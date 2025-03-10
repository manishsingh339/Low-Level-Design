package VottingService;

import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class VotingSystem {
    private final Map<String, Voter> voters;
    private final Map<String, Candidate> candidates;
    private final Map<String, AtomicInteger> voteCount;
    private final Set<String> votedVoters;
    private final ReadWriteLock votingLock;
    private volatile boolean isVotingOpen;
    private final BlockingQueue<VoteRecord> voteAuditLog;

    private VotingSystem () {
        this.voters = new ConcurrentHashMap<>();
        this.candidates = new ConcurrentHashMap<>();
        this.voteCount = new ConcurrentHashMap<>();
        this.votedVoters = ConcurrentHashMap.newKeySet();
        this.votingLock = new ReentrantReadWriteLock();
        this.voteAuditLog = new LinkedBlockingQueue<>();
        this.isVotingOpen = false;
    }

    private class SingletonHolder {
        private static final VotingSystem INSTANCE = new VotingSystem();
    }

    public static VotingSystem getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void registerVoter(String voterId, String name, int age, String password) {
        Voter voter = new Voter(voterId, name, 19, password);
        if(voter.isAllowedToVote()) {
            voters.putIfAbsent(voterId, voter);
        } else  {
           throw new IllegalArgumentException("Voter is not allowed to vote");
        }
    }

    public void registerCandidate(String candidateId, String name, String party) {
        Candidate candidate = new Candidate(candidateId, name, party);
        candidates.putIfAbsent(candidateId, candidate);
        voteCount.putIfAbsent(candidateId, new AtomicInteger(0));
    }

    public void startVoting() {
        votingLock.writeLock().lock();
        try {
            isVotingOpen = true;
            System.out.println("Voting has started!");
        } finally {
            votingLock.writeLock().unlock();
        }
    }

    public void endVoting() {
        votingLock.writeLock().lock();
        try {
            isVotingOpen = false;
            System.out.println("Voting has ended!");
        } finally {
            votingLock.writeLock().unlock();
        }
    }

    public boolean castVote(String voterId, String candidateId) {
        votingLock.readLock().lock();
        try {
            if(isVotingOpen) {
                if(voters.containsKey(voterId) && candidates.containsKey(candidateId)) {
                    if(!votedVoters.contains(voterId)) {
                        votedVoters.add(voterId);
                        voteAuditLog.add(new VoteRecord(voterId, candidateId, System.currentTimeMillis()));
                        voteCount.get(candidateId).incrementAndGet();
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } finally {
            votingLock.readLock().unlock();
        }
    }

    public Map<String, Integer> getCurrentResults() {
        Map<String, Integer> results = new HashMap<>();
        votingLock.readLock().lock();
        try {
            for (Map.Entry<String, AtomicInteger> entry : voteCount.entrySet()) {
                results.put(candidates.get(entry.getKey()).getName(), entry.getValue().get());
            }
        } finally {
            votingLock.readLock().unlock();
        }
        return results;
    }

    public List<VoteRecord> getAuditLog() {
        return new ArrayList<>(voteAuditLog);
    }
}

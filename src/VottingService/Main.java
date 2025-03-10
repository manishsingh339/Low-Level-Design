package VottingService;

public class Main {
    public static void main(String[] args) {
        VotingSystem votingSystem = VotingSystem.getInstance();
        votingSystem.registerVoter("voter1", "John Doe", 25, "password1");
        votingSystem.registerVoter("voter2", "Jane Doe1", 30, "password2");
        votingSystem.registerVoter("voter3", "Jane Doe2", 30, "password3");
        votingSystem.registerCandidate("candidate1", "Candidate A", "Party A");
        votingSystem.registerCandidate("candidate2", "Candidate B", "Party B");
        votingSystem.startVoting();
        votingSystem.castVote("voter1", "candidate1");
        votingSystem.castVote("voter2", "candidate2");
        votingSystem.castVote("voter3", "candidate1");
        votingSystem.endVoting();
        System.out.println(votingSystem.getCurrentResults());
    }
}

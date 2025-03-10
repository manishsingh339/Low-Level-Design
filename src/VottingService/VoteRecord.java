package VottingService;

public class VoteRecord {
    private final String voterId;
    private final String candidateId;
    private final long timestamp;

    public VoteRecord(String voterId, String candidateId, long timestamp) {
        this.voterId = voterId;
        this.candidateId = candidateId;
        this.timestamp = timestamp;
    }
}

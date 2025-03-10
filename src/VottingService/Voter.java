package VottingService;

public class Voter {
    private final String id;
    private final String name;
    private final int age;
    private final String password;

    public Voter(String id, String name, int age, String password) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public boolean isAllowedToVote() {
        return age >= 18;
    }
}

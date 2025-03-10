package atm;

public class User {
    private String name;
    private Card card;
    private Account account;

    public User(Card card, Account account, String name) {
        this.card = card;
        this.account = account;
        this.name = name;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

}

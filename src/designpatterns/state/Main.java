package designpatterns.state;

public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        document.edit();
        document.publish();
        document.edit();
        document.publish();
        document.edit();
        document.publish();
    }
}

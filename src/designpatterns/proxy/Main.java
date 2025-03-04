package designpatterns.proxy;

public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");
        image.display();
        Image image2 = new ProxyImage("test_10mb.jpg");
        image2.display();
    }

}

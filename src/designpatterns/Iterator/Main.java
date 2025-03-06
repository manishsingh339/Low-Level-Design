package designpatterns.Iterator;

public class Main {
    public static void main(String[] args) {
        NameCollection collection = new NameCollection();
        Iterator iterator = collection.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

package designpatterns.singleton;

public class BillPugh {
    private BillPugh() {}

    private static class SingletonHelper { // Static inner class
        private static final BillPugh INSTANCE = new BillPugh();
    }

    public static BillPugh getInstance() {
        return SingletonHelper.INSTANCE;
    }
}

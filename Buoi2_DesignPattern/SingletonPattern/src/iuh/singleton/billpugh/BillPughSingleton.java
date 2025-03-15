package iuh.singleton.billpugh;

public class BillPughSingleton {
    //Bill Pugh Singleton is loaded but not initialized
    private BillPughSingleton() {}

    //when calling getInstance, the SingletonHelper class is loaded
    //and the Singleton instance is created
    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}

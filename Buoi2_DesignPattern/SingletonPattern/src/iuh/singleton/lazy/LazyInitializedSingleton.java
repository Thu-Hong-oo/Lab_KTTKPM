package iuh.singleton.lazy;

public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {}

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
    //But this method has a drawback that multiple threads can access it at the same time and create multiple instances of the singleton class.
    //So, this method is not thread-safe. To make the class thread-safe, we can use the synchronized keyword in the getInstance() method.
    //But it will reduce the performance of the application because of the cost associated with the synchronized method.
}

package iuh.singleton.eager;

public class EagerInitializedSingleton {
    // instance is initialized at the time of class loading(compile)
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    // static is used globally for the variable and it can be used by any object of
    // the class
    // final is used to keep the value constant
    private EagerInitializedSingleton() {// private constructor to avoid client applications to use constructor

    }

    public static EagerInitializedSingleton getInstance() {// static method to get instance, we don't need to create
                                                           // object to call this method
        return instance;
    }
}

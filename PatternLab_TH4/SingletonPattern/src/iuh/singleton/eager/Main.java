package iuh.singleton.eager;
public class Main {
    public static void main(String[] args) {
        EagerInitializedSingleton singleton = EagerInitializedSingleton.getInstance();
        System.out.println(singleton);
    }
}

    

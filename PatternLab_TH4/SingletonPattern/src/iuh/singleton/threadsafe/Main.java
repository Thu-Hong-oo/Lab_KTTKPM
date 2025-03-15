package iuh.singleton.threadsafe;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n===== Thread Safe Singleton (Double-Checked Locking) =====");
        ThreadSafeSingleton threadSafe1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton threadSafe2 = ThreadSafeSingleton.getInstance();
        System.out.println("Thread Safe Singleton Instance 1: " + threadSafe1.hashCode());
        System.out.println("Thread Safe Singleton Instance 2: " + threadSafe2.hashCode());
        System.out.println(threadSafe1 == threadSafe2 ? "Same instance" : "Different instances");
    }
}

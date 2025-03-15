package iuh.singleton.staticBlock;

public class Main {
    public static void main(String[] args) {
        // Get 2 instances of StaticBlockSingleton
        StaticBlockSingleton instance1 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton instance2 = StaticBlockSingleton.getInstance();

        //Check hashcode of the instances
        System.out.println("instance1 hashcode: " + instance1.hashCode());
        System.out.println("instance2 hashcode: " + instance2.hashCode());

        if (instance1 == instance2) {
            System.out.println("both instances are same");
        } else {
            System.out.println("2 instances are different");
        }
    }
}

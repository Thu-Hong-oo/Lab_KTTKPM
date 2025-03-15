package iuh.singleton.lazy;

public class Main {
    public static void main(String[] args) {
        LazyInitializedSingleton instance1 = LazyInitializedSingleton.getInstance();
        LazyInitializedSingleton instance2 = LazyInitializedSingleton.getInstance();
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

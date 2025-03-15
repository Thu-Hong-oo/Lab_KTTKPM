package iuh.singleton.billpugh;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n===== Bill Pugh Singleton =====");
        BillPughSingleton billPugh1 = BillPughSingleton.getInstance();
        BillPughSingleton billPugh2 = BillPughSingleton.getInstance();
        System.out.println("Bill Pugh Singleton Instance 1: " + billPugh1.hashCode());
        System.out.println("Bill Pugh Singleton Instance 2: " + billPugh2.hashCode());
        System.out.println(billPugh1 == billPugh2 ? "Same instance" : "Different instances");
    }
}

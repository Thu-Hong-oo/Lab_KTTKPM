package iuh.ex2.strategy;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1000, new VATTaxStrategy());
        System.out.println("VAT tax for Laptop: " + product1.calculateTax());

        Product product2 = new Product("Phone", 500, new ConsumptionTaxStrategy());
        System.out.println("Consumption tax for Phone: " + product2.calculateTax());

        Product product3 = new Product("Luxury Watch", 2000, new LuxuryTaxStrategy());
        System.out.println("Luxury tax for Watch: " + product3.calculateTax());
    }
}
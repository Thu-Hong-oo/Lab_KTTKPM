package iuh.ex2.strategy;

public class VATTaxStrategy implements TaxStrategy {

    @Override
    public double calculateTax(double price) {
        return price * 0.1;
    }
    
}

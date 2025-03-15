package iuh.ex2.strategy;

public class LuxuryTaxStrategy implements TaxStrategy {

    @Override
    public double calculateTax(double price) {
        return price * 0.2;
    }
    
}

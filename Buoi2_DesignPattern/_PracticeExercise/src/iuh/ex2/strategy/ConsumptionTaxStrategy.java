package iuh.ex2.strategy;

public class ConsumptionTaxStrategy implements TaxStrategy {

    @Override
    public double calculateTax(double price) {
        return price * 0.05;
    }
    
}

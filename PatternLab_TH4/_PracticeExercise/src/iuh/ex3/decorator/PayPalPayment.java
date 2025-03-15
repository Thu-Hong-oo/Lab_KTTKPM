package iuh.ex3.decorator;

public class PayPalPayment implements PaymentMethod {
    private double amount;

    public PayPalPayment(double amount) {
        this.amount = amount;
    }

    @Override
    public double calculatePayment() {
        return amount; 
    }
    
}

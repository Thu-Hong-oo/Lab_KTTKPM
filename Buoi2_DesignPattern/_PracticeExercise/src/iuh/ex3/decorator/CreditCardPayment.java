package iuh.ex3.decorator;

public class CreditCardPayment implements PaymentMethod {
    private double amount;

    public CreditCardPayment(double amount) {
        this.amount = amount;
    }

    @Override
    public double calculatePayment() {
        return amount; 
    }
}

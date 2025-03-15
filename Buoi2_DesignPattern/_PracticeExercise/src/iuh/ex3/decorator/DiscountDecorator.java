package iuh.ex3.decorator;

public class DiscountDecorator extends PaymentDecorator {
    private double discount;

    public DiscountDecorator(PaymentMethod paymentMethod, double discount) {
        super(paymentMethod);
        this.discount = discount;
    }

    @Override
    public double calculatePayment() {
        return super.calculatePayment() * (1 - discount);
    }
    
}

package iuh.ex3.decorator;

public class PaymentDecorator implements PaymentMethod {
    private PaymentMethod paymentMethod;

    public PaymentDecorator(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public double calculatePayment() {
        return paymentMethod.calculatePayment();
    }
    
}

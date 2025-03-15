package iuh.ex3.decorator;

public class ProcessingFeeDecorator extends PaymentDecorator {
    private double processingFee;

    public ProcessingFeeDecorator(PaymentMethod paymentMethod, double processingFee) {
        super(paymentMethod);
        this.processingFee = processingFee;
    }

    @Override
    public double calculatePayment() {
        return super.calculatePayment() + processingFee;
    }
    
}

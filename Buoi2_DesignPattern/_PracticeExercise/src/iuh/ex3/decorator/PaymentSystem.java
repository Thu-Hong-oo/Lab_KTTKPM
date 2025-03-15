package iuh.ex3.decorator;

public class PaymentSystem {
    public static void main(String[] args) {
        // Create a Credit Card payment of $100
        PaymentMethod creditCardPayment = new CreditCardPayment(100);

        // Add processing fee of $5
        PaymentMethod creditCardWithProcessingFee = new ProcessingFeeDecorator(creditCardPayment, 5);
        System.out.println("Credit Card Payment with Processing Fee: " + creditCardWithProcessingFee.calculatePayment());

        // Apply a discount of $10 to the above payment
        PaymentMethod creditCardWithDiscount = new DiscountDecorator(creditCardWithProcessingFee, 10);
        System.out.println("Credit Card Payment with Processing Fee and Discount: " + creditCardWithDiscount.calculatePayment());

        // Create a PayPal payment of $200
        PaymentMethod payPalPayment = new PayPalPayment(200);

        // Add processing fee of $8 to PayPal payment
        PaymentMethod payPalWithProcessingFee = new ProcessingFeeDecorator(payPalPayment, 8);
        System.out.println("PayPal Payment with Processing Fee: " + payPalWithProcessingFee.calculatePayment());

        // Apply a discount of $15 to PayPal payment
        PaymentMethod payPalWithDiscount = new DiscountDecorator(payPalWithProcessingFee, 15);
        System.out.println("PayPal Payment with Processing Fee and Discount: " + payPalWithDiscount.calculatePayment());
    }
}

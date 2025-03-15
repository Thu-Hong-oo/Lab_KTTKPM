package iuh.ex1.strategy;
public class CancelledOrderState implements OrderState {
    @Override
    public void processOrder(Order order) {
        System.out.println("Hủy đơn hàng #" + order.getId() + " và hoàn tiền");
        
    }
}
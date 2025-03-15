package iuh.ex1.strategy;



public class ProcessingOrderState implements OrderState {
    @Override
    public void processOrder(Order order) {
        System.out.println("Đóng gói và vận chuyển đơn hàng #" + order.getId());
        // Logic đóng gói và vận chuyển
    }
}
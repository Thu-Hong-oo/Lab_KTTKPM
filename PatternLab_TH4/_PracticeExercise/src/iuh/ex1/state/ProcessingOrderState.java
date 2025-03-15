package iuh.ex1.state;

public class ProcessingOrderState implements OrderState {
    @Override
    public void handleOrder(Order order) {
        System.out.println("Đang đóng gói và vận chuyển đơn hàng #" + order.getOrderId());
        // Logic đóng gói và vận chuyển
        System.out.println("Đơn hàng đã được vận chuyển");
        order.setState(new DeliveredOrderState());
    }
    
    @Override
    public String getStateName() {
        return "Đang xử lý";
    }
}

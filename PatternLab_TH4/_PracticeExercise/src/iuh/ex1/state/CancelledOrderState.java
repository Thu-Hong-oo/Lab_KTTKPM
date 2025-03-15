package iuh.ex1.state;

public class CancelledOrderState implements OrderState {
    @Override
    public void handleOrder(Order order) {
        System.out.println("Đang hủy đơn hàng #" + order.getOrderId() + " và hoàn tiền");

        System.out.println("Đơn hàng đã được hủy và tiền đã được hoàn lại");

    }
    
    @Override
    public String getStateName() {
        return "Hủy";
    }
}
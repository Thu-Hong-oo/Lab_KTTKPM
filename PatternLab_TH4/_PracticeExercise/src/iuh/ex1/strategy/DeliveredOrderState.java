package iuh.ex1.strategy;

public class DeliveredOrderState implements OrderState {
    @Override
    public void processOrder(Order order) {
        System.out.println("Cập nhật trạng thái đơn hàng #" + order.getId() + " đã được giao thành công");
    }
    
}

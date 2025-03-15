package iuh.ex1.state;

import java.util.List;

public class Order {
    private String orderId;
    private OrderState state;
    private List<String> items;
    private double amount;
    
    public Order(String orderId, List<String> items, double amount) {
        this.orderId = orderId;
        this.items = items;
        this.amount = amount;
        this.state = new NewOrderState(); // Trạng thái ban đầu là "Mới tạo"
    }
    
    public void processOrder() {
        state.handleOrder(this);
    }
    
    public void cancelOrder() {
        setState(new CancelledOrderState());
        processOrder();
    }
    
    public String getOrderId() {
        return orderId;
    }
    
    public void setState(OrderState state) {
        this.state = state;
        System.out.println("Đơn hàng #" + orderId + " chuyển sang trạng thái: " + state.getStateName());
    }
    
    public OrderState getState() {
        return state;
    }
    
    public void displayOrderInfo() {
        System.out.println("------ THÔNG TIN ĐƠN HÀNG ------");
        System.out.println("Mã đơn hàng: " + orderId);
        System.out.println("Trạng thái: " + state.getStateName());
        System.out.println("Sản phẩm: " + String.join(", ", items));
        System.out.println("Tổng tiền: " + amount + " VND");
        System.out.println("--------------------------------");
    }
    

}

package iuh.ex1.strategy;

public class OrderManagementSystem {
    public static void main(String[] args) {
        // Tạo một đơn hàng mới
        Order order = new Order(1, "Nguyễn Văn A", 1500000);
        
        // Xử lý đơn hàng ở trạng thái Mới tạo
        order.process();
        
        // Chuyển sang trạng thái Đang xử lý
        order.setState(new ProcessingOrderState());
        order.process();
        
        // Chuyển sang trạng thái Đã giao
        order.setState(new DeliveredOrderState());
        order.process();
        
        // Tạo đơn hàng khác và hủy
        Order order2 = new Order(2, "Trần Thị B", 2000000);
        order2.process();
        order2.setState(new CancelledOrderState());
        order2.process();
    }}
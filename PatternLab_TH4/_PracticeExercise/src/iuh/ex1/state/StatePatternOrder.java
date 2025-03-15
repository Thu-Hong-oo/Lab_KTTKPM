package iuh.ex1.state;

import java.util.Arrays;
import java.util.List;

public class StatePatternOrder {

    public static void main(String[] args) {
        // Tạo đơn hàng mới
        List<String> items = Arrays.asList("Điện thoại Samsung", "Ốp lưng");
        Order order = new Order("ORD123456", items, 12000000);

        // Hiển thị thông tin đơn hàng
        order.displayOrderInfo();

        // Xử lý đơn hàng qua các trạng thái
        System.out.println("\n--- QUY TRÌNH XỬ LÝ ĐƠN HÀNG ---");
        order.processOrder(); // Chuyển từ "Mới tạo" sang "Đang xử lý"
        order.processOrder(); // Chuyển từ "Đang xử lý" sang "Đã giao"
        order.processOrder(); // Xử lý ở trạng thái "Đã giao"

        // Tạo đơn hàng mới để thử nghiệm trạng thái hủy
        System.out.println("\n--- ĐƠN HÀNG BỊ HỦY ---");
        Order cancelledOrder = new Order("ORD789012", Arrays.asList("Laptop Asus"), 20000000);
        cancelledOrder.displayOrderInfo();
        cancelledOrder.cancelOrder(); // Chuyển sang trạng thái "Hủy"

    }
}
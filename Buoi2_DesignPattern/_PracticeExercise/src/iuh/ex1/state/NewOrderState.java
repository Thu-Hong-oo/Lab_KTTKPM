package iuh.ex1.state;

public class NewOrderState  implements OrderState{
    @Override
    public void handleOrder(Order order) {
        System.out.println("Đang kiểm tả thông tin đơn hàng : "+order.getOrderId());
   order.setState(new ProcessingOrderState());
    }

    @Override
    public String getStateName() {
        return "Mới tạo";
    }
    
}

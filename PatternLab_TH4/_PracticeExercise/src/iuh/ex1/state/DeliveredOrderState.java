package iuh.ex1.state;

class DeliveredOrderState implements OrderState {
    @Override
    public void handleOrder(Order order) {
        System.out.println("Cập nhật trạng thái đơn hàng #" + order.getOrderId() + " là đã giao");
      
        System.out.println("Cập nhật hoàn tất");

    }
    
    @Override
    public String getStateName() {
        return "Đã giao";
    }}

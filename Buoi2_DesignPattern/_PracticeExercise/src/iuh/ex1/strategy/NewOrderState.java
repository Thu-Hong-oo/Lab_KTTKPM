package iuh.ex1.strategy;



public class NewOrderState implements OrderState {
    @Override
    public void processOrder(Order order) {
        System.out.println("Đang kiểm tra thông tin đơn hàng #" + order.getId());
        
    }

  
}
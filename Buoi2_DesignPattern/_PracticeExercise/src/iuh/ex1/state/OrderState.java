package iuh.ex1.state;
public interface OrderState {
    public void handleOrder(Order order);
    public String getStateName();
}

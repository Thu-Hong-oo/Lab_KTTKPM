package iuh.ex1.strategy;


public class Order {
    private int id;
    private String customerName;
    private double totalAmount;
    private OrderState state;

    public Order(int id, String customerName, double totalAmount) {
        this.id = id;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
        // Mặc định trạng thái ban đầu là New
        this.state = new NewOrderState();
    }

    public void process() {
        state.processOrder(this);
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
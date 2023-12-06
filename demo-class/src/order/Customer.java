
import java.time.LocalDate;
import java.util.Arrays;

public class Customer {
  // 17 types (String, Wraper Classes, Primitives)

  // Custom Class
  private Order[] orders;


  // Constructor
  public Customer() {
    this.orders = new Order[0];
  }

  public Customer(Order order) {
    this.orders = new Order[] {order};
  }

  public Customer(Order[] orders) {
    this.orders = orders;
  }

  // Getter
  public Order[] getOrders() {
    return this.orders;
  }

  public boolean updateOrderAmount(int orderId, double totalAmount) {
    for (int i = 0; i < this.orders.length; i++) {
      if (this.orders[i].getId() == orderId) {
        this.orders[i].setTotalAmount(totalAmount);
        return true;
      }
    }
    return false;
  }

  // Setter 
  public void addOrder(Order orders) {
   // It is a new array object
   Order[] newOrders = Arrays.copyOf(this.orders, this.orders.length + 1);
    newOrders[newOrders.length - 1] = orders;
    this.orders = newOrders;
  }

  @Override
  public String toString() {
    return "Customer(orders=" + Arrays.toString(this.orders) + ")";
  }


  public static void main(String[] args) {
    // New a customer object
    //Order o1 = new Order(1, LocalDate.of(2023, 10, 26), 2500.0d);
    //Order o2 = new Order(1, LocalDate.of(2023, 10, 28), 2500.0d);
    Customer customer = new Customer(
        new Order[] {new Order(1, LocalDate.of(2023, 10, 26), 2500.0d),
            new Order(2, LocalDate.of(2023, 10, 28), 3000.0d)});


    System.out.println("before: " + customer.toString());
    //o2.setTotalAmount(4000.0d);
    System.out.println("after: " + customer.toString());

    customer.addOrder(new Order(10,LocalDate.of(2000, 10, 10), 1000.0d));

    System.out.println("after adding order: " + customer.toString());

    // System.out.println("Order 1=" + o1);
    // Order 1=Order(id=1, buyDate=2023-10-26, totalAmount=2500.0)

    // New some order objects, and put into the customer object

    // research -> Class of class
  }
}

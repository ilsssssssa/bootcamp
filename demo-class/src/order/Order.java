
import java.time.LocalDate;

public class Order {
  
  private int id;

  private LocalDate buyDate;

  private double totalAmount;

  private int status; // 0 - pending, 1 - completed


  public Order (int id, LocalDate buyDate, double totalAmount) {
    this.id = id;
    this.buyDate = buyDate;
    this.totalAmount = totalAmount;
  }

  public int getId() {
    return this.id;
  }

  public double getTotalAmount() {
    return this.totalAmount;
  }

  public void setTotalAmount(double amount) {
    this.totalAmount = amount;
  }
 
  @Override
  public String toString() {
    return "id= " + id + " ,buyDate= " + buyDate + " ,totalAmount= " + totalAmount;
  }

  public static void main(String[] args) {
    Order order = new Order(1, LocalDate.of(2000, 1, 1), 215);
    System.out.println(order.toString()); //Order(id= 1 ,buyDate= 2000-01-01 ,totalAmount= 215.0)

  }

}
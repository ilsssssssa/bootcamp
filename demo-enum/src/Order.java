public class Order {
  
  private int id;

  private Status status;

  public Order(int id, Status status) {
    this.id = id;
    this.status = status;
  }

  public Status geStatus() {
    return this.status;
  }


  public static void main(String[] args) {
    Order o1 = new Order(1, Status.ORDERED);
    Order o2 = new Order(1, Status.SHIPPED);

    if (o1.geStatus() != o2.geStatus()) {
      System.out.println("different status");
    }
    if (o1.geStatus().getVal() != o2.geStatus().getVal()) {
      System.out.println("different status value");
    }

  }
}

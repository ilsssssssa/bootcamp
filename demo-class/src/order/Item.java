import java.math.BigDecimal;

public class Item {
  
  private double price;

  private int quantity;

  private String desc;


  // All-args constructor
  public Item (double price, int quantity, String desc) {
    this.price = price;
    this.quantity = quantity;
    this.desc = desc;
  }

  // getter, setter
  public void setPrice (double price) {
    this.price = price;
  }

  public double getPrice () {
    return this.price;
  }

  public void setQuantity (int quantity) {
    this.quantity = quantity;
  }

  public int getQuantity () {
    return this.quantity;
  }

  public void setDesc (String desc) {
    this.desc = desc;
  }

  public String getDesc () {
    return this.desc;
  }

  public double totalAmount() {
    return BigDecimal.valueOf(this.price);
    

  }

  




}

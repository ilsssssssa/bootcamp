import java.awt.Color;

public class Ball {

  // private String color;// No need use String
  private Color color; // relatively finite numbers 相對有限的數量

  public Ball(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return this.color;
  }


  public static void main(String[] args) {
    // Before the main() starts, class load -> new Color("Red")
    // CALL OUT WAY: Color.RED (something public static final, but Color.RED is an object)
    // You cannot "new" the Color object by yourself

    Ball b1 = new Ball(Color.RED);
    Ball b2 = new Ball(Color.BLACK);
    Ball b3 = new Ball(Color.BLACK);
    Ball b4 = new Ball(Color.YELLOW);
    
    if (b3.getColor() == b2.getColor()) { // == is checking object address
      System.out.println("Same color");
    }

    if (b1.getColor() != b2.getColor()) {
      System.out.println("Different color");
    }





  }



}
import java.math.BigDecimal;

public class Circle {

  private double radius; // 半徑

  // Empty Constructor空構造函數
  public Circle() {

  }

  public Circle(double radius) {
    this.radius = radius;
  }
  // Setter
  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }
// Instance methods實例方法
  public double diameter() { //直徑  (=半徑*2)
    return this.radius * 2; // double * int
  }
// Instance methods實例方法
  public double area() { // 半徑*半徑*pi
    // return this. radius * this.radius * 3.14
    // Math library
    return Math.pow(this.radius, 2) * Math.PI;
  }


  // Static Method - tool , 公家, only can use input
  public static double area(double radius) {
    return ((BigDecimal.valueOf(radius)).multiply(BigDecimal.valueOf(radius))
        .multiply(BigDecimal.valueOf(Math.PI)).doubleValue());
  }





// main - new a circle
  public static void main(String[] args) {
    Circle circle = new Circle();
    circle.setRadius(3.2d);
    System.out.println(circle.getRadius()); // 3.2

    Circle circle2 = new Circle(3.4d);
    System.out.println(circle2.getRadius()); // 3.4



    double diameter1 = circle.diameter();
    double area1 = circle.area();

    System.out.println("Circle 1 diameter= " + diameter1);
    System.out.println("Circle 1 area= " + area1);
    

    // Pass by reference circle2 -> same value of circle now.
    circle = circle2;

  }


}

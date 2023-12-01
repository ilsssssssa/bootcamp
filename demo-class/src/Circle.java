public class Circle {

  private double radius; // 半徑

  // Empty Constructor
  public Circle() {

  }

  public Circle(double radius) {
    this.radius = radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  public double diameter() { //直徑  (=半徑*2)
    double diameter = radius * 2;
    return diameter;
  }

  public double area() { // 半徑*半徑*pi
    double area = radius * radius * 3.14;
    return area;
  }









// main - new a circle
  public static void main(String[] args) {
    Circle circle = new Circle();
    circle.setRadius(3.2d);
    System.out.println(circle.getRadius()); // 3.2

    Circle circle2 = new Circle(3.4d);
    System.out.println(circle2.getRadius()); // 3.4

  }


}

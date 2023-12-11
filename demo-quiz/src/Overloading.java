public class Overloading {

  // public static int add(int x, int y) {
  // return x + y;
  // }

  public static double add(double a, double b) {
    return a - b;
  }

  public static void main (String[] args) {
    System.out.println(add(3, 4)); // 7
  }
}

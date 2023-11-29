public class DemoMethod {

  // main -> method name
  // public -> or "private"
  // static method -> tool
  // void -> NO return type
  public static void main(String[] args) {
    // javac -> compile(編譯) command, converting .java -> .class
    // java -> run .class file
    int x = 2;
    int y = 10;
    x *= 2; // 4
    x += y;
    System.out.println("x=" + x); // 14


    // Trigger Method
    int result10 = sum(10, 3);
    System.out.println("result10= " + result10); // 13
    System.out.println(sum(2, 4)); // 6
    System.out.println(sum(-10, -30)); // 40

    // Find if any method with 3 int input parameters
    int result14 = sum(10, 3, 20);
    System.out.println("result14= " + result14);

    int result15 = sum(10, 3, 'c');
    System.out.println("result15= " + result15); 

    double result16 = sum(2.3, 2.5);
    System.out.println("result16=" + result16);

    int result11 = minus(99, 44);
    System.out.println("result11= " + result11); // 55

    int result12 = times(4, 7);
    System.out.println("result12= " + result12); // 28

    double result13 = divide(36, 5);
    System.out.println("result13= " + result13); // 7.2 (double + int = 7.2 // int + int = 7.0)
    System.out.println(divide(36, 5));

    double v = (double) 7 / 2; // double / int -> double, int / int -> int
    System.out.println("v= " + v); // 3.5



  }

  // Method name: sum
  // return type: int
  // parameters: No parameter, one or more than one parameters 無參數、一個或多個參數
  // f(x1, x2) = x1 + x2
  // y = x1 + x2
  public static int sum(int x1, int x2) {
    int total = x1 + x2;
    return total;
  }

  // Method Signature: sum(int x1, int x2, int x3)
  public static int sum(int x1, int x2, int x3) {
    int total = x1 + x2 + x3;
    return total;
  }
  // Method Signature: sum(int x1, int x2, char x3)
  public static int sum(int x1, int x2, char x3) {
    int total = x1 + x2 + x3;
    return total;
  }
  public static double sum(double x1, double x2) {
    double total = x1 + x2;
    return total;
  }

  public static int minus(int x1, int x2) {
    int total = x1 - x2;
    return total;
  }

  public static int times(int x1, int x2) {
    int total = x1 * x2;
    return total;
  }

  public static double divide(int x1, int x2) {
    double total = (double) x1 / x2; // x1 is int and x2 is int, so x1/ x2 is int
    return total;
  }
}

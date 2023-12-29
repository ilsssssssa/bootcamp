public class DemoUncheckedException {

  private double balance;
  public static void main(String[] args) {
    double result;
    // Example 1: int / int
    try {
      System.out.println("before");
      result = divide(10, 0);
    } catch (ArithmeticException e) {
      result = 0;
    }


    // Example 2: double / double -> 10.0 / 0.0 = infinite (not error, is a result)
    try {
      System.out.println("before");
      result = 10.3 / 0.0;
      if (Double.isInfinite(result)) {
        System.out.println("result is Infinite");
      }
      System.out.println("after");
    } catch (ArithmeticException e) {
      System.out.println("ArithmeticException");
      result = 0.0d;
    }
    System.out.println(("result=" + result));
  }

  public static double divide(double x, double y) {
    return x / y; // Potentially run-time exception(潛在的運行時異常) - ArithmeticException(算術異常)
  }

  public static double divide(int x, int y) throws ArithmeticException {
    return x / y; // Potentially run-time exception(潛在的運行時異常) - ArithmeticException(算術異常)
  }

  public boolean deposit(double amount) { // can't deposit etc $-100 to someone -$xx is not make sense so -> IllegalArgumentException()
    if (amount <= 0.0d)
      throw new IllegalArgumentException();
      this.balance += amount;
      return true;
  }
}

public class DemoDoWhileLoop {
  public static void main(String[] agrs) {
    int j = 0;

    while (j < 0) { // CAN'T 滿足
      //
    }

    for (int i = 0; i < 0; i++) {

    }

    // Do-while: 無論條件如何，總是執行一次
    do {
      System.out.println("hello");
    } while (j < 0);

      while (++j < 5) {
      System.out.println("j = " + j);
    }
    // j=1
    // j=2
    // j=3
    // j=4
    
    j = 0;
    do {
      System.out.println("j1 = " + ++j);
    } while (j < 4);

      
  }
}

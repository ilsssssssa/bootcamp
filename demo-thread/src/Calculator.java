public class Calculator {

  private int x;

  // Multi-thread environment

  public synchronized void increment() {
    this.x++;
  }

  public void increment2() {
    this.x++;
  }

  public synchronized void decrease() {
    this.x--;
  }

  public static void main(String[] args) {
    Calculator calculator = new Calculator();

    // Increment with synchronized EXAMPLE
    Thread vincent = new Thread(() -> {
      for (int i = 0; i < 100_000; i++) {
        calculator.increment();
      }
    });
    Thread oscar = new Thread(() -> {
      for (int i = 0; i < 100_000; i++) {
        calculator.increment();
      }
    });

    vincent.start(); // .start() method
    oscar.start();


    try {
      vincent.join(); // .join() tgt
      oscar.join();
    } catch (InterruptedException e) {

    }

    System.out.println(("calculator.x=" + calculator.x)); // 200000


    // Increment WITHOUT synchronized EXAMPLE
    calculator.x = 0;

    vincent = new Thread(() -> {
      for (int i = 0; i < 100_000; i++) {
        calculator.increment2();
      }
    });


    oscar = new Thread(() -> {
      for (int i = 0; i < 100_000; i++) {
        calculator.increment2();
      }
    });

    vincent.start();
    oscar.start();


    try {
      vincent.join();
      oscar.join();
    } catch (InterruptedException e) {

    }

    System.out.println(("calculator.x=" + calculator.x)); // calculator.x= 137126(不穩定random)


    // Decrease with synchronized EXAMPLE
    calculator.x = 0;

    vincent = new Thread(() -> {
      for (int i = 0; i < 100_000; i++) {
        calculator.increment();
      }
    });


    oscar = new Thread(() -> {
      for (int i = 0; i < 100_000; i++) {
        calculator.decrease();
      }
    });

    vincent.start();
    oscar.start();


    try {
      vincent.join();
      oscar.join();
    } catch (InterruptedException e) {

    }

    System.out.println(("calculator.x=" + calculator.x)); // 0

  }
}

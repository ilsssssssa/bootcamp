package lambda;

import java.util.Random;
import java.util.function.Supplier;

public class DemoSupplier { // returning things , u will not return 2 things -> 0 in 1 out
  public static void main(String[] args) {
    Supplier<Integer> randomInteger = () -> new Random().nextInt(100) + 1; // 1 - 100
   System.out.println(randomInteger.get());
  }

  Supplier<Book> emptyBook = () -> new Book();
  Book book = emptyBook.get();

}

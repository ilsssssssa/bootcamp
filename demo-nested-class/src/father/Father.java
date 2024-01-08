package father;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Father implements Driver {

  @Override
  public void drive() {
    System.out.println("Father is driving ...");
  }

  public static void main(String[] args) {
//comparator -> funtional Interface 
    Queue<Integer> test = new PriorityQueue<>((a, b) -> a > b ? -1 : 1);
    test.add(1);
    test.add(13);
    test.add(31);
    test.add(131);
    System.out.println(test); // [131, 31, 13, 1]


    Driver driver = new Father();
    driver.drive();

    Driver driver2 = new Driver() {
      @Override
      public void drive() {
        System.out.println("Anonymous Inner Class ... driving ...");
      }
    };

    driver2.drive();
  }

}

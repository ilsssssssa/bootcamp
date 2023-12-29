import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemoArrayDeque {
  public static void main(String[] args) {
    Queue<String> qs = new ArrayDeque<>(); // Use LinkedList is better

    qs.add("TLY");
    qs.add("LKK"); // TLY, LKK
    qs.poll(); // TLY -> delete
    System.out.println(qs.peek()); // LKK

    Deque<String> ds = new ArrayDeque<>();
    ds.addFirst("ABC");
    ds.addFirst("CBA"); // CBA, ABC
    ds.addFirst("XXX"); // xxx, CBA, ABC
    ds.removeLast(); // ABC -> delete element

    System.out.println(ds.pollLast()); // CBA

    // List<String> adq = new ArrayDeque<>(); XXXX 


    Queue<String> qlinklist = new LinkedList<>();
    Queue<String> qlinklist2 = new ArrayDeque<>();


    List<Integer> test = new LinkedList<>();
    List<Integer> test2 = new ArrayList<>();
    long time = 0;
    for (int i = 0; i < 10000000; i++) {
      long start = System.nanoTime();
      test.add(i);
      long stop = System.nanoTime();
      time = (stop - start);
    }
    System.out.println(time);


    long time2 = 0;
    for (int i = 0; i < 10000000; i++) {
      long start = System.nanoTime();
      test2.add(i);
      long stop = System.nanoTime();
      time2 = (stop - start);
    }
    System.out.println(time2);

    // Deque<String> qlinklist3 = new LinkedList<>();
    // Deque<String> qlinklist4 = new ArrayDeque<>();
    // System.out.println(qlinklist4.);


  }
}

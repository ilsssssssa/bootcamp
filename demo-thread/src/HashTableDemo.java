import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

  public static void main(String[] args) throws InterruptedException {
    // HashTable (thread safe) vs HashMap (non-thread safe)
    // put ()

    Map<String, String> stringTable = new Hashtable<>();
    stringTable.put("JOHN", "English");
    stringTable.put("JOHN", "Maths");
    System.out.println(stringTable.size()); // 1

    Map<String, String> stringMap = new HashMap<>();

    Runnable hashTablePut = () -> {
      for (int i = 0; i < 100_000; i++) {
        stringTable.merge("x", "s", (oldVal, newVal) -> oldVal.concat(newVal));
      }
    };

    Runnable hashMapPut = () -> {
      for (int i = 0; i < 100_000; i++) {
        stringMap.merge("x", "s", (oldVal, newVal) -> oldVal.concat(newVal));
      }
    };

    Thread worker1 = new Thread(hashTablePut);
    Thread worker2 = new Thread(hashTablePut);
    worker1.start();
    worker2.start();
    worker1.join();
    worker2.join();
    System.out.println(stringTable.get("x").length()); // 200000

    Thread worker3 = new Thread(hashMapPut);
    Thread worker4 = new Thread(hashMapPut);
    worker3.start();
    worker4.start();
    worker3.join();
    worker4.join();
    System.out.println(stringMap.get("x").length()); // 1xxxxx (random no.)

  }
}

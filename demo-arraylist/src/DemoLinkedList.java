import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {
  public static void main(String[] args) {
     List<String> ls = new LinkedList<>();
     ls.add("ABC");
     ls.add("XYZ");
     ls.add("IJK");
     System.out.println(ls); // [ABC, XYZ, IJK]

     ls.remove(2); // remove by index, much slower than arraylist.remove(index)
     System.out.println(ls); // [ABC, XYZ]

     // for-each, contains(), isEmpty()
     System.out.println(ls.get(0)); // ABC
     
  }
}

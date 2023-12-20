import java.lang.management.MemoryUsage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {

  public static void main(String[] args) {

    // List<String> strings = new ArrayList<>();

    // Map:
    // 1. key value pair -> <key, value> -> one entry
    // 2. key must be unique
    // 3. (key, callout)
    Map<String, Integer> ageBook = new HashMap<>();

    // put()
    ageBook.put("John", 20);
    ageBook.put("John", 13); // Update 20 -> 13, because "John" is the key which exists in the map
    ageBook.put("Mary", 3); // add a new entry

    System.out.println(ageBook.size()); // 2

    for (Map.Entry<String, Integer> entry : ageBook.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }

    // get()
    System.out.println(ageBook.get("Mary")); // 3
    System.out.println(ageBook.get("John")); // 13
    System.out.println(ageBook.get("John")); // 13


    // MY EXAMPLE:
    // put()
    Map<Integer, String> Menu = new HashMap<>();
    Menu.put(1, "Fries");
    Menu.put(1, "frenchFries");
    Menu.put(2, "Hamburger");
    Menu.put(3, "COLA");
    Menu.put(null, "MILKSHAKE");

    for (Map.Entry<Integer, String> entry : Menu.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }

    // get()
    System.out.println(Menu.get(1)); // frenchFries
    System.out.println(Menu.get(2)); // Hamburger
    System.out.println(Menu.get(3)); // COLA
    System.out.println(Menu.get(null)); // MILKSHAKE
    System.out.println(Menu.size()); // 4
    System.out.println(Menu.keySet()); // [null, 1, 2, 3]

    // Map<String, Book>
    Map<String, Book> bookMap = new HashMap<>();
    // put Book
    bookMap.put("John", new Book("ABC"));
    bookMap.put("John", new Book("IJK"));
    bookMap.put("Jenny", new Book("MNO"));
    // get Book name
    for (Map.Entry<String, Book> entry : bookMap.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue().getName());
    }
    System.out.println(bookMap.get("Jenny").getName()); // MNO

    

    // Map <Author, Book>
    Map <Author, Book> bookStore = new HashMap<>();
    bookStore.put(new Author("John"), new Book("ABC"));
    // if there is no equals() & hashCode() -> new entry
    // if there are equals() & hashCode() -> update
    bookStore.put(new Author("John"), new Book("BCD"));

    System.out.println(bookStore.size()); // 1 // (2)!!! if no either 1 @Override
    // put() is not working without @Override hashcode() or @Override equals() method

    System.out.println(bookStore.get(new Author("John"))); //Book(name=BCD) // (null)!!! if no either 1 @Override
    // get() is not working without @Override hashcode() or @Override equals() method

    Author john = new Author("John");
    bookStore.put(john, new Book("ABC"));
    bookStore.put(john, new Book("BCD")); // if no equals() & hashCode -> update

    System.out.println(bookStore.get(john)); // Book(name=BCD)

    System.out.println(bookStore.containsKey(new Author("John"))); // true
    System.out.println(bookStore.containsValue(new Book("BCD"))); // true

    System.out.println(bookStore.putIfAbsent(new Author("Ann"), new Book("IJK"))); // will show [null], original value
    System.out.println(bookStore.putIfAbsent(new Author("Ann"), new Book("XXX"))); // IJK, ^original value^
    System.out.println("get= " + bookStore.get(new Author("Ann"))); // get= Book(name=IJK)

  }
}

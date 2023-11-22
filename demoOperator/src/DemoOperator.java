public class DemoOperator {
  public static void main(String[] args) {
    int x = 2;
    x++;
    ++x;
    x +=1;
    x = x + 1; // 6
    
    // difference between a++ and ++a
    int a = 5;
    int preIncrement = ++a; // (5+1) if ++ is in front, a will + 1 first, and being assigned
    // a -> 6 , then preIncrement -> 6
    System.out.println("preIncrement=" + preIncrement ); // 6
    System.out.println("a=" + a); // 6

    int b = 5;
    int postIncrement = b++; // assign the value of variable a to postIncrement
    // postIncrement -> 5, b -> 6
    System.out.println("postIncrement=" + postIncrement); // 5
    System.out.println("b=" + b); //6

    int cat = 8;
    int laugh = --cat;
    System.out.println("laugh=" + laugh);// 7
    System.out.println("c" + cat);// 7

    int d = 8;
    int sad = d--;
    System.out.println("sad=" + sad); // 8
    System.out.println("d=" + d); //7

     int c =1;
     int postIncrement3 = c;
     c++;

    // Conditional Operators
    // &&(AND) ||(OR) !(NOT)
    // Example 1 -AND
    // True only if both c and b are true; otherwise, false.
    if (c == 1 && b == 4) { // && -> Both two conditions need to be fulfilled
      // (c == 2) -> true
      // (b == 4) -> false
      // (true && false) -> false
      System.out.println("example 1=yes");
    } else { 
      System.out.println("example 1=no");
    }
    // Example 2 -OR
    // True if either c or b is true; false (0) only if both are false.
    if (c == 2 || b == 4) {
      // (c == 2) -> true
      // (b == 4) -> false
      // (true || false) -> true
      System.out.println("example 2=yes"); //print
    } else {
      System.out.println("example 2=no");
    }
    // Example 3 - AND OR
    String h = "hello";
    if (c == 2 && (b == 4 || "hello". equals(h))) {
      // (c == 2) -> true
      // (b == 4) -> false
      // "hello".equals(h) -> true
      // (true && false || true) -> true
      System.out.println("example 3=yes"); // print
    } else {
      System.out.println("example 3=no");
    }
    // Example 4 - AND
    if (c == 1 && b == 6) {
      // (c == 1) -> false
      // (b == 6) will NOT be executed
      System.out.println("example 4=yes");
    } else {
      System.out.println("example 4=no4");
    }

//SELF EXCERCISE
    int z = 10;
    int crazy = --z;
    String y = "jumbo";
    if (z == 9 && ( c ==1 || "jumbo".equals(y))){
      System.out.println("SELF=yes");
    } else {
      System.out.println("SELF=no");
    }

    // Example 5 - AND OR
    if (c == 1 || b == 4 && "hello".equals(h)) {
    // b == 4 -> false
    // "hello".equals(h) -> true
    // c == 1 -> false
    // false || false && true
    // false || false
    // false
    System.out.println("example 5=yes");
} else {
  System.out.println("example 5=no");
}

    // Example 6 - OR
    if (h.charAt(3) == 'e' || b == 6 ) {
      // h.charAt(3) -> 'l'
      // b == 6 -> true
      // false || true
      // true
      System.out.println("Example 6 =yes");
    }else {
      System.out.println("Example 6 = yes");
    }
   


  }
}

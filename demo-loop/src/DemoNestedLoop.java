public class DemoNestedLoop {
  public static void main(String[] args) {
    // REVIEW
    for (int i = 0; i < 5; i++) // 0,1,2,3,4
      System.out.print("*"); // *****


System.out.println("Example 1:");
    // when i=0, j -> 0,1,2,3
    // when i=1, j -> 0,1,2,3
    // when i=2, j -> 0,1,2,3
    // when i=3, j -> 0,1,2,3
    // when i=4, j -> 0,1,2,3
    for (int i = 0; i < 4; i++) { // outer loop
      System.out.println("FUCK!!, i=" + i);
      for (int j = 0; j < 3; j++) { // inner loop
        if (i > 1 && j > 1)
          break;
        System.out.println("World!, j=" + j);
      }
    }
 System.out.println("Example 2:");
    // i < 5
    // i < 4
    // System.out.println(); -> print & newline
    // System.out.print(); -> print
    for (int i = 0; i < 5; i++) { // Row
      for (int j = 0; j < 5 - i; j++) { // column -> variable length
        System.out.print("*");
      }
      System.out.println(""); // Making ROW
    }
    // *****
    // ****
    // ***
    // **
    // *
    System.out.println("Example 3:");
    // nested loop, 4 character in a row
    // abcd
    // efgh
    // ijk
    String str = "abcdefghijk";
    int count = 0;
    for (int i = 0; i < str.length(); i++) { // variable length
      // if ( i % 4 == 0 ){
      // System.out.println("");
      // }
      // System.out.print(str.charAt(i));
      System.out.print(str.charAt(i));
      if (++count % 4 == 0 || i == str.length() - 1) {
        System.out.println("");
      }
    }

System.out.println("Example 4a:");
    int noOfGroup = 6;
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print("*");
      }
      if (i != noOfGroup - 1) { // delete SPACE at the last 
      System.out.print(" ");
    }
  }
      System.out.println("Example 4b");

      int cnt = 0;
      for (int i = 0; i < 6; i++) {

      }

 

}



}


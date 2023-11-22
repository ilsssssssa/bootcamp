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
      System.out.println("Example 6 = yes   ");
    }

    // Comparsion operators NOT only exists in if statements
    // boolean -> && ||
    boolean b1 = true && false;
    System.out.println("b1=" + b1);
    
    boolean b2 = false;
    boolean b3 = true;

    boolean result = b2 || b3;
    System.out.println("Result=" + result); // true

    boolean result2 = b2 || b3 && b1;
    System.out.println("result=" + result2); // false

    // Using if( )
    if(b1 == false) { // !b1
    System.out.println("example 7a=b1 is false"); // print
    }
    
    if(!b1) { // b1 == false
      System.out.println("example 7b=b1 is false"); // print
    }

    if (b1 == true) { // b1 == true
      System.out.println("example 8a=b1 is true"); // not print
    }
      
    if (b1) { //  b1 == true
      System.out.println("example 8b=b1 is true"); // not print
    }

   int g = 0;
   if (b1 == false) {
       g = 10; 
       System.out.println("g=" + g);
    }
  //  ^^^^^^Short ways to code^^^^^^
   int k = b1 == false ? 10 : 0;
   System.out.println("k=" + k);
   // if b1 is false, k will be 10, otherwise 0

   // SELF EXCERCISE
   int jacus = !b3 ? 487 : 0; 
   System.out.println("jacus=" + jacus);

   int salary = 0; 
   if (b3 == true) { // if (b3 == false) <- incorrect -> not print
    salary = 20;
    System.out.println("salary=" + salary);
   }
    int sss = !b3 ? 16 : 20; // ? is判斷 true : false
    System.out.println("sss=" + sss);

    int a1 = 10;
    int a2 = 4;
    int min;
    
    if( a1 < a2 ){
      min = a1;
    } else { // a1 == a2 or a1 > a2
      min = a2;
    }
    System.out.println("min=" + min );

    int min2 = a1 == a2 ? 10 : 4;
    System.out.println("min2=" + min2 );

    int number = 13;    // EX
    boolean isOdd = true;
    // %
    if (number % 2 == 0) {
      isOdd = true;
     }else {
      isOdd = false;
     }
    System.out.println("Odd Number=" + isOdd); // Odd Number: true\

    double totalAmount = 0;
    double itemTotal = 1002;
     // if itemTotal > 3000, NO transportation fee, otherwise +3% transportation fee
    if (itemTotal < 3000) {
      totalAmount = itemTotal * 0.03 + itemTotal;
      } 
       System.out.println("Total Amount 1=" + totalAmount);

   //  double totalAmount = 0;
   //  int itemT = 2223;
   //  double feerate = 0.03;
   //  
   //  if(itemTotal > 3000); {
   //  totalAmount = item Total * (1 + feeRate); // 2289.69

   // double transportation Fee = 0.0d;
   // if (itemTotal <= 3000){
   // transportationFee = itemTotal * feeRate;
   // } 
   // totalAmount = itemTotal + transportation Fee;
   // System.out.println("Total Amount=" + totalAmount); 
       





   


  }
}

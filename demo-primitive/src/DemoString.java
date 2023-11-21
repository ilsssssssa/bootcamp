public class DemoString {
  public static void main(String [] args) {
  
    String emailAddress = "ilsa121999@gmail.com";
    // String s = 3; // s is declared by String, so you cannot assign int value
    // int i = "hello"; // i is declard by int, you cannot assign String value

    System.out.println(emailAddress); //ilsa12199@gmail.com

    //Operations str = "hello" + " " + "world";
    String str = "hello" + " " + "world";
    System.out.println(str); // "hello world"

    // Always look at the code inside the bracket first
    // Step 1: "hello" + " " + "world" -> "hello world"
    // Step 2: System.out.println() -> Print out
    System.out.println("hello" + " " + "world"); // "hello world"

    String str1 = "hello";
    System.out.println(str1); // "hello"
    System.out.println(str1. length()); //5


    // No "-", "*", "/" in String
  }
}

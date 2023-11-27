public class DemoASCII {
  public static void main(String[] args) {

//ASCII FORM
    // 0 = 48
    // A = 65
    // a = 97
    char value = 'C';
    int ascii = value; 
    System.out.println(ascii); // 67

    System.out.println(value == 'C'); //true
    System.out.println(value == 67); //true
    System.out.println(value > 64); //true
    System.out.println(value < 64); //false
//Sign Try
    char sign = '~';
    int testascii = sign;
    System.out.println(testascii); // 126
//Chinese Word Try
    char c2 = '開';
    int ascii2 = c2;
    System.out.println(ascii2); //38283

//CompareTo
    String s1 = "abcdef";
    String s2 = "banana";
    String s3 = "ABCDEF";
    String s4 = "acbdef";
    String s5 = "abcd";
    String s6 = "abcA";

    System.out.println(s2.compareTo(s1)); // 1 ('b' - 'a') (98 - 97)
    System.out.println(s1.compareTo(s2)); // -1 ('a' - 'b') (97 - 98)
    System.out.println(s3.compareTo(s1)); // -32 ('A' - 'a') (65 - 97)
    System.out.println(s4.compareTo(s1)); // 1, same 'a', then compare second char -> ('c' - 'b')(99 - 98)
    System.out.println(s5.compareTo(s1)); // -2, same first characters, will compare to length (4 - 6)
    System.out.println(s6.compareTo(s1)); // -35 ('A' - 'd') (65 - 100)



    
  }
  
}

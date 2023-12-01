import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class DemoForEachLoop {
  public static void main(String[] args) {
    Integer[] integers = new Integer[] {100, -30, 20};
    for (Integer i : integers) { // 用 :
      System.out.println("i = " + i);
    }

    for (int i = 0; i < integers.length; i++) { // 用 for loop 寫
      System.out.println("i2 = " + integers[i]);
    }



    String str = "abc,def,ijk,zxy";
    String[] parts = str.split(",");
    // System.out.println(Arrays.toString(parts)); [abc, def, ijk, zxy]
    // for (int i = 0; i < parts.length; i++) { 舊方法
    // System.out.println("parts = " + parts[i]);
    for (String s : parts) {
      System.out.println("part = " + s);
    }


    String str2 = "abcdefghijk";
    // char array
    char[] characters = str2.toCharArray(); // toCharArray() -> new char[str2.length]
    // finalString -> "acegik"
    int arrLength =
        str2.length() % 2 == 0 ? str2.length() / 2 : str2.length() / 2 + 1;
    char[] result = new char[arrLength];
    int idx = 0;
    for (int i = 0; i < characters.length; i++) {
      if (i % 2 == 0) {
        result[idx++] = characters[i];
      }
    }
    // i = 0 , idx = 0 , result[0]=a
    // i =1 , skip
    // i =2 , idx ++ -> idx =1 , result[1]=c ,ressult = ac
    System.out.println("Final String= " + String.valueOf(result));

    // Example 1:
    str2 = "abcdefghijk";
    System.out.println("Final String=" + evenIdx(str2));
    System.out.println("Final String=" + evenIdx("")); // ""
    System.out.println("Final String=" + evenIdx("abc")); // "ac"
    System.out.println("Final String=" + evenIdx("abcd")); // "ac"

    // Example 2:
    // Given String "abcdefg"
    // finalString "gfedcba"
    // char array
    System.out.println("Reversed String= " + reverse("abcdefg")); // "gfedcba"
    System.out.println("Reversed String= " + reverse("")); // ""
    System.out.println("Reversed String= " + reverse("abcde")); // "edcba"


  }

  public static String reverse(String s) {
    char[] result = s.toCharArray();
    // abcdefg
    // a <-> g
    // b <-> f
    // when to stop?
    int a = result.length / 2;
    char temp = ' ';
    for (int i = 0; i < a; i++) {
      temp = result[i]; // 'a' -> char
      result[i] = result[result.length - 1 - i];
      result[result.length - 1 - i] = temp;
    }
    return String.valueOf(result);
  }


  public static String evenIdx(String s) {
    char[] characters = s.toCharArray(); // toCharArray() -> new char[str2.length()]
    // finalString -> "acegik"
    int arrLength = s.length() % 2 == 0 ? s.length() / 2 : s.length() / 2 + 1;
    char[] result = new char[arrLength];
    int idx = 0;
    for (int i = 0; i < characters.length; i++) {
      if (i % 2 == 0) {
        result[idx++] = characters[i];
      }
    }
    return String.valueOf(result);

  }

}

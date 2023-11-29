public class DemoMethod2 {
  public static void main(String[] agrs) {

    String str = append("abc", "def");
    System.out.println(str);

    char str2 = getLastChar("ilsalam");
    System.out.println(str2);

    boolean b = isStartedWith("helloworld", "hello");
      System.out.println(b);

    String str3 = remove("abcbcdabc", "bcd");
    System.out.println(str3);


  }

  // s1 -> "abc"
  // s2 -> "def"
  // return "abcdef"
  public static String append(String s, String s1) {
    String str = s.concat(s1);
    return str;
  }

  // Get the last character of the String s
  // if s length < 1, return ' ' (space character)
  public static char getLastChar(String s) {
    if (s.length() < 1) {
      return ' ';
    }
    return s.charAt(s.length() - 1);
  }

  // s -> "helloworld"
  // prefix -> "hello"
  // return true
  public static boolean isStartedWith(String s, String prefix) {
    return s.startsWith(prefix);
  } 

  // s -> "abcbcdabc"
  // toBeRemove -> "bcd"
  // return "abcabc"
  public static String remove(String s, String toBeRemoved) {
    return s.replace(toBeRemoved, "");
  }


}

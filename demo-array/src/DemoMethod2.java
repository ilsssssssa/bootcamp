public class DemoMethod2 {
  public static void main(String[] agrs) {

    String str = append("abc", "def");
    System.out.println("append = " + str);

    char str2 = getLastChar("ilsalam");
    System.out.println("getLastChar =" + str2);

    boolean b = isStartedWith("helloworld", "hello");
    System.out.println("isStartedWith = " + b);

    String str3 = remove("abcbcdabc", "bcd");
    System.out.println("remove = " + str3);


  }

//EXAMPLE 1:

  public static void sound(String animal) {
    // Early Return
    // ho siu use 'else' in sorting
    if ("ABC".equals(animal)) {
      return; // similar to break
    }
    if ("Dog".equals(animal)) {
      System.out.println("wo wo");
      return; // similar to break
    } else if ("Cat".equals(animal)) {
      System.out.println("meow");
      return; // similar to break
    }
    System.out.println("Default sound...");
  }


  public static String sound2(String animal) {
    if ("ABC".equals(animal)) {
      return "";
    }
    if ("Dog".equals(animal)) {
      return "wo wo";
    } else if ("Cat".equals(animal)) {
      return "meow";
    }
    return "Default sound...";
  }

//EXAMPLE 2:

  public static void notifyCustomer() {
    if (sendEmail()) {
      return;
    }
    sendSMS();
  }

   public static boolean notifyCustomer2() {
    if (sendEmail()) {
      return true;
    } else if (sendSMS()){
      return true;
    }
    return false;
  }

  public static boolean notifyCustomer3() {
    return sendEmail() || sendSMS() ;
  }

  public static boolean sendEmail() {
    return false;
  }

  public static boolean sendSMS() {
    return false;
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

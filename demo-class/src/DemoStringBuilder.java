public class DemoStringBuilder {
  
  public static void main(String[] args) {
    // String: +=, concat()
    String x = "abc";
    x += "def";
    x = x.concat("def");
    System.out.println(x); // abcdefdef

    // StringBuilder
    StringBuilder sb = new StringBuilder("abc");
    sb.append("def").append("def");
    System.out.println(sb.toString()); // abcdefdef






  }
}

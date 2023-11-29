public class DemoWrapper {
    public static void main(String[] args) {
    // double -> Double
    double radius = 1.3;
    Double radius2 = 1.3;
    Double radius3 = Double.valueOf(1.3d); // 長寫法
    Double radius4 = new Double(1.3d);
    byte radius5 = (byte) radius; // 
    System.out.println(radius5);

    // char -> Character


    // boolean -> Boolean
    boolean isOkay = true;
    Boolean isPassed = true; // autobox
    Boolean isPassed2 = Boolean.valueOf(true); // self-box 長寫法
    Boolean isPassed3 = new Boolean(true);

    // Long 
    Long l1 = 10L; // 10L is long value, auto-box
    // Long -> Integer, how to fix 
    // Long -> long
    // Integer -> int
    // int <-> long
    Integer i10 = (int) (long) l1; // int -> Integer (autobox)
    Long l2 = (long) (int) i10; // long -> Long (autobox)



    }
}

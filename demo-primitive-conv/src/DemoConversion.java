public class DemoConversion {
    public static void main(String[] args) {
        // byte -> short -> int -> long
        byte b = 2;
        short s1 = b; // OK, upcast, no precision loss -> 自然change
        int i1 = s1; // OK
        long l1 = i1; // OK

        // long -> int -> short -> byte
        long l2 = 4L;
        // short s2 = l2; // NOT OK, potentially precision loss
        short s2 = (short) (l2); // OK Fixed, 有風險
        l2 = 40000; // 40000 -> int value
        s2 = (short) l2; // overflow
        System.out.println("s2 = " + s2);

        short s3 = 130;
        byte b2 = (byte) s3; // overflow
        System.out.println("b2 = " + b2); // -126

        int i2 = 130;
        short s4 = (short) i2;
        System.out.println("s4 = " + s4);

        byte b3 = 127; // int value

        float f1 = (float) 1.3d; // downcast need to add ( )
        double d1 = 5.2f; // upcast


        // float vs long
        float f2 = 3.5f;
        long l3 = (long) f2; // downcast
        float f3 = 10L; // upcast


        
        // char vs int
        int i3 = 'a'; // 97, upcast
        int i4 = 65610;
        char c3 = (char) i4; // downcast
        System.out.println("c3 (int)=" + (int) c3); // 74
        System.out.println("c3 (char)=" + (char) c3);// J

    }
}

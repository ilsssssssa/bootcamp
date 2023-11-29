import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class DemoForEachLoop {
   public static void main(String[] args) {
    Integer[] integers = new Integer[] {100, -30, 20};

    for (Integer i : integers) { // 用   :   
      System.out.println("i = " + i);
    }

    for (int i = 0; i < integers.length; i++) { // 用 for loop 寫
      System.out.println("i2 = " + integers[i]);
   }

    String str = "abc,def,ijk,zxy";
    String [] parts = str.split(","); 
    //System.out.println(Arrays.toString(parts)); [abc, def, ijk, zxy]
    //for (int i = 0; i < parts.length; i++) {  舊方法
    //  System.out.println("parts = " + parts[i]); 
    for (String s : parts) {
      System.out.println("part = " + s);
    }





  }
}

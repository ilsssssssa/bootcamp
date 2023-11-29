import java.util.Arrays;

public class DemoIntArray3 {
  public static void main(String[] args) {


    // for loop
    // {-100, 100, 34}
    int[] arr = new int[] {-100, 100, 34};
    int temp;
    for (int i = 0; i < arr.length; i++) {
      if (i == 0) {
        // SWAPPING
        temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
      }
    }
    System.out.println(Arrays.toString(arr));


    // move target index value to the tail of the array
    int[] arr2 = new int[] {100, -20, 4, 100, 500};
    int targetIndex = 1;
    for (int i = 0; i < arr2.length - 2; i++) {
      targetIndex = arr2[i + 2];
      arr2[i + 2] = arr2[i + 1];
      arr2[i + 1] = targetIndex;
    }
    System.out.println(Arrays.toString(arr2));


    // expected result = {100, 4, 100, 500, -20}
    // for loop
    // [100, 4, -20, 100, 500] // the reason of (arr2.length -2)
    // [100, 4, 100, -20, 500]
    // [100, 4, 100, 500, -20]



    // Find Max Value, and move to the tail
    // Approach 1
    int[] arr3 = new int[] {100, 4, 1050, 500, -20};
    // Loop - Find Max ???
    // Move the tail ??
    int maxValue = Integer.MIN_VALUE;
    int maxIndex = 0;
    for (int i = 0; i < arr3.length; i++) {
      if (arr3[i] > maxValue) {
        maxValue = arr3[i];
        maxIndex = i;
      }
    }
    System.out.println("MaxValue=" + maxValue);

    int tail = 1;
    for (int i = 0; i < arr3.length; i++) {
      if (i < arr3.length - 1 && i >= maxIndex) {
        arr3[i] = arr3[i + 1];
      } else if (i == arr3.length -1) {
        arr3[i] = maxValue;
      }
    }
    System.out.println(Arrays.toString(arr3));



    // Approach 2:
    int[] arr4 = new int[] {100, 4, 1050, 500, -20};
    // {4, 100, 1050, 500, -20}
    // {4, 100, 1050, 500, -20}
    // {4, 100, 500, 1050, -20}
    // {4, 100, 500 , -20, 1050}
    // outer loop; 4 times

    for (int i = 0; i < arr4.length; i++) {
      if (arr4[i] > arr4[i]) {
        temp = arr4[i];
        arr4[i] = arr4[i + 1];
        arr4[i + 1] = temp;
      }
    }
    System.out.println(Arrays.toString(arr4));

    String s = "abcabcabcabcabc";
    char[] arr5 = new char[s.length()];

    //Approach 1
    for (int i = 0; i < s.length(); i++) {
      arr5[i] = s.charAt(i);
    } 

    //Approach 2
    char[] arr6 = s.toCharArray(); //

    // replace a -> c (String)
    // "abcabcabcbacabc"
    // "cbccbccbccbccbc"
    char[] arr7 = new char[s.length()];
      for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'a') { 
        arr7[i] = 'c';
        continue;
      }
      arr7[i] = s.charAt(i);
      }


      // From array to String
      System.out.println(String.valueOf(arr7));

      String str = "hello";
      str = new String ("hello");
      str = String.valueOf("hello");

      System.out.println(String.valueOf(1));
      System.out.println(String.valueOf(1.0d));
      System.out.println(String.valueOf(1.0f));
      System.out.println(String.valueOf(1L));
      System.out.println(String.valueOf(new char[] {'a', 'b'})); // ab
     //System.out.println(String.valueOf(new int[] {1, 2, 3})); 唔得

     
     // Replace (String Method)
     String str4 = "abcabcabcabcabc";
     String result4 = str4.replace('a', 'c'); // replace a by c
     System.out.println("result4 = " + result4); // result4 = cbccbccbccbccbc

    // replace a pattern "ab" by "ij"
     System.out.println(str4.replace("ab", "ij")); // ijcijcijcijcijc



     

  }

}

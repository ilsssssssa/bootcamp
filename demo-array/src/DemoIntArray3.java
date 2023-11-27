import java.util.Arrays;

public class DemoIntArray3 {
  public static void main(String[] args) {
// for loop
// {-100, 100, 34}

    int[] arr = new int[] {-100, 100, 34};
    int temp;
    for (int i = 0; i < arr.length; i++) {
      if (i == 0) {
        //SWAPPING
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
       arr2[ i + 2] = arr2[ i + 1];
       arr2 [i + 1] = targetIndex;
     }
      System.out.println(Arrays.toString(arr2));

    
   


    // expected result = {100, 4, 100, 500, -20}
    // for loop





  }

}

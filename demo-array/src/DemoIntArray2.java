public class DemoIntArray2 {
  public static void main(String[] args) {
    // int array 10, 16, 8
    int[] arr = new int[] {10, 16, 8};
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    System.out.println("sum= " + sum); // 34

    // Find the max value
    int max = Integer.MIN_VALUE; // -21xxxxxxx 取代 0 -> less bug
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    System.out.println("max=" + max);

    // Find the min value
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    System.out.println("min=" + min);

    // Second max value
    int max1 = Integer.MIN_VALUE;
    int secmax = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max1) {
        secmax = max1;
        max1 = arr[i];
      } else if (arr[i] > secmax) {
        secmax = arr[i];
    }
  }
  System.out.println("secmax=" + secmax);
    

}
}
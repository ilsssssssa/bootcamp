public class DemointArray {
    public static void main(String[] args) {
    int age1 = 20;
    int age2 = 25;
    int age3 = 30;
    int age4 = 28;

    // Define an array (container) to store a list of int number
    // This array (container) can only store int number
    int[] arr = new int[9]; // [length of array], by index 0 - 8
    // assignment
    arr [0] = 20;
    System.out.println("arr[0]= " + arr[0]); // 20
    arr [1] = 25;
    System.out.println("arr[1]= " + arr[1]);
    arr [6] = age3;
    System.out.println("arr[6]= " + arr[6]);
    arr [8] = age4;
    System.out.println("arr[8]= " + arr[8]);
    
    // arr[9] = 28; // error, no index 9 in array arr

    int a; // local variable
    a = 1; // explicitly assignment
    System.out.println(a); // tou have to expicitly assign value before using it

    int [] arr2 = new int [5];
    int [] arr3 = new int [] {100, 5, 30, 9, -40};
    
    double [] arr4 = new double [] {1.2, 4.9, 4.3, 23.0};

    System.out.println(arr2.length); // 5

    arr2 = new int [10];
    System.out.println(arr2.length); // 10

    // array supports for loop

    int b = 100;
    b = 1000;
    System.out.println(b);

    }
}

package tester;

import java.util.Arrays;

public class Tester {
  public int[] findErrorNums(int[] nums) {  // 1,2,2,3
    int[] result = new int[2];
    int[] count = new int[nums.length + 1];
    for (int i = 0; i < nums.length; i++) {
      count[nums[i]]++; //nums[0]=1 => count[1]
    }
    for (int i = 0; i < count.length; i++) {
      if (count[i] == 2) // Appear TWICE
        result[0] = i ;
      if (count[i] == 0) // X Doesn't Appear 
        result[1] = i ;
    }
    return result;
  }

  /* public int[] findErrorNums(int[] nums) {
    int[] result = new int[2];
    int[] count = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      count[nums[i] - 1]++;
    }
    for (int i = 0; i < count.length; i++) {
      if (count[i] == 2) // Appear TWICE
        result[0] = i + 1;
      if (count[i] == 0) // X Doesn't Appear 
        result[1] = i + 1;
    }
    return result;
  } */

  

  public static void main(String[] args) {
    Tester solution = new Tester();
    System.out.println(
        Arrays.toString(solution.findErrorNums(new int[] {1, 2, 2, 3}))); // [2, 4]
    System.out
        .println(Arrays.toString(solution.findErrorNums(new int[] {1, 1}))); // [1, 2]
    System.out.println(
        Arrays.toString(solution.findErrorNums(new int[] {1, 2, 4, 4}))); // [4, 3]
    System.out.println(
        Arrays.toString(solution.findErrorNums(new int[] {1, 3, 2, 3}))); // [3, 4]
    System.out.println(
        Arrays.toString(solution.findErrorNums(new int[] {1, 2, 3, 3}))); // [3, 4]
        
  }
}


public class DemoCounting {
  public static void main(String[] args) {
      // Assume all numbers are positive
      int[] numbers = new int[] {10, 2, 200, 2000, 2000, 2, 2};
      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
      for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] > max) {
          max = numbers[i];
        }
        if (numbers[i] < min) {
          min = numbers[i];
        }
      }
      System.out.println(max); // 2000
      System.out.println(min); // 2
      int[] counts = new int[max - min + 1]; // 1999
      for (int i = 0; i < numbers.length; i++) {
        counts[numbers[i] - min]++;
      }
      int maxCount = 0;
      for (int i = 0; i < counts.length; i++) {
        if (counts[i] != 0 && counts[i] > maxCount) {
          maxCount = counts[i];
        }
      }
      System.out.println("Max. count=" + maxCount); // 3
  
      String str = "abcabcdpolxyzaa";
      char maxChar = ' ';
      maxCount = 0;
      int counts2[] = new int[26];
      // charAt()
      for (int i = 0; i < str.length(); i++) {
        counts2[str.charAt(i) - 'a']++; // 'a' - 'a' -> 97 - 97 -> 0
      }
      maxCount = 0;
      for (int i = 0; i < counts2.length; i++) {
        if (counts2[i] > maxCount) {
          maxCount = counts2[i];
          maxChar = (char) (i + 'a'); // downcast
        }
      }
      System.out.println("Max count=" + maxCount + ", char=" + maxChar); // 4
  /** int[] numbers = new int[] {10, 2, 2000, 2000, 2, 2};
    int maxCount = 0;
    for (int i = 0; i < numbers.length; i++) {
      int count = 0;
      for (int j = 0; j < numbers.length; j++) {
        if (numbers[j] == numbers[i]) {
          ++count;
        }
      }
      if (count > maxCount){
        maxCount = count;
      }
    }
        System.out.println("Max. count =" + maxCount); // 3

      String str = "abcabcdpolxyzaa";
      char maxChar = ' ';
      maxCount = 0;
      int[] count2 = new int[26];
      for(int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
          count2[c - 'a']++;
      }
      for (int i = 0; i < count2.length; i++) {
        if (count2[i] > maxCount) {
          maxCount = count2[i];
          maxChar = (char) ('a' + i); // downcast
        }
      }

      System.out.println("Max count=" + maxCount + ", char=" + maxChar); // 4

// [a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z]
// [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
//when i = 0 , base on counts2[str.charAt(i)-'a']++;
//-> counts2['a'-'a']++;
//-> counts2[0]++; 
// a appear 1 time
// [1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
// when i =1 
//-> counts2['b'-'a']++;
//-> counts2[1]++; 
// b appear 1 time
// [1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
// when i =2 
//-> counts2['a'-'a']++;
//-> counts2[0]++; 
// a appear 2 time
// [2,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0] */ 
  }
}

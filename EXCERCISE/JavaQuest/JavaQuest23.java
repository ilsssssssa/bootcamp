package JavaQuest;
/*
 * Question : given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half. Two strings are alike if they have the same
 * number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters. Return true if a and b are alike. Otherwise, return false.
 */

// hints : substring() , toCharArray() ?


public class JavaQuest23 {
  public boolean sameNumberOfVowels(String s) {
    // code here
    if ( s.length() % 2 != 0)
    return false;

    String a = s.substring(0, s.length() / 2).toLowerCase();
    String b = s.substring(s.length() / 2).toLowerCase();
    String num = "aeiou";
    int count = 0;
    int count2 = 0;


    for (int i = 0; i < a.length(); i++) {
      String str = String.valueOf(a.charAt(i));
      if (num.contains(str)) {
        count++;
      }
    }

    for (int i = 0; i < b.length(); i++) {
      String str2 = String.valueOf(b.charAt(i));
      if (num.contains(str2)){
      count2++;
    }
  }
    return count == count2;
  }

  public static void main(String[] args) {

    JavaQuest23 jq23 = new JavaQuest23();
    System.out.println(jq23.sameNumberOfVowels("aeiouAEIOU"));
  }
}

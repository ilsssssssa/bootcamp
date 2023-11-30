import java.util.Random;
import java.util.Scanner;

public class DemoRandom {
  public static void main(String[] args) {
    int target = new Random().nextInt(3);
    System.out.println("random number = " + target); // 0, 1, 2

    target = new Random().nextInt(100) + 1;
    System.out.println("random number = " + target); // 1, 2, 3

    // Game
    // 1 - 100 (random target: 47)
    // Round 1: "Please input an number (1-100):" User input 49 (wrong)
    // Round 2: "Please input a number (1-48):" User input 35 (wrong)
    // Round 3: "Please input a number (36-48):" User input 47 (correct)
    // if the inputed number is out of the range being asked, keep asking

    Scanner scanner = new Scanner(System.in);
    int input;
    int max = 100;
    int min = 1;
    do {
      System.out.println("Please input a number(" + min + "-" + max + "):");
      input = scanner.nextInt();
      if (input < min || input > max) {
        System.out.println("Out of range. Please input again.");
        continue;
      }
        else if (input > target) {
        max = input;
      } else if (input < target) {
        min = input;
      }
     } while (input != target);
     
     System.out.println("BINGO!!");     
     scanner.close();
    
    
    

/** Scanner scanner = new Scanner(System.in);
    System.out.println("PLEASE ENTER NUMBER (1-3)");
    int input = scanner.nextInt();
    // while loop
    // if user input same as target -> exit
    // otherwise, keep asking
    while (true) {
      if (input == target) {
        System.out.println("YOU GOT ILSA's HEART");
        break;
      } else {
        System.out.println("PLEASE COW AGAIN");
        input = scanner.nextInt();
      }
    }
    scanner.close(); */




  

}
}
public class DemoSwitch {
  public static void main(String[] args) {
    // if, else-if -> comparison and && || operators

    // switch: single value comparison (==)
    // case = kind of if
    // will run all makesense option
    char grade = 'B';
    switch (grade) {
      case 'A':
        System.out.println("grade=A");
      case 'B':
        System.out.println("grade=B");
      case 'C':
        System.out.println("grade=C");
      case 'D':
        System.out.println("grade=D");
      case 'E':
        System.out.println("grade=E");
    }

    char vipGrade = 'S'; // G / S / N
    double discount = 0.0d; // Silver(S) -> 10%, Gold(G) -> 20%
    switch (vipGrade) {
      case 'G':
        discount += 0.2d;
        break;
      case 'S':
        discount += 0.1d;
        break;
      case 'N':
      default: // other characters
    }
    System.out.println("discount=" + discount);

    char sex = 'M';
    int people = 10;
    switch (sex) {
      case 'M':
      people = 30;
      case 'P':
      people = 1;
      case 'G':
      people = 11; 
      break; // stop here
      case 'L':
      people = 4;
      case 'F':
      people = 20;
      
    }
      System.out.println("many people are = " + people);

    // Switch int, String


    }
     

    



  }


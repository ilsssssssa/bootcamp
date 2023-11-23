public class DemoIf {
    public static void main(String[] args) {
        // double salary = 15000.0; // by default 15000.0 is double
        double salary = 15000.0d;
        if (salary > 14000) {
            System.out.println("salary > 14000");
        }
        if (salary >= 15000) { // double vs int
            System.out.println("salary >= 15000");
        }
        if (salary < 17000) { // double vs int
            System.out.println("salary < 17000");
        }
        if (salary <= 15000) { // double vs int
            System.out.println("salary <= 15000");
        }

        // if(), else if (), else :
        // if either one else if,else is true, other's will be skip, and shows one answer
        char grade = 'A';
        if (grade == 'A') {
            System.out.println("grade=A");
        } else if (grade == 'B') {
            System.out.println("grade=B");
        } else if (grade == 'C') {
            System.out.println("grade=C");
        } else if (grade == 'D') {
            System.out.println("grade=D");
        } else if (grade == 'E') {
            System.out.println("grade=E");
        } else { // grade == 'F'
            System.out.println("Fail");
        }
        // Self excercise:
        int year = 13;
        if (year == 9) {
            System.out.println("year 9");
        } else if (year == 10) {
            System.out.println("year 10");
        } else if (year == 11) {
            System.out.println("year 11");
        } else if (year == 12) {
            System.out.println("year 12");
        } else if (year == 13) {
            System.out.println("BINGO!!");
        } else if (year == 14) {
            System.out.println("year 14");
        }


        int score = 75;
        // if
        // >= 90 -> A, 80-89 -> B, 70-79 -> C, 60-69 -> D
        // 50-59 ->E <50 -> F
        // Approah 1
        if (score < 0 || score > 100) {
            System.out.println("ERROR");
        } else if (score >= 90) {
            System.out.println('A');
        } else if (score >= 80) {
            System.out.println('B');
        } else if (score >= 70) {
            System.out.println('C');
        } else if (score >= 60) {
            System.out.println('D');
        } else if (score >= 50) {
            System.out.println('E');
        } else {
            System.out.println('F');
        }
        // Approach 2
        // if (score >= 90 && score <= 100) {
        // grade = 'A';
        // } else if (score >= 80 && score <= 90) {
        // grade = 'B';
        // } else if (score >= 70 && score <= 80) {
        // grade = 'C';
        // } else if (score >= 60 && score <= 70) {
        // grade = 'D';
        // } else if (score >= 50 && score <= 60) {
        // grade = 'E';
        // } else {
        // grade = 'F';

    int score2 = 40;

    // score and score2 >= 50, (score+score2) / 2 -> grade
    // either score or score2 < 50 -> grade F
    // both score and score2 <50 -> grade F
     
    if ( score < 50 || score2 < 50) {
        grade = 'F';
    } else {
        double averageScore = (score + score2) / 2;
        if (averageScore >= 90) {
            grade = 'A';
        } else if (averageScore >= 80) {
            grade = 'B';
        } else if (averageScore >= 70) {
            grade = 'C';
        } else if (averageScore >= 60) {
            grade = 'D';
        } else if (averageScore >= 50) {
            grade = 'E';
        }
    } System.out.println("Grade = " + grade);


























}




}     
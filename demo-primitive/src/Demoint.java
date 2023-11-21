public class Demoint {
    public static void main(String[] args) {
    //"xxxxx" -> String
    // number
    // ; --> end=footstop
    System.out.println("2");
    System.out.println("33");
    System.out.println("abc,with567!");

    //age and Salary are both "variable變量"
    int age = 33;
    int Salary = 30000;
    
    // "int FamilyMembers" -> Declaration, int -> "integer"
    // FamilyMembers = 5 -> Assignment, assign the integer value 30 to the variable
    int FamilyMembers = 5;

    int level; // Declaration
    level = 1; // Assignment
    level = 10; // Re-assignment
    // int level; // We cannot re-declare the same variable

    System.out.println(FamilyMembers);
    System.out.println(age);
    System.out.println(Salary);
    System.out.println("I want some fun"+age);
    System.out.println("There are "+FamilyMembers+" people inside the house");
    System.out.println("My mom's ages is " + age + " years old");

    // Step 1: level = 10 + 3; (because level = 3 before reaching this line)
    // Step 2: level = 13;  
    level = level + 3; // 13
    level += 3; // 16

    level =level - 7; // 9
    level -= 7; // 2

    level = level * 3; // 6
    level *= 3; // 18

    level = level / 2; // 9
    level /= 2; // 4 
    System.out.println("why the answer is "+level+ "?");

    level = level + 1; //5
    level ++; //6
    ++level; //7

    level = level - 1; //6
    level--; //5
    --level; //4

    // the remainder of 5 % 2 -> 1    //% = 餘數
    int remainder = 5 % 2 ; // 1
    System.out.println("remainder" + remainder);
    
    int result=  ( 5 + 3 ) / 2 % 3; 
    System.out.println("result=" + result); // 1

    result = 5 + 3 / 2 % 3;
    System.out.println("result=" + result); // 6

    // byte, short, int, long (primitive原函數)
    byte b = -128 ; //from -128 to 127
    byte b2 = 127;
    // byte b3 = 128; // 128 is out of range of integer value that can be stored
     
    short s = -32768;
    short s2 = 32767;
    // short s3 = 32768; // out of range of integer value that can be stored
   
    int i1 = -2147483648;
    int i2 = 2147483647;
    //int i3 = 2147483648; // out of range of integer value that can be stored

    // long 10 = 2147483648; // 2147483648 is int presentation, but out range of long
    long l1 = -9223372036854775808L; // notation(符號) L -> long value
    int i5 = 100; // The value 100 has no notation -> default it is an int value
    byte b4 = 100; // Java implicitly convert the int to -> default it is an int value
    short s4 = 100; // Java implicitly covert the int to short -> default it is an int value
   // example: 
    l1 = l1 + 10L;
    System.out.println(l1); // -9223372036854775798

    byte out = 2; // trying to use byte but not int
    System.out.println("there are "+out+ " person in the room."); // if the value is in the range then still can run


    int resut = 20 % 18;
    System.out.println("resut=" + resut);


  }
}
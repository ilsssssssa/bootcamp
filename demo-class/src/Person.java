// Blueprint藍圖, to produce Person objects

import java.lang.invoke.StringConcatException;

public class Person {

    private String firstName;
    private String lastName;
    private int age; // Default 0 如果唔比數字


    // Empty Constructor (Produce Person's object)
    public Person() {

    }

    public Person(String firstName, String lastName, int age) { // gen一個person
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName) {
        this.firstName = firstName;
    }

    // Instance Method
    // 1. Belongs to the object (Person p1 = new Person(); p1.swim();)
    // 2. Able to control the instance variable by "this"

    // Static Method
    // 1. Belongs to the class (ClassName.staticMethod() -> Person.swim(3))
    // 2. Not able to read/write instance variable
    // 3. The return value completely derived衍生 by the input parameters

    // Instance Method (Object method)
    // Setterl
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFullName() {
        // if lastName -> "", return "John"
        // if lastName -> "x", return "John X"
        if (this.lastName == null)
            return this.firstName;
        return this.lastName.isEmpty() ? this.firstName
                : this.firstName.concat(" ").concat(this.lastName);
    }

    public String getFullName(boolean isCapLetter) {
        String fullName = this.firstName.concat(" ").concat(this.lastName);
        return isCapLetter ? fullName.toUpperCase() : fullName.toLowerCase();
    }

    // First letter TO uppercase
    public String getFullName2() {
        return String.valueOf(this.firstName.charAt(0)).toUpperCase()
                .concat(this.firstName.substring(1, this.firstName.length()))
                .concat(" ").concat(String.valueOf(this.lastName.charAt(0)))
                .toUpperCase()
                .concat(this.lastName.substring(1, this.lastName.length()));
    }


    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public static void swimming() {
        System.out.println("I'm swimming");
    }

    public void swim() { // void method can be with "return" or without "return"
        int a = 1;
        if (a > 2)
            return;
        System.out.println(this.firstName + " is swimming.");
    }

    public int eat() { // int method has to be with "return" keyword
        int b = 10;
        if (b < 12)
            return 100;
        return -1;
    }



    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setFirstName("John");
        p1.setAge(23);

        Person p2 = new Person();
        p2.setFirstName("Peter");
        p2.setAge(55);

        Person p3 = p1;
        p3.setFirstName("Mary");

        Person p4 = new Person("Tommy"); // "Tommy" set name 後變 "Jenny"
        p4.setFirstName("Jenny");
        p4.setAge(99);


        System.out.println(p4.getFirstName()); // "Jenny"
        System.out.println(p3.getFirstName()); // "Mary"
        System.out.println(p2.getFirstName()); // "Peter"
        System.out.println(p1.getFirstName()); // "Mary"

        System.out.println(p1.getAge()); // 23
        System.out.println(p3.getAge()); // 23
        System.out.println(p2.getAge()); // 55
        System.out.println(p4.getAge()); // 99


        Person p5 = new Person("Ken", "Wong");
        System.out.println("p5 full name= " + p5.getFullName(true)); // boolean ALL UPPERCASE
        System.out.println("p5 full name= " + p5.getFullName(false)); // boolean ALL LOWERCASE
        System.out.println("p5 full name= " + p5.getFullName()); // Original insert

        // Static vs Instance Method
        // Call Instance Method
        Person p6 = new Person("Jenny");
        p6.setLastName("Chan");
        p6.swim(); // Jenny is swimming


        // Call Static Method
        Person.swimming(); // I'm swimming
    }


}

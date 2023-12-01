// Blueprint藍圖, to produce Person objects
public class Person {

    private String name;

    private int age; // Default 0 如果唔比數字

    // Constructor (Produce Person's object)
    public Person() {

    }

    public Person(String name) {  // gen一個person
        this.name = name;
    }

    // Instance Method (Object method)
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return this.name;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }











    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("John");
        p1.setAge(23);

        Person p2 = new Person();
        p2.setName("Peter");
        p2.setAge(55);

        Person p3 = p1;
        p3.setName("Mary");

        Person p4 = new Person("Tommy"); // "Tommy" set name 後變 "Jenny"
        p4.setName("Jenny");
        p4.setAge(99);

        System.out.println(p4.getName()); // "Jenny"
        System.out.println(p3.getName()); // "Mary"
        System.out.println(p2.getName()); // "Peter"
        System.out.println(p1.getName()); // "Mary"

        System.out.println(p1.getAge()); // 23
        System.out.println(p3.getAge()); // 23
        System.out.println(p2.getAge()); // 55
        System.out.println(p4.getAge()); // 99
   }

}

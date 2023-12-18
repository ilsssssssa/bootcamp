import test.Animal;

public class Cat extends Animal {

  // Cat Class ingerit all public attributes, methods
  // Cat did NOT ingerit constructor

  public Cat() {
    // super(); // implicitly call Animal() Constuctor
  }

  public static void main(String[] args) {
    Cat cat = new Cat(); // Create a Cat Object -> call Animal()
    cat.setAge(2);
    System.out.println(cat.getAge()); // 2
  }
}

// Kind of Class
public record Student(String name, int age) {

  public static int test = 1;

  public void read() {
    System.out.println("i am reading ...");
  }

  public static void sleep() {
    System.out.println("i am sleeping ...");
  }

  // public Student() { // no empty constructor

  // }

  // public Student(String name) {
  // this.name = name;
  // }

  // All attribute in "record" has been "final"
  // public void setName(String name) {
  // this.name = name; // The final field Student.name cannot be assignedJava(33554512)

}

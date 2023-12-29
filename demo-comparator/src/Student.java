import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable<Student> { // interface is a CERT

  private int score;

  private String name;


  public Student(int score, String name) {
    this.score = score;
    this.name = name;
  }

  public int getScore() {
    return this.score;
  }

  public String getName() {
    return this.name;
  }

  // public int compareTo(T o);
  // List<Student> students = new ArrayList<>();
  // students.add(new Student(40, "Peter"));
  // students.add(new Student(10, "John"));
  // students.add(new Student(98, "Ann"));
  // students.add(new Student(29, "John"));
  // System.out.println(students); // [Student(score=40), Student(score=10), Student(score=98), Student(score=29)]
  // Ann 98 -> John 29 -> John 10 -> Peter 40

  // @Override
  // public int compareTo(Student s) { // 背！！！
  // return s.getScore() > this.score ? -1 : 1; // -1 : 1 順 || 1 : -1 倒
  // }

  @Override
  public int compareTo(Student s) {
    if (s.getName().compareTo(this.name) > 0) {
      return -1;
    } else if (s.getName().compareTo(this.name) == 0) {
      if (s.getScore() > this.score) {
        return 1;
      } else {
        return - 1;
      }
    } else {
      return 1;
    }
  }

  @Override
  public String toString() {
    return "Student(" + "score=" + this.score + "name=" + this.name + ")";

  }
}

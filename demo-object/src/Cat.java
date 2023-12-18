import java.util.Objects;

public class Cat {

  private String name;

  private int age;

  private final Eye[] eyes = new Eye[2];

  public Eye[] getEye() {
    return this.eyes;
  }

  public Cat(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) // 檢查兩個對象是否引用相同的記憶體地址
      return true;
    if (!(obj instanceof Cat)) // 檢查obj是否為Cat類的實例
      return false;
    Cat cat = (Cat) obj; // 將obj轉換為Cat類型，並將其賦值給cat變數。
    // return cat.getAge() == this.age && cat.getName().equals(this.name); // 比較兩個Cat對象的age和name屬性
    return Objects.equals(cat.getAge(), this.age)
        && Objects.equals(cat.getName(), this.name)
        && Objects.equals(cat.getEye(), this.eyes);
  }


  @Override
  public int hashCode() { // hashcode -> represent object address
    return Objects.hash(this.name, this.age); // 點樣認出同一件OBJECT
  }


}

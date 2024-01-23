package com.vtxlab.bootcamp.lomboks; // 座標

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@SuperBuilder

public class Person extends Staff{

  private String name;

  private int age;

  public Person(String name) { // No need to write anymore after import lombok's method
    this.name = name;
  }

  public Person(int age) { // No need to write anymore after import lombok's method
    this.age = age;
  }

  public boolean isElderly() {
   return this.age >= 65;
  }

  public static Person of(String name, int age) {
    if (name == null || age < 0){
      return null;
    }
    return new Person(name, age);
  }

  public static String concat(String s1, String s2) {
    if (s1 == null && s2 != null)
      return s2;
    if (s2 == null && s1 != null)
      return s1;
    if (s2 == null && s1 == null)
      throw new IllegalArgumentException();
    return s1.concat(s2);
  }







  public static void main(String[] args) {
    Person person = new Person();
    person.setAge(30);
    person.setName("John");
    System.out.println(person.getName() + " " + person.getAge()); // John 30

    Person person2 = new Person("Mary", 20);
    System.out.println(person2.getAge()); // 20

    System.out.println(person.toString()); // Person(name=John, age=30)

    Person person3 = new Person("John", 30);
    System.out.println(person.hashCode()); // 2319790
    System.out.println(person3.hashCode()); // 2319790

    Person person4 = Person.builder() //
      .name("Steve") //
      .age(15) //
      .build();
    
  }



}


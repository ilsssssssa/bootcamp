package com.vtxlab.bootcamp.lomboks; // 座標

import java.util.ArrayList;
import java.util.List;
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
@ToString(callSuper = true) // name? age?
@EqualsAndHashCode(callSuper = true) // name? age?
@SuperBuilder // name? age? 

public class Developer extends Staff {

  private List<String> skills;

  public Developer(String name, int id, List<String> skills) {
    super(id, name);
    this.skills = skills;
  }

  public static void main(String[] args) {
    Developer developer = new Developer();
    developer.setSkills(null);
    System.out.println(developer.getSkills()); // null

    Developer developer2 =
        new Developer(new ArrayList<>(List.of("coding", "testing")));

    // Developer(super=Staff(id=0, name=null, skills=[coding, testing]))
    System.out.println(developer2.toString());

    System.out.println(developer2.getName()); // null -- set getter&setter in Staff
    System.out.println(developer2.getId()); // 0

    Developer developer3 = Developer.builder().id(2) //
        .name("Lydia") //
        .skills(new ArrayList<>(List.of("coding", "testing"))).build();

    Developer developer4 = Developer.builder().id(2) //
        .name("Lydia") //
        .skills(new ArrayList<>(List.of("coding", "testing"))).build();

    System.out.println(developer3.equals(developer4)); // true
    System.out.println(developer3.hashCode());  //-415610255
  }
}

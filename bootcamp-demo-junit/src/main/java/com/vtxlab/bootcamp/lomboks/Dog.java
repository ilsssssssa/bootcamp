package com.vtxlab.bootcamp.lomboks;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
// @AllArgsConstructor
@RequiredArgsConstructor
public class Dog {

   private final String firstName = "John";

   @NonNull
   private String lastName;

   @NonNull
   private String color;


   public static void main(String[] args) {
    Dog dog = new Dog("Chan", "Red");
    System.out.println(dog); //Dog(firstName=John, lastName=Chan, color=Red)

    Dog dog2 = new Dog(null, null);
    System.out.println(dog2);
   }

}

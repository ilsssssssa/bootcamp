package com.vtxlab.bootcamp;

import com.vtxlab.bootcamp.unittest.Calculator;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(OrderAnnotation.class)
public class Calculator2Test {
  
  private int value;

  @BeforeAll
  void berforeAll() {
    this.value = 10000;
    System.out.println("PER_CLASS, beforeAll this.value=" + this.value);
  }
  
  @Test
  @Order(1)
  void testAdd() {
    this.value = Calculator.substract(2, 3);
    assertEquals(5, this.value);
  }

  @Test
  @Order(2)
  void testSubstract() {
    this.value = Calculator.substract(this.value, 10);
    assertEquals(-5, this.value);
  }

  public static void main(String[] args) {
    Calculator2Test calculator2 = new Calculator2Test();
    calculator2.testAdd();
    calculator2.testSubstract();
  }
}

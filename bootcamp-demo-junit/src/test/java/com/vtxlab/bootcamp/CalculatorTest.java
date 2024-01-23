package com.vtxlab.bootcamp;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test; // Junit5 -> org.junit.jupiter
import com.vtxlab.bootcamp.lomboks.Order;
import com.vtxlab.bootcamp.lomboks.Person;
import com.vtxlab.bootcamp.unittest.Calculator;

// Unit Test
// Test Environment
// @TestInstance(TestInstance.Lifecycle.PER_METHOD) // default setting
public class CalculatorTest {

  private int x;
  private static int z = 50;

  @BeforeAll
  static void berforeAll() { // must be static
    // execute one time only
    z += 10; // 60
    System.out.println("BeforeAll z=" + z);
  }

  
// TestInstance.Lifecycle.PER_METHOD -> the meaning of @BeforeEach, same as @BeforAll
  @BeforeEach 
  void initialize() {
    this.x = 100;
    System.out.println("BeforeEach: this.x=" + x);
  }


  @Test // maven trigger this method during "test" phase
  void testAdd() {
    int actualResult = Calculator.add(3, 2);
    int expectResult = 5;
    assertEquals(expectResult, actualResult);
    assertNotEquals(6, Calculator.add(3, 2));
    assertNotEquals(4, Calculator.add(3, 2));

    // Refer to Lark Notes - Chapter40-JUnit5-Jupiter
    // http://javahongkong.larksuite.com/wiki/Y8PNwy3ZzUn7jk4l9FuC9zUsVe
    // assertTrue
    Person person = new Person("Sally", 65);
    assertTrue(person.isElderly());
    assertTrue(new Person("Sally", 66).isElderly());
    // assertFalse
    assertFalse(new Person("Sally", 64).isElderly());

    // assertNull
    assertNull(Person.of("John", -3));
    assertNull(Person.of(null, 0));
    // assertNotNull
    assertNotNull(Person.of("John", 40));

    // assertArrayEquals
    // assertSame, what is different between asserSame and assetEquals
    String s1 = "hello";
    String s2 = "hello";
    assertSame(s1, s2); // check if they are the same object

    // assertNotSame
    String s3 = new String("hello");
    assertNotSame(s2, s3); // check if they are not same object
    // Person equals()
    Person x1 = new Person("Jason", 30);
    Person x2 = new Person("Jason", 30);
    assertNotSame(x1, x2);
    assertEquals(x1, x2);

    // assertThrows
    assertThrows(IllegalArgumentException.class,
        () -> Person.concat(null, null));
    // assertDoesNotThrow
    assertDoesNotThrow(() -> Person.concat("abc", "def"));
    assertDoesNotThrow(() -> Person.concat(null, "def"));
    assertDoesNotThrow(() -> Person.concat("abc", null));

    // assertAll
    Order order = new Order();
    assertAll(() -> assertTrue(order.order()),
        () -> assertTrue(order.payment()),
        () -> assertTrue(order.lockInventory()));

    // assertTimeout
    List<String> items = new ArrayList<>();
    for (int i = 0; i < 1_000_000; i++) {
      items.add(String.valueOf(i));
    }
    assertTimeout(Duration.ofMillis(10), 
    () -> order.placeOrder(items));

  }

  @Test // let us communicate with Maven
  void testOther() {
    assertTrue(5 > 4);
    x++;
    System.out.println("this.x=" + this.x);
  }


  public static void main(String[] args) {
    // By default, the Unit Testing will be performed by instance & and instance method
    CalculatorTest calculatorTest = new CalculatorTest();
    calculatorTest.testAdd();
    calculatorTest.testOther();


  }


}

package com.vtxlab.bootcamp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
@ExtendWith
public class App1Test {

  @Mock
  private App2 dependency; // we didn't create object 

  @Test
  void testAdd(){

    // If someone call dependency.provider(10, 4), return -323
    Mockito.when(dependency.provider(10, 4)).thenReturn(-323);

    //
    App1 app1 = new App1(dependency);

    int result = app1.add(5, 4);

    assertEquals(677, result);

  }
}


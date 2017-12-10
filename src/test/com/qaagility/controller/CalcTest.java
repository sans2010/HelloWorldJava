package com.qaagility.controller;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalcTest {
  Calcmul cal = new Calcmul();
  
  @Test
  public void testSCalc1() {
    assertEquals("Result", 18, cal.mul());
  }
}

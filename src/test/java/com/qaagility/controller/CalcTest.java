package com.qaagility.controller;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalcTest {
  Calcmul cal = new Calcmul();
  Calculator calc = new Calculator();
  
  @Test
  public void testSCalc1() {
    assertEquals("Result", 18, cal.mul());
  }

  @Test
  public void testSCalc() {
    assertEquals("Result", 9, calc.add());
  }
}

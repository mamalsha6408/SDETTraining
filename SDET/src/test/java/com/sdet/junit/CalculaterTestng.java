package com.sdet.junit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculaterTestng {

	Calculater cal=new Calculater();
	
  @Test
  public void add1Test() {
    Assert.assertEquals(10, cal.add1(5, 5));
  }

  @Test
  public void sub1Test() {
    Assert.assertEquals(0, cal.sub1(5, 5));
  }
}

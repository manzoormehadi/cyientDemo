package day4;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import graphql.Assert;

public class TestA {
  @Test (groups="smoke")
  public void first() {
	  System.out.println("this is my first test in A");
  }
  
  @Test(groups="functional")
  public void second() {
	  System.out.println("this is my second test in A");
  }
  
  @Test(groups="smoke")
  public void third() {
	  System.out.println("this is my third test in A");
	  Assert.assertTrue(true);
  }
  
  @BeforeTest
  public void beforetest()
  {
	  System.out.println("this is my before test");
  }
}

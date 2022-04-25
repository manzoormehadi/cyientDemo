package day4;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class TestC {
  @Test
  public void f() {
	  System.out.println("this is my test");
  }
  @BeforeSuite
  public void beforeSuiote() {
	  System.out.println("this is my before test");
  }

  @AfterSuite
  public void after() {
	  System.out.println("this is my after test");
  }

}

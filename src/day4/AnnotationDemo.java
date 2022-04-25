package day4;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class AnnotationDemo {
  
  @BeforeMethod
  public void beforeClass() {
	  System.out.println("this is before class");
  }

  @AfterMethod
  public void afterClass() {
	  System.out.println("this is after class");
  }

  @Test 
  public void testcase()
  {
	  System.out.println("this is test class");
  }
  
  @Test 
  public void testcase2()
  {
	  System.out.println("this is test class");
  }
}

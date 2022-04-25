package day4;

import org.testng.annotations.Test;

public class BasicAnnotations {
  @Test(priority=1)
  public void AppleTest() {
	  System.out.println("this is my Apple Test");
  }
  
  @Test(priority=2)
  public void MangoTest() {
	  System.out.println("this is my Mango Test");
  }
  @Test(priority=3)
  public void BananaTest1() {
	  System.out.println("this is my Banana Test");
  }
  @Test(priority=3)
  public void BananaTest2() {
	  System.out.println("this is my Banana Test");
  }
  
  @Test(priority=-1)
  public void OrangeTest() {
	  System.out.println("this is my Orange Test");
  }
}

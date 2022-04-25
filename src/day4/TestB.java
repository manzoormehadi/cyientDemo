package day4;

import org.testng.annotations.Test;

public class TestB {
	@Test(groups="functional")
	  public void first() {
		  System.out.println("this is my first test in B");
	  }
	  
	  @Test(groups="functional")
	  public void second() {
		  System.out.println("this is my second test in B");
	  }
	  
	  @Test(groups="smoke")
	  public void third() {
		  System.out.println("this is my third test in B");
	  }
}

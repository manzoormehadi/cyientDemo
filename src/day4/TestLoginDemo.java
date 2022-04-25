package day4;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestLoginDemo {
	public WebDriver driver;
  @Test
  public void loginFunctionality() {
	  driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("globallogic@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("global");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		String text=driver.findElement(By.linkText("globallogic@gmail.com")).getText();
		Assert.assertEquals(text, "globallogic@gmail1.com");
		
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "/home/manzoormehadi/StackRoute/Training Workspace/GlobalLogic/Jar Files/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}

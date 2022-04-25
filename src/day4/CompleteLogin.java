package day4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CompleteLogin {
	public WebDriver driver;
	@BeforeClass
	public void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver", "/home/manzoormehadi/StackRoute/Training Workspace/GlobalLogic/Jar Files/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
	}
  @Test
  public void login() {
	  driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("globallogic@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("global");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		String text=driver.findElement(By.linkText("globallogic@gmail.com")).getText();
		assertEquals(text, "globallogic1@gmail.com");
  }
  
  @Test(dependsOnMethods = "login")
  public void logout() {
	  driver.findElement(By.linkText("Log out")).click();
	  driver.close();
  }
}

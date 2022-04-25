package day4;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class DataDrivenTesting {
	public WebDriver driver;
	@BeforeClass
	public void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver", "/home/manzoormehadi/StackRoute/Training Workspace/GlobalLogic/Jar Files/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
	}
  @Test(dataProvider = "dp")
  public void f(String email, String password) {
	  driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.linkText("Log out")).click();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "globallogic@gmail.com", "global" },
      new Object[] { "manz@mass.com", "mass123" },
      new Object[] {"manz1@mass.com","mass123"},
    };
  }
}

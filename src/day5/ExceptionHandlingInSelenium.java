package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionHandlingInSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/manzoormehadi/StackRoute/Training Workspace/GlobalLogic/Jar Files/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("manz@mass.com");
		driver.findElement(By.id("Password")).sendKeys("mass12");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		try 
		{
			driver.findElement(By.linkText("manz@mass.com")).isDisplayed();
			System.out.println("succesful Login");
			driver.findElement(By.linkText("Log out")).click();
		}catch(NoSuchElementException e) {
			System.out.println("unsuccesful Login");
		}

	}

}

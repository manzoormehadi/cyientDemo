package day4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



class LoginDemo {
	public WebDriver driver;

	
	@Test
	void test() {
		System.setProperty("webdriver.chrome.driver", "/home/manzoormehadi/StackRoute/Training Workspace/GlobalLogic/Jar Files/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("globallogic@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("global");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		String text=driver.findElement(By.linkText("globallogic@gmail.com")).getText();
		assertEquals(text, "globallogic1@gmail.com");
	}
	
}

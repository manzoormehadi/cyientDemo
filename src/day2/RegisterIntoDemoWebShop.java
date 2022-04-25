package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterIntoDemoWebShop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/manzoormehadi/StackRoute/Training Workspace/GlobalLogic/Jar Files/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("asderf");
		driver.findElement(By.id("LastName")).sendKeys("defg");
		driver.findElement(By.id("Email")).sendKeys("asderg@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("asdfghj");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("asdfghj");
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.linkText("Log out")).click();
	}

}

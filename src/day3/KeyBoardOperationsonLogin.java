package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardOperationsonLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/manzoormehadi/StackRoute/Training Workspace/GlobalLogic/Jar Files/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("asderg@gmail.com");
		Actions act= new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("asdfghj").perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.ENTER).perform();

	}

}

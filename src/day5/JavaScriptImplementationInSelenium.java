package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptImplementationInSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/manzoormehadi/StackRoute/Training Workspace/GlobalLogic/Jar Files/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Index.html");
		driver.manage().window().maximize();
		JavascriptExecutor ji = (JavascriptExecutor)driver;
		ji.executeScript("document.getElementById(\"email\").value='Manzoor'");
		ji.executeScript("document.getElementById(\"enterimg\").click()");
		WebElement firstName=driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
		ji.executeScript("arguments[0].value='Manzoor'", firstName);
	}

}

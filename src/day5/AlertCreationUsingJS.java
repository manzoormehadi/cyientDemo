package day5;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertCreationUsingJS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/manzoormehadi/StackRoute/Training Workspace/GlobalLogic/Jar Files/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Index.html");
		driver.manage().window().maximize();
		JavascriptExecutor ji = (JavascriptExecutor)driver;
		//ji.executeScript("alert('Welcome to StackRoute')");
		//driver.switchTo().alert().accept();
		//ji.executeScript("confirm('Welcome to StackRoute')");
		//driver.switchTo().alert().dismiss();
		ji.executeScript("prompt('Welcome to StackRoute','True/False')");
		
	}

}

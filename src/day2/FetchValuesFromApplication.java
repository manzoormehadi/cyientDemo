package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchValuesFromApplication {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/manzoormehadi/StackRoute/Training Workspace/GlobalLogic/Jar Files/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		boolean register=driver.findElement(By.linkText("Register")).isDisplayed();
		System.out.println(register);
		driver.findElement(By.linkText("Log in")).click();
		String text=driver.findElement(By.xpath("//strong[contains(text(),'Returning')]")).getText();
		System.out.println(text);
		
		driver.findElement(By.id("Email")).sendKeys("manz@gmail.com");
		String text1=driver.findElement(By.id("Email")).getAttribute("value");
		System.out.println(text1);
		
		String tag=driver.findElement(By.id("Email")).getTagName();
		System.out.println(tag);
		driver.close();
	}

}

package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class NotePadInDemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/manzoormehadi/StackRoute/Training Workspace/GlobalLogic/Jar Files/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement computer=driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Computers')]"));
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.moveToElement(computer).build().perform();
		WebElement notebook=driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Notebooks')]"));
		act.moveToElement(notebook).click().perform();
		WebElement product=driver.findElement(By.id("products-orderby"));
		Select sel = new Select(product);
		//sel.selectByIndex(4);
		//sel.selectByValue("http://demowebshop.tricentis.com/notebooks?orderby=6");
		sel.selectByVisibleText("Created on");
		driver.close();
	}

}

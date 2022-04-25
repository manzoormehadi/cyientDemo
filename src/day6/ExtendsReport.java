package day6;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtendsReport {

	public static void main(String[] args) {
		ExtentReports extent;
		ExtentTest extentTest;
		extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/manzoorReport.html");
		extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
		extentTest=extent.startTest("Launching Browser");
		System.setProperty("webdriver.chrome.driver", "/home/manzoormehadi/StackRoute/Training Workspace/GlobalLogic/Jar Files/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		String title=driver.getTitle();
		extentTest.log(LogStatus.PASS, title);
		extent.endTest(extentTest);
		extentTest=extent.startTest("Login Into Application");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("manz@mass.com");
		driver.findElement(By.id("Password")).sendKeys("mass123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		String email=driver.findElement(By.linkText("manz@mass.com")).getText();
		extentTest.log(LogStatus.PASS, email);
		extent.endTest(extentTest);
		extentTest=extent.startTest("Logout");
		driver.findElement(By.linkText("Log out")).click();
		String closingTitle=driver.getTitle();
		driver.close();
		extentTest.log(LogStatus.PASS, closingTitle);
		extent.endTest(extentTest);
		extent.flush();
		extent.close();
	}

}

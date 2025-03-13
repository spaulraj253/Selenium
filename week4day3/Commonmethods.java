package week4day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class Commonmethods {
	WebDriver driver;

	@Parameters({ "url", "browser","username","password" })
	@BeforeMethod

	public void preCondition(String url, String browser,String username,String password) {
		switch (browser) {
		case "chrome":
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito"); 
			driver = new ChromeDriver(options);
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;

		default:
			ChromeOptions options1 = new ChromeOptions();
			options1.addArguments("--incognito"); 
			driver = new ChromeDriver(options1);
			break;
		}
        	
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Login to https://login.salesforce.com
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("Login")).click();
	}

	@AfterMethod
	public void postCondition() {
		driver.quit();
	}
}
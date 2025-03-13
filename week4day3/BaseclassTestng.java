package week4day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;


 
public class BaseclassTestng {
	WebDriver driver;

	@Parameters({"url","username","password"})

	@BeforeMethod
	public static void main(String url,String username,String pwd) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("democsr");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.partialLinkText("CRM")).click();
	    driver.findElement(By.linkText("Accounts")).click();
	    driver.findElement(By.linkText("Create Account")).click();
	}

	@AfterMethod
	public void postcondition() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.close();
		}
}

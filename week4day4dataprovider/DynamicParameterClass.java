package week4day4dataprovider;



	import java.time.Duration;

import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Parameters;
	import org.openqa.selenium.WebDriver;


	 
	public class DynamicParameterClass {
		WebDriver driver;

		@Parameters({"url","username","password"})

		@BeforeMethod
		public  void precondition(String url,String username,String pwd) {
			driver  = new ChromeDriver();

			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			
		}

		@AfterMethod
		public void postcondition()
		{
			
			driver.close();
			}
	

		

	}



package week4day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class EditLead {
	
	@Test

			public  void runEdit() throws InterruptedException {
			 {
				ChromeDriver driver=new ChromeDriver();
				//String phonenum="1238896";
				driver.get("http://leaftaps.com/opentaps/");
				driver.manage().window().maximize();
				driver.findElement(By.id("username")).sendKeys("democsr");
			    driver.findElement(By.id("password")).sendKeys("crmsfa");
			    driver.findElement(By.className("decorativeSubmit")).click();
			    driver.findElement(By.partialLinkText("CRM")).click();
			    driver.findElement(By.linkText("Leads")).click();
			    driver.findElement(By.linkText("Create Lead")).click();
			    driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleafng123");
			    driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Newsel1");
			    driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Newsel2");
			    driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Newsel3");
			    driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Testleaf_Selenium");
			    driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("TestleafAutomationSelenium");
			    driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("Testleaf@gmail.com");
			    WebElement Value=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			    Select Object=new Select(Value);
			    Object.selectByVisibleText("New York");
			    Thread.sleep(2000);
			    driver.findElement(By.className("smallSubmit")).click();
			    String title=driver.getTitle();
			    System.out.println(title);
			    driver.findElement(By.linkText("Edit")).click();
			    Thread.sleep(2000);
			    driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
			    driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Impnotes");
			    driver.findElement(By.name("submitButton")).click();
			    String title1=driver.getTitle();
			    System.out.println(title1);
			    

	}

			}
}

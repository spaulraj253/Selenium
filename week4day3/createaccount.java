package week4day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class createaccount {

	@Test
		public  void runcreateaccount() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("democsr");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.partialLinkText("CRM")).click();
	    driver.findElement(By.linkText("Accounts")).click();
	    driver.findElement(By.linkText("Create Account")).click();
	    driver.findElement(By.id("accountName")).sendKeys("TestSeleniung567");
	    driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	    WebElement dropdown = driver.findElement(By.name("industryEnumId"));
	     Select objSelect = new Select(dropdown);
	    objSelect.selectByIndex(2);
	    //ownership
	    WebElement dropdown1 = driver.findElement(By.name("ownershipEnumId"));
	     Select objSelect1 = new Select(dropdown1);
	    objSelect1.selectByVisibleText("Partnership");
	    
	    //source
	    WebElement dropdown2 = driver.findElement(By.name("dataSourceId"));
	     Select objSelect2 = new Select(dropdown2);
	     objSelect2.selectByIndex(4);
	     //market
	     WebElement dropdown3 = driver.findElement(By.name("marketingCampaignId"));
	     Select objSelect3 = new Select(dropdown3);
	     objSelect3.selectByValue("CATRQ_CARNDRIVER");
	     //stateprovience
	     WebElement dropdown4 = driver.findElement(By.name("generalStateProvinceGeoId"));
	     Select objSelect4 = new Select(dropdown4);
	     objSelect4.selectByIndex(6);	     
	     
	     driver.findElement(By.className("smallSubmit")).click();
	     String title=driver.getTitle();
	     System.out.println(title);
	     String orgtitle="Account Details | opentaps CRM";
	    	if(title.equals(orgtitle))
	    	{
	    		System.out.println("Title is expected");
	    	}
	    	else
	    		System.out.println("Title is not expected");
	    Thread.sleep(3000);
	}

}

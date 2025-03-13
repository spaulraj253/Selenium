package week4.day4;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class editleadnew extends DynamicParameterClass{
	@DataProvider(name="fetch")
	public String[][] senddata()
	{
		String data[][]= new String[2][2];
        data[0][0] = "98127";
        data[0][1]= "Testleaf";
        		
        data[1][0] = "98127";
        data[1][1]= "TCS";       		
        		
        
        
        return data;
	}
	
	
@Test(dataProvider="fetch")
	public void runEdit(String phno, String cname) throws InterruptedException {
		//ChromeDriver driver  = new ChromeDriver();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phno);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-partyId')]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Edit")).click();
		WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys(cname);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		Assert.assertTrue(text.contains(cname));
	}

}

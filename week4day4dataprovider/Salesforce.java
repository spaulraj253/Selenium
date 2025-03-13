package week4day4dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Salesforce extends Commonmethods {
	

	@DataProvider(name = "Data")
	public String[][] setUpData() {
		String[][] data = new String[2][3];
		// row1
		data[0][0] = "Salesforce Automation by Santhiya";
		data[0][1] = "Testleaf";
		data[0][2] = "Salesforces";

		// row2
		data[1][0] = "Salesforce Automation by SanthiyaNew";
		data[1][1] = "TCS";
		data[1][2] = "Change";
return data;
	}

	@Test(dataProvider="Data")

	
	
	public void salesForce(String lName,String cName,String desc) throws InterruptedException
	{
        
		
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
				
		WebElement legalEntity = driver.findElement(By.xpath("//div[@id='lgt-accordion-section-179']//ul/li//p[text()='Legal Entities']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				wait.until(ExpectedConditions.elementToBeClickable(legalEntity));
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", legalEntity);
		
		
		legalEntity.click();
		
		
		driver.findElement(By.xpath("//button[contains(@title,'Legal Entities')]")).click();
	
		driver.findElement(By.xpath("//li[@data-target-selection-name='sfdc:StandardButton.LegalEntity.New']")).click();		
		
		
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(lName);
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys(cName);	
		
		driver.findElement(By.xpath("//label[text()='Description']//following::textarea")).sendKeys(desc);
		//Select Status as 'Active'
		WebElement status = driver.findElement(By.xpath("//div[@class='slds-form-element__control']//span[contains(text(),'None')]"));
		js.executeScript("arguments[0].scrollIntoView(true);", status);
		status.click();		
		WebElement statusActive = driver.findElement(By.xpath("//span[@class='slds-media__body']/span[text()='Active']"));
		//js.executeScript("arguments[0].scrollIntoView(true);", statusActive);
		statusActive.click();
		
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();		
		String confirmMsg = driver.findElement(By.xpath("//div[contains(@id,'toastDescription')]")).getText();
		System.out.println(confirmMsg);
		
	}
}
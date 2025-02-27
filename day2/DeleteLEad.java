package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLEad {

	public static void main(String[] args) throws InterruptedException {
		 {
			ChromeDriver driver=new ChromeDriver();
			String phonenum="1238896";
			driver.get("http://leaftaps.com/opentaps/");
			driver.findElement(By.id("username")).sendKeys("democsr");
		    driver.findElement(By.id("password")).sendKeys("crmsfa");
		    driver.findElement(By.className("decorativeSubmit")).click();
		    driver.findElement(By.partialLinkText("CRM")).click();
		    driver.findElement(By.linkText("Leads")).click();
		    driver.findElement(By.linkText("Create Lead")).click();
		    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sel2");
		    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sel3");
		    driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mr");
		    driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phonenum);
		    driver.findElement(By.name("submitButton")).click();
		    String title=driver.getTitle();
		    System.out.println(title);
		    driver.findElement(By.linkText("Find Leads")).click();
		    driver.findElement(By.xpath("//span[text()='Phone']")).click();
		    driver.findElement(By.name("phoneNumber")).sendKeys(phonenum);
		    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		    Thread.sleep(2000);
		    WebElement Value=driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner')]/a"));
		    System.out.println("LEadname is" +Value.getText());
		    Value.click();
		    driver.findElement(By.linkText("Delete")).click();
		    driver.findElement(By.linkText("Find Leads")).click();
		    driver.findElement(By.xpath("//span[text()='Phone']")).click();
		    driver.findElement(By.name("phoneNumber")).sendKeys(phonenum);
		    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		    driver.findElement(By.xpath("//div[contains(text(),'No records to display')]"));
		    
} 
}
}

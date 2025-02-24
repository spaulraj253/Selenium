package learnselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead 
{

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
	    driver.findElement(By.id("username")).sendKeys("democsr");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.partialLinkText("CRM")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Create Lead")).click();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("San");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("P");
	    driver.findElement(By.className("smallSubmit")).click();
	    String orgtitle="View Lead | opentaps CRM"; 		
	    		
	    
	    
	    String title=driver.getTitle();
	    System.out.println("Original Title is" +title);
	    if(orgtitle.equals(title))
	    {
	    	System.out.println("Title is coorect");
	    	
	    }else
	    {
	    	System.out.println("Title is not correct");
	    }
	    Thread.sleep(1000);
	    driver.close();

}
}

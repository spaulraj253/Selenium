package learnselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
	    driver.findElement(By.id("username")).sendKeys("democsr");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.partialLinkText("CRM")).click();
	    driver.findElement(By.linkText("Accounts")).click();
	    driver.findElement(By.linkText("Create Account")).click();
	    driver.findElement(By.id("accountName")).sendKeys("TestSeleniumnew");
	    driver.findElement(By.name("description")).sendKeys("Automation");
	    driver.findElement(By.id("numberEmployees")).sendKeys("20");
	    driver.findElement(By.id("officeSiteName")).sendKeys("Testleafs");
	    driver.findElement(By.className("smallSubmit")).click();
	    
	    
	    String orgtitle="Account Details| opentaps CRM"; 		
	    		
	    
	    
	    String title=driver.getTitle();
	    System.out.println("Original Title is" +title);
	    if(orgtitle.equals(title))
	    {
	    	System.out.println("Title is correct");
	    	
	    }else
	    {
	    	System.out.println("Title is not correct");
	    }
	    Thread.sleep(1000);
	    driver.close();

	}

}

package seleniummarathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class bookticket {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pvrcinemas.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(@class,'cinemas')]")).click();
		Thread.sleep(2000);
       driver.findElement(By.xpath("//div[@id='cinema']")).click();
       driver.findElement(By.xpath("//div[@class='p-dropdown-items-wrapper']//li[6]")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//div[@class='p-dropdown-items-wrapper']//li[2]")).click();
       
       driver.findElement(By.xpath("//div[@class='p-dropdown-items-wrapper']//li[6]")).click();
       driver.findElement(By.xpath("//span[text()='Tamil']/parent::li[1]")).click();
       driver.findElement(By.xpath("//span[text()='Book']/parent::button[@type='submit']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//button[text()='Accept']")).click();
       Thread.sleep(2000);
       WebElement seat=driver.findElement(By.xpath("//span[@class='seat-current-pvr']"));
       seat.click();
       driver.findElement(By.xpath("//button[text()='Proceed']")).click();
       String name=driver.findElement(By.xpath("//div[@class='movies-summary']")).getText();
       System.out.println("Summary" +name);
       String name1=driver.findElement(By.xpath("//div[@class='seat-info']")).getText();
       System.out.println("seatinfo" +name1);
       String name2=driver.findElement(By.xpath("//div[@class='seat-bottom-btn']")).getText();
         
       System.out.println(name2);
       Thread.sleep(2000);
       driver.findElement(By.xpath("//button[text()='Proceed']")).click();
       String title=driver.getTitle();
       System.out.println("Title is" +title);
       
	}
	

}

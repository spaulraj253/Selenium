package week3day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonusingActionclass {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement Ele=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		WebElement Search=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		Actions action=new Actions(driver);
	    action.moveToElement(Ele).sendKeys(Ele,"oneplus 9 pro").click(Search).perform();
	    Thread.sleep(4000);
	    System.out.println("Price of 1st product");
String price=driver.findElement(By.xpath("(//span[contains(@class,'a-price-whole')])[2]")).getText();
System.out.println(price);
	
//Rating
	System.out.println("-----------");
	WebElement Rating=driver.findElement(By.xpath("(//a[contains(@aria-label,'ratings')])[1]"));
	System.out.println("Rating of 1st product" +Rating.getText());
	
	
	WebElement link=driver.findElement(By.xpath("(//span[contains(text(),'OnePlus')])[1]"));
	action.click(link).perform();
	Set<String> newwindow=driver.getWindowHandles();
    List<String> child=new ArrayList<String>(newwindow);
    driver.switchTo().window(child.get(1));
    //System.out.println(driver.getTitle());
    Thread.sleep(1000);
    File src = driver.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
    File des= new File("C:\\Users\\HP\\eclipse\\LearnAutomation\\src\\main\\resources\\Snapshot\\Amazon.png");
	FileUtils.copyFile(src, des);
	
	//add to cart
	Thread.sleep(1000);
	WebElement Cart=driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"));
	action.moveToElement(Cart).click().perform();
	
	//total in cart
	Thread.sleep(1000);
	String total=driver.findElement(By.xpath("//div[@class='a-fixed-left-grid-col a-col-right']/descendant::span[@id='attach-accessory-cart-subtotal']")).getText();
		System.out.println("Total" +total);
	}

}

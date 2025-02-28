package seleniummarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String Res=driver.findElement(By.xpath("//div[@class='sg-col-inner']")).getText();
		System.out.println(Res);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//li[@id='p_123/2037']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Featured']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		String name=driver.findElement(By.xpath("//span[text()='Safari']")).getText();
		System.out.println("Name:" +name);
		String bag=driver.findElement(By.xpath("//div[contains(@class,'top-small s-price-instructions-style')][1]")).getText();
		System.out.println("price:" +bag);
		String title=driver.getTitle();
		System.out.println(title);
		
	
	

	}

}

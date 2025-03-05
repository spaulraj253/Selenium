package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//input[@class='inputLogin']")).sendKeys("democsr");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
        driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
        driver.findElement(By.partialLinkText("CRM")).click();
        driver.findElement(By.linkText("Contacts")).click();
        driver.findElement(By.linkText("Merge Contacts")).click();
        driver.findElement(By.xpath("//input[@id='partyIdFrom']/following-sibling::a")).click();
        Set<String> newwindow=driver.getWindowHandles();
        List<String> child=new ArrayList<String>(newwindow);
        driver.switchTo().window(child.get(1));
        System.out.println("child:" +driver.getTitle());
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='DemoCustomer']")).click();
        driver.switchTo().window(child.get(0));
        System.out.println("Parent:" +driver.getTitle());
        driver.findElement(By.xpath("//input[@id='partyIdTo']/following-sibling::a")).click();
        Set<String> newwindow1=driver.getWindowHandles();
        List<String> child1=new ArrayList<String>(newwindow1);
        driver.switchTo().window(child1.get(1));
        System.out.println("child:" +driver.getTitle());
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='DemoLBCust']")).click();
        driver.switchTo().window(child.get(0));
        System.out.println("Parent:" +driver.getTitle());
        driver.findElement(By.xpath("//a[text()='Merge']")).click();
        
        Alert alert=driver.switchTo().alert();        
        alert.accept();
        String title=driver.getTitle();
        System.out.println("Current title:" +title);
        
        
        
	}

}

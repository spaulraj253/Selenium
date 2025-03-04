package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertsass {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		Thread.sleep(3000);
		
		WebElement tryit=driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
		tryit.click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Test");
		System.out.println("Text" +alert.getText());
		alert.accept();
		System.out.println(driver.findElement(By.id("demo")).getText());
		Thread.sleep(2000);
		WebElement dis=driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
		dis.click();
		Alert alert1=driver.switchTo().alert();
		alert1.sendKeys("Test");
		System.out.println("Text" +alert.getText());
		alert.dismiss();
		System.out.println(driver.findElement(By.id("demo")).getText());
				driver.close();
		
		
	}

}

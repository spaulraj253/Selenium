package week3.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement promptdialog=driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following-sibling::button"));
		promptdialog.click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Test");
		System.out.println("Text" +alert.getText());
		alert.dismiss();
		String text=driver.findElement(By.id("confirm_result")).getText();
		
		System.out.println(text);
		driver.close();
		
		
		// TODO Auto-generated method stub

	}

}

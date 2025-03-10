package week3day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BigBasket {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Actions action=new Actions(driver);
		//click on shop by category
		WebElement Ele=driver.findElement(By.xpath("(//span[text()='Category'])[2]"));
		action.moveToElement(Ele).click(Ele).perform();
		action.pause(1000).perform();
		
	// Mouse over "Foodgrains, Oil & Masala"
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement Food=driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		action.moveToElement(Food).perform();
		action.pause(1000).perform();
		
		// Mouse over "Rice & Rice Products".
	
		WebElement Rice=driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"));
		action.moveToElement(Rice).perform();
		action.pause(1000).perform();
		 //Click on "Boiled & Steam Rice".
		
		
		WebElement Boil=driver.findElement(By.xpath("(//a[text()='Boiled & Steam Rice'])[1]"));
		action.moveToElement(Boil).click(Boil).perform();
		action.pause(1000).perform();
		
		//select bbroyal
		WebElement BBRoyal=driver.findElement(By.xpath("//input[@id='i-BBRoyal']"));
		wait.until(ExpectedConditions.visibilityOf(BBRoyal));
		action.moveToElement(BBRoyal).click(BBRoyal).perform();
		action.pause(1000).perform();
		
		//select tamil ponni rice
		WebElement boildRice = driver
				.findElement(By.xpath("//h3[contains(text(),'Ponni Boiled Rice - 12 To 17 Months Old')]"));
		wait.until(ExpectedConditions.visibilityOf(boildRice));
		action.moveToElement(boildRice).click(boildRice).perform();
		action.pause(1000).perform();
		//select 5kg
				Set<String> newwindow=driver.getWindowHandles();
			    List<String> child=new ArrayList<String>(newwindow);
			    driver.switchTo().window(child.get(1));	
		WebElement Bag=driver.findElement(By.xpath("//span[text()='5 kg']"));
		wait.until(ExpectedConditions.visibilityOf(Bag));
		action.click(Bag).perform();
		Thread.sleep(1000);
		
		//price
		System.out.println(driver.findElement(By.xpath("//td[contains(text(),'Price:')]")).getText());
		
		//click add to basket
		WebElement Add=driver.findElement(By.xpath("(//button[text()='Add to basket'])[1]"));
		action.click(Add).perform();
		Thread.sleep(1000);
		
		WebElement successMsg = driver.findElement(By.xpath("//p[contains(text(),'An item has been added to your basket successfully')]"));
		System.out.println("Sucess MEssage" +successMsg.getText());
		
		Thread.sleep(1000);
	    File src = driver.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
	    File des= new File("C:\\Users\\HP\\eclipse\\LearnAutomation\\src\\main\\resources\\Snapshot\\BigBasket.png");
		FileUtils.copyFile(src, des);
		driver.close();
		 driver.switchTo().window(child.get(0));	
		 driver.close();

			System.out.println("Windows are closed successfully");

	}

}

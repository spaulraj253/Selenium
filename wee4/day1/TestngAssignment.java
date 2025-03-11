package wee4.day1;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestngAssignment {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://finance.yahoo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//click more
		Actions action=new Actions(driver);
		WebElement more=driver.findElement(By.xpath("//span[text()='More']"));
		WebElement crypto=driver.findElement(By.xpath("//a[contains(@aria-label,'Finance: Crypto')]"));
		action.moveToElement(more).click(crypto).perform();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElements(By.xpath("//table[@class='markets-table freeze-col yf-hhhli1 fixedLayout']"));
		List<WebElement> Row=driver.findElements(By.xpath("//table[@class='markets-table freeze-col yf-hhhli1 fixedLayout']//tbody/tr"));
		int RowSize=Row.size();
		System.out.println("Row Size:" +RowSize);
		List<WebElement> columnheader = driver
				.findElements(By.xpath("//table[@class='markets-table freeze-col yf-hhhli1 fixedLayout']//tr/th"));
		int columnSize = columnheader.size();
		System.out.println("Column Size:" + columnSize);
		
		for (int i = 2; i <= RowSize; i++) //(tr[1] is header so actual row starts from 2)
		{
			
			WebElement cryptoName = driver.findElement(
					By.xpath("//table[@class='markets-table freeze-col yf-hhhli1 fixedLayout']//tr[" + i + "]/td[2]"));

			System.out.println(cryptoName.getText());
		}
		
					
         driver.quit();
	}


	}


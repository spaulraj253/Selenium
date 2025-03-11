package wee4.day1;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTestng {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("chkSelectDateOnly")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<WebElement> TrainColumn=driver.findElements(By.xpath("//div[@id='divTrainsList']//tbody/tr/td[2]"));
		int Row=TrainColumn.size();
		System.out.println(Row);
		//Set<String> set=new HashSet<String>();
		for (int i=2;i<=Row;i++)
				{
		WebElement Data=driver.findElement(By.xpath("//div[@id='divTrainsList']//tbody/tr[" +i+ "]/td[2]"));
			String TrainName=Data.getText();
		
			System.out.println(TrainName);
				}
	}
		
		
		
				
		
	}



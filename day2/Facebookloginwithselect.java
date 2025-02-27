package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Facebookloginwithselect {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
				driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(@class,'selected')]")).click();
		driver.findElement(By.xpath("//input[contains(@class,'inputtext')]")).sendKeys("ABCD");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("EFGS");
		driver.findElement(By.xpath("//input[contains(@name,'reg_email')]")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name,'reg_passwd_')]")).sendKeys("sele123");
		WebElement day=driver.findElement(By.id("day"));
		Select obj=new Select(day);
		obj.selectByIndex(3);
		WebElement month=driver.findElement(By.id("month"));
		Select obj1=new Select(month);
		obj1.selectByIndex(6);
		WebElement year=driver.findElement(By.id("year"));
		Select obj2=new Select(year);
		obj2.selectByValue("2000");
		driver.findElement(By.xpath("//input[@id='sex']")).click();
		System.out.println("Created");
		driver.close();

	}

}

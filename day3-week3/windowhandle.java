package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
Thread.sleep(2000);
String currentwindow=driver.getWindowHandle();
System.out.println("Current window id");
System.out.println(currentwindow);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();
Set<String> allwindow=driver.getWindowHandles();
List<String> child=new ArrayList<String>(allwindow);
driver.switchTo().window(child.get(1));
System.out.println("child:" +driver.getTitle());
driver.close();
driver.switchTo().window(child.get(0));
System.out.println("Parent:" +driver.getTitle());
driver.close();
	}


	}



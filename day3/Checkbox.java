package day3;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/checkbox.xhtml");
		// Basic Checkbox
		driver.findElement(By.xpath("//h5[text()='Basic Checkbox']/following::div[5]")).click();

		// Notification checkbox
		driver.findElement(By.xpath("//h5[text()='Notification']/following::div[5]")).click();
		WebElement element = driver.findElement(By.xpath("//span[text()='Checked']"));
		if (element.getText().equals("Checked")) {
			System.out.println("Notification checkbox: Expected Message " + element.getText() + " Displayed");
		} else
			System.out.println("Expected Message not Displayed");
		Thread.sleep(1000);

		// Choose your favorite language(s)
		driver.findElement(By.xpath("//h5[text()='Choose your favorite language(s)']/following::div[5]")).click();
		driver.findElement(By.xpath("//div[contains(@id,'ajaxTriState')]/div[2]")).click();

		WebElement element2 = driver.findElement(By.xpath("//span[text()='State has been changed.']"));
		if (element2.getText().equals("State has been changed.")) {
			System.out.println("Favorite language: Expected Message " + element2.getText() + " Displayed");
		} else
			System.out.println("Expected Message not Displayed");

		// Tri State Checkbox

		WebElement triState = driver.findElement(
				By.xpath("	//h5[text()='Tri State Checkbox']//following::div[contains(@class,'ui-chkbox-box')]"));
		triState.click();
		System.out.println("TriState checkbox status : " + triState.isSelected()); //Need to confirm this returns false even if the checkbox is selected
		Thread.sleep(1000);
		WebElement element3 = driver.findElement(By.xpath("//span[text()='State has been changed.']"));
		if (element3.getText().equals("State has been changed.")) {
			System.out.println("Tristate checkbox: Expected Message " + element3.getText() + " Displayed");
		} else
			System.out.println("Expected Message not Displayed");

		// Toggle Switch
		Thread.sleep(2000);
		driver.findElement(By.className("ui-toggleswitch-slider")).click();
		Thread.sleep(2000);
		WebElement element1 = driver.findElement(By.xpath("//span[text()='Checked']"));
		Thread.sleep(1000);
		// System.out.println(element1.getText());
		if (element1.getText().equals("Checked")) {
			System.out.println("Expected Message " + element1.getText() + " Displayed");
		} else
			System.out.println("Expected Message not Displayed");

		// Verify if checkbox is disabled
		WebElement disCheck = driver.findElement(
				By.xpath("//span[text()='Disabled']/preceding-sibling::div[contains(@class,'ui-state-disabled')]"));
		System.out.println("Status of Disabled checkbox : " + disCheck.isEnabled());

		// Select multiple options on the page
		driver.findElement(By.xpath("//h5[text()='Select Multiple']/following::div[@aria-haspopup='listbox']")).click();
		driver.findElement(By.xpath("//li[contains(@class,'ui-selectcheckboxmenu-unchecked')][1]/div")).click();
		driver.findElement(By.xpath("//li[contains(@class,'ui-selectcheckboxmenu-unchecked')][2]/div")).click();
		driver.findElement(By.xpath("//a[@aria-label='Close']")).click();
		WebElement element4 = driver
				.findElement(By.xpath("//h5[text()='Select Multiple']/following::div[@aria-haspopup='listbox']"));
		System.out.println("Values Selected in multiple checkbox:" + element4.getText());

		driver.quit();

	}

}
package week5day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefOne {
	
	ChromeDriver driver;
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
		driver  = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
	   
	}
	@When("the user enters the username as demosalesmanager")
	public void the_user_enters_the_username_as_demosalesmanager() {
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	    
	}
	@When("the user enters the password as crmsfa")
	public void the_user_enters_the_password_as_crmsfa() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	
	}
	@When("the user clicks the login button")
	public void the_user_clicks_the_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("the user should be redirected to welcome page")
	public void the_user_should_be_redirected_to_welcome_page() {
	    Assert.assertEquals(driver.getTitle(), "Leaftaps - TestLeaf Automation Platform", "Title doe not match");
	}
	@Then("the user should view the welcome message")
	public void the_user_should_view_the_welcome_message() {
	    WebElement element =driver.findElement(By.xpath("//h2[contains(text(),'Welcome'))"));
	    Assert.assertTrue(element.getText().contains("Welcome"),"Welcome message not displayed");
	}
	@Then("close the browser")
	public void close_the_browser() {

driver.quit();
	    throw new io.cucumber.java.PendingException();
	}

	@When("the user enters the username as testuser")
	public void the_user_enters_the_password_as_testuser() {
		driver.findElement(By.id("password")).sendKeys("testuser");
	}
	
	@When("the user enters the password as testpass")
	public void the_user_enters_the_password_as_testpass() {
		driver.findElement(By.id("password")).sendKeys("testpass");
	}
	
	
	@Then("the user should not be redirected to welcome page")
	public void the_user_should_not_be_redirected_to_welcome_page() {
		String error=driver.findElement(By.xpath("//div[@id='errorDiv]")).getText();
		Assert.assertTrue(error.contains("Usernot found"),"Error message not displayed");
	    
	}
	
}

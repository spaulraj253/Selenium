package learnselenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class loginpage {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.close();
	}

}

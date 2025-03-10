package week3day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SnapdealusingAction {
	
	public static double getPrice(String price)
	{
        price = price.replaceAll("[^\\d]", "").replaceAll(",", ""); // Remove non-numeric characters like symbols and ,
        return Double.parseDouble(price);
    }

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions action=new Actions(driver);
		
		//Go to "Men's Fashion".
		WebElement menFashions = driver.findElement(By.xpath("(//span[contains(text(),'Men')])[1]"));
		action.moveToElement(menFashions).perform();
		
		//Go to "Sports Shoes".
		WebElement sportsShoe = driver.findElement(By.xpath("(//span[contains(text(),'Sports Shoes')])[1]"));
		action.moveToElement(sportsShoe).click(sportsShoe).perform();
		
		//Get the count of sports shoes.
		System.out.println("Count of Mens shoes : "+ driver.findElement(By.xpath("//div[text()='Sports Shoes for Men']/following-sibling::div")).getText());

		//Click on "Training Shoes".
		WebElement traingShoes = driver.findElement(By.xpath("//div[text()='Training Shoes']"));
		System.out.println("test");
		action.moveToElement(traingShoes).click(traingShoes).perform();
		
		//Sort the products by "Low to High".
		
		WebElement sortBy = driver.findElement(By.xpath("//div[@class='sort-drop clearfix']"));
		action.moveToElement(sortBy).click(sortBy).perform();
		
		WebElement lowToHigh = driver.findElement(By.xpath("//li[@class='search-li'][1]"));
		action.moveToElement(lowToHigh).click(lowToHigh).perform();
		
		//Check if the displayed items are sorted correctly.
		Thread.sleep(2000);
		
		List<WebElement> elements = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfAllElements(elements));
		
		
		for (int i = 0; i < elements.size(); i++)
			
		{
			System.out.println(elements.get(i).getText());
		}
		
		boolean isSorted = true;
        for (int i = 0; i < elements.size() - 1; i++) {
            double currentPrice = getPrice(elements.get(i).getText());
            double nextPrice = getPrice(elements.get(i + 1).getText());
            if (currentPrice > nextPrice) {
            	System.out.println("incorrect values");
            	System.out.println(currentPrice);
            	System.out.println(nextPrice);
                isSorted = false;
                break;
            }
        }

        if (isSorted==true) {
            System.out.println("The items are sorted correctly from Low to High." + isSorted);
        } else {
            System.out.println("The items are not sorted correctly." + isSorted);
        }
        
       
        
        //9. Filter by any colour.
        WebElement color = driver.findElement(By.xpath("//div[@data-filtername='Color_s']//a[contains(text(),'White')]"));
        action.moveToElement(color).click(color).perform();
        action.pause(1000);
        //Select any price range ex:(500-700). 
        
        WebElement price = driver.findElement(By.xpath("//div[contains(@class,'ui-slider-range')]"));
        action.dragAndDropBy(price, 0, (int) 0.1).perform();
         Thread.sleep(1000);
     
        // 10. Verify all the applied filters. 
         String colFilter = driver.findElement(By.xpath("(//div[contains(@class,'navFiltersPill')])[1]")).getText();
         String priceFilter = driver.findElement(By.xpath("(//div[contains(@class,'navFiltersPill')])[2]")).getText();
        System.out.println(colFilter);
        System.out.println(priceFilter);
        if(colFilter.contains("Color")&&priceFilter.contains("Price"))
        {
        	System.out.println("Filters applied correctly");
        }
        else
        	System.out.println("Filters not applied properly");
        
        //11. Mouse hover on the first resulting "Training Shoes". 
        
        WebElement firstprod = driver.findElement(By.xpath("(//div[contains(@class,'product-tuple-image')])[1]"));
        action.moveToElement(firstprod).perform();
        
        
        //12. Click the "Quick View" button.
        
        WebElement quickView = driver.findElement(By.xpath("(//div[contains(text(),'Quick View')])[1]"));
        action.moveToElement(quickView).click(quickView).perform();
        
        //13. Print the cost and the discount percentage. 
		/*
		 * Set<String> windowHandles = driver.getWindowHandles(); List<String> list =
		 * new ArrayList<>(windowHandles); String parentWindow=list.get(0); String
		 * childWindow=list.get(1); driver.switchTo().window(childWindow);
		 * 
		 * System.out.println(driver.findElement(By.xpath(
		 * "(//span[contains(@class,'pdp-final-price')])")).getText());
		 * 
		 */
        String windowHandle = driver.getWindowHandle();
        driver.switchTo().window(windowHandle);
        Thread.sleep(1000);
        System.out.println("Price details : " + driver.findElement(By.xpath("(//div[contains(@class,'product-price')])[1]")).getText());
		
        
        //14. Take a snapshot of the shoes.
		 
		 File src = driver.getScreenshotAs(OutputType.FILE);
			File des = new File(
					"C:\\Users\\DIVYA\\Desktop\\Selenium Feb2025\\Selenium\\src\\main\\resources\\Snapshot\\Bigbasket.png");
			FileUtils.copyFile(src, des);
			
			// Close the current window.

			driver.close();
			
			// Close the main window.
			//driver.switchTo().window(parentWindow);
			//driver.close();
	}

}
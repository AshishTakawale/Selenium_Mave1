package Selenium1;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuggestedDD {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AshishTakawale\\eclipse-workspace\\Selenium\\Driver109\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		driver.findElement(By.id("autosuggest")).sendKeys("am");
		Thread.sleep(4000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		
		for (WebElement option :options)	
		{
			if (option.getText().equalsIgnoreCase("American Samoa"))
			{
				option.click();
				break;
			
			}
		}
		
		Thread.sleep(4000);
		
		driver.close();
		

	}

}

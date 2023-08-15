package Selenium1;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Green_kart {
	public static void main(String[] arg) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		String itemsToAdd= "Beetroot";
		
		List<WebElement> products =  driver.findElements(By.cssSelector("h4.product-name"));
		for (int i=0;i<products.size();i++)
		{
			String items = products.get(i).getText();
			if (items.contains(itemsToAdd))
			{
				driver.findElements(By.xpath("//div[@class ='product-action']/button")).get(i).click();
			}
				
			
		}
		
	
		
		
		
		
	}
}

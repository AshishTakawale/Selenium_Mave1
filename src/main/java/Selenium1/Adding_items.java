package Selenium1;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adding_items {
	public static void main(String[] arg) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AshishTakawale\\eclipse-workspace\\Selenium\\Driver109\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int j=0;
		String[] itemsNeeded = {"Brocolli","Cucumber","Tomato","Beans"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		List itemsNeededList = Arrays.asList(itemsNeeded);
		
		
		
		for (int i=0;i<products.size();i++)
				{
					String[] name = products.get(i).getText().split("-");
					String formatedName = name[0].trim();
					
					
					
					if (itemsNeededList.contains(formatedName))
					{j++;
						
					
						driver.findElements(By.xpath("//div[@class ='product-action']/button")).get(i).click();
						
						
						if(j==itemsNeeded.length)
						{
							break;
							
						}
					}
					
				}
//		driver.close();
		
	}
	

}

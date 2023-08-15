package Selenium1;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class add_Items_practice {
	@SuppressWarnings("deprecation")
	public static void main(String[] arg) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AshishTakawale\\eclipse-workspace\\Selenium\\Driver109\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		String[] itemsNeeded = {"Brocolli","Tomato","Brinjal"};
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			
		addItems(driver, itemsNeeded);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();
		WebElement states= driver.findElement(By.xpath("//div[@class='wrapperTwo']/div/select"));
		Select dropDown = new Select(states);
		dropDown.selectByValue("India");
		driver.findElement(By.cssSelector("input.chkAgree")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Proceed']")).click();
		
		
		}
		
	
	public static void addItems(WebDriver driver, String[] itemsNeeded) throws InterruptedException {
		
		int j=0;
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		List<String> itemsNeededList = Arrays.asList(itemsNeeded);
		
		for(int i=0;i<products.size();i++) 
		{
			String[] name = products.get(i).getText().split("-");
			String updatedName = name[0].trim();
			
		if(itemsNeededList.contains(updatedName)) 
			{j++;
			
				driver.findElements(By.xpath("//div[@class ='product-action']/button")).get(i).click();
				
			}
			if(j==itemsNeeded.length)
			{
				break;
			}
	}
	

		}
	}

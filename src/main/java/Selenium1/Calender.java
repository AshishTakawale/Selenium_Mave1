package Selenium1;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.Assert;

public class Calender {

	public static void main(String[] arg) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AshishTakawale\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		Assert.assertTrue((driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isSelected()));
		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		
		
	
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("Button is enable");
			Assert.assertTrue(true);
			
		}
		else
		{
			Assert.assertTrue(false);
			
			
			
		}
		driver.close();
		
		
		
	}

}

package Selenium1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class CheckBox {

		  	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\AshishTakawale\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
			System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
			driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
			System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
			
			System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
			
			driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
			Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
			
			
			driver.close();
			
			
			
			
			
			

	}

}

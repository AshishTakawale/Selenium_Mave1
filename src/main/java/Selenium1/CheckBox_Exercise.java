package Selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class CheckBox_Exercise {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\AshishTakawale\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.findElement(By.id("checkBoxOption1")).click();
			Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
			driver.findElement(By.id("checkBoxOption1")).click();
			Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
			System.out.println(( driver.findElements(By.cssSelector("input[type*='checkbox']"))).size());
			
			driver.close();
			
		
	}

}

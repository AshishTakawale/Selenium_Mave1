package Selenium_Maven.Selenium_Maven1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HDFC_Net_banking {
	public static void main(String arg[]) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://nb-nextgen-uat.hdfcbank.com/retail-app");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		
//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("username")));
		
		
		
		driver.findElement(By.id("username")).sendKeys("444674444");
		driver.findElement(By.id("password")).sendKeys("hdfcbank1");
		driver.findElement(By.id("kc-login")).click();
		
		
		
		
	}

}

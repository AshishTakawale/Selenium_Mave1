package Selenium1;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Greenkart_streams {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AshishTakawale\\eclipse-workspace\\Selenium_Maven1\\Driver109\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		List<WebElement> elementList = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		List<Object> original = elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		List<Object> sorted = original.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(original.equals(sorted));
		
	
	}

}

package Selenium1;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_to_child_window {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AshishTakawale\\eclipse-workspace\\Selenium\\Driver109\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a.blinkingText")).click();
		Set <String> windows = driver.getWindowHandles();
		Iterator <String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
//		System.out.println(driver.findElement(By.xpath("//p[@class= 'im-para red']")).getText());
		String emailId = driver.findElement(By.xpath("//p[@class= 'im-para red']")).getText().split("at")[1].trim().split("with")[0];
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(emailId);
		
		
		
		
		
		
		

	}

}

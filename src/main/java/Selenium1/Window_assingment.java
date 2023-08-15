package Selenium1;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_assingment {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AshishTakawale\\eclipse-workspace\\Selenium\\Driver109\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a[href='/windows']")).click();
		driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
		Set <String> handles = driver.getWindowHandles();
		Iterator <String> it = handles.iterator();
		String parentID = it.next();
		String childID = it.next();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
		
		driver.switchTo().window(childID);
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		driver.switchTo().window(parentID);
		System.out.println(driver.findElement(By.cssSelector("h3")).getText());
		
		
		
		
		
		
		
		
		
		
		

	}

	
	

}

package Selenium1;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scope {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AshishTakawale\\eclipse-workspace\\Selenium\\Driver109\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qaclickacademy.com/practice.php");
//		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer = driver.findElement(By.xpath("//tbody/tr/td[1]/ul[1]"));
		int linkSize = footer.findElements(By.tagName("a")).size();
		
		System.out.println(linkSize);
		
		for(int i=1;i<linkSize; i++)
		{
			String keys = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			footer.findElements(By.tagName("a")).get(i).sendKeys(keys);
			
		}
		Set <String> abc = driver.getWindowHandles();
		Iterator <String> it= abc.iterator();
		
		while(it.hasNext());
		
			{
				driver.switchTo().window(it.next());
				
				System.out.println(driver.getTitle());
				
				
			}
		
	
		
		

	}

}

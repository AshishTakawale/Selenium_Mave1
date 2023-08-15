package Selenium1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Updateddropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AshishTakawale\\eclipse-workspace\\Selenium\\Driver109\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);;
		
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println (driver.findElement(By.id("divpaxinfo")).getText());
		/*int i=1;
		
		while (i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
			
		}*/
		
		
		for (int i=1;i<5;i++)
				{
					driver.findElement(By.id("hrefIncAdt")).click();
				}
		Thread.sleep(3000);
		System.out.println (driver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(3000);
		
		System.out.println();
		
		
		driver.close();
		
				
				
		
		
		
		
		

	}

}

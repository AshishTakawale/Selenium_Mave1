package Selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_class {
	public static void main(String[] arg) {
		
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\AshishTakawale\\eclipse-workspace\\Selenium_Maven1\\Driver109\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			Actions a = new Actions(driver);
			WebElement signin = driver.findElement(By.xpath("//a[@data-nav-ref='nav_ya_signin']"));
			
			a.moveToElement(signin).contextClick().build().perform();
			
			WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
			
			a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("hello ashish").doubleClick().build().perform();
			
			
			
		
	}

}

package Selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class angula_practice_assingment {
	public static void main (String[] arg) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AshishTakawale\\eclipse-workspace\\Selenium\\Driver109\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Ashish");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("ashish.takawale123@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("ashish123");
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement staticdropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(0);
		System.out.println(driver.findElement(By.id("inlineRadio3")).isEnabled());
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("01101994");
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
		Thread.sleep(5000);
		
		System.out.println((driver.findElement(By.cssSelector("div[class*='alert']")).getText()));
		
		driver.close();
		
		
		
		
	}

}

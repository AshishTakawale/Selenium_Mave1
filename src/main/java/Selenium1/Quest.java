package Selenium1;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Quest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AshishTakawale\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		
		driver.get("https://www.amazon.in/");
		WebElement we = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
		action.moveToElement(we).build().perform();
		
		//*[@id="nav-link-accountList"]
		driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();
		
		WebElement username = driver.findElement(By.xpath("//*[@id=\"ap_email\"]"));
		username.sendKeys("8850400207");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		
		WebElement password= driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
		password.sendKeys("ioplkj@123");
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		
		WebElement search= driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		search.sendKeys("the alchemist by paulo coelho");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		
		Set<String> handles=driver.getWindowHandles();
		
		Iterator it= handles.iterator();
		
		String parentid=(String) it.next();
		String childid=(String) it.next();
		
		driver.switchTo().window(childid);
		

		//System.out.println(driver.getTitle());
		
		//driver.switchTo().window("Amazon.in : the alchemist by paulo coelho");
		
		
		driver.findElement(By.xpath("//*[@id=\"buy-now-button\"]")).click();
		
		driver.switchTo().window(parentid);
		
		
		driver.close();
		
		driver.findElement(By.xpath("//*[@id=\"pp-muONxJ-93\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"pp-muONxJ-96\"]")).click();
		
		WebElement carddetails= driver.findElement(By.xpath("//*[@id=\"pp-wLsJRk-16\"]"));
		
		
		carddetails.sendKeys("1234432112344321");
		
		
		
		
		
		
		
		
		
		
		
		
		//WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
		//password.sendKeys("Quality@123");
		
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/form/div[3]/div/button")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"includedAngularJS\"]/app-root/div/div[1]/div/div/div/div/div/app-home/app-card/div/div/div[2]/app-punch-inout/div/div[1]/div/div/div[3]/div[1]/div[1]/a")).click();
		

	}

}

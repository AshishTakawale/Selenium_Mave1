package Selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoonjSwipe2pay {

	public static void main(String[] args) {

		
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AshishTakawale\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://goonj.org/");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div/div[3]/div/div/a")).click();
		driver.findElement(By.tagName("class=form-control donationAmount")).click();
		
		
		//WebElement amount=driver.findElement(By.className("form-control donationAmount"));
		
		//amount.sendKeys("10");
		
		
		

	}

}

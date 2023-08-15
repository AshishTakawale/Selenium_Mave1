package Selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_ele_xpath1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AshishTakawale\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://qk.peoplestrong.com/altLogin.jsf");
		
		WebElement username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form[5]/div/div[1]/div[2]/input[1]"));
		
		WebElement password= driver.findElement(By.xpath("//*[@id=\"loginForm:password\"]"));
		
		username.sendKeys("Q8844");
		password.sendKeys("Quality22");
		
		driver.findElement(By.xpath("//*[@id=\"loginForm:loginButton\"]/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"includedAngularJS\"]/app-root/div/div[1]/div/div/div/div/div/app-home/app-card/div/div/div[2]/app-punch-inout/div/div[1]/div/div/div[3]/div[1]/div[1]/a")).click();
		
		
		
		
		
		
		
		
		
		
		
	}

}

package Selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_access {

	 	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AshishTakawale\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		String Password = getpassword(driver);
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("Ashish");
		
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(Password);
		
		driver.findElement(By.cssSelector("button.signInBtn")).click();
		
		
		
		//driver.findElement(By.linkText("Forgot your password?")).click();
		
		

	}
	public static String getpassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		String Passwordtext = driver.findElement(By.cssSelector("p.infoMsg")).getText();
		String[] Passwordarray = Passwordtext.split("'");
		String[] Passwordarray2 = Passwordarray[1].split("'");
		String Password = Passwordarray2[0];
		return Password;
		
		
		
	
		
		
		
		
		
	
		
		
	}

}

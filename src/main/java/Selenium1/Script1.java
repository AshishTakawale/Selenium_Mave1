package Selenium1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdrive.chrome.driver","C:\\Users\\AshishTakawale\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		
		
		//driver.navigate().to("https://www.selenium.dev/documentation/");
		//Thread.sleep(2000);
		
		String title=driver.getTitle();
		
		if(title.equals("Slenium")) {
			System.out.println("Test pass");
		}
		else {
			System.out.println("Test Fail");
			}
		
		driver.close();
	}

}

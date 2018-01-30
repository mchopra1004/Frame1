package rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Rough1 {
	public static WebDriver driver;
	
	@Test
	public void abc(){
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manish.chopra\\workspace\\ClearSanity\\chromedriver.exe");
		ChromeOptions o = new ChromeOptions();
		o.addArguments("disable-extensions");
	
		
		driver = new ChromeDriver(o);
	
	
	driver.get("http://www.google.com");
	driver.manage().window().maximize();
		
	}
}

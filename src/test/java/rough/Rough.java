package rough;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.collections.CollectionUtils;

public class Rough {

	@Test
	public void abc() throws AWTException, InterruptedException{
		Properties OR = new Properties();
		FileInputStream fis = null;
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://clearme.com");
		driver.manage().window().maximize();
		String Title = driver.getCurrentUrl();
		Assert.assertEquals(Title,"https://clearme.com/home");
		try {
			fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			OR.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
//		
//		driver.findElement(By.xpath("//li[@class='fb']")).click();
//		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
//		Set<String> windows = driver.getWindowHandles();
//		Iterator<String> itr = windows.iterator();
//		String parent = itr.next();
//		String child = itr.next();
//		driver.switchTo().window(child);
//		String CURL = driver.getCurrentUrl();
//		Assert.assertEquals(CURL, "https://www.facebook.com/Clearme");
//		driver.close();
//		driver.switchTo().window(parent);
	
//	WebElement ele = driver.findElement(By.xpath(OR.getProperty("ForPartners")));
//	Actions action = new Actions(driver);
//	action.moveToElement(ele).build().perform();
//		
//	driver.findElement(By.xpath("//a[text()=' Platform Overview']")).click();
//	driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
//	String CURL = driver.getCurrentUrl();
//	Assert.assertEquals(CURL, "https://clearme.com/platform-overview");
//		
//		WebElement ele = driver.findElement(By.xpath(OR.getProperty("ForPartners")));
//		Actions action = new Actions(driver);
//		action.moveToElement(ele).build().perform();
//	
//		
//	driver.findElement(By.xpath("//a[text()=' Stadiums and Arenas']")).click();
//	driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
//	String CURL = driver.getCurrentUrl();
//	Assert.assertEquals(CURL, "https://clearme.com/stadiums");
		
		driver.findElement(By.className("top")).click();
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		String CURL = driver.getCurrentUrl();
		Assert.assertEquals(CURL, "https://clearme.com/enroll");
	}
}

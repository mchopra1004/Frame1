package commonUtils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import base.Base;

public class Navigation extends Base {

	public void ClickOnTheLink(String Locator) {

		driver.findElement(By.xpath(OR.getProperty(Locator))).click();

	}

	public void MoveToTheElement(String Element) {
		WebElement ele = driver.findElement(By.xpath(OR.getProperty(Element)));
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();

	}

	public void VerifyTheCurrentURL(String URL) {
		String CURL = driver.getCurrentUrl();
		Assert.assertEquals(CURL, URL);

	}

	public void VerifyTheCurrentURLOnMultipleWindows(String URL) {

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		String parent = itr.next();
		String child = itr.next();
		driver.switchTo().window(child);
		String CURL = driver.getCurrentUrl();
		Assert.assertEquals(CURL, URL);
		driver.close();
		driver.switchTo().window(parent);
	}

	public void HandleEmailClient() throws AWTException {
		Robot robot = new Robot();
		driver.getCurrentUrl();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
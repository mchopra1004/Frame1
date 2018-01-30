package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import commonUtils.HeaderFooterElements;

import commonUtils.Navigation;

public class Base {

	public static Navigation Nav;
	public static HeaderFooterElements ele;
	public static WebDriver driver;
	public static Properties OR = new Properties();
	public static FileInputStream fis;

	public Base() {

		if (driver == null) {

			driver = new FirefoxDriver();
			driver.get("https://clearme.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);

			Nav = new Navigation();
			ele = new HeaderFooterElements();
			try {
				fis = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\OR.properties");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			try {
				OR.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}

package stepDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.Base;
import cucumber.api.Scenario;
import cucumber.api.java.After;

public class Hooks {

//	@After
//	public void TakeScreenshotandTearDown(Scenario S) {
//
//		if (S.isFailed()) {
//
//			File scrFile = ((TakesScreenshot) Base.driver).getScreenshotAs(OutputType.FILE);
//			String FilePath = System.getProperty("user.dir") + "\\Screenshots\\";
//			new File(FilePath);
//			String method = S.getName();
//			try {
//				FileUtils.copyFile(scrFile, new File(FilePath + method + ".jpg"));
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			System.out.println(method + " has failed");
//		}
//
//		Base.driver.quit();
//
//	}

}

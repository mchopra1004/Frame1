package commonUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.Base;

public class HeaderFooterElements extends Base {

	// To verify Header contents//

	public void HeaderContents() {

		List<WebElement> abc = driver.findElements(By.xpath(OR.getProperty("Header")));
		List<String> HeaderList = new ArrayList<String>();
		for (WebElement H : abc) {
			HeaderList.add(H.getText());
		}
		String[] exp = { "CLEAR", "HOW IT WORKS", "WHERE WE ARE", "FOR PARTNERS", "GET CLEAR", "LOG IN", };
		List<String> eHeaderList = new ArrayList<String>();

		for (String S : exp) {
			eHeaderList.add(S);
		}

		System.out.println("Printing the Header List of contents:" + HeaderList);
		Assert.assertEquals(HeaderList, eHeaderList);
	}

	// To verify Footer contents//

	public void FooterContents() {

		List<WebElement> footer1 = driver.findElements(By.xpath(OR.getProperty("LeftFooter")));
		List<WebElement> footer2 = driver.findElements(By.xpath(OR.getProperty("RightFooter")));
		WebElement footer3 = driver.findElement(By.xpath(OR.getProperty("CopyRight")));
		WebElement Ques = driver.findElement(By.xpath(OR.getProperty("QuestionsForUs")));
		WebElement FAQ = driver.findElement(By.xpath(OR.getProperty("FAQs")));
		WebElement Tel = driver.findElement(By.xpath(OR.getProperty("Phone")));
		WebElement email = driver.findElement(By.xpath(OR.getProperty("EmailClear")));
		WebElement GetClear = driver.findElement(By.xpath(OR.getProperty("GetClear")));
		List<WebElement> Social = driver.findElements(By.xpath(OR.getProperty("SocialIcons")));

		List<String> FooterList = new ArrayList<String>();
		for (WebElement a : footer1) {
			FooterList.add(a.getText());
		}
		for (WebElement b : footer2) {
			FooterList.add(b.getText());

		}

		FooterList.add(footer3.getText());
		FooterList.add(Ques.getText().replace("\n", " "));
		FooterList.add(FAQ.getText());
		FooterList.add(Tel.getText());
		FooterList.add(email.getText());
		FooterList.add(GetClear.getText());

		for (WebElement a : Social) {

			FooterList.add(a.getAttribute("title"));
		}
		String[] expFooter = new String[] { "ABOUT US", "CAREERS AT CLEAR", "LATEST NEWS", "REFER A FRIEND",
				"Privacy Policy", "Member Terms", "Terms of Use", "© 2017 Secure Identity, LLC. All rights reserved.",
				"Questions for us? We’re here to help.", "FAQs", "855-CLEARME (253-2763)", "EMAIL CLEAR", "GET CLEAR",
				"Follow the LinkedIn Influencer posts of CLEAR's Chairperson and CEO Caryn Seidman Becker",
				"Follow CLEAR on twitter", "Like CLEAR on facebook" };

		List<String> eFooterList = new ArrayList<String>();
		for (String V : expFooter) {
			eFooterList.add(V);
		}

		System.out.println("Printing the Footer List of contents:" + FooterList);
		

		Assert.assertEquals(FooterList, eFooterList);

	}

	// Waiting for page to load//
	public void WaitForPageToLoad(int WaitTime) {

		driver.manage().timeouts().pageLoadTimeout(WaitTime, TimeUnit.SECONDS);
		
	}
}

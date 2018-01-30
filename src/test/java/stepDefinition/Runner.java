package stepDefinition;

import java.io.File;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.cucumber.listener.Reporter;
import com.github.mkolisnyk.cucumber.reporting.CucumberResultsOverview;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/resources/Features" }, format = { "pretty",
		"html:target/cucumber","json:target/Destination/cucumber.json"}, monochrome = true, plugin={"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"})
public class Runner extends AbstractTestNGCucumberTests {

	@BeforeClass
	public void Deletescreenshot() {
		try {
			File f = new File(System.getProperty("user.dir") + "\\Screenshots\\");
			File[] files = f.listFiles();
			for (File file : files) {
				file.delete();
			}
		} catch (Exception e) {
			System.out.println("No file");
		}

	}
	
	@AfterClass
	public void setup() throws Exception{
		//Reporter.getExtentHtmlReport();
		//Reporter.loadXMLConfig(new File("C:\\Users\\manish.chopra\\workspace\\ClearSanity\\src\\test\\resources\\extent-config.xml"));
//        Reporter.setSystemInfo("user", System.getProperty("user.name"));
//        Reporter.setSystemInfo("os", "Mac OSX");
//        Reporter.setTestRunnerOutput("Sample test runner output message");
//        Reporter.getExtentReport();
		CucumberResultsOverview results = new CucumberResultsOverview();
		results.setOutputDirectory("target");
		results.setOutputName("cucumber-results");
		results.setSourceFile("C:\\Users\\manish.chopra\\workspace\\ClearSanity\\target\\Destination\\cucumber.json");
		results.executeFeaturesOverviewReport();
        
    }

		
	}
	



package TestRunner;

//import org.apache.logging.log4j.LogManager;
import org.junit.runner.RunWith;

//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
				
	
		features = { ".//FeatureFiles//FindingHospital.feature" },
				 glue = { "stepDefinitions" },
                 plugin = {"pretty", "html:reports/myreport.html",
		                   "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, 
                 dryRun = false,
                 monochrome = true,
                 publish = true
                 
                 )

//public class TestRunner extends AbstractTestNGCucumberTests{
//
//}
public class TestRunner{

}

package testCases;

import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import Utilities.readandwritedata;
import pageObjects.Surgeries;
import testBase.BaseClass;

public class TC02_Surgeries extends BaseClass {
	String excelFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata.xlsx";
	String sheetName="ListofSurgeries";
	
	@Test(priority=1,groups= {"regression"})
	public void T001_goToSurgery() throws IOException {
		logger.info("*******Starting the TC02 TestCases********" );
		sur=new Surgeries(driver);
		sur.clickSurgery();
		logger.info("*******Clicking Surgeries********" );
	}
	
	@Test(priority=2,groups= {"sanity","regression"})
	public void T002_validate() {
		sur.validateSurgeryPage();
		logger.info("*******Validating Surgeries Page********" );
	}
	
	@Test(priority=3,groups= {"sanity"})
	public void T003_ScrollDown() {
		sur.scrollDown();
		logger.info("*******Scrolling Down********" );
	}
	
	@Test(priority=4,groups= {"regression"})
	public void T004_SurgeryList() throws IOException {
		//sur.listOfSurgeries1();
		List<String> surgeryList=sur.listOfSurgeries();
		readandwritedata.writeSurgery(surgeryList, excelFilePath,sheetName);
		logger.info("*******Fetching List of Surgeries********" );
	}
	
	@Test(priority=5,groups= {"sanity"})
	public void T005_ScrollUp() {
		
		sur.scrollup();
		logger.info("*******Scrolling Up********" );
		logger.info("*******Ending the TC02 TestCases********" );
	}

}

package testCases;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;
import org.testng.annotations.Test;
import pageObjects.Corporates;
import testBase.BaseClass;

public class TC03_WellNess extends BaseClass {
	String excelFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata.xlsx";
	String sheetName="Details";
	
	@Test(priority=1,groups= {"regression"})
	public void T001_goToCorporates() throws InterruptedException, IOException, HeadlessException, AWTException {
		logger.info("*******Starting the TC03 TestCases********" );
		corporate=new Corporates(driver);
		corporate.selectCorporate();
		logger.info("*******Clicking ForCorporates********" );
		corporate.selectHealth();
		logger.info("*******Selecting Health and Wellness********" );
	}
	
	@Test(priority=2,groups= {"sanity","regression"})
	public void T002_validateCorporate() {
		
		corporate.validateCorporatePage();
		logger.info("*******Validating Corporate Page********" );
	}
	
	@Test(priority=3,groups= {"regression"})
	public void T003_sendDetails() throws InterruptedException, IOException {
		//corporate.enterDetails(excelFilePath,sheetName);
		corporate.enterDetailsinvalid(excelFilePath, sheetName);
		logger.info("*******Entering invalid Detail********" );
		corporate.demobutton();
		logger.info("*******Verifying Demo Button********" );
		corporate.enterDetailsvalid(excelFilePath, sheetName);
		logger.info("*******Entering Valid Detail********" );
		corporate.demobutton();
		logger.info("*******Verifiying Demo Button********" );
		
	}
	
	@Test(priority=4,groups= {"regression"})
	public void T004_VerifyMsg() throws InterruptedException {
		corporate.textPrint();
		logger.info("*******Printing text message********" );
		corporate.validateThankYou();
		logger.info("*******Validating Thank you Message********" );
	}
	
	@Test(priority=5,groups= {"sanity"})
	public void T005_MsgScreenshot() throws HeadlessException, IOException, AWTException {
		 corporate.screenshot();
		 logger.info("*******Taking Screenshot of message********" );
		 
		 logger.info("*******Ending the TC02 TestCases********" );
	}

}

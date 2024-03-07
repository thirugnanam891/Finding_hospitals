package testCases;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.List;
import org.testng.annotations.Test;
import Utilities.readandwritedata;
import testBase.BaseClass;
import pageObjects.Corporates;
import pageObjects.Doctors;
import pageObjects.Surgeries;

public class TC_FindingHospital extends BaseClass
{
	String excelFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata.xlsx";
	String sheetName1="DoctorsDetails";
	String sheetName2="ListofSurgeries";
	String sheetName3="Details";
	
	@Test(priority=1,groups= {"sanity"})
	public void T001_homepage() throws InterruptedException, IOException {
		
		logger.info("*******Starting the TestCases********");
		
		doctor=new Doctors(driver);
		
		doctor.ValidateHomepage();
		
		logger.info("*******Validating the HomePage********" );
	}
	
	@Test(priority=2,groups= {"sanity","regression"})
	public void T002_DoctorPage() throws IOException {
		
		doctor.clickFindDoctors();
		
		logger.info("*******clicking find doctors********" );
		
		doctor.City(excelFilePath,sheetName1);
		
		logger.info("*******Sending the location********" );
		
		doctor.searchDoctor();
		
		logger.info("*******Searching Doctor********" );
	}
	
	@Test(priority=3,groups= {"regression"})
	public void T003_Filters() throws InterruptedException {
		
		doctor.selectingGender();
		
		logger.info("*******selecting the gender********" );
		
	    Thread.sleep(2000);
	    
	    doctor.selectingPatientStories();
	    
	    logger.info("*******selecting the Patient Stories********" );
	    
	    doctor.selectDoctorexp();
	    
	    logger.info("*******selecting the Doctor Experience********" );
	    
	    doctor.selectFilter();
	    
	    logger.info("*******selecting the Filters********" );
	    
		Thread.sleep(2000);
		
		doctor.selectFilterAgain();
		
		logger.info("*******selecting the Filters again********" );
		
		doctor.selectRelevance();
		
		logger.info("*******selecting the Relevance********" );
	}
	
	@Test(priority=4,groups= {"regression"})
	public void T004_DoctorInfo() throws InterruptedException, IOException {
		
		Thread.sleep(2000);
		
		List<String> Doctors = doctor.getDoctorInfo();
		 
		readandwritedata.writeDoctors(Doctors, excelFilePath,sheetName1);
		 
		logger.info("*******Fetching Doctor Information********" );

	}
	
	@Test(priority=5,groups= {"regression"})
	public void T005_goToSurgery() throws IOException {
		
		sur=new Surgeries(driver);
		
		sur.clickSurgery();
		
		logger.info("*******Clicking Surgeries********" );
		
	}
	
	@Test(priority=6,groups= {"sanity","regression"})
	public void T006_validate() {
		
		sur.validateSurgeryPage();
		
		logger.info("*******Validating Surgeries Page********" );
		
	}
	
	@Test(priority=7,groups= {"sanity"})
	public void T007_ScrollDown() {
		
		sur.scrollDown();
		
		logger.info("*******Scrolling Down********" );
		
	}
	
	@Test(priority=8,groups= {"regression"})
	public void T008_SurgeryList() throws IOException {

		List<String> surgeryList=sur.listOfSurgeries();
		
		readandwritedata.writeSurgery(surgeryList, excelFilePath,sheetName2);
		
		logger.info("*******Fetching List of Surgeries********" );
		
	}
	
	@Test(priority=9,groups= {"sanity"})
	public void T009_ScrollUp() {
		
		sur.scrollup();
		
		logger.info("*******Scrolling Up********" );
		
	}
	
	@Test(priority=10,groups= {"regression"})
	public void T010_goToCorporates() throws InterruptedException {
		
		corporate=new Corporates(driver);
		
		corporate.selectCorporate();
		
		logger.info("*******Clicking ForCorporates********" );
		
		corporate.selectHealth();
		
		logger.info("*******Selecting Health and Wellness********" );
		
	}
	
	@Test(priority=11,groups= {"sanity","regression"})
	public void T011_validateCorporate() {
		
		corporate.validateCorporatePage();
		
		logger.info("*******Validating Corporate Page********" );
	}
	
	@Test(priority=12,groups= {"regression"})
	public void T012_sendDetails() throws InterruptedException, IOException {
		
		corporate.enterDetailsinvalid(excelFilePath, sheetName3);
		
		logger.info("*******Entering invalid Detail********" );
		
		corporate.demobutton();
		
		logger.info("*******Verifying Demo Button********" );
		
		corporate.enterDetailsvalid(excelFilePath, sheetName3);
		
		logger.info("*******Entering Valid Detail********" );
		
		corporate.demobutton();
		
		logger.info("*******Verifiying Demo Button********" );
		
	}
	
	@Test(priority=13,groups= {"sanity","regression"})
	public void T013_PrintMsg() throws InterruptedException {
		
		corporate.textPrint();
		
		logger.info("*******Printing text message********" );
		
	}
	
	@Test(priority=14,groups= {"regression"})
	public void T014_VerifyMsg() throws InterruptedException {
		
		corporate.validateThankYou();
		
		logger.info("*******Validating Thank you Message********" );
		
	}
	@Test(priority=15,groups= {"sanity"})
	public void T015_MsgScreenshot() throws HeadlessException, IOException, AWTException {
		
		 corporate.screenshot();
		 
		 logger.info("*******Taking Screenshot of message********" );
		 
		 logger.info("*******Ending the TestCases********");
	}
	

}

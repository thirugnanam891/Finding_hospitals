package testCases;

import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import Utilities.readandwritedata;
import pageObjects.Doctors;
import testBase.BaseClass;

public class TC01_Doctors extends BaseClass {
	String excelFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata.xlsx";
	String sheetName="DoctorsDetails";
	String sheetName1="Details";
	@Test(priority=1,groups= {"sanity"})
	public void T001_homepage() throws InterruptedException, IOException {
		
		logger.info("*******Starting the TC01 TestCases********" );
		
		doctor=new Doctors(driver);
		
		doctor.ValidateHomepage();
		logger.info("*******Validating the HomePage********" );
	}
	
	@Test(priority=2,groups= {"sanity","regression"})
	public void T002_DoctorPage() throws IOException {
		doctor.clickFindDoctors();
		logger.info("*******clicking find doctors********" );
		doctor.City(excelFilePath,sheetName);
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
		 readandwritedata.writeDoctors(Doctors, excelFilePath,sheetName);
		logger.info("*******Fetching Doctor Information********" );
		logger.info("*******Ending the TC01 TestCases********" );
	}

}

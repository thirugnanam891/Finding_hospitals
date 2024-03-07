package stepDefinitions;
 
import java.util.List;
import pageObjects.Doctors;
import factory.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utilities.readandwritedata;
 
public class searchDoctorsteps {
	//WebDriver driver;
	Doctors doctor;
	String excelFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata.xlsx";
	String sheetName="DoctorsDetails";
	String sheetName1="Details";
 
	@Given("the user navigates to practo com")
	public void the_user_navigates_to_practo_com() {
		doctor = new Doctors(Base.getDriver());
	}
 
	@When("the user validates the HomepageTitle")
	public void the_user_validates_the_homepage_title() throws InterruptedException {
		Thread.sleep(2000);
		doctor.ValidateHomepage();
		Base.getLogger().info("*****Fetch & display the first 5 Doctor details*****");
	}
 
	@Then("the user Navigates to the Find Doctors page")
	public void the_user_navigates_to_the_find_doctors_page() {
		doctor.clickFindDoctors();
	}
 
	@Then("the user selects the city Chennai")
	public void the_user_selects_the_city_chennai() {
		doctor.City(excelFilePath,sheetName1);
	}
 
	@Then("filters the search by Dentist")
	public void filters_the_search_by_dentist() {
		doctor.searchDoctor();
	}
	@When("the user applies filters for Gender")
	public void the_user_applies_filters_for_gender() throws InterruptedException {
		doctor.selectingGender();
	}
	@Then("user sees list of dentists")
	public void user_sees_list_of_dentists() throws InterruptedException {
	    Thread.sleep(2000);
	}
 
	@When("the user applies filters for patient stories")
	public void the_user_applies_filters_for_patient_stories() throws InterruptedException {
		doctor.selectingPatientStories();
	}
 
	@When("the user applies filters for experiences")
	public void the_user_applies_filters_for_experiences() throws InterruptedException {
		doctor.selectDoctorexp();
	}
 
	@When("the user applies filters for fees")
	public void the_user_applies_filters_for_fees()throws InterruptedException {
		doctor.selectFilter();
		Thread.sleep(5000);
	}
 
	@When("the user applies filters for availability")
	public void the_user_applies_filters_for_availability() throws InterruptedException {
		doctor.selectFilterAgain();
	}
	@When("sorts the result by some criteria")
	public void sorts_the_result_by_some_criteria() throws InterruptedException {
		doctor.selectRelevance();
	}
	@When("the user applies filters")
	public void the_user_applies_filters() throws InterruptedException {
		doctor.allFilters();
	}
 
	@Then("the user should display the details of te first {int} doctors")
	public void the_user_should_display_the_details_of_te_first_doctors(Integer int1) throws InterruptedException {
		 List<String> Doctors = doctor.getDoctorInfo();
		 readandwritedata.writeDoctors(Doctors, excelFilePath,sheetName);
		 Base.getLogger().info("*****Fetched & displayed the first 5 Doctor details*****");
	}
 
 
}
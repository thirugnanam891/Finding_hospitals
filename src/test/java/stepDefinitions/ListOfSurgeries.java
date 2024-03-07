package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import pageObjects.Surgeries;
import factory.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utilities.readandwritedata;

public class ListOfSurgeries {
	WebDriver driver;
	Surgeries surgery;
	String excelFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata.xlsx";
	String sheetName="ListofSurgeries";
	
	@Given("user navigates to the practo home page")
	public void user_navigates_to_the_practo_home_page() {
		driver = Base.getDriver();
		surgery = new Surgeries(driver);
	}

	@When("user clicks on surgeries in the practo home page")
	public void user_clicks_on_surgeries_in_the_practo_home_page() {
		Base.getLogger().info("*****Extract & store all the surgeries*****");
		surgery.clickSurgery();
	}

	@Then("user validates the surgeries page")
	public void user_validates_the_surgeries_page() {
		surgery.validateSurgeryPage();
	}
	
	@Then("the user sees surgeries page")
	public void the_user_sees_surgeries_page() throws InterruptedException {
	   Thread.sleep(2000);
	}
	
	@Then("user scrolls down the page")
	public void user_scrolls_down_the_page() {
		 surgery.scrollDown();
	}
	
	@Then("user sees list of surgeries")
	public void user_sees_list_of_surgeries() throws InterruptedException {
	    Thread.sleep(2000);
	}
	
	@Then("user should capture the list of surgeries")
	public void user_should_capture_the_list_of_surgeries() {
		List<String> surgeryList=surgery.listOfSurgeries();
		readandwritedata.writeSurgery(surgeryList, excelFilePath,sheetName);
	    surgery.scrollup();
	    Base.getLogger().info("*****Extracted & stored all the surgeries*****");
	}



}

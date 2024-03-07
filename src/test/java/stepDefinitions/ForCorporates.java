package stepDefinitions;
 
import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;
import pageObjects.Corporates;
import factory.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class ForCorporates {

	Corporates corporate;
	String excelFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata.xlsx";
	String sheetName="Details";
 
	@Given("the user navigates to practo page")
	public void the_user_navigates_to_practo_page() {

		corporate = new Corporates(Base.getDriver());
	}
 
	@When("user clicks on for corporates in practo home page navigation bar")
	public void user_clicks_on_for_corporates_in_practo_home_page_navigation_bar() {
		Base.getLogger().info("*****Schedule a Demo started*****");
		corporate.selectCorporate();
	}
 
	@When("user clicks health and wellness plans in for corporates")
	public void user_clicks_health_and_wellness_plans_in_for_corporates() {
		corporate.selectHealth();
	}
 
	@Then("user navigates to health and wellness plans page and validate the page")
	public void user_navigates_to_health_and_wellness_plans_page_and_validate_the_page() {
		corporate.validateCorporatePage();
	}
	@When("user leaves name field empty and fill all other fields and clicks on schedule a demo button")
	public void user_leaves_name_field_empty_and_fill_all_other_fields_and_clicks_on_schedule_a_demo_button() throws InterruptedException, IOException {
		corporate.nameEmpty(excelFilePath, sheetName);
	}
 
	@When("user leaves organization name field empty and fill all other fields")
	public void user_leaves_organization_name_field_empty_and_fill_all_other_fields() throws InterruptedException, IOException {
	    corporate.OrganizationEmpty(excelFilePath, sheetName);
	}
 
	@When("user leaves contact number field empty and fill all other fields")
	public void user_leaves_contact_number_field_empty_and_fill_all_other_fields() throws InterruptedException, IOException {
		corporate.contactEmpty(excelFilePath, sheetName);
	}
 
	@When("user enters incorrect number of digits in contact field and fill all other fields")
	public void user_enters_incorrect_number_of_digits_in_contact_field_and_fill_all_other_fields() throws InterruptedException, IOException {
		corporate.incorrectNoOfDigitsContact(excelFilePath, sheetName);
	}
 
	@When("user enters number that starts with less than five in contact field and fill all other fields")
	public void user_enters_number_that_starts_with_less_than_five_in_contact_field_and_fill_all_other_fields() throws InterruptedException, IOException {
		corporate.incorrectContactNo(excelFilePath, sheetName);
	}
 
	@When("user leaves official email field empty and fill all other fields")
	public void user_leaves_official_email_field_empty_and_fill_all_other_fields() throws InterruptedException{
		corporate.emailEmpty();
	}
	@When("user provide invalid email id and valid details for other fields in the formreg")
	public void user_provide_invalid_email_id_and_valid_details_for_other_fields_in_the_formreg() throws InterruptedException, IOException {
		corporate.enterDetails(excelFilePath,sheetName);
	}
	@When("user provide invalid email id and valid details for other fields in the form")
	public void user_provide_invalid_email_id_and_valid_details_for_other_fields_in_the_form() throws InterruptedException, IOException {
		corporate.enterDetailsinvalid(excelFilePath,sheetName);
	}
 
	@Then("user validates schedule a demo button is enabled in the health and wellness plans page")
	public void user_validates_schedule_a_demo_button_is_enabled_in_the_health_and_wellness_plans_page() throws InterruptedException {
		corporate.demobutton();
	}
 
	@When("user enters valid email id and clicks on schedule a demo button")
	public void user_enters_valid_email_id_and_clicks_on_schedule_a_demo_button() throws InterruptedException, IOException {
		corporate.enterDetailsvalid(excelFilePath,sheetName);
	}
    //for regression
	@When("user enters valid emailid and clicks on schedule a demo button")
	public void user_enters_valid_emailid_and_clicks_on_schedule_a_demo_button() throws InterruptedException, IOException {
		corporate.enterDetaildvalid(excelFilePath,sheetName);
	}
	@Then("user validates the Thank you message is displayed")
	public void user_validates_the_thank_you_message_is_displayed() throws InterruptedException, HeadlessException, IOException, AWTException {
		corporate.textPrint();
		Base.getLogger().info("*****Schedule a Demo Ended*****");
	}
	@Then("user validates the Thank you message was displayed")
	public void user_validates_the_thank_you_message_was_displayed() throws InterruptedException, HeadlessException, IOException, AWTException {
		corporate.validateThankYou();
	}
	@Then("user takes a screenshot of thank you message")
	public void user_takes_a_screenshot_of_thank_you_message() throws HeadlessException, IOException, AWTException {
	    corporate.screenshot();
	}
}

package pageObjects;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Utilities.readandwritedata;
 
public class Doctors extends BasePage {
	public Doctors(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	static String file=System.getProperty("user.dir")+"\\src\\test\\resources\\testdata.xlsx";
	
	    List<String> Doctors=new ArrayList<>();
	    //click FindDoctors
	    @FindBy(xpath="//div[@class='product-tab__title'][normalize-space()='Find Doctors']")
	    WebElement findDoctors;
	    //choose city
	    @FindBy(xpath="//input[@placeholder='Search location']")
	    WebElement city;
	    @FindBy(xpath="//input[@data-qa-id='omni-searchbox-locality']")
		WebElement sendLoc;
	    //city option
	    @FindBy(xpath="//div[normalize-space()='Chennai']")
	    WebElement clickCity;
	    //search specialist
	    @FindBy(xpath="//input[@data-qa-id='omni-searchbox-keyword']")
	    WebElement searchSpecialist;
	    //click specialist option
	    @FindBy(xpath="(//div[@data-qa-id='omni-suggestion-listing'])[1]")
	    WebElement clickSpecialist;
	    //selecting gender
	    @FindBy(xpath="(//span[normalize-space()='Gender'])[3]")
	    WebElement gender;
	    //click female as gender
	    @FindBy(xpath="//ul[@data-qa-id='doctor_gender_list']/li[1]")
	    WebElement clickGender;
	    //selecting patient stories
		@FindBy(xpath="//span[@data-qa-id='doctor_review_count_selected']//i[@class='u-transition--transform u-d-inlineblock icon-ic_dropdown u-f-right']")
		WebElement patientStories;
		//20+ patients
		@FindBy(xpath="(//li[@role='option'])[3]")
		WebElement selectpatientStories; 
		//selecting doctor experience
		@FindBy(xpath="//div[@class='c-filter__top']//div[3]")
		WebElement clickexperience;
		//15 years experience
		@FindBy(xpath="//span[normalize-space()='15+ Years of experience']")
		WebElement selectexperience; 
		//selecting filter
		@FindBy(xpath="//i[@data-qa-id='all_filters_icon']")
		WebElement clickfilter; 
		//fees-Rs.0-500
		@FindBy(xpath="(//div[@data-qa-id='Fees_radio'])[1]")
		WebElement selectfees;
		//click availability tmrw
		@FindBy(xpath="(//div[@data-qa-id='Availability_radio'])[3]")
		WebElement selectavailability; 
		//selecting relevance
		@FindBy(xpath="//span[@data-qa-id='sort_by_selected']")
		WebElement clickrelevance;
		//choosing consultation fee low-high
		@FindBy(xpath="//li[@role='option'][@data-qa-id='consultation_fees_desc']")
		WebElement selectrelevance; 
		//doctor profile
		@FindBy(xpath="//div[@class='info-section']")
		List<WebElement>  doctorProfile;
		
	private static String[] inputData;	
	
	//Homepage Validation
	public void ValidateHomepage(){
		String homepagetitle = driver.getTitle();
		System.out.println("Title of the homepage is : " + homepagetitle);
		String homepage="Practo | Video Consultation with Doctors, Book Doctor Appointments, Order Medicine, Diagnostic Tests";
		Assert.assertEquals(homepagetitle,homepage);
	}
	//clicking FindDoctors
	public void clickFindDoctors() {
		findDoctors.click();
	}
	//searching and selecting City
	public void City(String excelFilePath,String sheetName1) {
		inputData=readandwritedata.read(excelFilePath,sheetName1);
		city.click();
		city.clear();
		city.sendKeys(inputData[0]);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[normalize-space()='Chennai']")));
		clickCity.click();
	}
    //searching and selecting Doctor
	public void searchDoctor() {
		searchSpecialist.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@data-qa-id='omni-suggestion-listing'])[1]")));
		clickSpecialist.click();
	}
	
	//Action Methods for regression starts
	public void selectingGender() throws InterruptedException {
		gender.click();
		clickGender.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}
	public void selectingPatientStories() throws InterruptedException {
		patientStories.click();
		selectpatientStories.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}
	public void selectDoctorexp() throws InterruptedException {
		clickexperience.click();
		selectexperience.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}
	public void selectFilter() throws InterruptedException {
		clickfilter.click();
	    selectfees.click();
	    Thread.sleep(2000);
	    driver.navigate().refresh();
	}
	public void selectFilterAgain() throws InterruptedException {
		clickfilter.click();
		selectavailability.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}
	public void selectRelevance() throws InterruptedException {
		clickrelevance.click();
		selectrelevance.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}
	//regression end***********************
	
	//selecting filters
    public void allFilters() throws InterruptedException {
    	gender.click();
		clickGender.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		patientStories.click();
		selectpatientStories.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		clickexperience.click();
		selectexperience.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		clickfilter.click();
	    selectfees.click();
	    Thread.sleep(2000);
	    driver.navigate().refresh();
	    clickfilter.click();
		selectavailability.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		clickrelevance.click();
		selectrelevance.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
    }

	public List<String> getDoctorInfo() throws InterruptedException {
		int count=1;
		for (WebElement ele :doctorProfile ) {
			String data = ele.getText();
			Doctors.add(data);
			count++;
			if(count>5) {
				break;
			}
		}
		for(int i=0;i<Doctors.size();i++) {
		System.out.println((i+1)+". "+Doctors.get(i));
		System.out.println("----------------------------------------------------");
		}
		Thread.sleep(2000);
		return Doctors;
	}
}


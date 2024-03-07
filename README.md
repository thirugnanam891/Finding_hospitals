
Problem Statement : Finding Hospitals
Website           : "https://www.practo.com"
---------------------------------------------------------------------
1. Search Doctors
 - Speciality:Dentist,cardiologist,etc...
 - City:Chennai, Bangalore, Pune, etc...

2. Apply filters
 - Patient Stories
 - Experience
 - Fees
 - Availability
 - Relevance

3. Fetch & display the first 5 Doctor details

4. Go to "Surgeries"
 - Extract & store all the surgeries in a List
 - display it in console output

5. Under "For Corporate -> Health and Wellness Plan"
 - Fill the form with invalid email id & valid details for other fields
 - validate if "Taking a demo" button is disabled
 - Provide email in valid format and click the button

6. validate "Thank You" message is displayed


Steps of the Procedure:
----------------------------------------------------------------------
1)  Launch any browser (In this code we have used Chrome browser and Microsoft Edge browser). 
2)  Goto "https://www.practo.com". 
3)  Click on "Find Doctors".
4)  Choose City as "Chennai" and Speciality as "Dentist".
5)  Apply Filters for Patient Stories as "20+ Patient Stories.
6)  Apply Filters for Experience as "15+ Experience".
7)  Apply Filters for Fees as "0-500".
8)  Apply Filters for Availabilty as "Available Tomorrow"
9)  Store List of First 5 doctors in a list
10) Display it in a console.
11) Go to "surgeries"
12) ScrollDown and Fetch and display list of surgeries in a console.
13) Go to "For Corporates"
14) Click on Health and Wellness 
15) Fill the form with invalid "email" and valid details on other fields like "Name","Organization name","Contact"
16) Choose "Organization size" as "500-1000" and "Interested In" as "Taking a demo"
17) Validate "Schedule a Demo" Button.
18) Clear the "email" and fill valid "email"
19) Validate a "Schedule a Demo" Button.
20) Validate a "Thank you" Message.


Output
----------------------------------------------------------------------
[RemoteTestNG] detected TestNG version 7.4.0

Scenario: User searches for doctors with specific criteria       # src/test/resources/FeatureFiles/FindingHospitals.feature:3
  Given the user navigates to practo com                         # stepDefinitions.searchDoctorsteps.the_user_navigates_to_practo_com()

    Embedding User searches for doctors with specific criteria [image/png 375793 bytes]

Title of the homepage is : Practo | Video Consultation with Doctors, Book Doctor Appointments, Order Medicine, Diagnostic Tests
  When the user validates the HomepageTitle                      # stepDefinitions.searchDoctorsteps.the_user_validates_the_homepage_title()

    Embedding User searches for doctors with specific criteria [image/png 375793 bytes]

  Then the user Navigates to the Find Doctors page               # stepDefinitions.searchDoctorsteps.the_user_navigates_to_the_find_doctors_page()

    Embedding User searches for doctors with specific criteria [image/png 296779 bytes]

  And the user selects the city Chennai                          # stepDefinitions.searchDoctorsteps.the_user_selects_the_city_chennai()

    Embedding User searches for doctors with specific criteria [image/png 295945 bytes]

  And filters the search by Dentist                              # stepDefinitions.searchDoctorsteps.filters_the_search_by_dentist()

    Embedding User searches for doctors with specific criteria [image/png 195426 bytes]

  When the user applies filters                                  # stepDefinitions.searchDoctorsteps.the_user_applies_filters()

    Embedding User searches for doctors with specific criteria [image/png 91111 bytes]

1. Microsmiles
4 Dentist
3 - 17 years experience
Anna Nagar West
₹300Consultation Fees
100%235 Patient Stories
**************************************************
2. Dr. Kiruthika Asokan
Dentist
20 years experience overall
Porur,Chennai  Family Clinic
₹400 Consultation fee at clinic
100% 686 Patient Stories
**************************************************
3. Dr. Rachel Jacob
Dentist
18 years experience overall
Tambaram East,Chennai  Dr Jacobs Dentacare Clinic
₹400 Consultation fee at clinic
99% 87 Patient Stories
**************************************************
4. Dr. Lakshmi
Dentist
28 years experience overall
Anna Nagar,Chennai  Root Canal Foundation
₹400 Consultation fee at clinic
97% 46 Patient Stories
**************************************************
5. Dr. T. Sivasankari
Dentist
21 years experience overall
Mogappair,Chennai  Harsini Dental Clinic
₹300 Consultation fee at clinic
88% 27 Patient Stories
**************************************************
  Then the user should display the details of te first 5 doctors # stepDefinitions.searchDoctorsteps.the_user_should_display_the_details_of_te_first_doctors(java.lang.Integer)

    Embedding User searches for doctors with specific criteria [image/png 91116 bytes]


Scenario: User retrieves a list of surgeries            # src/test/resources/FeatureFiles/FindingHospitals.feature:12
  Given user navigates to the practo home page          # stepDefinitions.ListOfSurgeries.user_navigates_to_the_practo_home_page()

    Embedding User retrieves a list of surgeries [image/png 375793 bytes]

  When user clicks on surgeries in the practo home page # stepDefinitions.ListOfSurgeries.user_clicks_on_surgeries_in_the_practo_home_page()

    Embedding User retrieves a list of surgeries [image/png 594517 bytes]

Title of the diagnostic page is: Practo Care Surgeries | End to end care from top surgeons in your city
User navigated to correct page
  Then user validates the surgeries page                # stepDefinitions.ListOfSurgeries.user_validates_the_surgeries_page()

    Embedding User retrieves a list of surgeries [image/png 594517 bytes]

  Then user scrolls down the page                       # stepDefinitions.ListOfSurgeries.user_scrolls_down_the_page()

    Embedding User retrieves a list of surgeries [image/png 140256 bytes]

1. Piles
2. Hernia Treatment
3. Kidney Stone
4. Cataract
5. Circumcision
6. Lasik
7. Varicose Veins
8. Gallstone
9. Anal Fistula
10. Gynaecomastia
11. Anal Fissure
12. Lipoma Removal
13. Sebaceous cyst
14. Pilonidal Sinus
15. Lump in Breast
16. TURP
17. Hydrocele
18. Knee Replacement
19. Hair Transplant
**************************************************
  And user should capture the list of surgeries         # stepDefinitions.ListOfSurgeries.user_should_capture_the_list_of_surgeries()

    Embedding User retrieves a list of surgeries [image/png 490165 bytes]


Scenario: Schedule a demo in health and wellness plans for corporates                         # src/test/resources/FeatureFiles/FindingHospitals.feature:19
  Given the user navigates to practo page                                                     # stepDefinitions.ForCorporates.the_user_navigates_to_practo_page()

    Embedding Schedule a demo in health and wellness plans for corporates [image/png 375793 bytes]

  When user clicks on for corporates in practo home page navigation bar                       # stepDefinitions.ForCorporates.user_clicks_on_for_corporates_in_practo_home_page_navigation_bar()

    Embedding Schedule a demo in health and wellness plans for corporates [image/png 384971 bytes]

  And user clicks health and wellness plans in for corporates                                 # stepDefinitions.ForCorporates.user_clicks_health_and_wellness_plans_in_for_corporates()

    Embedding Schedule a demo in health and wellness plans for corporates [image/png 347647 bytes]

corporates page title is : Employee Health | Corporate Health & Wellness Plans | Practo
Directed to correct page
  Then user navigates to health and wellness plans page and validate the page                 # stepDefinitions.ForCorporates.user_navigates_to_health_and_wellness_plans_page_and_validate_the_page()

    Embedding Schedule a demo in health and wellness plans for corporates [image/png 347647 bytes]

  When user provide invalid email id and valid details for other fields in the form           # stepDefinitions.ForCorporates.user_provide_invalid_email_id_and_valid_details_for_other_fields_in_the_form()

    Embedding Schedule a demo in health and wellness plans for corporates [image/png 343861 bytes]

Schedule a Demo is disabled
  Then user validates schedule a demo button is enabled in the health and wellness plans page # stepDefinitions.ForCorporates.user_validates_schedule_a_demo_button_is_enabled_in_the_health_and_wellness_plans_page()

    Embedding Schedule a demo in health and wellness plans for corporates [image/png 343861 bytes]

  When user enters valid email id and clicks on schedule a demo button                        # stepDefinitions.ForCorporates.user_enters_valid_email_id_and_clicks_on_schedule_a_demo_button()

    Embedding Schedule a demo in health and wellness plans for corporates [image/png 344386 bytes]

Schedule a Demo is enabled
  Then user validates schedule a demo button is enabled in the health and wellness plans page # stepDefinitions.ForCorporates.user_validates_schedule_a_demo_button_is_enabled_in_the_health_and_wellness_plans_page()

    Embedding Schedule a demo in health and wellness plans for corporates [image/png 612733 bytes]

THANK YOU
Your demo request has been received. Our team will contact you shortly to follow-up.
THANK YOU message is displayed
  Then user validates the Thank you message is displayed                                      # stepDefinitions.ForCorporates.user_validates_the_thank_you_message_is_displayed()

    Embedding Schedule a demo in health and wellness plans for corporates [image/png 134064 bytes]

  Then user takes a screenshot of thank you message                                           # stepDefinitions.ForCorporates.user_takes_a_screenshot_of_thank_you_message()

    Embedding Schedule a demo in health and wellness plans for corporates [image/png 134064 bytes]

┌──────────────────────────────────────────────────────────────────────────┐
│ View your Cucumber Report at:                                            │
│ https://reports.cucumber.io/reports/740a8dd5-8f4d-406b-947b-30184dd6454e │
│                                                                          │
│ This report will self-destruct in 24h.                                   │
│ Keep reports forever: https://reports.cucumber.io/profile                │
└──────────────────────────────────────────────────────────────────────────┘
===============================================
Suite
Total tests run: 3, Passes: 3, Failures: 0, Skips: 0
===============================================

Folders
----------------------------------------------------------------------

1) src/test/java
       i)   factory
            -BaseClass.java 
       ii)  PageObjects
            -BasePage.java
            -Corporates.java
	        -Doctors.java
            -Surgeries.java
       iii) ScreenShots
	    	-Thankyou.png
       iv)  StepDefinitions
            -ForCorporates.java
            -Hooks.java  
            -ListOfSurgeries.java
            -searchDoctorsteps.java
        v)  testRunner
	    	-TestRunner.java
        vi) utilities
        	-ExtentReportManager
            -readandwritedata.java

2) src/test/resources
   	
       i)  config.properties
       ii)  extent.properties
       iii)  log4j2.xml
       iv)   testdata.xlsx

3) FeatureFiles
	-FindingHospital.feature
	-regression.feature
	-Smoke.feature
4)  logs
   
5)  reports - (cucumber report saved here)
     
6)  screenshots
7)  TestOutput
8)	crossBorwser
9)	Mastertestng
10)	run.bat
11) testng.xml
12) pom.xml

Data Driven Concepts
-----------------------------------------------------------------------
1) Properties File (Reading Data)

   * config.properties - This file consists of Execution environment, Browser name, os and URL value.
   * extent.properties - This file consists of configurations for Cucumber extentReport

2) Excel File (Writing data)

   1. testdata.xls  

      * Reads the data for city, specialist, name, organization name, contact and email.

      * writes the details of Doctors after applying filters

      * writes the list of surgeries


Key Automation Scope
-------------------------------------------------------------------------
-> Handling alert, different browser windows, search option
-> Navigating back to home page
-> Extract multiple options items & store in collections
-> Filling form (in different objects in web page)
-> Capture warning message   
-> Taking Screenshots


Technology/Automation Tools Used
-------------------------------------------------------------------------
1)  Selenium Webdriver and it's concepts.
2)  Maven
3)  Cucumber framework and it's concepts.
4)  Data Driven approach
5)  Page Object Model
6)  Cucumber Extent Report/ Cucumber Report
7)  Excel, Property file concepts
8)  Multiple Browser testing concepts
9)  Java Concepts
10) Selenium grid
11) Jenkins
12) Smoke and Regression suite


                                  
                                  ----------------------------
                                  |                          |
                                  |      IMPORTANT NOTE      |
                                  |                          |
                                  ----------------------------

    -> For mutiple browsers (chrome and Edge), The brower name is read from 'Config.properties' file
    -> If you want to use chrome brower, please go to 'Config.properties' file and set browser name as 'chrome'.
    -> If you want to use edge brower, please go to 'Config.properties' file and set browser name as 'edge'.
    -> Then execute the Test.


 
     

   

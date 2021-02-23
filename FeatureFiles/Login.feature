Feature: Login page as an admin i want to test login page
Scenario: Validate Login
Given i open hrm url in chrome browser
When i enter  in username field
When i enter in password field
When i click on login button
Then i validate url
Then i close browser
@DataTable
Scenario Outline: Validate login with multiple data
Given user open url in "<Browser>" browser
When user enter "<Username>" in textbox
When user enter "<Password>" in password
When user click on login button
Then user validates url
Then user close browser
Examples:
|Browser|Username|Password|
|chrome|Admin|Qedge123!@#|
|firefox|Admin|Qedge123!@#|
|chrome|Admin1|Qedge123!@#|
|firefox|Admin|Qedge123!@#2|
|chrome|Admin|Qedge123!@#|
|firefox|Admin|Qedge123!@#|



Feature: Login page as an admin i want to test login page
Scenario: Validate Login
Given i open hrm url in chrome browser
When i enter  in username field
When i enter in password field
When i click on login button
Then i validate url
Then i close browser

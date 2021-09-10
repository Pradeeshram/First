Feature: Validating the login functionality of the adactin website

Scenario: Validating the login functionality with all the combinations

Given  user is on the adactin website
When  user is going to enter the Username and password
And user is going to click login
Then user should check the success message

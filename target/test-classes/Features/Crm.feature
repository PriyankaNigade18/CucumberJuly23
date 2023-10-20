Feature: Test CRM application

  Background: 
    Given Open Crm application

  Scenario: Test signIn link
    When User click on SignIn Link
    Then SignIn page should be open

  Scenario: Test crm login with valid data
    Given Open SignIn page
    When User enter valid emailId "test@gmail.com"  and valid password "test123"
    And User click on Submit button
    Then User should be able login into crm application

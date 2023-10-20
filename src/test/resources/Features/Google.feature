Feature: Test Google Application

  Background: 
   Given Open Google application

  Scenario: Test Google page title
    When User get the current page title
    Then Title should be Google

  Scenario: Test search feature with valid keyword
    When User enter valid keyword in search box
    Then User should get valid result

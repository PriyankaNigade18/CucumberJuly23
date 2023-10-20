Feature: Test Orangehrm application

  #Data driven testing
  Scenario Outline: Test Hrm login functionality
    Given Open Hrm application
    When User enter "<username>" and enter "<password>"
    And User click on Login button
    Then Valid User should navigate to dashboard page

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | Amit     | test123  |
      | Admin    | admin123 |
      | smita    | test123  |

Feature: Test DataTable Scenario

  Scenario: Test Login with DataTable
    Given Open orangehrm application
    When user enter username and password
      | Admin | admin123 |
    When User click on button
    Then User should be able to login and should be able to navigate to dashboard

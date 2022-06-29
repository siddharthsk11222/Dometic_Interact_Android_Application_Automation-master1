Feature: Testing an Dometic LMC application

  @First @sanity
  Scenario: Verifying application Login Functionality with valid credentials
    Then I enter Valid Email in Login Page
    Then I enter Valid Password in Login Page
    Then I Tap on an Login button in Login Page
    Then  I Wait short period for Page to Load
    Then I verify successfully navigated to On boarding screen

Feature: Testing Login page in Dometic LMC application

  @First @sanity
  Scenario: Launching the application
    Given I Launch the application
    Then I Wait short period for Page to Load

  @sanity
  Scenario: Verifying application Splash screen Functionality
    Then I Tap on Allow button in Permission popup in Login Page
    Then I Wait short period for Page to Load
    Then I verify Welcome Text is displaying in Login Page
    Then I Verify Page title is displayed in Login Page
    Then I Wait short period for Page to Load


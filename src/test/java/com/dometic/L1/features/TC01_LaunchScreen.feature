Feature: Verifying application Splash screen in Dometic LMC/ERIBA application

  @First @sanity @Regression
  Scenario: Launching the application
    Given I Launch the application
    Then I Wait for Page to Load

  @First @sanity @Regression
  Scenario: Verifying application Splash screen Functionality
    Then I Tap on Allow button in Permission popup in Login Page
#    Then I Tap on Allow button for storage Permission popup in Login Page
    Then I Wait short period for Page to Load
    #Then I verify Welcome Text is displaying in Login Page
    Then I Verify Page title is displayed in Login Page
    Then I Wait short period for Page to Load


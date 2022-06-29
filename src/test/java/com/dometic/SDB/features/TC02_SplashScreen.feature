Feature: Verifying application Splash screen in Dometic Marine application

  @First @sanity @Regression
  Scenario: Verifying application Splash screen Functionality
    Then I Tap on Allow button in Permission popup in Login Page
    Then I Wait short period for Page to Load
    Then I verify Welcome Text is displaying in Login Page
    Then I Verify Page title is displayed in Login Page
    Then I Wait short period for Page to Load




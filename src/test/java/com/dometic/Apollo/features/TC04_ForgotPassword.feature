Feature: Verifying application Forgot Screen in Dometic Marine application

  @First @sanity @Regression
  Scenario: Verifying application Forgot Password Functionality
    Then I verify Forgot your password text is displayed in Forgot password Page
    Then I verify Forgot your password content text is displayed in Forgot password Page
    Then I verify E-mail (case sensitive) label is displayed
    Then I Verify Forgot Email Input text field is displayed in Login Page
    Then I Verify Send button is displayed in Forgot password Page

  @Regression
  Scenario: Verifying application Forgot Password Screen Functionality with invalid credentials(Checking password text field with below 8 character)
    Then I enter less then 8 characters in Email Field in Forgot Password Page
    Then I Tap on Send button in Forgot Password Page
    Then The password doesn't satisfy the conditions Error message is displayed.

  @Regression
  Scenario: Verifying application Forgot Password Screen Functionality with invalid credentials(Checking password text field with Above 8 character)
    Then I enter more then 8 characters in Email Field in Forgot Password Page
    Then I Tap on Send button in Forgot Password Page
    Then The password doesn't satisfy the conditions Error message is displayed.

  @Regression
  Scenario: Verifying application Forgot Password Functionality(Checking text field allowing Emoji's)
    Then I Wait short period for Page to Load
    Then I enter an Emoji's in Email Field in Forgot Password Page
    Then I Tap on Send button in Forgot Password Page
    Then The email must be a valid email address Error message is displayed.

  @Regression
  Scenario: Verifying application Forgot Password Functionality(Checking text field allowing Special Character)
    Then I Wait short period for Page to Load
    Then I enter an Special Character in Email Field in Forgot Password Page
    Then I Tap on Send button in Forgot Password Page
    Then The email must be a valid email address Error message is displayed.

  @sanity @Regression
  Scenario: Verifying application Forgot Password Functionality
    Then I Wait short period for Page to Load
    And I enter Email in Login Page
    Then I Wait short period for Page to Load
    Then I Tap on Send button in Forgot Password Page
    Then I Tap on Successfully email send popup

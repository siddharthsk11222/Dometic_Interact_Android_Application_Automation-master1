Feature: Verifying application Forgot Password page in Dometic LMC/ERIBA application

  @First @sanity1 @Regression1
  Scenario: Verifying application Forgot Password Screen UI
    Then I tap on forgot password in the login page
    Then I verify Forgot your password text is displayed in Forgot password Page
    Then I verify Forgot your password content text is displayed in Forgot password Page
   # Then I verify E-mail (case sensitive) label is displayed
    Then I Verify Forgot Email Input text field is displayed in Login Page
    Then I Verify Send button is displayed in Forgot password Page

  @Regression
  Scenario: Verifying application Forgot Password Screen Functionality with Blank Email field
#    Then I enter less then 8 characters in Email Field in Forgot Password Page
    Then I verify blank email in email text field in forgot password page
    Then I Tap on Send button in Forgot Password Page
    Then I verify E-mail field is required Error message is displayed

  @Regression
  Scenario: Verifying application Forgot Password Screen Functionality with invalid Email address
#    Then I enter more then 8 characters in Email Field in Forgot Password Page
    Then I enter a invalid email address in Email Field in Forgot Password Page
    Then I Tap on Send button in Forgot Password Page
    Then The email must be a valid email address Error message is displayed

  @Regression
  Scenario: Verifying application Forgot Password Functionality(Checking text field allowing Emoji's)
    Then I Wait short period for Page to Load
    Then I enter an Emoji's in Email Field in Forgot Password Page
    Then I Tap on Send button in Forgot Password Page
    Then The email must be a valid email address Error message is displayed

  @Regression
  Scenario: Verifying application Forgot Password Functionality(Checking text field allowing Special Character)
    Then I Wait short period for Page to Load
    Then I enter an Special Character in Email Field in Forgot Password Page
    Then I Tap on Send button in Forgot Password Page
    Then The email must be a valid email address Error message is displayed

  @sanity1 @Regression
  Scenario: Verifying application Forgot Password Functionality
    Then I Wait short period for Page to Load
    And I enter Email in Login Page
    Then I Tap on Send button in Forgot Password Page
#    Then I Wait short period for Page to Load
#    Then I Tap on Ok button.
#    Then I Wait short period for Page to Load
#    Then I Tap on Successfully email send popup


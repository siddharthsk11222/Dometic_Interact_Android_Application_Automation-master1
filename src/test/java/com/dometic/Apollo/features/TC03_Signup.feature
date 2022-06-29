Feature: Verifying application Signup Screen in Dometic Marine application

  @First @sanity @Regression
  Scenario: Verifying application Signup Screen UI
    Then I Tap on signup link in login page
    Then I Wait short period for Page to Load
    Then I Verify Email Inputbox is displayed in Signup Page
    Then I Verify Password Inputbox is displayed in Signup Page
    Then I Verify Confirm Password Inputbox is displayed in Signup Page
    Then I Verify Signup button is displayed in Signup Page
    Then I Tap on term and conditions checkbox

  @Regression
  Scenario: Empty Email and Enter the password and verify password
    Then I left the Email blank
    Then I enter Password in Signup Page
    And I enter confirm password in Signup Page
    Then I Tap on Signup button
    Then Email field is required Error message is displayed.

  @Regression
  Scenario: Enter the Email and Empty password and verify password
    Then I Wait short period for Page to Load
    Then I enter Email in Signup Page
    Then I left the password blank
    And I enter confirm password in Signup Page
    Then I Tap on Signup button
    Then The password field is required Error message is displayed.
    Then Doesn't match Error message is displayed.

  @Regression
  Scenario: Enter Valid email valid password and empty verify password
    Then I enter Email in Signup Page
    Then I enter Password in Signup Page
    Then I left the Verify password blank
    Then I Tap on Signup button
    Then The verify password field is required Error message is displayed.

  @Regression
  Scenario: Enter inValid email, password and valid verify password
    Then I enter Invalid Email in Signup Page
    Then I enter Password in Signup Page
    And I enter confirm password in Signup Page
    Then I Tap on Signup button
    Then The email must be a valid email address Error message is displayed.

  @Regression
  Scenario: Enter Valid email, invalid password and valid verify password
    Then I enter Email in Signup Page
    Then I enter invalid Password in Signup Page
    And I enter confirm password in Signup Page
    Then I Tap on Signup button
    Then The password doesn't satisfy the conditions Error message is displayed.
    Then Doesn't match Error message is displayed.

  @Regression
  Scenario: Enter Valid email, password and invalid verify password
    Then I enter Email in Signup Page
    Then I enter Password in Signup Page
    And I enter invalid verify password password in Signup Page
    Then I Tap on Signup button
    Then Doesn't match Error message is displayed.

  @Regression
  Scenario: Verifying application Signup Screen Functionality with invalid credentials(Checking password text field with below 8 character)
    Then I enter Email in Signup Page
    Then I enter an password below 8 characters in Password Field in Signup Page.
    Then I enter an password below 8 characters in confirm Password Field in Signup Page.
    Then I Tap on Signup button
    Then The password doesn't satisfy the conditions Error message is displayed.

  @Regression
  Scenario:Verifying application Signup Screen Functionality with invalid credentials(Checking password text field with Above 8 character)
    Then I enter Email in Signup Page
    Then I enter an password above 8 characters in Password Field in Signup Page.
    Then I enter an password above 8 characters in confirm Password Field in Signup Page.
    Then I Tap on Signup button
    Then The password doesn't satisfy the conditions Error message is displayed.

  @Regression
  Scenario:Verifying application Signup Screen Functionality with invalid credentials(Checking text field allowing Emoji's)
    Then I Wait short period for Page to Load
    Then I enter an Emoji's in Email Field in Signup Page.
    And I enter Password in Signup Page
    And I enter confirm password in Signup Page
    Then I Tap on Send button in Signup Page
    Then The email must be a valid email address Error message is displayed.

  @Regression
  Scenario: Verifying application Signup Screen Functionality with invalid credentials(Checking text field allowing Special Character)
    Then I Wait short period for Page to Load
    Then I enter an Special Character in Email Field in Signup Page.
    And I enter Password in Signup Page
    And I enter confirm password in Signup Page
    Then I Tap on Send button in Signup Page
    Then The email must be a valid email address Error message is displayed.

  @sanity @Regression
  Scenario: Verifying application Signup Functionality
    Then I Wait short period for Page to Load
    Then I Tap on signup link in login page
    And I enter Email in Signup Page
    And I enter Password in Signup Page
    And I enter confirm password in Signup Page
    Then I Tap on Send button in Signup Page
    Then I Tap on existing user popup
    Then I Tap on login link in signup page





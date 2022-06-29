Feature: Verifying application Signup Screen Language validation(French) in Dometic USLTV application

  @First1 @sanity1
  Scenario: Empty Email and Enter the password and verify password(French Language)
#    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I Tap on signup link in login page
    Then I left the Email blank
    Then I enter Password in Signup Page
    And I enter confirm password in Signup Page
    Then I Tap on term and conditions checkbox
    Then I Tap on Signup button
    Then Email field is required French text Error message is displayed

  @sanity1
  Scenario: Enter the Email and Empty password and verify password(French Language)
    Then I enter Email in Signup Page
    Then I left the password blank
    And I enter confirm password in Signup Page
    Then I Tap on Signup button
    Then The password field is required Spanish text Error message is displayed
    Then Doesn't match French text Error message is displayed

  @sanity1
  Scenario: Enter Valid email valid password and empty verify password(French Language)
    Then I enter Email in Signup Page
    Then I enter Password in Signup Page
    Then I left the Verify password blank
    Then I Tap on Signup button
    Then The verify password field is required French text Error message is displayed

  @sanity1
  Scenario: Enter inValid email, password and valid verify password(French Language)
    Then I enter Invalid Email in Signup Page
    Then I enter Password in Signup Page
    And I enter confirm password in Signup Page
    Then I Tap on Signup button
    Then The email must be a valid email address French text Error message is displayed

  @sanity1
  Scenario: Enter Valid email, invalid password and valid verify password(French Language)
    Then I enter Email in Signup Page
    Then I enter invalid Password in Signup Page
    And I enter confirm password in Signup Page
    Then I Tap on Signup button
    Then The password doesn't satisfy the conditions French text Error message is displayed
    Then Doesn't match French text Error message is displayed

  @sanity1
  Scenario: Enter Valid email, password and invalid verify password(French Language)
    Then I enter Email in Signup Page
    Then I enter Password in Signup Page
    And I enter invalid verify password password in Signup Page
    Then I Tap on Signup button
    Then Doesn't match French text Error message is displayed

  @sanity1
  Scenario: Validating application Spanish Language in Signup Page
    Then I Wait short period for Page to Load
    Then I Tap on signup link in login page
    Then I Verify Email Inputbox is displayed in Signup Page
    Then I Verify Password Inputbox is displayed in Signup Page
    Then I Verify Confirm Password Inputbox is displayed in Signup Page
    Then I Verify Signup button is displayed in Signup Page
    And I enter Email in Signup Page
    And I enter Password in Signup Page
    And I enter confirm password in Signup Page
    Then I Tap on Send button in Signup Page
    Then I Tap on login link in signup page
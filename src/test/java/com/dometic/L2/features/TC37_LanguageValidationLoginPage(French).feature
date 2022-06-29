Feature: Verifying application Login Screen Language validation(French) in Dometic USLTV application

  @First1 @sanity1
  Scenario: Validating application French Language in login page
    Then I verify Welcome! Text(French) is displayed in login screen
    Then I verify Log In Text(French) is displayed in login screen
    Then I verify E-mail label is displayed in login page
    Then I verify Password label is displayed in login page
    Then I verify Forgot password? link(French) is displayed in login page
    Then I verify Don't have an account? text(French) is displayed in login page
    Then I verify Sign Up link(French) is displayed in login page
    Then I verify Login CTA is displayed in login page

  @sanity1
  Scenario: Login with blank email and blank password field(French Language)
    Then I verify black email in email text field
    Then I verify black password in password text field
    Then I Tap on Login button in Login Page
    Then The Email field is required French Error message is displayed in login page
    Then The Password field is required French Error message is displayed in login page

  @sanity1
  Scenario: Login with Invalid Email with valid password(French Language)
    Then I enter Invalid Email in Login Page
    Then I enter Valid Password in Login Page
    Then I Tap on Login button in Login Page
    Then French Error message is displayed

  @sanity1
  Scenario: Login with Valid email and invalid password(French Language)
    Then I enter Valid Email in Login Page
    Then I enter an Invalid Password in Login Page
    Then I Tap on Login button in Login Page
    Then The password must be at least 5 characters. French Error message is displayed in login page

  @sanity1
  Scenario: Login with Valid email and blank password(French Language)
    Then I enter Valid Email in Login Page
    Then I verify black password in password text field
    Then I Tap on Login button in Login Page
    Then The Password field is required French Error message is displayed in login page

  @sanity1
  Scenario: Login with empty email and valid password(French Language)
    Then I verify black email in email text field
    Then I enter Valid Password in Login Page
    Then I Tap on Login button in Login Page
    Then The Email field is required French Error message is displayed in login page

  @sanity1
  Scenario:  Verifying application Login Functionality with invalid credentials(French Language)
    Then I enter Invalid Email in Login Page
    Then I enter an Invalid Password in Login Page
    Then I Tap on Login button in Login Page
    Then French Error message is displayed

  @sanity1
  Scenario: Verifying application Login Functionality with valid credentials(French Language)
    Then I enter Valid Email in Login Page
    Then I enter Valid Password in Login Page
    Then I Tap on an Login button(Spanish) in Login Page
    Then  I Wait short period for Page to Load
    Then I verify successfully navigated to On boarding screen
    Then I entered into On boarding screen
    Then I Tap on Yes button
    Then Landing screen is displayed
    Then I Wait short period for Page to Load
    Then I Tap on hamburger menu in landing screen
    Then I Wait short period for Page to Load
    Then I navigate to update language section in Settings
    Then I Wait short period for Page to Load
    Then I update language to French in settings
    Then I Tap on Back Button
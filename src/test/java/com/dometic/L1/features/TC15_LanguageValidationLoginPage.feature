Feature: Verifying application Login Screen Language validation in Dometic LMC/ERIBA application

  @First1 @sanity1
  Scenario: Validating application German Language in login page
    Then I verify Wilkommen zurück! text is displayed in login page
    Then I verify EinLoggen text is displayed in login page
    Then I verify Email text is displayed in login page
    Then I verify Passwort text is displayed in login page
    Then I verify Haben Sie ihr Passwort vergessen? text is displayed in login page
    Then I verify Haben Sie noch keinen Account? text is displayed in login page
    Then I verify Registrieren text is displayed in login page
    Then I verify EinLoggen button is displayed  in login page

  @sanity1
  Scenario: Login with blank email and blank password field
    Then I verify black email in email text field
    Then I verify black password in password text field
    Then I Tap on Login button in Login Page
    Then The Email field is required german Error message is displayed in login page
    Then The Password field is required german Error message is displayed in login page

  @sanity1
  Scenario: Login with Invalid Email with valid password
    Then I enter Invalid Email in Login Page
    Then I enter Valid Password in Login Page
    Then I Tap on Login button in Login Page
    Then German Error message is displayed

  @sanity1
  Scenario: Login with Valid email and invalid password
    Then I enter Valid Email in Login Page
    Then I enter an Invalid Password in Login Page
    Then I Tap on Login button in Login Page
    Then The password must be at least 5 characters. German Error message is displayed in login page

  @sanity1
  Scenario: Login with Valid email and blank password
    Then I enter Valid Email in Login Page
    Then I verify black password in password text field
    Then I Tap on Login button in Login Page
    Then The Password field is required german Error message is displayed in login page

  @sanity1
  Scenario: Login with empty email and valid password
    Then I verify black email in email text field
    Then I enter Valid Password in Login Page
    Then I Tap on Login button in Login Page
    Then The Email field is required german Error message is displayed in login page

  @sanity1
  Scenario:  Verifying application Login Functionality with invalid credentials
    Then I enter Invalid Email in Login Page
    Then I enter an Invalid Password in Login Page
    Then I Tap on Login button in Login Page
    Then German Error message is displayed

  @sanity1
  Scenario: Verifying application Login Functionality with valid credentials
    Then I enter Valid Email in Login Page
    Then I enter Valid Password in Login Page
    Then I Tap on an EinLoggen button in Login Page
    Then  I Wait short period for Page to Load
    Then I verify successfully navigated to On boarding screen
    Then I entered into On boarding screen
    Then I Tap on Yes button
    Then Landing screen is displayed
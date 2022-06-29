Feature: Verifying application Forgot Password Screen Language validation in Dometic LMC/ERIBA application

  @First1 @sanity1
  Scenario: Validating application German Language in login page
    Then I verify Forgot your password german text is displayed in Forgot password Page
    Then I verify Forgot your password content german text is displayed in Forgot password Page
    Then I verify E-mail german label is displayed
    Then I Verify Forgot Email Input text field is displayed in Login Page
    Then I Verify Send button is displayed in Forgot password Page
    And I enter Email in Login Page
    Then I Wait short period for Page to Load
    Then I Tap on Send button in Forgot Password Page
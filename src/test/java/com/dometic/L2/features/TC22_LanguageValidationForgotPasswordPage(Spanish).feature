Feature: Verifying application Forgot Password Screen Language validation(Spanish) in Dometic USLTV application

  @First1 @sanity1
  Scenario: Validating application Spanish Language in login page
    Then I verify Forgot your password Spanish text is displayed in Forgot password Page
    Then I verify Forgot your password content Spanish text is displayed in Forgot password Page
    Then I verify E-mail Spanish label is displayed
    Then I Verify Forgot Email Input text field is displayed in Login Page
    Then I Verify Send button is displayed in Forgot password Page
    And I enter Email in Login Page
    Then I Wait short period for Page to Load
    Then I Tap on Send button in Forgot Password Page
Feature: Verifying application Forgot password Screen Language validation(French) in Dometic USLTV application

  @First1 @sanity1
  Scenario: Validating application French Language in Forgot password
    Then I verify Forgot your password French text is displayed in Forgot password Page
    Then I verify Forgot your password content French text is displayed in Forgot password Page
    Then I verify E-mail French label is displayed
    Then I Verify Forgot Email Input text field is displayed in Login Page
    Then I Verify Send button is displayed in Forgot password Page
    And I enter Email in Login Page
    Then I Wait short period for Page to Load
    Then I Tap on Send button in Forgot Password Page
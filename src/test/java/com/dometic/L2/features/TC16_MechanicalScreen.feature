Feature: Verifying application Mechanical Screen in Dometic USLTV application

  @First1 @sanity1 @Regression1
  Scenario: Verifying application Mechanical screen functionality
    Then I Tap on Mechanical in Landing screen
    Then I Wait short period for Page to Load
    Then I verify Mechanical Header text
    Then I verify Awning text
    Then I verify Controller text in Mechanical screen
    Then I verify Open button in Mechanical screen
    And I verify Open button text in Mechanical screen
    Then I verify Close button in Mechanical screen
    And I verify Close button text in Mechanical screen
#    Then I Verify the Awning text
#    Then I Verify the Extent text
    Then I Wait short period for Page to Load
    Then I Tap on Back Button
    Then I Wait short period for Page to Load

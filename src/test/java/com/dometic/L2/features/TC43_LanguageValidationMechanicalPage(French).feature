Feature: Verifying application Mechanical Screen Language validation(French) in Dometic USLTV application

  @First1 @sanity1
  Scenario: Verifying application Mechanical screen(French) UI
    Then I Tap on Mécanique in Landing screen
    Then I Wait short period for Page to Load
    Then I verify Controller French text in Mechanical screen
    Then I verify Open button in Mechanical screen
    And I verify Open button French text in Mechanical screen
    Then I verify Close button in Mechanical screen
    And I verify Close button French text in Mechanical screen
    Then I Wait short period for Page to Load
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
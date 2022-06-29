Feature: Verifying application Mechanical Screen Language validation(Spanish) in Dometic USLTV application

  @First1 @sanity1
  Scenario: Verifying application Mechanical screen(Spanish) UI
    Then I Tap on Mecánica in Landing screen
    Then I Wait short period for Page to Load
    Then I verify Controller Spanish text in Mechanical screen
    Then I verify Open button in Mechanical screen
    And I verify Open button Spanish text in Mechanical screen
    Then I verify Close button in Mechanical screen
    And I verify Close button Spanish text in Mechanical screen
    Then I Wait short period for Page to Load
    Then I Tap on Back Button
    Then I Wait short period for Page to Load



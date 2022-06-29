Feature: Verifying application Power Screen Language validation in Dometic LMC/ERIBA application

  @First1 @sanity1
  Scenario: Verifying application German Language Energie tile in landing screen
    Then I Tap energy tile in landing screen
    Then I verify ENERGIE text displayed in the top of the app
    Then I verify Energie percentage is displayed in graphical format
    Then I verify Aufbaubatterie text is displayed
    Then I verify Spannung text is displayed
    Then I verify Spannung value is displayed
    Then I verify Strom text is displayed
    Then I verify Strom value is displayed
    Then I verify Zeit text is displayed
    Then I verify Zeit value is displayed
    Then I verify Spannungsversorgung text is displayed
    Then I verify Spannungsversorgung value is displayed
    Then I verify Back Button displayed in left corner of the Power house battery screen
    Then I Tap on Back Button in Power house battery screen
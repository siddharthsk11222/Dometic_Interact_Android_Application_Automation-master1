Feature: Verifying application Landing Screen Language validation in Dometic LMC/ERIBA application

  @First1 @sanity1
  Scenario: Verifying application German Language in Landing screen
    Then I Entered into Landing screen
    Then I Tap on Climate CTA in Landing screen
    Then I verify Klima Tile is displayed in Landing screen
    Then I verify Climate Klimaanlage text is displayed in landing screen
    Then I verify Klima unit is displayed in landing screen
#    Then I verify Klima Climate fan icon is displayed in landing screen
#    Then I verify Klima Climate fan speed is displayed in landing screen
    Then I verify Klima is displayed in Landing screen
    Then I verify Klima draußen text is displayed in Landing screen
    Then I verify Klima unit in outside is displayed in landing screen
    Then I verify Energie Tile is displayed in Landing screen
    Then I verify Energie Aufbaubatterie text is displayed in landing screen
    Then I verify Energie percentage is displayed in landing screen
    Then I verify Panzer Frischwassertank is displayed in Landing screen
    Then I verify Panzer Frischwassertank text is displayed in landing screen
    Then I verify Panzer Frischwassertank percentage is displayed in landing screen
    Then I verify Grauwassertank is displayed in Landing screen
    Then I verify Panzer Grauwassertank text is displayed in landing screen
    Then I verify Panzer Grauwassertank percentage is displayed in landing screen

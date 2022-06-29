Feature: Verifying application Tank Black Water Screen Language validation(French) in Dometic USLTV application

  @First1 @sanity1
  Scenario: Verifying application French Language in Tank Black Water screen
    Then I Tap on Réservoir in Landing screen
    Then I Wait short period for Page to Load
    Then I verify the NIVEAU D’EAU POTABLE in the Black tank main screen
    Then I verify the Pompe à eau in the Black tank main screen
    Then I verify the Potable in the Black tank main screen
    Then I verify the Noires in the Black tank main screen
    Then I verify the Analyse prédictive in the Black tank main screen
    Then I Wait short period for Page to Load
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
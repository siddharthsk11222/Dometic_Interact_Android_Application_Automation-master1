Feature: Verifying application View Options Screen Language validation(French) in Dometic USLTV application

  @First1 @sanity1
  Scenario: Verifying application ViewOption UI functionality(French)
    Then I Tap on View option button in landing screen
    Then I Validate the cancel button
    Then I Wait short period for Page to Load
    Then I verify Voir les options French text is displayed
    Then I verify Affichage par vignettes French text is displayed
    Then I verify Affichage par liste French text is displayed
    Then I verify Display French text is displayed
    Then I verify All Devices French text is displayed
    Then I verify Connected Devices French text is displayed
    Then I verify Non Connected Devices French text is displayed

  @sanity1
  Scenario: Verifying application ViewOption(Tile View-All Devices) functionality
    Then I Tap on Affichage par vignettes
    Then I Tap on All Devices
    Then I Tap on Cancel Button

  @sanity1
  Scenario: Verifying application ViewOption(Tile View-Connected Devices) functionality
    Then I Tap on View option button in landing screen
    Then I Tap on Connected Devices
    Then I Tap on Cancel Button

  @sanity1
  Scenario: Verifying application ViewOption(Tile View-Non Connected Devices) functionality
    Then I Tap on View option button in landing screen
    Then I Tap on Non Connected Devices
    Then I Tap on Cancel Button

  @sanity1
  Scenario: Verifying application ViewOption(List View-All Devices) functionality
    Then I Tap on View option button in landing screen
    Then I Tap on Affichage par liste
    Then I Tap on All Devices
    Then I Tap on Cancel Button

  @sanity1
  Scenario: Verifying application ViewOption(List View-Connected Devices) functionality
    Then I Tap on View option button in landing screen
    Then I Tap on Connected Devices
    Then I Tap on Cancel Button

  @sanity1
  Scenario: Verifying application ViewOption(List View-Non Connected Devices) functionality
    Then I Tap on View option button in landing screen
    Then I Tap on Non Connected Devices
    Then I Tap on Cancel Button

  @sanity1
  Scenario: Verifying application ViewOption functionality after Logout
    Then I Tap on View option button in landing screen
    Then I Tap on Affichage par vignettes
    Then I Tap on Connected Devices
    Then I Tap on Cancel Button
    Then I Wait short period for Page to Load
    Then I Tap on hamburger menu in landing screen
    Then I Wait short period for Page to Load
    Then I Tap on Logout
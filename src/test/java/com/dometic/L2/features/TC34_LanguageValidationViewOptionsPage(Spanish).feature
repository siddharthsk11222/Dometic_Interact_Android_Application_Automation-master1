Feature: Verifying application View Options Screen Language validation(Spanish) in Dometic USLTV application

  @First1 @sanity1
  Scenario: Verifying application ViewOption UI functionality
    Then I Tap on View option button in landing screen
    Then I Validate the cancel button
    Then I Wait short period for Page to Load
    Then I verify Ver Opciones spanish text is displayed
    Then I verify Vista de cuadrícula spanish text is displayed
    Then I verify Vista de lista spanish text is displayed
    Then I verify Display spanish text is displayed
    Then I verify All Devices spanish text is displayed
    Then I verify Connected Devices spanish text is displayed
    Then I verify Non Connected Devices spanish text is displayed

  @sanity1
  Scenario: Verifying application ViewOption(Tile View-All Devices) functionality
    Then I Tap on Vista de cuadrícula
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
    Then I Tap on Vista de lista
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
    Then I Tap on Vista de cuadrícula
    Then I Tap on Connected Devices
    Then I Tap on Cancel Button
    Then I Wait short period for Page to Load
    Then I Tap on hamburger menu in landing screen
    Then I navigate to update language section in Settings
    Then I update language to French in settings
    Then I Wait short period for Page to Load
    Then I Tap on Logout in Settings
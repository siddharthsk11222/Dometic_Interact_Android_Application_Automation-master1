Feature: Verifying application Climate Screen-Heater in Dometic LMC/ERIBA application

  @First1 @sanity1 @Regression1
  Scenario: Verifying application Climate-Heater screen functionality
    Then I Tap on Climate CTA in Landing screen
    Then I Wait short period for Page to Load
    Then I Tap on Heater in climate screen
    Then I Wait short period for Page to Load
    Then I Tap on heater power
    Then I Wait short period for Page to Load
    Then I Tap on Yes button
    Then I Wait short period for Page to Load
    Then I verify climate title is displayed in Heater Climate screen
    Then I verify inside text is displayed in Heater Climate screen
    Then I verify inside unit is displayed in Heater Climate screen
    Then I verify outside text is displayed in Heater Climate screen
    Then I verify outside unit is displayed in Heater Climate screen
    Then I swipe the screen right to left
    Then I swipe the screen right to left
    Then I Wait short period for Page to Load
    Then I verify Apply button is displayed in Heater Climate screen
    Then I Tap on Apply button in Climate Heater screen
    Then I verify Power text displayed in Heater climate screen
    Then I verify Power toggle displayed Heater in climate screen
    Then I verify Temperature text displayed in Heater climate screen
    Then I verify Temperature toggle displayed in Heater climate screen
    Then I verify Hot Water Level text is displayed in Heater climate screen
    Then I verify Hot Water Level Value is displayed in Heater climate screen
    Then I verify Energy text is displayed in Heater climate screen
    Then I verify Energy Value is displayed in Heater climate screen
    Then I Tap on Back Button

  @Regression1
  Scenario: Verifying application Climate-Heater(Hot Water Level)screen-last Value functionality
    Then I Tap on Climate CTA in Landing screen
    Then I Wait short period for Page to Load
    Then I Tap on Hot Water Level in Heater climate screen
    Then I Wait short period for Page to Load
    Then I Scroll the page till the last value in Hot Water Level page
    Then I verify apply button is displayed in Hot Water Level Heater climate screen
    Then I Tap on apply button in Hot Water Level Heater climate screen
    Then I Wait for Page to Load
    Then I Validate HotWaterLevel value is displayed in AC climate screen

  @Regression1
  Scenario: Verifying application Climate-Heater(Hot Water Level)screen-First Value functionality
    Then I Wait short period for Page to Load
    Then I Tap on Hot Water Level in Heater climate screen
    Then I Wait short period for Page to Load
    Then I Scroll the page till the First value in Hot Water Level page
    Then I verify apply button is displayed in Hot Water Level Heater climate screen
    Then I Tap on apply button in Hot Water Level Heater climate screen
    Then I Wait for Page to Load
    Then I Validate HotWaterLevel value is displayed in AC climate screen

  @Regression1
  Scenario: Verifying application Climate-Heater(Hot Water Level)screen functionality
    Then I Wait short period for Page to Load
    Then I Tap on Hot Water Level in Heater climate screen
    Then I verify Climate text displayed in Hot Water Level Heater climate screen
    Then I verify inside text is displayed in Hot Water Level Heater climate screen
    Then I verify inside unit is displayed in Hot Water Level Heater climate screen
    Then I verify outside text is displayed in Hot Water Level Heater climate screen
    Then I verify outside unit is displayed in Hot Water Level Heater climate screen
    Then I verify Water Heater temperature is displayed in Hot Water Level Heater climate screen
    Then I Verify THERME text is displayed
    Then I scroll up the screen
    Then I Wait for Page to Load
    Then I verify apply button is displayed in Hot Water Level Heater climate screen
    Then I Tap on apply button in Hot Water Level Heater climate screen
    Then I Wait for Page to Load
    Then I Validate HotWaterLevel value is displayed in AC climate screen

  @Regression1
  Scenario: Verifying application Climate-Heater(Energy)screen-Last Value functionality
    Then I Wait short period for Page to Load
    Then I Tap on Energy in Heater climate screen
    Then I Wait short period for Page to Load
    Then I Scroll the page till the last value in Energy page
    Then I verify apply button is displayed in Energy in Heater climate screen
    Then I Tap on apply button in Energy in Heater climate screen
    Then I Wait for Page to Load
    Then I validate Energy value is displayed in AC climate screen

  @Regression1
  Scenario: Verifying application Climate-Heater(Energy)screen-First Value functionality
    Then I Wait short period for Page to Load
    Then I Tap on Energy in Heater climate screen
    Then I Wait short period for Page to Load
    Then I Scroll the page till the First value in Energy page
    Then I verify apply button is displayed in Energy in Heater climate screen
    Then I Tap on apply button in Energy in Heater climate screen
    Then I Wait for Page to Load
    Then I validate Energy value is displayed in AC climate screen

  @Regression1
  Scenario: Verifying application Climate-Heater(Energy)screen functionality
    Then I Wait short period for Page to Load
    Then I Tap on Energy in Heater climate screen
    Then I Wait short period for Page to Load
    Then I verify Climate text displayed in Energy in Heater climate screen
    Then I verify inside text is displayed in Energy in Heater climate screen
    Then I verify inside unit is displayed in Energy in Heater climate screen
    Then I verify outside text is displayed in Energy in Heater climate screen
    Then I verify outside unit is displayed in Energy in Heater climate screen
    Then I verify Water Heater temperature is displayed in Energy in Heater climate screen
    Then I Verify ENERGY text is displayed
    Then I scroll up the screen
    Then I Wait for Page to Load
    Then I verify apply button is displayed in Energy in Heater climate screen
    Then I Tap on apply button in Energy in Heater climate screen
    Then I Wait for Page to Load
    Then I validate Energy value is displayed in AC climate screen
    Then I verify Back Button displayed in left corner of the climate screen
    Then I Tap on Back Button
    Then I Wait short period for Page to Load

  @Regression1
  Scenario: Verifying application Climate-Heater screen functionality and scroll up-to minimum temperature
    Then I Wait short period for Page to Load
    Then I scroll minimum temperature in Climate Heater
    Then I Wait short period for Page to Load
    Then I Tap on Apply button in Climate Heater screen
    Then I Wait for Page to Load
    Then I Wait short period for Page to Load
    Then I validate applied temperature is displayed in Temperature field

  @Regression1
  Scenario: Verifying applied Climate-Heater Minimum temperature displayed on Hot Water Level
    Then I Wait short period for Page to Load
    Then I Tap on Hot Water Level in Heater climate screen
    Then I validate applied temperature is displayed in Hot Water Level
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @Regression1
  Scenario: Verifying applied Climate-Heater Minimum temperature displayed on Energy
    Then I Wait short period for Page to Load
    Then I Tap on Energy in Heater climate screen
    Then I validate applied temperature is displayed in Energy
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @Regression1
  Scenario: Verifying applied Climate-Heater Minimum temperature displayed on Climate Tile
    Then I Wait short period for Page to Load
    Then I Tap on Back Button
    Then I validate applied minimum heater temperature is displayed in Climate Tile
    Then I Wait short period for Page to Load
    Then I Tap on Climate CTA in Landing screen

  @Regression1
  Scenario: Verifying application Climate-Heater screen functionality and scroll up-to Maximum temperature
    Then I Wait short period for Page to Load
    Then I scroll maximum temperature in Climate Heater
    Then I Wait short period for Page to Load
    Then I Tap on Apply button in Climate Heater screen
    Then I Wait for Page to Load
    Then I Wait short period for Page to Load
    Then I validate applied maximum temperature is displayed in Temperature field

  @Regression1
  Scenario: Verifying applied Climate-Heater Maximum temperature displayed on Hot Water Level
    Then I Wait short period for Page to Load
    Then I Tap on Hot Water Level in Heater climate screen
    Then I validate applied maximum temperature is displayed in Hot Water Level
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @Regression1
  Scenario: Verifying applied Climate-Heater Maximum temperature displayed on Energy
    Then I Wait short period for Page to Load
    Then I Tap on Energy in Heater climate screen
    Then I validate applied maximum temperature is displayed in Energy
    Then I Wait short period for Page to Load
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I verify Back Button displayed in left corner of the climate screen
    Then I Tap on Back Button

  @Regression1
  Scenario: Verifying applied Climate-Heater Maximum temperature displayed on Climate Tile
    Then I Wait short period for Page to Load
    Then I validate applied maximum heater temperature is displayed in Climate Tile
    Then I Wait short period for Page to Load












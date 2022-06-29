Feature: Verifying application Climate Screen in Dometic LMC/ERIBA application

  @First1 @sanity1 @Regression1
  Scenario: Verifying application Climate screen functionality
    Then I Tap on Climate CTA in Landing screen
    Then I Verify climate text displayed in the top of the app
    Then I verify climate inside field in climate screen
    Then I verify Climate outside field in climate screen
    Then I verify climate field in climate screen
    Then I swipe the screen left to right
    Then I swipe the screen left to right
    Then I Wait short period for Page to Load
    Then I verify Apply button is displayed in climate screen
    Then I Tap on Apply button  in climate screen
    Then I verify fan icon is displayed in climate screen
    Then I verify fan Speed is displayed in climate screen
    Then I verify Power container in climate screen
    Then I verify Power text displayed in climate screen
    Then I verify Power toggle displayed in climate screen
    Then i verify temperature in Climate screen
    Then I verify Temperature text displayed in climate screen
    Then I verify Temperature toggle displayed in climate screen
    Then I verify AC text displayed in climate screen
    Then I verify Heater text displayed in climate screen
    Then I verify AC Mode in climate screen
    Then I verify AC Fan Speed in climate screen

  @Regression1
  Scenario: Verifying application Climate screen scroll up-to Maximum temperature functionality
    Then I Wait short period for Page to Load
    Then I scroll maximum temperature in Climate AC
    Then I Wait short period for Page to Load
    Then I verify Apply button is displayed in climate screen
    Then I Tap on Apply button  in climate screen
    Then I Wait for Page to Load
    Then I validate applied temperature is displayed in temperature

  @Regression1
  Scenario: Verifying applied Climate Maximum temperature displayed on Ac Mode
    Then I Wait short period for Page to Load
    Then I Tap on Ac Mode in Climate screen
    Then I validate applied temperature is displayed in Ac Mode
    Then I Wait for Page to Load
    Then I Tap on Back Button in Ac Mode

  @Regression1
  Scenario: Verifying applied Climate Maximum temperature displayed on Ac Fan Speed
    Then I Wait short period for Page to Load
    Then I Tap on AC Fan Speed in climate screen
    Then I validate applied temperature is displayed in Ac Fan Speed
    Then I Wait for Page to Load
    Then I Tap on Back Button in Ac Fan Speed

  @Regression1
  Scenario: Verifying applied Climate Maximum temperature displayed on Climate Tile
    Then I Wait short period for Page to Load
    Then I Tap on Back Button
    Then I validate applied maximum temperature is displayed in Climate Tile
    Then I Wait short period for Page to Load















































































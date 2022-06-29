Feature: Verifying application Power Screen in Dometic USLTV application

  @First1 @sanity1
  Scenario: Verifying application Power screen Functionality
#    Then I Tap on the Power in Landing screen
#    Then I Wait short period for Page to Load
#    Then I verify Power-progressIndicator in Power
#    Then I Tap on Back Button
#    Then I Wait short period for Page to Load
#    Then I Validated Power-progressIndicator Percentage is displayed in Landing screen
#    Then I Wait short period for Page to Load

  @First1 @sanity1 @Regression1
  Scenario: Verifying application Power screen(Batteries) UI
    #Then I Tap on Back Button
    Then I Tap on the Power in Landing screen
    Then I Wait short period for Page to Load
    Then I Verify BATTERIES header text
    Then I Verify the House Battery Text
#    Then I Verify the Inverter Text
#    Then I Verify the Inverter toggle button is in OFF status
#    Then I Verify the Operating Mode Text
#    Then I Verify the House Battery Voltage Text
#    Then I Verify the Load Wattage Text
#    Then I Verify the Chassis Battery Voltage Text
#    Then I Verify the Generator Text
#    Then I Verify the Charger Text
#    Then I Verify the AGS Text in power main screen
    Then I Verify the Predictive data in power main screen

  @sanity1 @Regression1
  Scenario: Verify the POWER Generator Page UI
    Then I Tap on Generator in Power Screen
    Then I Wait short period for Page to Load
    Then I Verify the Generator text in Generator main page
    Then I Verify control text in Generator main screen
    Then I Verify Start button in power main screen
    Then I Verify Stop button in power main screen
    Then I Verify the  status text in Generator main screen
    Then I verify the Run time text in Generator main screen
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1 @Regression1
  Scenario: Verify the Charger Page UI
    Then I Wait short period for Page to Load
    Then I Tap on Charger in Power Screen
    Then I Wait short period for Page to Load
    Then I Verify the Charger text in the Charger main Page
    Then I verify the charger state in  charger main screen
    Then I verify the AC Input Current in charger main screen
    Then I verify the AC Load Current in charger main screen
    Then I verify the charger current in charger main screen
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1 @Regression1
  Scenario: Verify the POWER AGS Page UI
    Then I Wait short period for Page to Load
    Then I Tap on AGS in Power Screen
    Then I Wait short period for Page to Load
    Then I Verify the AGS text in the AGS main Page
    Then I verify clear AGS text in power AGS main screen
    Then I verify status text in power AGs main screen
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1 @Regression1
  Scenario: Verify the POWER Predictive Data Page UI
    Then I Wait short period for Page to Load
    Then I Tap on Predictive Data in Power Screen
    Then I Wait short period for Page to Load
    Then I Verify the Power Predictive Data text in the Predictive Data main Page
    Then I Wait short period for Page to Load
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I Tap on Back button in the Power main screen





















#    Then I Verify the power main screen header
#    Then I Verify the House Battery Text
#    Then I Verify the Inverter Text
#    Then I Verify the Operating Mode Text
#    Then I Verify the House Battery Voltage Text
#    Then I Verify the Load Wattage Text
#    Then I Verify the Chassis Battery Voltage Text
#    Then I Verify the Generator Text
#    Then I Verify the Charger Text
#    Then I Verify the AGS Text in power main screen
#    Then I Verify the Predictive data in power main screen
#    Then I Tap on Generator in Power Screen
#    Then I Verify control text in Generator main screen
#    Then I Verify Start button in power main screen
#    Then I Verify Stop button in power main screen
#    Then I Verify the  status text in Generator main screen
#    Then I verify the Run time text in Generator main screen
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button
#    Then I Wait short period for Page to Load
#    Then I Tap on Charger in Power Screen
#    Then I verify the charger state in  charger main screen
#    Then I verify the AC Input Current in charger main screen
#    Then I verify the AC Load Current in charger main screen
#    Then I verify the charger current in charger main screen
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button
#    Then I Wait short period for Page to Load
#    Then I Tap on AGS in Power Screen
#    Then I verify clear AGS text in power AGS main screen
#    Then I verify status text in power AGs main screen
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button
#    Then I Wait short period for Page to Load
#    Then I Tap on Predictive Data in Power Screen
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button
#    Then I Verify the battery voltage icon
#    Then I verify the Engine-1 text
#    Then I verify the STBD text
#    Then I verify the House text
#    Then I verify the Measured voltage text
#    Then I verify the Measured voltage value
#    Then I verify the Status text
#    Then I verify the Status value
#    Then I verify the UsageAnalysis text
#    Then I verify the UsageAnalysis Down Arrow
#    Then I Scroll up the page
#    Then I verify the Alert text
#    Then I verify the Alert toggle status
#    Then I verify the Alert toggle
#    Then I verify the Notify Me text
#    Then I verify the Notify Me toggle status
#    Then I verify the Notify Me toggle
#    Then I verify the Battery voltage text
#    Then I verify the Battery voltage value
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button
#    Then I Wait short period for Page to Load


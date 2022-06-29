Feature: Verifying application Power screen in Dometic LMC/ERIBA application

  @First1 @sanity1 @Regression1
  Scenario: Verifying application PowerHouseBattery screen functionality
    Then I Tap on PowerHouseBattery CTA in Landing screen
    Then I verify POWER text displayed in the top of the app
    Then I verify power percentage is displayed in graphical format
    Then I verify HOUSE BATTERY text is displayed
    Then I verify BatteryVoltage text is displayed
    Then I verify BatteryVoltage value is displayed
    Then I verify Current text is displayed
    Then I verify Current value is displayed
    Then I verify Time text is displayed
    Then I verify Time value is displayed
    Then I verify powerSource text is displayed
    Then I verify powerSource value is displayed
    Then I verify Back Button displayed in left corner of the Power house battery screen
#    Then I Tap on Back Button in Power house battery screen
    Then I Wait short period for Page to Load
    Then I Tap on Back Button








































































#    Then I verify Inverter is displayed
#    Then I verify Operating Mode is displayed
#    Then I verify HouseBatteryVoltage is displayed
#    Then I verify Load Wattage is displayed
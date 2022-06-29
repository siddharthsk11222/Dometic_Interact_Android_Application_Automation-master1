Feature: Verifying application AGS Screen in Dometic USLTV application

  @First1 @sanity1 @Regression1
  Scenario: Verifying application AGS screen UI
    Then I Tap on AGS in Landing Screen
    Then I Verify the Auto charger text in AGS Main screen
    Then I verify the Auto charger ON or OFF
    Then I Verify the Quiet Time Start text in AGS Main screen
    Then I Verify the Quiet Time Ends text in AGS Main screen
    Then I Verify the Start Voltage text in AGS Main screen
    Then I Verify the Time Under text in AGS Main screen
    Then I Verify the Generator Exerciser text in AGS Main screen
    Then I verify the Generator Exerciser ON or OFF
#    Then I Verify the Selected Days text in AGS Main screen
#    Then I Verify the Start Time text in AGS Main screen
#    Then I Verify the Run Time text in AGS Main screen
    Then I Verify the AGS Climate text in AGS Main screen
    Then I Tap on Back Button
    Then I Wait short period for Page to Load

  @Regression1
  Scenario: Verifying application AGS screen Quiet Time Start(AM) functionality
    Then I Tap on AGS in Landing Screen
    Then I Wait short period for Page to Load
    Then I Tap on the Auto Charger toggle whether toggle in OFF state
    Then I Tap on the Generator Exerciser toggle whether toggle in OFF state
    Then I Tap on Quiet Time Start
    Then I verify QUITE TIME START title
    Then I Wait short period for Page to Load
    Then I Tap on AM in Quiet Time Start screen
    Then I Wait short period for Page to Load
    Then I Scroll up the hours in Quiet Time Start
    Then I Scroll up the minutes in Quiet Time Start
    Then I Tap on apply button in AGS
    Then I Wait for Page to Load
    Then I validate updated Quiet Time Start time is applied in AGS Screen
    Then I Wait short period for Page to Load

  @Regression1
  Scenario: Verifying application AGS screen Quiet Time Start(PM) functionality
    Then I Tap on Quiet Time Start
    Then I verify QUITE TIME START title
    Then I Wait short period for Page to Load
    Then I Tap on PM in Quiet Time Start screen
    Then I Wait short period for Page to Load
    Then I Scroll up the hours in Quiet Time Start
    Then I Scroll up the minutes in Quiet Time Start
    Then I Tap on apply button in AGS
    Then I Wait for Page to Load
    Then I validate updated Quiet Time Start time is applied in AGS Screen
    Then I Wait short period for Page to Load

  @Regression1
  Scenario: Verifying application AGS screen Quiet Time Ends(AM) functionality
    Then I Tap on Quiet Time Ends
    Then I verify QUITE TIME ENDS title
    Then I Wait short period for Page to Load
    Then I Tap on AM in Quiet Time Ends screen
    Then I Wait short period for Page to Load
    Then I Scroll up the hours in Quiet Time Ends
    Then I Scroll up the minutes in Quiet Time Ends
    Then I Tap on apply button in Quiet Time Ends
    Then I Wait for Page to Load
    Then I validate updated Quiet Time Ends time is applied in AGS Screen
    Then I Wait short period for Page to Load

  @Regression1
  Scenario: Verifying application AGS screen Quiet Time Ends(PM) functionality
    Then I Tap on Quiet Time Ends
    Then I verify QUITE TIME ENDS title
    Then I Wait short period for Page to Load
    Then I Tap on PM in Quiet Time Ends screen
    Then I Wait short period for Page to Load
    Then I Scroll up the hours in Quiet Time Ends
    Then I Scroll up the minutes in Quiet Time Ends
    Then I Tap on apply button in Quiet Time Ends
    Then I Wait for Page to Load
    Then I validate updated Quiet Time Ends time is applied in AGS Screen
    Then I Wait short period for Page to Load

  @Regression1
  Scenario: Verifying application AGS screen Start Voltage functionality
    Then I Tap on Start Voltage
    Then I verify START VOLTAGE title
    Then I Wait short period for Page to Load
    Then I Scroll up the Start Voltage
    Then I Tap on apply button in Start Voltage
    Then I Wait for Page to Load
    Then I validate updated Start Voltage is applied in AGS Screen
    Then I Wait short period for Page to Load

  @Regression1
  Scenario: Verifying application AGS screen Time Under functionality
    Then I Tap on Time Under
    Then I verify TIME UNDER title
    Then I Wait short period for Page to Load
    Then I Scroll up the Time Under
    Then I Tap on apply button in Time Under
    Then I Wait for Page to Load
    Then I validate updated Time Under value is applied in AGS Screen
    Then I Wait short period for Page to Load

  @Regression1
  Scenario: Verifying application AGS screen Start Time(AM) functionality
    Then I Scroll up the screen in AGS
    Then I Tap on Start Time
    Then I verify START TIME title
    Then I Wait short period for Page to Load
    Then I Tap on AM in Start Time screen
    Then I Wait short period for Page to Load
    Then I Scroll up the hours in Start Time
    Then I Scroll up the minutes in Start Time
    Then I Tap on apply button in Start Time
    Then I Wait for Page to Load
    Then I validate updated Start Time value is applied in AGS Screen
    Then I Wait short period for Page to Load

  @Regression1
  Scenario: Verifying application AGS screen Start Time(PM) functionality
    Then I Tap on Start Time
    Then I verify START TIME title
    Then I Wait short period for Page to Load
    Then I Tap on PM in Start Time screen
    Then I Wait short period for Page to Load
    Then I Scroll up the hours in Start Time
    Then I Scroll up the minutes in Start Time
    Then I Tap on apply button in Start Time
    Then I Wait for Page to Load
    Then I validate updated Start Time value is applied in AGS Screen
    Then I Wait short period for Page to Load

  @Regression1
  Scenario: Verifying application AGS screen Run Time functionality
    Then I Scroll up the screen in AGS
    Then I Tap on Run Time
    Then I verify RUN TIME title
    Then I Wait short period for Page to Load
    Then I Scroll up the Run Time
    Then I Tap on apply button in Run Time
    Then I Wait for Page to Load
    Then I validate updated Run Time value is applied in AGS Screen
    Then I Wait short period for Page to Load
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
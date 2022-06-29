Feature: Verifying application Climate Screen in Dometic USLTV application

  @First1 @sanity1 @Regression1
  Scenario: Verifying application Climate screen functionality
    Then I Tap on Climate in Landing screen
    Then I Verify climate text displayed in the top of the app
    Then I verified inside text is displayed in Ac climate screen
   # Then I verified outside text is displayed in Ac climate screen
    Then I Tap on All climate toggle if already it's OFF state
    Then I Scroll Right to Left of the screen
    Then I Scroll Right to Left of the screen
    Then I Scroll Right to Left of the screen
    Then I Wait short period for Page to Load
#    Then I Tap on Apply button in climate screen
#    Then I Wait for Page to Load
    Then I verified Power text is displayed Ac climate screen
    Then I Scroll up the page
    Then I verified Fan speed text is displayed Ac climate screen
    Then I verified Climate Mode text is displayed Ac climate screen
    Then I verified Scheduler text is displayed Ac climate screen
    Then I Scroll up the page
    Then I Tap on Scheduler toggle if already it's OFF state
    Then I Verify Sleep text is displayed in Climate Screen
    Then I Verify Wake text is displayed in Climate Screen
    Then I Verify Away text is displayed in Climate Screen
    Then I Verify Return text is displayed in Climate Screen
    Then I Verify Temperature text is displayed in Climate Screen
    Then I Verify Scheduled Days text is displayed in Climate Screen
    Then I Verify Scheduled At text is displayed in Climate Screen
    Then I Tap on Back Button
    Then I Wait short period for Page to Load

  @Regression1
  Scenario: Verifying application Climate screen scroll up to Minimum temperature functionality
    Then I Tap on Climate in Landing screen
    Then I Wait short period for Page to Load
    Then I scroll minimum temperature in Climate
    Then I Wait short period for Page to Load
    Then I Tap on Apply button  in climate
    Then I Wait for Page to Load
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I validated minimum applied temperature is displayed in Landing screen

  @Regression1
  Scenario: Verifying application Climate screen scroll up to Maximum temperature functionality
    Then I Wait short period for Page to Load
    Then I Tap on Climate in Landing screen
    Then I Wait short period for Page to Load
    Then I scroll maximum temperature in Climate
    Then I Wait short period for Page to Load
    Then I Tap on Apply button  in climate
    Then I Wait for Page to Load
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I validated maximum applied temperature is displayed in Landing screen
    Then I Wait short period for Page to Load

  @Regression1
  Scenario: Verifying application Climate screen-Fan Speed Change the status into AUTO functionality
    Then I Wait short period for Page to Load
    Then I Tap on Climate in Landing screen
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Tap on Fan Speed value in Climate screen
    Then I Tap on Auto in Fan Speed
    Then I Scroll down the page
    Then I Validated the Applied Fan Speed is displayed

  @Regression1
  Scenario: Verifying application Climate screen-Fan Speed Change the status into LOW functionality
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Tap on Fan Speed value in Climate screen
    Then I Tap on Low in Fan Speed
    Then I Scroll down the page
    Then I Validated the Applied Fan Speed is displayed

  @Regression1
  Scenario: Verifying application Climate screen-Fan Speed Change the status into MEDIUM functionality
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Tap on Fan Speed value in Climate screen
    Then I Tap on Medium in Fan Speed
    Then I Scroll down the page
    Then I Validated the Applied Fan Speed is displayed

  @Regression1
  Scenario: Verifying application Climate screen-Fan Speed Change the status into HIGH functionality
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Tap on Fan Speed value in Climate screen
    Then I Tap on High in Fan Speed
    Then I Scroll down the page
    Then I Validated the Applied Fan Speed is displayed

  @Regression1
  Scenario: Verifying application Climate screen-Climate Mode Change the status into COOL functionality
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I Tap on Marine Tile.
    Then I Wait short period for Page to Load
    Then I Tap on Climate in Landing screen
    Then I Wait short period for Page to Load
    Then I Scroll the page till the Climate Mode
    Then I Tap on Climate Mode value in Climate screen
    Then I Tap on Cool in Climate Mode
    Then I Tap on Ok button
    Then I verify Climate AGS text in Climate Mode
    Then I verify Climate AGS Toggle in Climate Mode
    Then I verify Climate AGS Toggle Status in Climate Mode
    Then I verify Air Conditioner text in Climate Mode

  @Regression1
  Scenario: Verifying application Climate screen-Climate Mode Change the status into HEAT functionality
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I Tap on Marine Tile.
    Then I Wait short period for Page to Load
    Then I Tap on Climate in Landing screen
    Then I Wait short period for Page to Load
    Then I Scroll the page till the Climate Mode
    Then I Wait short period for Page to Load
    Then I Tap on Climate Mode value in Climate screen
    Then I Tap on Heat in Climate Mode
    Then I Tap on Ok button
    Then I verify Heat Source text in Climate Mode
    Then I verify Furnace text in Climate Mode
    Then I verify Heat Pump text in Climate Mode

  @Regression1
  Scenario: Verifying application Climate screen-Climate Mode Change the status into AUTO functionality
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I Tap on Marine Tile.
    Then I Wait short period for Page to Load
    Then I Tap on Climate in Landing screen
    Then I Wait short period for Page to Load
    Then I Scroll the page till the Climate Mode
    Then I Wait short period for Page to Load
    Then I Tap on Climate Mode value in Climate screen
    Then I Tap on Auto in Climate Mode
    Then I Tap on Ok button
    Then I verify Heat Source text in Climate Mode
    Then I verify Furnace text in Climate Mode
    Then I verify Heat Pump text in Climate Mode

  @Regression1
  Scenario: Verifying application Climate screen-Climate Mode Change the status into FAN SPEED functionality
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I Tap on Marine Tile.
    Then I Wait short period for Page to Load
    Then I Tap on Climate in Landing screen
    Then I Wait short period for Page to Load
    Then I Scroll the page till the Climate Mode
    Then I Wait short period for Page to Load
    Then I Tap on Climate Mode value in Climate screen
    Then I Tap on Fan Speed in Climate Mode
    Then I Tap on Ok button

  @Regression1
  Scenario: Verifying application Scheduler-Temperature Screen UI
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I Tap on Marine Tile.
    Then I Wait short period for Page to Load
    Then I Tap on Climate in Landing screen
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Scroll up the page
    Then I Tap on Temperature in Climate screen
    Then I verify header title is displayed
    Then I verify Inside Temperature is displayed
    Then I verify Outside Temperature is displayed
    Then I Verify Sleep text is displayed in Climate Screen
    Then I Verify Wake text is displayed in Climate Screen
    Then I Verify Away text is displayed in Climate Screen
    Then I Verify Return text is displayed in Climate Screen
    Then I verify Selected Days is displayed
    Then I verify Selected Days-Sunday text is displayed
    Then I verify Selected Days-Monday text is displayed
    Then I verify Selected Days-Tuesday text is displayed
    Then I verify Selected Days-Wednesday text is displayed
    Then I verify Selected Days-Thursday text is displayed
    Then I verify Selected Days-Friday text is displayed
    Then I verify Selected Days-Saturday text is displayed
    Then I Verify Scheduled At text is displayed
    Then I verify Scheduled At-AM text is displayed
    Then I verify Scheduled At-PM text is displayed
    Then I Scroll up the page

  @Regression1
  Scenario: Verifying application Scheduler-Temperature Screen Functionality
    Then I Wait short period for Page to Load
    Then I Scroll up the hours in Scheduled At-Temperature
    Then I Scroll up the minutes in Scheduled At-Temperature
    Then I verify the apply button in Temperature
    Then I Tap on apply button in Temperature
    Then I Wait for Page to Load
    Then I verify applied hours and minutes is displayed in Temperature
    Then I Tap on Ok button

  @Regression1
  Scenario: Verifying application Scheduler-Scheduled Days Screen UI
    Then I Wait short period for Page to Load
    Then I Tap on Scheduled Days in Climate screen
    Then I Wait short period for Page to Load
    Then I verify header title is displayed
    Then I verify Inside Temperature is displayed
    Then I verify Outside Temperature is displayed
    Then I Verify Sleep text is displayed in Climate Screen
    Then I Verify Wake text is displayed in Climate Screen
    Then I Verify Away text is displayed in Climate Screen
    Then I Verify Return text is displayed in Climate Screen
    Then I verify Selected Days is displayed
    Then I verify Selected Days-Sunday text is displayed
    Then I verify Selected Days-Monday text is displayed
    Then I verify Selected Days-Tuesday text is displayed
    Then I verify Selected Days-Wednesday text is displayed
    Then I verify Selected Days-Thursday text is displayed
    Then I verify Selected Days-Friday text is displayed
    Then I verify Selected Days-Saturday text is displayed
    Then I Verify Scheduled At text is displayed
    Then I verify Scheduled At-AM text is displayed
    Then I verify Scheduled At-PM text is displayed
    Then I Scroll up the page

  @Regression1
  Scenario: Verifying application Scheduler-Scheduled Days Screen Functionality
    Then I Scroll up the hours in Scheduled At-Scheduled Days
    Then I Scroll up the minutes in Scheduled At-Scheduled Days
    Then I verify the apply button in Temperature
    Then I Tap on apply button in Temperature
    Then I Wait for Page to Load
    Then I verify applied hours and minutes is displayed in Scheduled Days
    Then I Tap on Ok button

  @Regression1
  Scenario: Verifying application Scheduler-Scheduled At Screen UI
    Then I Wait short period for Page to Load
    Then I Tap on Scheduled AT in climate screen
    Then I Wait short period for Page to Load
    Then I verify header title is displayed
    Then I verify Inside Temperature is displayed
    Then I verify Outside Temperature is displayed
    Then I Verify Sleep text is displayed in Climate Screen
    Then I Verify Wake text is displayed in Climate Screen
    Then I Verify Away text is displayed in Climate Screen
    Then I Verify Return text is displayed in Climate Screen
    Then I verify Selected Days is displayed
    Then I verify Selected Days-Sunday text is displayed
    Then I verify Selected Days-Monday text is displayed
    Then I verify Selected Days-Tuesday text is displayed
    Then I verify Selected Days-Wednesday text is displayed
    Then I verify Selected Days-Thursday text is displayed
    Then I verify Selected Days-Friday text is displayed
    Then I verify Selected Days-Saturday text is displayed
    Then I Verify Scheduled At text is displayed
    Then I verify Scheduled At-AM text is displayed
    Then I verify Scheduled At-PM text is displayed
    Then I Scroll up the page

  @Regression1
  Scenario: Verifying application Scheduler-Scheduled At Screen Functionality
    Then I Scroll up the hours in Scheduled At-Scheduled At
    Then I Scroll up the minutes in Scheduled At-Scheduled At
    Then I verify the apply button in Temperature
    Then I Tap on apply button in Temperature
    Then I Wait for Page to Load
    Then I verify applied hours and minutes is displayed in Scheduled At
    Then I Tap on Ok button
    Then I Tap on Back Button
    Then I Wait for Page to Load





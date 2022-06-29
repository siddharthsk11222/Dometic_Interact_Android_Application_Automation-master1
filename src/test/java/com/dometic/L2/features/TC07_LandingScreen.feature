Feature: Verifying application Landing Screen in Dometic USLTV application

  @First1 @sanity1 @Regression1
  Scenario: Verifying application Landing Screen functionality
    Then I Tap on LATER Button
    Then I Tap on cancel button in Upgrade Firmware

  @sanity1
  Scenario: Verifying application Bottom Layout screen functionality
    Then I Verify the All option in the Bottom layout of Landing screen
    Then I Verify the Device option in the Bottom  layout of Landing screen
    Then I Verify the Tanks option in the Bottom  layout of Landing screen
    Then I Verify the climate option in the Bottom  layout of Landing screen
    Then I Verify the Scene option in the Bottom  layout of Landing screen
    Then I Wait short period for Page to Load
    Then I Tap on climate option in the Bottom  layout of Landing screen
    Then I Validated Corresponding Climate tile is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Device option in the Bottom  layout of Landing screen
    Then I Validate Corresponding Devices tile is displayed
    Then I Tap on Tanks option in the Bottom  layout of Landing screen
    Then I Validate Corresponding Tank tile is displayed
    Then I Tap on Scene option in the Bottom  layout of Landing screen
    Then I Wait short period for Page to Load
    Then I Tap on All option in the Bottom layout of Landing screen

  @sanity1
  Scenario: Verifying application Bottom Layout screen with ViewOption(Tile View-All Devices) functionality
    Then I Wait short period for Page to Load
    Then I Tap on View option button in landing screen
    Then I Wait short period for Page to Load
    Then I Tap on Tile View Options
    Then I Tap on All Devices
    Then I Tap on Cancel Button
    Then I Wait short period for Page to Load
    Then I Verify the All option in the Bottom layout of Landing screen
    Then I Verify the Device option in the Bottom  layout of Landing screen
    Then I Verify the Tanks option in the Bottom  layout of Landing screen
    Then I Verify the climate option in the Bottom  layout of Landing screen
    Then I Verify the Scene option in the Bottom  layout of Landing screen
    Then I Wait short period for Page to Load
    Then I Tap on climate option in the Bottom  layout of Landing screen
    Then I Validated Corresponding Climate tile is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Device option in the Bottom  layout of Landing screen
    Then I Validate Corresponding Devices tile is displayed
    Then I Tap on Tanks option in the Bottom  layout of Landing screen
    Then I Validate Corresponding Tank tile is displayed
    Then I Tap on All option in the Bottom layout of Landing screen

  @sanity1
  Scenario: Verifying application Bottom Layout screen with ViewOption(Tile View-Connected Devices) functionality
    Then I Tap on View option button in landing screen
    Then I Tap on Connected Devices
    Then I Tap on Cancel Button
    Then I Wait short period for Page to Load
    Then I Verify the All option in the Bottom layout of Landing screen
    Then I Verify the Device option in the Bottom  layout of Landing screen
    Then I Verify the Tanks option in the Bottom  layout of Landing screen
    Then I Verify the climate option in the Bottom  layout of Landing screen
    Then I Verify the Scene option in the Bottom  layout of Landing screen
    Then I Wait short period for Page to Load
    Then I Tap on climate option in the Bottom  layout of Landing screen
    Then I Validated Corresponding Climate tile is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Device option in the Bottom  layout of Landing screen
    Then I Validate Corresponding Devices tile is displayed
    Then I Tap on Tanks option in the Bottom  layout of Landing screen
    Then I Validate Corresponding Tank tile is displayed
    Then I Tap on All option in the Bottom layout of Landing screen

  @sanity1
  Scenario: Verifying application Bottom Layout screen with ViewOption(Tile View-Non Connected Devices) functionality
    Then I Tap on View option button in landing screen
    Then I Tap on Non Connected Devices
    Then I Tap on Cancel Button
    Then I Wait short period for Page to Load
    Then I Verify the All option in the Bottom layout of Landing screen
    Then I Verify the Device option in the Bottom  layout of Landing screen
    Then I Verify the Tanks option in the Bottom  layout of Landing screen
    Then I Verify the climate option in the Bottom  layout of Landing screen
    Then I Verify the Scene option in the Bottom  layout of Landing screen
    Then I Tap on Device option in the Bottom  layout of Landing screen
    Then I Tap on Tanks option in the Bottom  layout of Landing screen
    Then I Tap on Scene option in the Bottom  layout of Landing screen
    Then I Wait short period for Page to Load
    Then I Tap on All option in the Bottom layout of Landing screen

  @sanity1
  Scenario: Verifying application Bottom Layout screen with ViewOption(List View-All Devices) functionality
    Then I Tap on View option button in landing screen
    Then I Tap on List View Options
    Then I Tap on All Devices
    Then I Tap on Cancel Button
    Then I Verify the All option in the Bottom layout of Landing screen
    Then I Verify the Device option in the Bottom  layout of Landing screen
    Then I Verify the Tanks option in the Bottom  layout of Landing screen
    Then I Verify the climate option in the Bottom  layout of Landing screen
    Then I Verify the Scene option in the Bottom  layout of Landing screen
    Then I Wait short period for Page to Load
    Then I Tap on climate option in the Bottom  layout of Landing screen
    Then I Validated Corresponding Climate tile is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Device option in the Bottom  layout of Landing screen
    Then I Validate Corresponding Devices tile is displayed
    Then I Tap on Tanks option in the Bottom  layout of Landing screen
    Then I Validate Corresponding Tank tile is displayed
    Then I Tap on Scene option in the Bottom  layout of Landing screen
    Then I Wait short period for Page to Load
    Then I Tap on All option in the Bottom layout of Landing screen

  @sanity1
  Scenario: Verifying application Bottom Layout screen with ViewOption(List View-Connected Devices) functionality
    Then I Tap on View option button in landing screen
    Then I Tap on Connected Devices
    Then I Tap on Cancel Button
    Then I Verify the All option in the Bottom layout of Landing screen
    Then I Verify the Device option in the Bottom  layout of Landing screen
    Then I Verify the Tanks option in the Bottom  layout of Landing screen
    Then I Verify the climate option in the Bottom  layout of Landing screen
    Then I Verify the Scene option in the Bottom  layout of Landing screen
    Then I Wait short period for Page to Load
    Then I Tap on climate option in the Bottom  layout of Landing screen
    Then I Validated Corresponding Climate tile is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Device option in the Bottom  layout of Landing screen
    Then I Validate Corresponding Devices tile is displayed
    Then I Tap on Tanks option in the Bottom  layout of Landing screen
    Then I Validate Corresponding Tank tile is displayed
    Then I Tap on Scene option in the Bottom  layout of Landing screen
    Then I Wait short period for Page to Load
    Then I Tap on All option in the Bottom layout of Landing screen

  @sanity1
  Scenario: Verifying application Bottom Layout screen with ViewOption(List View-Non Connected Devices) functionality
    Then I Tap on View option button in landing screen
    Then I Tap on Non Connected Devices
    Then I Tap on Cancel Button
    Then I Verify the All option in the Bottom layout of Landing screen
    Then I Verify the Device option in the Bottom  layout of Landing screen
    Then I Verify the Tanks option in the Bottom  layout of Landing screen
    Then I Verify the climate option in the Bottom  layout of Landing screen
    Then I Verify the Scene option in the Bottom  layout of Landing screen
    Then I Wait short period for Page to Load
    Then I Tap on Device option in the Bottom  layout of Landing screen
    Then I Tap on Tanks option in the Bottom  layout of Landing screen
    Then I Tap on Scene option in the Bottom  layout of Landing screen
    Then I Wait short period for Page to Load
    Then I Tap on All option in the Bottom layout of Landing screen
    Then I Wait short period for Page to Load
    Then I Tap on View option button in landing screen
    Then I Wait short period for Page to Load
    Then I Tap on Tile View Options
    Then I Tap on All Devices
    Then I Tap on Cancel Button
    Then I Wait short period for Page to Load





Feature: Verifying application Water Heater Truma Screen in Dometic USLTV application

  @First1 @sanity1
  Scenario: Verifying application Water Heater Truma screen UI
    Then I Wait short period for Page to Load
    Then I Scroll the screen upto water heater truma
    Then I Tap on Water Heater Truma
    Then I Wait short period for Page to Load
    Then I verify the Heater text in the Truma heater
    Then I verify the Mode text in the Truma heater
    Then I verify the Change Mode text in the Truma heater
#    Then I verify the status in the Truma heater
#    Then I verify the Decalcification in the Truma heater
    Then I Tap on Back Button
    Then I Wait short period for Page to Load

  @sanity1
  Scenario: Verifying application Water Heater Truma screen functionality
    Then I validated Truma Heater Status on Tile
    Then I Tap on Water Heater Truma
    Then I Wait short period for Page to Load
    Then I scroll up the Truma heater carousel
    Then I verify the apply button in the Water heater Truma
    Then I Tap on the Truma heater Apply button
    Then I Wait short period for Page to Load
    Then I validated the Heater mode in the main screen

  @sanity1
  Scenario: Validating the updated values in the Water Heater main screen
    Then I Wait short period for Page to Load
    Then I Tap on Water Heater Truma
    Then I Wait short period for Page to Load
    Then I Validated the updated Heater mode values in the Heater Main screen
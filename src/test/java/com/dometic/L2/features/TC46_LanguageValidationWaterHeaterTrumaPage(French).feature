Feature: Verifying application Water Heater Truma Screen Language validation(French) in Dometic USLTV application

  @First1 @sanity1
  Scenario: Verifying application French Language in Water Heater Truma screen
    Then I Scroll the screen upto water heater truma
    Then I Tap on Chauffe-eau
    Then I Wait short period for Page to Load
    Then I Verify the Mode French text in the Water Truma main screen
    Then I Verify the CHANGER DE MODE French text in the Water Truma main screen
    Then I scroll up the Truma heater carousel
    Then I Wait short period for Page to Load
    Then I verify the Appliquer in apply button
    Then I Tap on Back Button
    Then I Wait short period for Page to Load

Feature: Verifying application Tank Black Water in Dometic USLTV application

  @First1 @sanity1
  Scenario: Verifying application Tank Black Water screen UI
    Then I Wait short period for Page to Load
    Then I Tap on Tank Black Water in Landing screen
    Then I Wait short period for Page to Load
    Then I verify the Black water level text
    Then I verify the Empty Black Water Tank text
    Then I verify the water pump text
    Then I verify the fresh text on button
    Then I verify the black text on button
    Then I verify the predictive data in Fresh water text

  @sanity1
  Scenario: Verifying application Tank Black Water screen functionality
    Then I verify Tank-progressIndicator in Tank Black Water
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I Validated Tank-progressIndicator(Black Water) Percentage is displayed in Landing screen
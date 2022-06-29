Feature: Verifying application Water Heater Truma Screen Language validation(Spanish) in Dometic USLTV application

  @First1 @sanity1
  Scenario: Verifying application Spanish Language in Water Heater Truma screen
    Then I Scroll the screen upto water heater truma
    Then I Tap on Calentador de agua
    Then I Wait short period for Page to Load
    Then I Verify the Modo text in the Water Truma main screen
    Then I Verify the MODO DE CAMBIO text in the Water Truma main screen
    Then I scroll up the Truma heater carousel
    Then I Wait short period for Page to Load
    Then I verify the Aplicar in apply button
    Then I Tap on Back Button
    Then I Wait short period for Page to Load

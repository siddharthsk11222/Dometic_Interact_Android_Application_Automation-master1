Feature: Verifying application Tank Black Water Screen Language validation(Spanish) in Dometic USLTV application

  @First1 @sanity1
  Scenario: Verifying application Spanish Language in Tank Black Water screen
    Then I Tap on Depósito Agua negra in Landing screen
    Then I Wait short period for Page to Load
    Then I verify the NIVEL DE AGUA NEGRA in the Black tank main screen
    Then I verify the Bomba de agua in the Black tank main screen
    Then I verify the Agua dulce in the Black tank main screen
    Then I verify the Negra in the Black tank main screen
    Then I verify the Análisis predictivo in the Black tank main screen
    Then I Wait short period for Page to Load
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
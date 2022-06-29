Feature: Verifying application Tank Fresh Water screen Language validation(Spanish) in Dometic USLTV application

  @First1 @sanity1
  Scenario: Verifying application Spanish Language in Tank Fresh Water screen
    Then I Tap on Depósito Fresh Water in Landing screen
    Then I Wait short period for Page to Load
    Then I verify the NIVEL DE AGUA DULCE in the Fresh tank main screen
    Then I verify the Bomba de agua in the Fresh tank main screen
    Then I verify the Agua dulce in the Fresh tank main screen
    Then I verify the Negra in the Fresh tank main screen
    Then I verify the Análisis predictivo in the Fresh tank main screen
    Then I Wait short period for Page to Load
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
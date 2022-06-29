Feature: Verifying application AGS Screen Language validation(Spanish) in Dometic USLTV application

  @First1 @sanity1
  Scenario: Verifying application Spanish text in AGS screen
    Then I Wait short period for Page to Load
    Then I Tap on AGS in Landing Screen
    Then I verify the Cargador automático in the AGS main screen
    Then I verify the Inicio del tiempo de silencio in the AGS main screen
    Then I verify the Fin del tiempo de silencio in the AGS main screen
    Then I verify the Tensión de inicio in the AGS main screen
    Then I verify the Tiempo de espera in the AGS main screen
    Then I verify the Funcionamiento preventivo del generador in the AGS main screen
    Then I verify the Días seleccionados in the AGS main screen
    Then I verify the Hora de inicio in the AGS main screen
    Then I Scroll up the page
    Then I verify the Tiempo de funcionamiento in the AGS main screen
    Then I verify the Climatización con AGS in the AGS main screen
    Then I Scroll down the page

  @sanity1
  Scenario: Verifying Inicio del tiempo de silencio main screen Spanish text in AGS screen
    Then I Tap on Inicio del tiempo de silencio
    Then I Wait short period for Page to Load
    Then I verify the Inicio del tiempo de silencio Header text in main screen
    Then I Verify the Apply button in the Inicio del tiempo de silencio main screen
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying Fin del tiempo de silencio main screen Spanish text in AGS screen
    Then I Wait short period for Page to Load
    Then I Tap on Fin del tiempo de silencio
    Then I verify the Fin del tiempo de silencio Header text in main screen
    Then I Verify the Apply button in the Fin del tiempo de silencio main screen
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying Tensión de inicio main screen Spanish text in AGS screen
    Then I Wait short period for Page to Load
    Then I Tap on Tensión de inicio
    Then I verify the Tensión de inicio Header text in main screen
    Then I Verify the Apply button in the Tensión de inicio main screen
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying Tiempo de espera main screen Spanish text in AGS screen
    Then I Wait short period for Page to Load
    Then I Tap on Tiempo de espera
    Then I verify the Tiempo de espera Header text in main screen
    Then I Verify the Apply button in the Tiempo de espera main screen
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying Hora de inicio main screen Spanish text in AGS screen
    Then I Wait short period for Page to Load
    Then I Tap on Hora de inicio
    Then I verify the Hora de inicio Header text in main screen
    Then I Verify the Apply button in the Hora de inicio main screen
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying Tiempo de funcionamiento main screen Spanish text in AGS screen
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Tap on Tiempo de funcionamiento
    Then I verify the Tiempo de funcionamiento Header text in main screen
    Then I Verify the Apply button in the Tiempo de funcionamiento main screen
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I Tap on Back Button
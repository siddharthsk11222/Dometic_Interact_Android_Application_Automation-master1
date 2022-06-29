Feature: Verifying application AGS Screen Language validation(French) in Dometic USLTV application

  @First1 @sanity1
  Scenario: Verifying application French text in AGS screen
    Then I Wait short period for Page to Load
    Then I Tap on AGS in Landing Screen
    Then I verify the Chargement automatique in the AGS main screen
    Then I verify the Début de la période d’inactivité in the AGS main screen
    Then I verify the Fin de la période d’inactivité in the AGS main screen
    Then I verify the Tension de démarrage in the AGS main screen
    Then I verify the Temps en dessous de in the AGS main screen
    Then I verify the Générateur d’exercices in the AGS main screen
    Then I verify the Selected Days in the AGS main screen
    Then I verify the Heure de début in the AGS main screen
    Then I Scroll up the page
    Then I verify the Durée de fonctionnement in the AGS main screen
    Then I verify the Climate AGS in the AGS main screen
    Then I Scroll down the page

  @sanity1
  Scenario: Verifying Début de la période d’inactivité main screen French text in AGS screen
    Then I Tap on Début de la période d’inactivité
    Then I Wait short period for Page to Load
    Then I verify the Début de la période d’inactivité Header text in main screen
    Then I Verify the Apply button in the Début de la période d’inactivité main screen
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying Fin de la période d’inactivité main screen French text in AGS screen
    Then I Wait short period for Page to Load
    Then I Tap on Fin de la période d’inactivité
    Then I verify the Fin de la période d’inactivité Header text in main screen
    Then I Verify the Apply button in the Fin de la période d’inactivité main screen
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying Tension de démarrage main screen French text in AGS screen
    Then I Wait short period for Page to Load
    Then I Tap on Tension de démarrage
    Then I verify the Tension de démarrage Header text in main screen
    Then I Verify the Apply button in the Tension de démarrage main screen
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying Temps en dessous de main screen French text in AGS screen
    Then I Wait short period for Page to Load
    Then I Tap on Temps en dessous de
    Then I verify the Temps en dessous de Header text in main screen
    Then I Verify the Apply button in the Temps en dessous de main screen
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying Heure de début main screen French text in AGS screen
    Then I Wait short period for Page to Load
    Then I Tap on Heure de début
    Then I verify the Heure de début Header text in main screen
    Then I Verify the Apply button in the Heure de début main screen
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying Durée de fonctionnement main screen French text in AGS screen
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Tap on Durée de fonctionnement
    Then I verify the Durée de fonctionnement Header text in main screen
    Then I Verify the Apply button in the Durée de fonctionnement main screen
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I Tap on Back Button
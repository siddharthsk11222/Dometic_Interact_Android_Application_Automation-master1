Feature: Verifying application DashBoard Screen in Dometic USLTV application

  @sanity1 @Regression1
  Scenario: Verifying application Login Functionality with valid credentials
    Then I enter Valid Email.
    Then I enter Valid Password.
    Then I Tap on an Login button.
#    Then I Wait short period for Page to Load
#    Then I verify successfully navigated to Dash Board screen

  @First1 @sanity1 @Regression1
  Scenario: Verifying application DashBoard screen functionality
    Then I entered into Home Page.
    Then I Wait short period for Page to Load
    Then I Tap on Marine Tile.
    Then I Wait short period for Page to Load
    Then I Wait until Landing screen is displayed.
#    Then I entered into On boarding screen
#    Then I Wait short period for Page to Load
#    Then I Tap on Yes button
#    Then Landing screen is displayed


Feature: Verifying application Tank Fresh Water Screen in Dometic USLTV application

  @First1 @sanity1 @Regression1
  Scenario: Verifying application Tank Fresh Water screen UI
    Then I Tap on Tank Fresh Water in Landing screen
    Then I Wait short period for Page to Load
    Then I Verify the fresh water level text
#    Then I verify the water pump text
    Then I verify the fresh text on button
#    Then I verify the black text on button
    Then I verify the predictive data in Fresh water text
    Then I Tap on the predictive data in the Tank main screen
#    Then I Scroll up the page
#    Then I verify the filling text in predicitve data
    Then I Tap on Back Button
    Then I Wait short period for Page to Load

  @Regression1
  Scenario: Verifying application Tank Fresh Water screen functionality
    Then I Tap on Tank Fresh Water in Landing screen
    Then I Wait short period for Page to Load
    Then I verify Tank-progressIndicator in Tank Fresh Water
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I Validated Tank-progressIndicator(Fresh Water) percentage is displayed in Landing screen
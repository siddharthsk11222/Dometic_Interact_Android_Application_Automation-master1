Feature: Verifying application Fuse Screen in Dometic USLTV application

  @Regression1
  Scenario: Verifying application Fuses screen applying all the fuse(Maximum) Functionality
    Then I validate Maximum Fuses is turn ON State
    Then I Wait short period for Page to Load
    Then I validate All Fuse is OK text is displayed in Landing page

  @First1 @sanity1 @Regression1
  Scenario: Verifying application Fuses screen UI
    Then I Tap on Fuses in Landing Screen
    Then I verify water pump text in Fuse
    Then I verify Satellite Dish text in Fuse
    Then I verify Accent light text in Fuse
    Then I verify Ceiling Light text in Fuse
    Then I verify Bed light text in Fuse
    Then I Scroll up the page
    Then I verify washroom light text in Fuse
    Then I verify Galley text in Fuse
    Then I verify Lounge light text in Fuse
    Then I verify Awning text in Fuse
    Then I Wait short period for Page to Load
    Then I Tap on Back Button
    Then I Wait short period for Page to Load

  @Regression1
  Scenario: Verifying application Fuses screen applying all the fuse(Minimum) Functionality
    Then I validate Maximum Fuses is turn OFF State
    Then I Wait short period for Page to Load
    Then I validate BlownOut text is displayed in Landing page

  @Regression1
  Scenario: Verifying application Fuses screen tap on any fuse Functionality
    Then I Tap on any of the fuse in Fuse Screen
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I validate applied fuse value is displayed in Landing page






























#    Then I Tap on Water Pump toggle in fuse
#    Then I Wait short period for Page to Load
#    Then I Tap on Ceiling Light toggle in fuse

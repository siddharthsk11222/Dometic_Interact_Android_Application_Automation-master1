Feature: Verifying application Fuse Screen Language validation(French) in Dometic USLTV application

  @First1 @sanity1
  Scenario: Verifying application Fuses screen(French) UI
    Then I Tap on Fusibles in Landing Screen
    Then I verify water pump French text in Fuse
    Then I verify Satellite Dish French text in Fuse
    Then I verify Accent light French text in Fuse
    Then I verify Ceiling Light French text in Fuse
    Then I verify Bed light French text in Fuse
    Then I verify washroom light French text in Fuse
    Then I Scroll up the page
    Then I verify Galley French text in Fuse
    Then I verify Lounge light French text in Fuse
    Then I verify Awning French text in Fuse
    Then I Wait short period for Page to Load
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
Feature: Verifying application Light Screen in Dometic USLTV application

  @First1 @sanity1 @Regression1
  Scenario: Verifying application Light screen UI
    Then I Tap on Back Button
    Then I Tap on Light in Landing screen
    Then I Wait short period for Page to Load
    Then I Verified Light screen header
    Then I Verified Assist Handle Text
    Then I Verified Utility center Text
    Then I Verified Accent Light Text
#    Then I Scroll left to right in Accent Light
#    Then I Wait short period for Page to Load
    Then I Verified Shower Text
    Then I Verified Ceiling Text
    Then I Verified Bedroom ceiling Text
    Then I Scroll up the page
#    Then I Scroll left to right in Bedroom Ceiling
    Then I Verified Galley Text
    Then I Verified Lounge Text
    Then I Verified Awning Light Text
    Then I Verified Bedroom Overhead Text
    Then I Verified Porch Light Text
    Then I Tap on Back Button
    Then I Wait short period for Page to Load

  @Regression1
  Scenario: Verifying application Light screen All Lights On Functionality
    Then I Tap on Light in Landing screen
    Then I Wait short period for Page to Load
    Then I Verify all the lights in Light screen
    Then I Tap on All lights ON Button
    Then I Wait for Page to Load
    Then I Wait short period for Page to Load
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I validate applied lights value is displayed in Landing page
    Then I Wait short period for Page to Load

  @Regression1
  Scenario: Verifying application Light screen All Lights Off Functionality
    Then I Tap on Light in Landing screen
    Then I Wait short period for Page to Load
    Then I Tap on All lights OFF Button
    Then I Wait for Page to Load
    Then I Wait short period for Page to Load
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I validated applied lights value is displayed in Landing page
    Then I Wait short period for Page to Load

  @Regression1
  Scenario: Verifying application Light screen Tap on any Lights Functionality
    Then I Tap on Light in Landing screen
    Then I Wait short period for Page to Load
    Then I Tap on any lights in light screen
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I validate applied lights value is displayed in Landing Screen
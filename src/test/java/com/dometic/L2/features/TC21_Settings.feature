Feature: Verifying application Settings Screen in Dometic USLTV application

  @First1 @sanity1 @Regression1
  Scenario: Verifying application Settings screen UI
    Then I verify hamburger menu in landing screen
    Then I Tap on hamburger menu in landing screen
    Then I verify settings screen back button
    Then I verify user profile photo is displayed
    Then I verify username is displayed
    Then I verify user email is displayed
    Then I verify View Edit Account text is displayed
    Then I verify Home text is displayed
    Then I verify Notification Settings text is displayed
    Then I verify Device Management is displayed
    Then I verify App Settings is displayed
    Then I verify Logout is displayed
    Then I verify Version 1.6 is displayed
    Then I Wait short period for Page to Load

  @Regression1
  Scenario: Verifying application Settings screen Functionality
    Then I Tap on Home in Settings screen
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Notification Settings
    Then I Tap on Back Button
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Device Management
    Then I Tap on back button in Device Management screen
    Then I Tap on hamburger menu in landing screen
    Then I Tap on App Settings
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I Tap on Marine Tile.

  @First1 @sanity1 @Regression1
  Scenario: Verify the Account Settings UI
    Then I Tap on hamburger menu in landing screen
    Then I Tap on view Edit Account option
    Then I verify the Header of the account settings
    Then I verify the profile photo of the account settings
    Then I Verify the UserName of account settings
    Then I Verify the UserEmail of account settings
    Then I Verify the profile text of account settings
    Then I verify the subscription text of account settings

  @sanity1 @Regression1
  Scenario: Verify the application Profile Page UI
    Then I Tap on the Profile card icon
    Then I Verify the Header of the profile page
    Then I verify the personal information text in profile page
    Then I verify the name text in profile page
    Then I verify the name value in profile page
    Then I verify the email text in profile page
    Then I verify the email value in profile page
    Then I verify the mobile text in profile page
    Then I verify the mobile value in profile page
    Then I verify the Address text in profile page
    Then I verify the Address value text in profile page
    Then I verify the Edit profile text in profile page
    Then I verify the Security text in profile page
    Then I Scroll up the page
    Then I verify the Password text in profile page
    Then I verify the Renew text in profile page
    Then I Tap on Back Button
    Then I Wait short period for Page to Load

  @sanity1 @Regression1
  Scenario: Verify the application Subscription Page UI
    Then I Tap on the Subscription navigation icon
    Then I verify the header of the subscription page
    Then I Tap on Back Button
    Then I Wait short period for Page to Load

  @First1 @sanity1 @Regression1
  Scenario: Verify the Edit profile page UI
    Then I Tap on the Profile card icon
    Then I tap on Edit profile in profile screen
    Then I Verify Edit profile header text
    Then I Verify user profile photo in edit profile screen
    Then I Verify user email value is displayed
    Then I Verify Firstname label is displayed
    Then I Verify Firstname Value is displayed
    Then I Verify Lastname label is displayed
    Then I Verify Lastname Value is displayed
    Then I Verify Primary Mobile label is displayed
    Then I Verify Primary Mobile Value is displayed
    Then I Verify Address label is displayed in Edit profile screen
    Then I Verify Address value is displayed in Edit profile screen
    Then I Verify Save Button is displayed
    Then I Verify the Close Button is Edit profile Page
    Then I tap on close button in Edit profile screen
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

#Edit profile functionality

  @Regression1
  Scenario: Verifying application Settings screen Edit profile screen(Checking text field allowing Empty text) Functionality
    Then I Wait short period for Page to Load
    Then I Enter an empty in First name Field in Edit profile screen
    Then I Enter an empty in Last name Field in Edit profile screen
    Then I Enter an empty in Primary Field Mobile in Edit profile screen
    Then I Enter an empty in Address field in Edit profile screen
    Then I Wait short period for Page to Load
    Then I tap on Save button
    Then I Wait short period for Page to Load
    Then I tap on Ok button

  @Regression1
  Scenario: Verifying application Settings screen Edit profile screen(Checking text field allowing Emoji's) Functionality
    Then I Enter an Emoji's in First name Field in Edit profile screen
    Then I Enter an Emoji's in Last name Field in Edit profile screen
    Then I Enter an Primary Mobile in Edit profile screen
    Then I Enter an Emoji's in Address field in Edit profile screen
    Then I Wait short period for Page to Load
    Then I tap on Save button
    Then I Wait short period for Page to Load
    Then I tap on Ok button

  @Regression1
  Scenario: Verifying application Settings screen Edit profile screen(Checking text field allowing Special Characters) Functionality
    Then I Enter an Special character in First name Field in Edit profile screen
    Then I Enter an Special character in Last name Field in Edit profile screen
    Then I Enter an Primary Mobile in Edit profile screen
    Then I Enter an Special character in Address field in Edit profile screen
    Then I Wait short period for Page to Load
    Then I tap on Save button
    Then I Wait short period for Page to Load
    Then I Tap on Ok button

  @Regression1
  Scenario: Verifying application Settings screen Edit profile screen Functionality
    Then I Enter an First name in Edit profile screen
    Then I Enter an Last name in Edit profile screen
    Then I Enter an Primary Mobile in Edit profile screen
    Then I Enter an Address in Edit profile screen
    Then I Wait short period for Page to Load
    Then I tap on Save button
    Then I Wait short period for Page to Load
    Then I tap on Ok button
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I Tap on Back Button
    Then I Wait short period for Page to Load

  @First1 @sanity1 @Regression1
  Scenario: Verifying Device Management and Edit vessel UI
    Then I Tap on hamburger menu in landing screen
    Then I click on Device Management
    Then I tap on the onboarded device
    Then I verify Device management title
    Then I verify Device management back button
    Then I verify Device management image
    Then I verify if device name is displayed
    Then I verify vessel information
    Then I verify Name text
    Then I verify if the device name is displayed
    Then I verify MAC address text
    Then I verify if MAC address is displayed
    Then I verify Edit vessel text
    Then I verify Edit vessel navigation button
    Then I tap on Edit vessel
    Then I Wait short period for Page to Load
    Then I verify Edit vessel header
    Then I verify Edit vessel close button
    Then I verify Edit vessel image is displayed
    Then I verify Edit vessel name text
    Then I verify if vessel name is displayed
    Then I verify Edit vessel Mac address text
    Then I verify if Edit vessel Mac address is displayed
    Then I verify if Save button is displayed
    Then I verify Save text
    Then I tap on close button in Edit vessel screen
    Then I verify Advanced text
    Then I verify Check Updates text
    Then I verify check updates navigation button
    Then I verify Unregister Delete Offboard text
    Then I verify Unregister Delete Offboard navigation button
    Then I Tap on back button in Device Management screen
    Then I Tap on back button in Device Management screen

  @Regression1
  Scenario: Verifying Device Management Edit device - Vessel name with more characters
    Then I Tap on hamburger menu in landing screen
    Then I click on Device Management
    Then I tap on the onboarded device
    Then I tap on Edit vessel
    Then I verify Edit vessel header
    Then I tap on Edit vessel Name
    Then I change Edit vessel name
    Then I click on Edit vessel image
    Then I click on Save button
    Then I Wait for Page to Load
    Then I verify the given new device name under the image
    Then I verify the given new device name in the Name field
    Then I Tap on back button in Device Management page
    Then I Wait short period for Page to Load
    Then I verify edited device name in device list page

  @Regression1
  Scenario: Verifying Device Management Edit device - Vessel name with invalid characters
    Then I Wait short period for Page to Load
    Then I tap on the onboarded device
    Then I tap on Edit vessel
    Then I verify Edit vessel header
    Then I tap on Edit vessel Name
    Then I enter an invalid vessel name
    Then I click on Edit vessel image
    Then I click on Save button
    Then I Wait for Page to Load
    Then I verify the given new device name under the image
    Then I verify the given new device name in the Name field
    Then I Tap on back button in Device Management page
    Then I Wait short period for Page to Load
    Then I verify edited device name in device list page

  @Regression1
  Scenario: Verifying Device Management Edit device - vessel name with emojis
    Then I Wait short period for Page to Load
    Then I tap on the onboarded device
    Then I tap on Edit vessel
    Then I verify Edit vessel header
    Then I tap on Edit vessel Name
    Then I enter a vessel name with emojis
    Then I click on Edit vessel image
    Then I click on Save button
    Then I Wait for Page to Load
    Then I verify the given new device name under the image
    Then I verify the given new device name in the Name field
    Then I Tap on back button in Device Management page
    Then I Wait short period for Page to Load
    Then I verify edited device name in device list page

  @Regression1
  Scenario: Verifying Device Management Edit device - valid vessel name
    Then I Wait short period for Page to Load
    Then I tap on the onboarded device
    Then I tap on Edit vessel
    Then I verify Edit vessel header
    Then I tap on Edit vessel Name
    Then I enter a valid vessel name
    Then I click on Edit vessel image
    Then I click on Save button
    Then I Wait for Page to Load
    Then I verify the given new device name under the image
    Then I verify the given new device name in the Name field
    Then I Tap on back button in Device Management page
    Then I Wait short period for Page to Load
    Then I verify edited device name in device list page
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I Tap on back button in Device Management screen

  @First1 @sanity1 @Regression1
  Scenario: Verify app setting UI implementation
    Then I Tap on hamburger menu in landing screen
    Then I Tap on App Settings
    Then I verify the App setting header text
    Then I verify the language text on the app setting page
    Then I verify the Temperature text on the setting page
    Then I verify the celcius temperature unit
    Then I verify the fahrenheit temperature unit
    Then I verify the app version name card title

  @sanity1 @Regression1
  Scenario: Verify app setting UI implementation for language
    Then I tap on the language collapse button
    Then I verify the language page header text
    Then I verify the english language text
    Then I verify the spanish language text
    Then I verify the french language text
    Then I verify the german language text
    Then I tap on the back button icon on language page
    Then I tap on the back button icon on app setting page

  @First1 @sanity1 @Regression1
  Scenario: Verify Temperature Functionality
    Then I Tap on hamburger menu in landing screen
    Then I Tap on App Settings
    Then I verify the App setting header text
    Then I verify the celcius temperature unit
    Then I verify the fahrenheit temperature unit
    Then I update Temperature Unit in Settings to fahrenheit
    Then I Tap on Back button from Settings
    Then I Tap on Marine Tile.
    Then I Scroll down the page
    Then I Wait for Page to Load
    Then I Tap on Climate in Landing screen
    Then I validate updated value displayed inside the climate tile
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I Tap on hamburger menu in landing screen
    Then I Tap on App Settings
    Then I update the Temperature Unit in Settings to Celcius
    Then I Tap on Back button from Settings
    Then I Tap on Climate in Landing screen
    Then I validated updated value displayed inside the climate tile
    Then I Tap on Back Button

  @First1 @sanity1 @Regression1
  Scenario: Verifying application Settings screen functionality
    Then I Tap on hamburger menu in landing screen
    Then I Wait short period for Page to Load
    Then I Tap on Logout in Settings screen.
#    Then I Verify SETTINGS Text displayed in the top of the app

  @sanity1
  Scenario: Verify Zone Management UI validation
    Then I Tap on hamburger menu in landing screen
    Then I Wait short period for Page to Load
    Then I verify Zone Management text is displayed
    Then I Tap on Zone Management in Settings
    Then I Wait short period for Page to Load
    Then I Verify ALL ZONES in Zone Management
    Then I verify Edit text in Zone Management
    Then I verify Limited to 4 Zones only text in Zone Management
    Then I verify Add ZoneIcon in Zone Management

  @sanity1
  Scenario: Verify Zone Management Functionality with Empty Zone name
    Then I Wait short period for Page to Load
    Then I Tap on Edit in ALL ZONES
    Then I Wait short period for Page to Load
    Then I Tap on Rename in ALL ZONES
    Then I Tap on the Zone name
    Then I clear the previous zone name
    Then I save the Zone
    Then I verify Zone Name can not be empty message is displayed

  @sanity1
  Scenario: Verify Zone Management Functionality with more then 10 character
    Then I Wait short period for Page to Load
    Then I Enter the zone name more then the limit
    Then I verify "10/10" character message is displayed

  @sanity1
  Scenario: Verify Zone Management Functionality with Zone name
    Then I Wait short period for Page to Load
    Then I Tap on the Zone name
    Then I clear the previous zone name
    Then I Enter the Zone name
    Then I Tap on Save

  @sanity1
  Scenario: Verify Zone Management Delete Zone Functionality
    Then I Wait short period for Page to Load
    Then I Tap on Edit in ALL ZONES
    Then I Wait short period for Page to Load
    Then I Tap on the Delete Zone Icon
    Then I Wait short period for Page to Load
    Then I Tap on YES, DELETE IT Button

  @sanity1
  Scenario: Verify Zone Management Add Zone Functionality
    Then I Wait short period for Page to Load
    Then I Tap on the Add Zone Icon
    Then I Select the zone
    Then I Enter the New Zone name
    Then I SAVE the Zone
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1
  Scenario: Verify Spanish Language Functionality
    Then I Wait short period for Page to Load
    Then I verify Languages text is displayed
    Then I navigate to update language section in Settings
    Then I update language to Spanish in settings
    And I verify on Language text updated with Spanish translation
    And I verify on Temperature text updated with Spanish translation
    And I verify on logout text updated with Spanish translation
#    Then I Tap on Back Button
    Then I Wait short period for Page to Load
#    Then I Tap on hamburger menu in landing screen

  @sanity1
  Scenario: Verify French Language Functionality
    Then I verify Languages text is displayed
    Then I navigate to update language section in Settings
    Then I update language to French in settings
    And I verify on Language text updated with French translation
    And I verify on Temperature text updated with French translation
    And I verify on logout text updated with French translation
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I Tap on hamburger menu in landing screen

  @sanity1
  Scenario: Verify Temperature Functionality
    Then I Verify Temperature unit text is displayed
    Then I update Temperature Unit in Settings
    Then I Tap on Back button from Settings
    Then I Wait short period for Page to Load
    Then I Tap on hamburger menu in landing screen

  @sanity1
  Scenario: Verify Version Functionality
    Then I verify Version is displayed

  @sanity1
  Scenario: Verify application Logout Functionality
    Then I verify Log out is displayed
#    Then I navigate to update language section in Settings
#    Then I update language to Spanish in settings
    Then I Wait short period for Page to Load
    Then I Tap on Logout in Settings









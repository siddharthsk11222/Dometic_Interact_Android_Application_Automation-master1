Feature: Verifying application Settings Screen in Dometic LMC/ERIBA application

  @First @sanity1
  Scenario: Verify the Device Management onboard screen UI
    Then I Tap on hamburger menu in landing screen
    Then I Wait short period for Page to Load
    Then I Tap on Device Management option
    Then I Tap on add new button in device Management
    Then I Tap on ok Button in No Device Onboarded popup
    Then I Verify the On-boarding screen Title
    Then I Wait for Page to Load
    Then I Wait short period for Page to Load
    Then I verify the close button in onboarding screen
    Then I Verify No device Found text in Onboarding screen
    Then I Verify the Search again button in onboarding screen
    Then I Tap on the close button in onboarding screen
    Then I Wait short period for Page to Load
    Then I tap on back button on onboarded device page

  @First @sanity1 @Regression1
  Scenario: Verifying Device Management screen UI
    Then I Tap on hamburger menu in landing screen
    Then I Wait short period for Page to Load
    Then I Tap on Device Management option
    Then I Wait short period for Page to Load
    Then I tap on the onboarded device for ERIBA
    Then I Wait short period for Page to Load
    Then I verify Device Management header
    Then I verify Device Management back button
    Then I verify Device image
    Then I verify the display of Device name
    Then I verify the vessel information text in Device Management
    Then I verify Name text in Device Management
    Then I verify the same device name is displayed
#    Then I verify MAC Address text in Device Management
#    Then I verify MAC address
    Then I verify Edit vessel
    Then I verify Edit vessel navigation button in Device Management
    Then I verify Advanced text in Device Management
    Then I verify Check updates
    Then I verify Check updated button
    Then I verify Unreg,Del,Offboard text
    Then I verify Unreg,Del,Offboard navigation button
    Then I Wait short period for Page to Load
    Then I Tap on Device Management back button
    Then I Wait short period for Page to Load
    Then I tap on back button on onboarded device page

  @sanity @Regression1
  Scenario: Verifying Device Management Edit vessel UI and functionality
    Then I Tap on hamburger menu in landing screen
    Then I Wait short period for Page to Load
    Then I Tap on Device Management option
    Then I Wait short period for Page to Load
    Then I tap on the onboarded device for ERIBA
    Then I Wait short period for Page to Load
    Then I tap on Edit vessel text in Device Management
    Then I Wait short period for Page to Load
    Then I verify Edit vessel header text
    Then I verify close button in Edit vessel
    Then I verify Name text in Edit vessel
    Then I Wait short period for Page to Load
    Then I enter new vessel name
    Then I verify Mac address text in Edit vessel
    Then I verify Mac address is display
    Then I verify Save button for Edit vessel
    Then I tap on Save button in Edit vessel
    Then I Wait short period for Page to Load
    Then I verify New vessel name under image
    Then I verify New vessel name
    Then I Wait short period for Page to Load
    Then I Tap on Device Management back button
    Then I Wait short period for Page to Load
    Then I verify if the device name is updated in onboarded device
    Then I tap on back button on onboarded device page
    Then I Wait short period for Page to Load
    Then I verify the updated device name in Home screen
    Then I Wait short period for Page to Load

  @sanity
  Scenario: Verify the Account Settings Main Screen UI
    Then I Tap on Hamburger menu
    Then I Tap on View Edit Account link
    Then I verify the Account Settings Header
    Then I verify the Profile photo
#    Then I verify the User Name
   # Then I verify the user Email
    Then I Verify the Settings text
    Then I verify the Profile text
    Then I Verify the Profile card icon
    Then I verify the Subscriptions text
    Then I verify the Subscriptions navigation icon
    Then I Tap on back button in Account settings screen


  @sanity
  Scenario: Verify the Profile Main screen UI
    Then I Tap on Hamburger Menu button
    Then I Wait short period for Page to Load
    Then I Tap on view Edit Account button link
    Then I Wait short period for Page to Load
    Then I Tap on Profile Card icon in Account settings screen
    Then I Wait short period for Page to Load
    Then I verify Profile title text
    Then I verify the profile photo in Profile screen
    Then I verify the Personal information text
    Then I verify the Name Label
   # Then I verify the Name value in profile page
    Then I verify the Email Label
   # Then I verify the Email value in profile page
    Then I verify the Mobile Label
   # Then I verify the Mobile value in profile page
    Then I verify the Address Label
    Then I verify the Edit profile text in Profile page
    Then I verify the Edit profile button card icon
    Then I verify the Security text
    Then I scroll up the screen
    Then I verify the Password text
   # Then I verify the Password value
    Then I verify the Renew card title
    Then I verify the Renew card icon
    Then I Tap on back button in Profile screen
    Then I Wait short period for Page to Load
    Then I Tap on back button in Account settings screen

  @sanity
  Scenario: Verify the Subscriptions Main screen UI
    Then I Tap on hamburger menu in landing screen
    Then I Wait short period for Page to Load
    Then I Tap on view Edit Account button link
    Then I Wait short period for Page to Load
    Then I Tap on the Subscriptions navigation icon
    Then I Wait short period for Page to Load
    Then I verify Subscriptions title text
    Then I verify the Back button in Subscriptions Page
    Then I Wait short period for Page to Load
    Then I Tap on back button in Account settings screen
    Then I Wait short period for Page to Load
    Then I Tap on back button in Account settings screen
    Then I Wait short period for Page to Load


  @sanity
  Scenario: Verify the Edit Profile Main screen UI
    Then I Tap on Hamburger Menu button
    Then I Wait short period for Page to Load
    Then I Tap on view Edit Account button link
    Then I Wait short period for Page to Load
    Then I Tap on Profile Card icon in Account settings screen
    Then I Tap on Edit Profile button card icon
    Then I Wait short period for Page to Load
    Then I verify the Edit profile title text
   # Then I Tap on Edit Profile cancel button image
    Then I verify Edit profile photo image
   # Then I verify the Edit profile Email value
    Then I verify the Edit profile First Name text
   # Then I verify the Edit profile First Name value
    Then I verify the Edit profile Last Name Label
   # Then I verify the Edit Profile Last Name value
    Then I verify the Primary mobile Label
   # Then I verify the Primary mobile value
    Then I verify the Edit Profile Address label
   # Then I verify the Address value
    Then I verify the Edit Profile Save button text
    Then I Tap on Edit Profile cancel button image
    Then I Tap on back button in Profile screen
    Then I Wait short period for Page to Load
    Then I Tap on back button in Account settings screen

  @sanity1
  Scenario: Verify the Manage Notification Main screen UI
    Then I Tap on Hamburger Menu button
    Then I Wait short period for Page to Load
    Then I Tap on Notification settings
    Then I Wait short period for Page to Load
    Then I verify the Manage Notification Header
    Then I verify the back arrow image in Manage notification screen
    Then I Verify Manage Notification logo
    Then I Verify Global settings text
    Then I Verify the Push Notifications text
    Then I Verify Push Notification toggle button status
    Then I Verify the email text on the page
    Then I verify email toggle button
    Then I Verify the sms text on the page
    Then I verify sms  toggle button
    Then I Verify the Advanced title text
    Then I Wait short period for Page to Load
    Then I tap on back button in Manage notifications

  @First1 @sanity1 @Regression1
  Scenario: Verifying application Settings screen functionality
    Then I Wait short period for Page to Load
  #  Then I verify hamburger menu in landing screen
    Then I Tap on hamburger menu in landing screen
    Then I Wait short period for Page to Load
    Then I Tap on Logout in Settings screen
#    Then I Verify SETTINGS Text displayed in the top of the app

  @sanity1
  Scenario: Verify Language Functionality
    Then I verify Languages text is displayed
    Then I navigate to update language section in Settings
    Then I update language to German in settings
    And I verify on Language text updated with German translation
    And I verify on Temperature text updated with German translation
    And I verify on logout text updated with German translation
    Then I Wait short period for Page to Load
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I Tap on Climate CTA in Landing screen
    Then I Wait short period for Page to Load
    Then I Tap on Back Button
    Then I Tap on PowerHouseBattery CTA in Landing screen
    Then I Wait short period for Page to Load
    Then I Tap on Back Button
    Then I Tap on hamburger menu in landing screen

  @sanity1
  Scenario: Verify Temperature Functionality
    Then I Verify Temperature unit text is displayed
    Then I update Temperature Unit in Settings
    Then I Tap on Back button from Settings
    Then I Tap on hamburger menu in landing screen

  @sanity1
  Scenario: Verify Version Functionality
    Then I verify Version is displayed

  @sanity1
  Scenario: Verify Logout Functionality
    Then I verify Log out is displayed
#    Then I Tap on Logout in Settings
Feature: Verifying application Setting Screen in Dometic SDB application

  @First @sanity @Regression
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

  @Regression
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
    Then I Tap on Marine Tile

  @First @sanity @Regression
  Scenario: Verifying UI for Device Management screen
    Then I tap on Alert Ok button
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Device Management
    Then I Tap on SDB
    Then I verify the Device Management Header
    Then I verify back button in Device Management screen
    Then I verify device name
    Then I verify Product information text
    Then I verify Name
    Then I verify given device name text
    Then I verify Edit text
    Then I verify the edit navigation button
    Then I verify PIN CODES text
    Then I verify Master pin text
    Then I verify Master Pin navigation button is displayed
    Then I verify Guest PIN list text
    Then I verify Guest PIN list navigation button is displayed
    Then I verify the Advanced text
    Then I verify Cooler settings text
    Then I verify cooler settings navigation button is displayed
    Then I verify Check updates text
    Then I verify Check updates navigation button is displayed
    Then I Scroll up the page
    Then I verify Unregister,Delete,Off board text
    Then I verify Unregister,Delete,Off board navigation button
    Then I tap on back button on device management main screen
    Then I tap on back button on device management device selection page

  @sanity @Regression
  Scenario: Verifying the device management Edit name UI
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Device Management
    Then I Tap on SDB
    Then I verify the edit card tile name
    Then I tap on vessel edit card button
    Then I verify the vessel name card title
    Then I verify the save button text
#    Then I tap on back button on edit screen
#    Then I Wait short period for Page to Load
#    Then I tap on back button on device management main screen
#    Then I Wait short period for Page to Load
#    Then I tap on back button on device management device selection page
    Then I Tap on close button in edit screen
    Then I tap on back button on device management main screen
    Then I tap on back button on device management device selection page
    Then I Wait short period for Page to Load

  @Regression
  Scenario: Verify device management Edit name functionality-invalid name
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Device Management
    Then I Tap on SDB
    Then I tap on vessel edit card button
    Then I enter an invalid name in edit name field
    Then I Tap on save button in edit screen
    Then I Wait for Page to Load
    Then I Verify Vessal name should not be empty text is displayed
#    Then I verify if the edited invalid name is displayed under name field
#    Then I tap on back button on device management main screen
#    Then I Wait short period for Page to Load
#    Then I verify if the edited name is displayed under device management device selection page
#    Then I tap on back button on device management device selection page
#    Then I Tap on hamburger menu in landing screen
#    Then I Tap on Home in Settings screen
#    Then I verify if the edited name is displayed in the home page tile

  @Regression
  Scenario: Verify device management edit name functionality-blank name
#    Then I Tap on hamburger menu in landing screen
#    Then I Tap on Device Management
#    Then I Tap on SDB
#    Then I tap on vessel edit card button
    Then I leave the edit name field blank
    Then I Verify Vessal name should not be empty text is displayed

  @Regression
  Scenario: Verify device management edit name functionality-valid name
    Then I enter a valid name in edit name field
    Then I Tap on save button in edit screen
    Then I Wait for Page to Load
    Then I verify if the edited valid name is displayed under name field
    Then I tap on back button on device management main screen
    Then I Wait short period for Page to Load
    Then I verify if the edited valid name is displayed under device management device selection page
    Then I tap on back button on device management device selection page
    Then I Wait short period for Page to Load
    Then I verify if the edited name is displayed in the home page tile

  @First @sanity @Regression
  Scenario: Verifying application Device Management Set Master Pin UI
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Device Management
    Then I Tap on SDB
    Then I Tap on the Master PIN option
    Then I Verified the Master PIN Password popup
    Then I enter the correct password
    Then I Tap on the alert popup Enter button
    Then I tap on Alert Ok button
    Then I tap on Alert Ok button
#    Then I verify the Master PIn Header
#    Then I Verify the Set Master Pin text
#    Then I Verify the text "Pin Must be 4 digit"
#    Then I have tap on the close button in master Pin Main screen
#    Then I Wait short period for Page to Load
    Then I tap on back button on device management main screen
    Then I tap on back button on device management device selection page

  @Regression
  Scenario: Master Pin Password blank field
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Device Management
    Then I Tap on SDB
    Then I Tap on the Master PIN option
    Then I Tap on the alert popup Enter button
    Then I tap on Alert Ok button
    Then I tap on Alert Ok button

  @Regression
  Scenario: Master Pin Password with Wrong password
    Then I Tap on the Master PIN option
    Then I enter the wrong password in the Password field
    Then I Tap on the alert popup Enter button
    Then I tap on Alert Ok button
    Then I tap on Alert Ok button

  @Regression
  Scenario: Master Pin Password with Correct password
    Then I Tap on the Master PIN option
    Then I enter the correct password
    Then I Tap on the alert popup Enter button
    Then I tap on Alert Ok button
    Then I tap on Alert Ok button

  @Regression1
  Scenario: Set Master PIN functionality
#    Then I Tap on the set master pin Input Field
#    Then I Enter the PIN less then 4 Digit
#    Then I Hide the Device Keypad
#    Then I Wait for Page to Load
#    Then I Enter the PIN as 4 Digit
#    Then I Verify the Text Message for Re-Enter PIN
#    Then I Re-Enter the PIN as 4 Digit
#    Then I Wait short period for Page to Load

  @First @sanity @Regression
  Scenario: Verifying the guest pin list UI
    Then I tap on Alert Ok button
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Device Management
    Then I Tap on SDB
    Then I tap on guest pin list right icon button
    Then I verify the back button for guest pin list page
    Then I verify the guest pin header text
    Then I verify the edit header text
    Then I tap on the edit text
    Then I verify the close symbol on edit guest list page
    Then I verify the add button symbol on edit guest list page
    Then I tap on the add button symbol on edit guest list page
    Then I verify the edit pin header text
    Then I verify the close symbol on edit pin page
    Then I verify the pin name text
    Then I verify the pin code text
    Then I verify the Mail box text
    Then I verify the Mail box toggle button
    Then I verify the refrigerated compartment text
    Then I verify the refrigerated compartment toggle button
    Then I tap on the close button symbol on edit pin page
    Then I tap on the close button symbol on guest list page
    Then I Wait short period for Page to Load
    Then I Tap on Back Button in guest List Page

  @First @sanity @Regression
  Scenario:Verify the temperature setting screen UI
    Then I tap on the temperature settings text
    Then I Wait short period for Page to Load
    Then I Verify the temperature settings header text tile
    Then I Verify the current temperature text on the temperature page
    Then I Verify the outside text on the temperature page
    Then I Verify the lower compartment on the temperature page
    Then I Verify the temperature alert text on the temperature page
    Then I Verify the temperature threshold text on the temperature page
    Then I Verify the temperature control text on the temperature page
    Then I Verify the scheduler title text on the temperature page
    Then I Verify the scheduler text on the temperature page
    Then I Tap on the back button on the temperature page
    Then I tap on back button on device management main screen
    Then I tap on back button on device management device selection page

  @Regression1
  Scenario: Verifying the guest pin list functionality
#    Then I tap on guest pin list right icon button
#    Then I tap on the edit text
#    Then I tap on the add button symbol on edit guest list page
#    Then I Wait short period for Page to Load
#    Then I enter the name for pin name
#    Then I enter the pincode
#    Then I tap on the save button for edit pin
#    Then I Wait for Page to Load
#    Then I tap on the edit text
#    Then I tap on the add button symbol on edit guest list page
#    Then I enter the name for pin name
#    Then I enter the pincode
#    Then I tap on the save button for edit pin
#    Then I Wait for Page to Load
#    Then I tap on the edit text
#    Then I tap on the add button symbol on edit guest list page
#    Then I enter the combination for name field
#    Then I enter the combination for pincode
#    Then I tap on the save button for edit pin
#    Then I Wait for Page to Load
#    Then I tap on the edit text
#    Then I tap on the add button symbol on edit guest list page
#    Then I enter the long length for name field
#    Then I enter the long length for pincode
#    Then I tap on the save button for edit pin
#    Then I Wait for Page to Load
#    Then I tap on the edit text
#    Then I tap on the add button symbol on edit guest list page
#    Then I enter the short for name field
#    Then I enter the short for pincode
#    Then I tap on the save button for edit pin
#    Then I Wait for Page to Load
#    Then I tap on the guest list right icon
#    Then I tap on back button on device management main screen
#    Then I Wait short period for Page to Load
#    Then I tap on back button on device management device selection page
#    Then I Wait short period for Page to Load

  @Regression1
  Scenario: Verifying the cooler setting UI implementation
#    Then I Verify the main cooler setting text
#    Then I tap on right icon of cooler setting
#    Then I verify the header text for cooler settings
#    Then I verify the cooler status card title
#    Then I verify the cooler status toggle button
#    Then I verify the scheduler card title
#    Then I verify the scheduler card toggle button
#    Then I verify the scheduled at card title
#    Then I verify the scheduled at right icon
#    Then I verify the temperature card title
#    Then I verify the temperature card right icon
#    Then I tap on the back button on cooler setting screen
#    Then I tap on the back button cooler settings
#    Then I Wait short period for Page to Load
#    Then I tap on back button on device management main screen
#    Then I Wait short period for Page to Load
#    Then I tap on back button on device management device selection page
#    Then I Wait short period for Page to Load

  @sanity @Regression
  Scenario: Verifying the app setting UI
    Then I Tap on hamburger menu in landing screen
    Then I tap on the app setting text
    Then I verify Version is displayed
    Then I verify the app setting card title
    Then I verify the language name card title
    Then I verify the right icon for for languages
    Then I verify the app version card title

  @sanity @Regression
  Scenario: Verify Version Functionality
    Then I verify Version is displayed
    Then I Tap on Back Button
    Then I Wait short period for Page to Load

  @First @sanity @Regression
  Scenario: Verify the Account Settings UI
    Then I Tap on hamburger menu in landing screen
    Then I Tap on App view and edit account
    Then I verify the Header of the account settings
    Then I verify the profile photo of the account settings
    Then I Verify the UserName of account settings
    Then I Verify the UserEmail of account settings
    Then I Verify the profile text of account settings
    Then I verify the subscription text of account settings

  @sanity @Regression
  Scenario: Verify Account Settings-Profile page UI
    Then I Tap on profile setting right icon
    Then I verify the personal information text
    Then I verify the name text
    Then I verify the email text
    Then I verify the mobile text
    Then I verify the address text
    Then I Scroll up the page
    Then I verify Edit profile text
    Then I verify Edit profile right icon text
    Then I verify Security text
    Then I Scroll up the page
    Then I verify Password text
    Then I verify the renew text
    Then I verify the right icon button
    Then I Tap on Back Button in profile screen
#    Then I Tap on Back Button in account settings screen

  @sanity @Regression
  Scenario: Verify the application Account Settings-Subscription Page UI
    Then I Tap on the Subscription navigation icon
    Then I verify the header of the subscription page
    Then I Tap on Back Button
    Then I Wait short period for Page to Load

  @First @sanity @Regression
  Scenario: Verify the Account Settings-Edit profile page UI
    Then I Tap on profile setting right icon
    Then I Tap on Edit profile in profile screen
    Then I verify Edit profile header text
    Then I verify user profile photo in edit profile screen
    Then I verify user email value is displayed
    Then I verify Firstname label is displayed
    Then I verify Firstname Value is displayed
    Then I verify Lastname label is displayed
    Then I verify Lastname Value is displayed
    Then I verify Primary Mobile label is displayed
    Then I verify Primary Mobile Value is displayed
    Then I verify Address label is displayed in Edit profile screen
    Then I verify Address value is displayed in Edit profile screen
    Then I verify Save Button is displayed
    Then I Verify the Close Button is Edit profile Page
    Then I tap on Close in Edit profile screen
    Then I Tap on Back Button in profile screen
    Then I Tap on Back Button

  @Regression
  Scenario: Verifying application Settings screen Edit profile screen(Checking text field allowing Empty text) Functionality
    Then I Tap on hamburger menu in landing screen
    Then I Tap on App view and edit account
    Then I Tap on profile setting right icon
    Then I Tap on Edit profile in profile screen
    Then I Wait short period for Page to Load
    Then I enter an empty in First name Field in Edit profile screen
    Then I enter an empty in Last name Field in Edit profile screen
    Then I enter an empty in Primary Field Mobile in Edit profile screen
    Then I enter an empty in Address field in Edit profile screen
    Then I Wait short period for Page to Load
    Then I Tap on Save button
    Then I Wait short period for Page to Load
    Then I tap on Ok button

  @Regression
  Scenario: Verifying application Settings screen Edit profile screen(Checking text field allowing Emoji's) Functionality
    Then I enter an Emoji's in First name Field in Edit profile screen
    Then I enter an Emoji's in Last name Field in Edit profile screen
    Then I enter an Primary Mobile in Edit profile screen
    Then I enter an Emoji's in Address field in Edit profile screen
    Then I Wait short period for Page to Load
    Then I Tap on Save button
    Then I Wait short period for Page to Load
    Then I tap on Ok button

  @Regression
  Scenario: Verifying application Settings screen Edit profile screen(Checking text field allowing Special Characters) Functionality
    Then I enter an Special character in First name Field in Edit profile screen
    Then I enter an Special character in Last name Field in Edit profile screen
    Then I enter an Primary Mobile in Edit profile screen
    Then I enter an Special character in Address field in Edit profile screen
    Then I Wait short period for Page to Load
    Then I Tap on Save button
    Then I Wait short period for Page to Load
    Then I tap on Ok button

  @Regression
  Scenario: Verifying application Settings screen Edit profile screen Functionality
    Then I enter an First name in Edit profile screen
    Then I enter an Last name in Edit profile screen
    Then I enter an Primary Mobile in Edit profile screen
    Then I enter an Address in Edit profile screen
    Then I Wait short period for Page to Load
    Then I Tap on Save button
    Then I Wait short period for Page to Load
    Then I tap on Ok button
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity @Regression
  Scenario: Verifying application Settings screen-App Settings screen
    Then I Wait short period for Page to Load
    Then I Tap on hamburger menu in landing screen
    Then I tap on the app setting text
    Then I Tap on Language in App Settings page
    Then I verify Back Button displayed in Language Page
    Then I verify Language Header Text in Language Page
    Then I Verify Language English Text in Language Page
    Then I Verify Language German Text in Language Page
    Then I Tap on Back Button in Language Screen

  @sanity @Regression
  Scenario: Verify Temperature Functionality
    Then I Verify Temperature unit text is displayed
    Then I update Temperature Unit in Settings

  @sanity @Regression
  Scenario: Verify German Language Functionality
    Then I Wait short period for Page to Load
    Then I verify Languages text is displayed
    Then I Tap on Language in App Settings page
    Then I update on the German language
    And I verify on Language text updated with German translation
    Then I Wait short period for Page to Load
    Then I Tap on Language in App Settings page
    Then I update on the english language
    Then I Wait short period for Page to Load
    Then I verify on Language text updated with english translation
    Then I Verify the selected english language selection
    Then I Wait short period for Page to Load
    Then I Tap on Back Button in App Settings screen

  @First @sanity @Regression
  Scenario: Verifying application Settings screen(logout) functionality
    Then I Wait short period for Page to Load
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Logout in Settings screen

  @sanity1
  Scenario: Verifying Push Notification UI in Manage Notification screen
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Notification Settings
    Then I verify the Manage Notification header
    Then I verify back button in Manage Notification
    Then I verify the Manage Notification logo
    Then I verify Global Settings text in Manage notification page
    Then I verify Push notification text in Manage notification page
    Then I verify Push notification toggle in Manage notification page
    Then I verify show more text for Push notification
    Then I verify show more text navigation button
    Then I click show more text
    Then I verify show less text for Push notification
    Then I verify show less text navigation button
    Then I verify Alerts text for Push notification
    Then I verify Alerts toggle button for Push notification
    Then I verify Warnings text for Push Notification
    Then I verify Warnings toggle button for Push notification
    Then I click show less
    Then I Wait short period for Page to Load

  @sanity1
  Scenario: Verifying Email UI in Manage Notification screen
#      Then I Tap on hamburger menu in landing screen
#      Then I Tap on Notification Settings
#      Then I verify the Manage Notification header
#      Then I verify back button in Manage Notification
#      Then I verify the Manage Notification logo
#      Then I verify Global Settings text in Manage notification page
    Then I verify E-mail text
    Then I verify E-mail toggle button
    Then I verify show more text for Email
    Then I verify show more navigation button in Email
    Then I Tap on email show more text
    Then I Wait for Page to Load
    Then I verify show less text in Email
    Then I verify show less text navigation button in Email
    Then I verify Email list text
    Then I verify edit list text
    Then I verify edit list navigation button
    Then I Tap on E-mail edit list
    Then I Wait for Page to Load
    Then I verify Email list header
    Then I verify Email account text
    Then I verify additional emails text
    Then I verify the add new button
    Then I verify save button
    Then I verify close button is displayed
    Then I click close button
    Then I Scroll up the page
    Then I verify Alerts text for Email
    Then I verify Alerts toggle button for Email
    Then I verify Warnings text for Email
    Then I verify Warnings toggle button for Email
    Then I click show less in Email

  @sanity1
  Scenario: Verifying SMS UI in Manage Notification screen
#    Then I Tap on hamburger menu in landing screen
#    Then I Tap on Notification Settings
    Then I verify SMS text
    Then I verify if SMS toggle is displayed
    Then I verify show more text for SMS
    Then I verify show more navigation button for SMS
    Then I click show more button
    Then I Wait for Page to Load
    Then I verify show less text for SMS
    Then I verify show less navigation button for SMS
    Then I Scroll up the page
    Then I verify Edit list text for SMS
    Then I verify Edit list navigation button for SMS
    Then I click on Edit list for SMS
    Then I Wait for Page to Load
    Then I verify SMS List header
    Then I verify SMS list close button
    Then I verify Mobile account text
    Then I verify Additional SMS text
    Then I verify add new button for SMS List
    Then I verify save button is displayed for SMS list
    Then I verify Save button text for SMS list
    Then I click on close button
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Wait short period for Page to Load
    Then I verify Alerts text for SMS
    Then I verify Alerts toggle for SMS
    Then I verify Warnings text for SMS
    Then I verify Warnings toggle for SMS
    Then I click show less in SMS
    Then I Tap on back button in manage notifications screen
    Then I Wait short period for Page to Load
    #Then I Tap on Back Button
    #Then I Wait short period for Page to Load


  @sanity1
  Scenario: Verify if user is able to click on Manage Notifications option
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Notification Settings
    Then I flip the state of Push Notifications toggle button
    Then I Wait short period for Page to Load
    Then I flip the state of Push Notifications toggle button


  @sanity1
  Scenario: Verify alerts warnings functionality in push notifications
    Then I Tap on push notifications show more dropdown
    Then I Wait short period for Page to Load
    Then I Turn OFF push notifications alerts toggle
    Then I Wait short period for Page to Load
    Then I Turn OFF push notifications warnings toggle
    Then I Wait short period for Page to Load
    Then I Turn ON push notifications alerts toggle
    Then I Wait short period for Page to Load
    Then I Turn ON push notifications warnings toggle
    Then I Wait short period for Page to Load
    Then I Tap on push notifications show less navigation button
    Then I Wait short period for Page to Load


  @sanity1
  Scenario: Verify E-mail toggle functionality
    Then I flip the state of E-mail toggle button
    Then I Wait short period for Page to Load
    Then I flip the state of E-mail toggle button
    Then I Wait short period for Page to Load
    Then I Tap on E-mail show more text
    Then I Wait short period for Page to Load

  @sanity1
  Scenario: Edit E-mail list functionality - valid inputs
    #Then I Scroll up the page
    Then I Wait short period for Page to Load
    Then I Tap on E-mail edit list
    Then I Wait short period for Page to Load
   # Then I verify if user navigates to the edit E-mail list screen
    Then I delete the existing list of Emails
    Then I Tap on Save button in Edit E-mail list screen
    Then I Wait short period for Page to Load
    Then I Tap on E-mail edit list
    Then I Wait short period for Page to Load
    Then I Tap on add new email button
   # Then I verify if E-mail and label field are displayed
    Then I enter a valid E-mail in E-mail field
    Then I enter a valid E-mail label name
    Then I Tap on Save button in Edit E-mail list screen
    Then I Wait for Page to Load
    Then I verify if the edited E-mail is displayed in the E-mail list
    Then I verify if the edited Label name is displayed below the respective E-mail
    Then I turn ON the toggle for the first edited E-mail in list
    Then I Wait short period for Page to Load
    Then I turn OFF the toggle for the first edited E-mail in list
    Then I Wait short period for Page to Load
    Then I Try to Turn ON the toggle for the first E-mail in list
    Then I Wait short period for Page to Load
    Then I try to Turn OFF the toggle for the first value in list
    Then I Wait short period for Page to Load

  @sanity1
  Scenario: Edit E-mail list functionality - two same E-mail ID's
    Then I Scroll up the page
    Then I Tap on E-mail edit list
    #Then I verify if user navigates to the edit E-mail list screen
    Then I Tap on add new email button
    #Then I verify if E-mail and label field are displayed
    Then I enter an E-mail that is already added to the list
    Then I Scroll up the page
    Then I enter a label that is already added to the list
    Then I Tap on Save button in Edit E-mail list screen
    Then I Wait for Page to Load
    Then I verify if the edited duplicate E-mail is displayed in the E-mail list
    Then I verify if the edited duplicate Label name is displayed below the respective E-mail
    Then I Try to Turn ON the toggle for the fourth E-mail in list
    Then I Wait short period for Page to Load
    Then I try to Turn OFF the toggle for the fourth value in list
    Then I Wait short period for Page to Load

  @sanity1
  Scenario: Edit E-mail list functionality - duplicate email and different label
    Then I Scroll up the page
    Then I Tap on E-mail edit list
    Then I Wait short period for Page to Load
    #Then I verify if user navigates to the edit E-mail list screen
    Then I Scroll up the page
    Then I Tap on add new email button
    #Then I verify if E-mail and label field are displayed
    Then I enter a duplicate E-mail already present in list
    Then I Scroll up the page
    Then I enter a label name that is not already present in list
    Then I Tap on Save button in Edit E-mail list screen
    Then I Wait for Page to Load
    Then I verify if the duplicate E-mail is displayed in the E-mail list
    Then I verify if the modified Label name is displayed below the respective E-mail
    Then I Try to Turn ON the toggle for the fifth E-mail in list
    Then I Wait short period for Page to Load
    Then I try to Turn OFF the toggle for the fifth value in list
    Then I Wait short period for Page to Load

  @sanity1
  Scenario: Edit E-mail list functionality - empty inputs
    Then I Scroll up the page
    Then I Tap on E-mail edit list
    Then I Wait short period for Page to Load
    #Then I verify if user navigates to the edit E-mail list screen
    Then I Scroll up the page
    Then I Tap on add new email button
    #Then I verify if E-mail and label field are displayed
    Then I leave the E-mail field blank
    Then I Scroll up the page
    Then I leave the E-mail label field blank
    Then I Tap on Save button in Edit E-mail list screen
    #Then I observe the error text message displayed in Edit Email fields


  @sanity1
  Scenario: Verify E-mail alerts and warnings functionality
    Then I Turn OFF E-mail alerts toggle
    Then I Wait short period for Page to Load
    Then I Turn OFF E-mail warnings toggle
    Then I Wait short period for Page to Load
    Then I Turn ON E-mail alerts toggle
    Then I Wait short period for Page to Load
    Then I Turn ON E-mail warnings toggle
    Then I Wait short period for Page to Load
    Then I Scroll down the page
    Then I Tap on E-mail show less navigation button


  @sanity1
  Scenario: Verify sms alerts and warnings functionality
    Then I flip the state of sms toggle button
    Then I Wait short period for Page to Load
    Then I flip the state of sms toggle button
    Then I Wait short period for Page to Load
    Then I Tap on sms show more text
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Wait short period for Page to Load
    Then I Turn OFF sms alerts toggle
    Then I Wait short period for Page to Load
    Then I Turn OFF sms warnings toggle
    Then I Wait short period for Page to Load
    Then I Turn ON sms alerts toggle
    Then I Wait for Page to Load
    Then I Turn ON sms warnings toggle
    Then I Wait short period for Page to Load

  @sanity1
  Scenario: Verify sms list functionality - valid inputs
    Then I Scroll up the page
    Then I Tap on sms edit list
    Then I Wait short period for Page to Load
   # Then I verify if user navigates to the edit E-mail list screen
    Then I delete the existing list of mobile numbers
    Then I Tap on Save button in Edit sms list screen
    Then I Wait short period for Page to Load
    Then I Tap on sms edit list
    Then I Wait short period for Page to Load
    Then I Tap on add new number button
   # Then I verify if E-mail and label field are displayed
    Then I enter a valid number in mobile number field
    Then I enter a valid sms label name
    Then I Tap on Save button in Edit sms list screen
    Then I Wait for Page to Load
    Then I verify if the edited number is displayed in the sms list
    Then I verify if the edited Label name is displayed below the respective number
    Then I turn ON the toggle for the first edited number in list
    Then I Wait short period for Page to Load
    Then I turn OFF the toggle for the first edited number in list
    Then I Wait short period for Page to Load
    Then I Try to Turn ON the toggle for the valid number in list
    Then I Wait short period for Page to Load
    Then I try to Turn OFF the toggle for the valid number in list
    Then I Wait short period for Page to Load

  @sanity1
  Scenario: Verify sms list functionality - invalid inputs
    Then I Scroll up the page
    Then I Tap on sms edit list
    Then I Wait short period for Page to Load
   # Then I verify if user navigates to the edit E-mail list screen
    Then I Tap on add new number button
   # Then I verify if E-mail and label field are displayed
    Then I enter an invalid number in mobile number field
    Then I verify the error message in the mobile number field
    Then I reenter a valid number
    Then I enter an invalid sms label name
    Then I Tap on Save button in Edit sms list screen
    Then I Wait for Page to Load
    Then I verify if the reentered number is displayed
    Then I verify if the edited invalid Label name is displayed below the respective number
    Then I Try to Turn ON the toggle for the invalid number in list
    Then I Wait short period for Page to Load
    Then I try to Turn OFF the toggle for the invalid number in list
    Then I Wait short period for Page to Load


  @sanity1
  Scenario: Verify sms list functionality - two same mobile numbers
    Then I Tap on sms edit list
    Then I Wait short period for Page to Load
    Then I Scroll up the page
   # Then I verify if user navigates to the edit E-mail list screen
    Then I Tap on add new number button
   # Then I verify if E-mail and label field are displayed
    Then I enter an already added number in mobile number field
    Then I Scroll up the page
    Then I enter an already created sms label name
    Then I Tap on Save button in Edit sms list screen
    Then I Wait for Page to Load
    Then I verify if the edited duplicate number is displayed in the sms list
    Then I verify if the edited duplicate Label name is displayed below the respective number
    Then I Try to Turn ON the toggle for the duplicate number in list
    Then I Wait short period for Page to Load
    Then I try to Turn OFF the toggle for the duplicate number in list
    Then I Wait short period for Page to Load

  @sanity1
  Scenario: Verify sms list functionality - duplicate mobile unique label
    Then I Tap on sms edit list
    Then I Wait short period for Page to Load
    Then I Scroll up the page
   # Then I verify if user navigates to the edit E-mail list screen
    Then I Tap on add new number button
   # Then I verify if E-mail and label field are displayed
    Then I enter an existing number in mobile number field
    Then I Scroll up the page
    Then I enter a unique sms label name
    Then I Tap on Save button in Edit sms list screen
    Then I Wait for Page to Load
    Then I verify if the edited existing number is displayed in the sms list
    Then I verify if the edited unique Label name is displayed below the respective number
    Then I Try to Turn ON the toggle for the edited existing number in list
    Then I Wait short period for Page to Load
    Then I try to Turn OFF the toggle for the edited existing number in list
    Then I Wait short period for Page to Load

  @sanity1
  Scenario: Verify sms list functionality - empty fields
    Then I Tap on sms edit list
    Then I Wait short period for Page to Load
    Then I Scroll up the page
   # Then I verify if user navigates to the edit E-mail list screen
    Then I Tap on add new number button
   # Then I verify if E-mail and label field are displayed
    Then I leave the mobile number field blank
    Then I leave the sms label field blank
    Then I Tap on Save button in Edit sms list screen
    Then I click on close button
    Then I Wait for Page to Load
    Then I Scroll down the page
    Then I Tap on sms show less navigation button

  @sanity1
  Scenario: Verifying Advanced UI in Manage Notification screen
#    Then I Tap on hamburger menu in landing screen
#    Then I Tap on Notification Settings
#    Then I verify the Manage Notification header
#    Then I verify back button in Manage Notification
#    Then I verify the Manage Notification logo
#    Then I verify Global Settings text in Manage notification page

#    Then I verify Advanced text in Manage notification page
#    Then I verify SDB icon
#    Then I verify SDB name
#    Then I verify SDB Device navigation button
#    Then I click on Dometic device
#    Then I Wait for Page to Load
#    Then I verify Advanced header
#    Then I verify back button in Advanced screen
#    Then I verify the logo
#    Then I verify Push notification text in Advanced
#    Then I verify Push notification toggle in Advanced
#    Then I verify email text in advanced
#    Then I verify email toggle in advanced
#    Then I verify Tank text in advanced
#    Then I verify Tank toggle in advanced
#    Then I verify show more text in advanced
#    Then I verify show more navigation button in advanced
#    Then I click on show more
#    Then I verify Alerts text for advanced
#    Then I verify Alerts Push notification text in advanced
#    Then I verify Alerts Push notification toggle in advanced
#    Then I tap on show less
#    Then I verify Batteries text in advanced
#    Then I verify Batteries toggle in advanced
#    Then I verify batteries show more text in advanced
#    Then I verify batteries show more navigation button in advanced
#    Then I click on batteries show more
#    Then I verify batteries show less text in advanced
#    Then I verify batteries show less navigation button in advanced
#    Then I scroll down the screen
#    Then I verify batteries Alerts text for advanced
#    Then I verify batteries Push notification text in advanced
#    Then I verify batteries Push notification toggle in advanced
#    Then I verify Temperature text in advanced
#    Then I verify Temperature toggle in advanced
#    Then I verify Temperature show more text in advanced
#    Then I verify Temperature show more navigation button in advanced
#    Then I click on Temperature show more
#    Then I scroll down the screen
#    Then I verify Temperature Alerts text for advanced
#    Then I verify Temperature Push notification text in advanced
#    Then I verify Temperature Push notification toggle in advanced


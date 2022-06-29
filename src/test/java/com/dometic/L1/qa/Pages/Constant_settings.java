package com.dometic.L1.qa.Pages;

public class Constant_settings {
    // --------------Accessibility_id-------------------//
    public static final String Settings_Back_Button_access_id="com.dometicapp:id/tiles-backImage";
    public static final String Settings_languageContainer_access_id="com.dometicapp:id/setting-languageContainer";
    public static final String Settings_versionContainer_access_id="com.dometicapp:id/setting-versionContainer";
    public static final String Settings_language_text_access_id="com.dometicapp:id/setting-languageText";
    public static final String Settings_language_text_expected="Sprachen";
    public static final String Settings_language_Spanish_text_expected="Idioma";
    public static final String Settings_temperature_Spanish_text_expected="Unidad de temperatura";
    public static final String Settings_version_Spanish_text_expected="Versión 1.3";
    public static final String Settings_logout_Spanish_text_expected="Cerrar sesión";
    public static final String Settings_language_French_text_expected="Langue";
    public static final String Settings_temperature_French_text_expected="Unité de température";
    public static final String Settings_version_French_text_expected="Version 1.3";
    public static final String Settings_logout_French_text_expected="CDéconnexion";
    public static final String Settings_language_selectedName_access_id="com.dometicapp:id/setting-selectedLanguage";
    public static final String Settings_languages_navigation_button_access_id="com.dometicapp:id/setting-languageiconCollapse";
    public static final String Settings_Language_English_tick_access_id="com.dometicapp:id/language-iconTickEnglish";
    public static final String Settings_language_German_access_id="com.dometicapp:id/language-germanText";
    public static final String Settings_Language_German_tick_access_id="com.dometicapp:id/language-iconTickGerman";
    public static final String Settings_Temperature_text_access_id="com.dometicapp:id/setting-temperatureContainer";
    public static final String Settings_Temperature_text_expected="Temperatureinheit";
    public static final String Settings_version_text_access_id="com.dometicapp:id/setting-versionText";
    public static final String Settings_logout_text_access_id="com.dometicapp:id/setting-logOutText";
    public static final String Settings_logout_expected="Abmelden";
    public static final String Settings_fahrenheit_access_id="com.dometicapp:id/setting-fahrenheitText";
    public static final String Settings_language_Spanish_access_id="";
    public static final String Settings_Temperature_unit_access_id="com.dometicapp:id/setting-temperatureButtons";
    public static final String Settings_Logout_access_id="";

    public static final String Settings_Device_Management_access_id = "com.dometicapp:id/sidemenu-deviceMangagement-button";
    public static final String Settings_Device_Management_onboarded_device_access_id = "com.dometicapp:id/DeviceManagementScreen-DeviceManagementButton-Container";
    public static final String Settings_Device_Management_onboarded_device_back_button_access_id = "com.dometicapp:id/DeviceManagementScreen-leftButtonImage";
    public static final String Device_Management_header = "//android.widget.TextView[contains(@text,'DEVICE MANAGEMENT') or @content-desc='com.dometicapp:id/DeviceManagementDetailsScreen-header-header-centerTitleText']";
    public static final String Device_Management_back_button_access_id = "com.dometicapp:id/DeviceManagementDetailsScreen-header-header-leftButton";
    public static final String Device_Management_image_access_id = "com.dometicapp:id/deviceManagement-deviceImage";
    public static final String Device_Management_Device_name_under_image_access_id ="com.dometicapp:id/deviceManagement-deviceName";
    public static final String Device_Management_Vessel_info_text = "//android.widget.TextView[contains(@text,'VESSEL INFORMATION') or @content-desc='com.dometicapp:id/DeviceManagementDetailsScreen-ProductInformationLabel']";
    public static final String Device_Management_Name_text = "//android.widget.TextView[contains(@text,'Name') or @content-desc='com.dometicapp:id/DeviceManagementDetailsScreen-NameLabel-Label']";
    public static final String Device_Management_Device_Name_access_id = "com.dometicapp:id/DeviceManagementDetailsScreen-NameLabel-Title";
    public static final String Device_Management_MAC_Address_text_access_id = "com.dometicapp:id/deviceManagement-hullIdLabel";
    public static final String Device_Management_MAC_Address_access_id = "com.dometicapp:id/deviceManagement-hullIdValue";
    public static final String Device_Management_Edit_vessel_text_Xpath = "//android.widget.TextView[contains(@text,'Edit') or @content-desc='com.dometicapp:id/DeviceManagementDetailsScreen-EditProductInfo-Title']";
    public static final String Device_Management_Edit_vessel_navigation_button_access_id = "com.dometicapp:id/deviceManagement-editVessel-cardIcon";
    public static final String Device_Management_Edit_vessel_navigation_button_Xpath = "//android.view.ViewGroup[@content-desc='com.dometicapp:id/DeviceManagementDetailsScreen-EditProductInfo-Container']/android.view.ViewGroup";
    public static final String Device_Management_Advanced_text = "//android.widget.TextView[contains(@text,'ADVANCED') or @content-desc='com.dometicapp:id/DeviceManagementDetailsScreen-AdvancedLabel']";

    public static final String Device_Management_Advanced_text_Xpath = " //android.view.ViewGroup[@content-desc='com.dometicapp:id/DeviceManagementDetailsScreen-EditProductInfo-Container']/android.view.ViewGroup";
    public static final String Device_Management_Check_updates_text_Xpath = "(//android.widget.TextView[contains(@text,'Check updates') or @content-desc='com.dometicapp:id/DeviceManagementDetailsScreen-CheckUpdatesButton-Title'])[1]";
    public static final String Device_Management_Check_updates_navigation_button_access_id = "com.dometicapp:id/deviceManagement-checkForUpdates-cardIcon";
    public static final String Device_Management_Check_updates_navigation_button_Xpath="(//android.view.ViewGroup[@content-desc='com.dometicapp:id/DeviceManagementDetailsScreen-CheckUpdatesButton-Container'])[1]/android.view.ViewGroup[2]";
    public static final String Device_Management_Unreg_Del_Off_text_Xpath = "(//android.widget.TextView[contains(@text,'Unregister/Delete/Offboard') or @content-desc='com.dometicapp:id/DeviceManagementDetailsScreen-CheckUpdatesButton-Title'])[2]";
    public static final String Device_Management_Unreg_Del_Off_navigation_button_access_id = "com.dometicapp:id/deviceManagement-unregisterDelete-cardIcon";
    public static final String Device_Management_Unreg_Del_Off_navigation_button_xpath ="(//android.view.ViewGroup[@content-desc='com.dometicapp:id/DeviceManagementDetailsScreen-CheckUpdatesButton-Container'])[2]/android.view.ViewGroup[2]";
    public static final String Edit_vessel_header_access_id = "com.dometicapp:id/header-TitleText";
    public static final String Edit_vessel_header_Xpath="//android.widget.TextView[contains(@text,'EDIT VESSEL') or @content-desc='com.dometicapp:id/header-TitleText']";
    public static final String Edit_vessel_image_access_id = "com.dometicapp:id/deviceManagement-deviceImage";
    public static final String Edit_vessel_Name_text_access_id = "com.dometicapp:id/editVessel-vesselNameLabel";
    public static final String Edit_vessel_Name_text_Xpath = "//android.widget.TextView[contains(@text,'Name') or @content-desc='com.dometicapp:id/editVessel-vesselNameLabel']";
    public static final String Edit_vessel_Name_access_id = "com.dometicapp:id/editVessel-vesselNameValue";
    public static final String Edit_vessel_MAC_address_text_access_id = "com.dometicapp:id/editVessel-hullIdLabel";
    public static final String Edit_vessel_MAC_address_text_Xpath = "//android.widget.TextView[contains(@text,'Mac Address') or @content-desc='com.dometicapp:id/editVessel-hullIdLabel']";
    public static final String Edit_vessel_MAC_address_access_id = "com.dometicapp:id/editVessel-hullIdValue";
    public static final String Edit_vessel_Save_button_access_id = "com.dometicapp:id/editVessel-saveButton";
    public static final String Home_screen_device_name_access_id = "com.dometicapp:id/Dashboard-cardText";
    public static final String Onboarded_device_name_access_id = "com.dometicapp:id/DeviceManagementScreen-DeviceManagementButton-Title";


    public static final String Hamburger_header_menu_button_access_id = "com.dometicapp:id/header-menuButton";
    public static final String View_EditAccount_Button_text_access_id = "com.dometicapp:id/sidemenu-viewEditButtonText";
    public static final String AccountSettings_text_expected = "ACCOUNT SETTINGS";
    public static final String AccountSettings_title_text_access_id = "com.dometicapp:id/header-TitleText";
    public static final String AccountSettings_title_text_Xpath = "//android.widget.TextView[contains(@text,'ACCOUNT SETTINGS') or @content-desc='com.dometicapp:id/header-TitleText']";
    public static final String AccountSettings_back_button_access_id = "com.dometicapp:id/tiles-backImage";
    public static final String AccountSettings_back_button_Xpath ="//android.widget.Button[@content-desc=' , back']/android.view.ViewGroup";
    public static final String AccountSettings_Profile_photo_access_id = "com.dometicapp:id/userSettings-profilePhoto";
    public static final String AccountSettings_UserName_text_expected = "Dom";
    public static final String AccountSettings_UserName_text_access_id = "com.dometicapp:id/userSettings-userName";
    public final static String AccountSettings_User_Email_text_expected = "l1test@yopmail.com";
    public final static String AccountSettings_User_Email_access_id = "com.dometicapp:id/userSettings-userEmail";
    public static final String AccountSettings_Settings_text_expected = "SETTINGS";
    public static final String AccountSettings_Settings_text_access_id = "com.dometicapp:id/userSettings-settingText";
    public static final String AccountSettings_Settings_text_Xpath = "//android.widget.TextView[contains(@text,'SETTINGS') or @content-desc='com.dometicapp:id/userSettings-settingText']";
    public static final String AccountSettings_Profile_text_expected = "Profile";
    public static final String AccountSettings_Profile_title_access_id = "com.dometicapp:id/userSettings-profile-cardTitle";
    public static final String AccountSettings_Profile_title_Xpath = "//android.widget.TextView[contains(@text,'Profile') or @content-desc='com.dometicapp:id/userSettings-profile-cardTitle']";
    public static final String AccountSettings_Profile_card_icon_access_id = "com.dometicapp:id/userSettings-profile-cardIcon";
    public static final String AccountSettings_Subscriptions_text_expected = "Subscriptions";
    public static final String AccountSettings_Subscriptions_title_text_access_id = "com.dometicapp:id/userSettings-subscriptions-cardTitle";
    public static final String AccountSettings_Subscriptions_title_text_Xpath = " //android.widget.TextView[contains(@text,'Subscriptions') or @content-desc='com.dometicapp:id/userSettings-subscriptions-cardTitle']";
    public static final String AccountSettings_Subscriptions_card_icon_access_id = "com.dometicapp:id/userSettings-subscriptions-cardIcon";



    public static final String Header_menu_button_access_id = "com.dometicapp:id/header-menuButton";
    public static final String view_EditAccount_Button_access_id = "com.dometicapp:id/sidemenu-viewEditButtonText";
    public static final String AccountSettings_Profile_Card_icon_access_id = "com.dometicapp:id/userSettings-profile-cardIcon";
    public static final String Profile_text_expected = "PROFILE";
    public static final String Profile_title_text_access_id = "com.dometicapp:id/header-TitleText";
    public static final String Profile_title_text_Xpath = "//android.widget.TextView[contains(@text,'PROFILE') or @content-desc='com.dometicapp:id/header-TitleText']";
    public static final String Profile_Back_button_image_access_id = "com.dometicapp:id/tiles-backImage";
    public static final String Profile_Back_button_image_Xpath = "//android.widget.Button[@content-desc=' , back']/android.view.ViewGroup";
    public static final String Profile_Profile_photo_access_id = "com.dometicapp:id/userProfile-photo";
    public static final String Profile_Personal_information_text_expected = "PERSONAL INFORMATION";
    public static final String Profile_Personal_information_text_access_id = "com.dometicapp:id/userProfile-personalInfoText";
    public static final String Profile_Personal_information_text_Xpath = "//android.widget.TextView[contains(@text,'PERSONAL INFORMATION') or @content-desc='com.dometicapp:id/userProfile-personalInfoText']";
    public static final String Profile_Name_text_expected = "Name";
    public static final String Profile_Name_Label_access_id = "com.dometicapp:id/userProfile-nameLabel";
    public static final String Profile_Name_Label_Xpath = "//android.widget.TextView[contains(@text,'Name') or @content-desc='com.dometicapp:id/userProfile-nameLabel']";
    public static final String Profile_Name_value_expected = "Dom Test";
    public static final String Profile_Name_value_access_id = "com.dometicapp:id/userProfile-nameValue";
    public static final String Profile_Email_text_expected = "E-mail";
    public static final String Profile_Email_Label_access_id = "com.dometicapp:id/userProfile-emailLabel";
    public static final String Profile_Email_Label_Xpath = "//android.widget.TextView[contains(@text,'E-mail') or @content-desc='com.dometicapp:id/userProfile-emailLabel']";
    public static final String Profile_Email_value_expected = "l1test@yopmail.com";
    public static final String Profile_Email_value_access_id = "com.dometicapp:id/userProfile-emailValue";
    public static final String Profile_Mobile_text_expected = "Mobile";
    public static final String Profile_Mobile_Label_access_id = "com.dometicapp:id/userProfile-phoneLabel";
    public static final String Profile_Mobile_Label_Xpath= "//android.widget.TextView[contains(@text,'Mobile') or @content-desc='com.dometicapp:id/userProfile-phoneLabel']";
    public static final String Profile_Mobile_value_expected = "+9180562227779";
    public static final String Profile_Mobile_value_access_id = "com.dometicapp:id/userProfile-phoneLabel";
    public static final String Profile_Address_text_expected = "Address";
    public static final String Profile_Address_label_access_id = "com.dometicapp:id/userProfile-addressLabel";
    public static final String Profile_Address_label_Xpath = " //android.widget.TextView[contains(@text,'Address') or @content-desc='com.dometicapp:id/userProfile-addressLabel']";
    public static final String Profile_EditProfile_text_expected = "Edit Profile";
    public static final String Profile_EditProfile_text_access_id = "com.dometicapp:id/userProfile-EditProfileButton-cardTitle";
    public static final String Profile_EditProfile_text_Xpath = "//android.widget.TextView[contains(@text,'Edit Profile') or @content-desc='com.dometicapp:id/userProfile-EditProfileButton-cardTitle']";
    public static final String Profile_EditProfile_Button_CardIcon_access_id = "com.dometicapp:id/userProfile-EditProfileButton-cardIcon";
    public static final String Profile_Security_text_expected = "SECURITY";
    public static final String Profile_Security_text_access_id = "com.dometicapp:id/userProfile-securityText";
    public static final String Profile_Security_text_Xpath = "//android.widget.TextView[contains(@text,'SECURITY') or @content-desc='com.dometicapp:id/userProfile-securityText']";
    public static final String Profile_Password_text_expected = "Password";
    public static final String Profile_Password_text_access_id = "com.dometicapp:id/userProfile-resetPasswordText";
    public static final String Profile_Password_text_Xpath = "//android.widget.TextView[contains(@text,'Password') or @content-desc='com.dometicapp:id/userProfile-resetPasswordText']";
    public static final String Profile_Password_Value_access_id = "com.dometicapp:id/userProfile-resetPasswordValue";
    public static final String Profile_Renew_text_expected = "Renew";
    public static final String Profile_Renew_CardTitle_access_id = "com.dometicapp:id/userProfile-renew-cardTitle";
    public static final String Profile_Renew_CardTitle_Xpath = "//android.widget.TextView[contains(@text,'Renew') or @content-desc='com.dometicapp:id/userProfile-renew-cardTitle']";
    public static final String Profile_Renew_CardIcon_access_id = "com.dometicapp:id/userProfile-renew-cardIcon";




    public static final String Profile_Edit_Profile_button_card_icon_access_id = "com.dometicapp:id/userProfile-EditProfileButton-cardIcon";
    public static final String Edit_Profile_text_expected = "EDIT PROFILE";
    public static final String Edit_Profile_title_text_access_id = "com.dometicapp:id/header-TitleText";
    public static final String Edit_Profile_title_text_Xpath = "//android.widget.TextView[contains(@text,'EDIT PROFILE') or @content-desc='com.dometicapp:id/editProfile-header-header-centerTitleText']";
    public static final String Edit_Profile_Cancel_button_image_access_id = "com.dometicapp:id/header-leftButtonImage";
    public static final String Edit_Profile_Photo_access_id = "com.dometicapp:id/editProfile-photo";
    public static final String Edit_Profile_Email_value_expected = "l1test@yopmail.com";
    public static final String Edit_Profile_Email_value_access_id = "com.dometicapp:id/editProfile-emailValue";
    public static final String Edit_Profile_FirstName_text_expected = "First name";
    public static final String Edit_Profile_FirstName_Label_access_id = "com.dometicapp:id/editProfile-firstNameLabel";
    public static final String Edit_Profile_FirstName_Label_Xpath = "//android.widget.TextView[contains(@text,'First name') or @content-desc='com.dometicapp:id/editProfile-firstNameLabel']";
    public static final String Edit_Profile_FirstName_value_expected = "Dom";
    public static final String Edit_Profile_FirstName_value_access_id = "com.dometicapp:id/editProfile-firstNNameValue";
    public static final String Edit_Profile_LastName_text_expected = "Last name";
    public static final String Edit_Profile_LastName_Label_access_id = "com.dometicapp:id/editProfile-lastameLabel";
    public static final String Edit_Profile_LastName_Label_Xpath = "//android.widget.TextView[contains(@text,'Last name') or @content-desc='com.dometicapp:id/editProfile-lastameLabel']";
    public static final String Edit_Profile_LastName_value_expected = "Test";
    public static final String Edit_Profile_LastName_value_access_id = "com.dometicapp:id/editProfile-lastNameValue";
    public static final String Edit_Profile_Primary_mobile_text_expected = "Primary mobile";
    public static final String Edit_Profile_Primary_mobile_Label_access_id = "com.dometicapp:id/editProfile-phoneLabel";
    public static final String Edit_Profile_Primary_mobile_Label_Xpath = "//android.widget.TextView[contains(@text,'Primary mobile') or @content-desc='com.dometicapp:id/editProfile-phoneLabel']";
    public static final String Edit_Profile_Primary_mobile_value_access_id = "com.dometicapp:id/editProfile-phoneValue";
    public static final String Edit_Profile_Address_text_expected = "Address";
    public static final String Edit_Profile_Address_Label_access_id = "com.dometicapp:id/editProfile-addressLabel";
    public static final String Edit_Profile_Address_Label_Xpath = "//android.widget.TextView[contains(@text,'Address') or @content-desc='com.dometicapp:id/editProfile-addressLabel']";
    public static final String Edit_Profile_Address_value_expected = "Enter Address";
    public static final String Edit_Profile_Address_value_access_id = "com.dometicapp:id/editProfile-addressValue";
    public static final String Edit_Profile_Save_button_text_expected = "Save";
    public static final String Edit_Profile_Save_button_text_access_id = "com.dometicapp:id/editProfile-saveButtonText";
    public static final String Edit_Profile_Save_button_text_Xpath = "//android.widget.TextView[contains(@text,'Save') or @content-desc='com.dometicapp:id/editProfile-saveButtonText']";

    public static final String Subscriptions_text_expected = "SUBSCRIPTIONS";
    public static final String Subscriptions_title_text_access_id = "com.dometicapp:id/header-TitleText";
    public static final String Subscriptions_title_text_Xpath = "//android.widget.TextView[contains(@text,'SUBSCRIPTIONS') or @content-desc='com.dometicapp:id/header-TitleText']";
    public static final String Subscriptions_back_button_Xpath = "//android.widget.Button[@content-desc=' , back']/android.view.ViewGroup";
    //public static final String Subscriptions_back_button_xpath = "//*[@text='back']";




    public static final String header_menu_button_access_id = "com.dometicapp:id/header-menuButton";
    public static final String NotificationSettings_text_access_id = "com.dometicapp:id/sidemenu-notificationSettings-text";
    public static final String ManageNotification_ManageNotification_text_expected="MANAGE NOTIFICATIONS";
    public static final String ManageNotifications_title_access_id = "com.dometicapp:id/header-TitleText";
    public static final String ManageNotifications_title_Xpath = "//android.widget.TextView[contains(@text,'MANAGE NOTIFICATIONS') or @content-desc='com.dometicapp:id/NotificationScreen-header-centerTitleText']";
    public static final String ManageNotifications_back_button_access_id = "com.dometicapp:id/tiles-backImage";
    public static final String ManageNotifications_logo_access_id = "com.dometicapp:id/notification-header-logo";
    public static final String ManageNotifications_Global_settings_text_expected = "Global settings";
    public static final String ManageNotifications_Global_settings_access_id = "com.dometicapp:id/notification-header-text";
    public static final String ManageNotifications_Global_settings_xpath = "//*[@text='Global settings']";
    public static final String ManageNotifications_PushNotifications_text_xpath="//*[@text='Push notifications']";
    public static final String ManageNotifications_Push_Notifications_text_expected = "Push notifications";
    public static final String ManageNotifications_PushNotifications_text_access_id = "com.dometicapp:id/notification-pushNotificationContainer-cardTitle";
    public static final String ManageNotifications_Push_Notifications_Container_access_id = "com.dometicapp:id/notification-pushNotificationContainer-container";
    public static final String ManageNotifications_PushNotifications_toggle_access_id = "com.dometicapp:id/notification-pushNotificationContainer-switchComponent";
    public static final String ManageNotifications_push_show_more_text_access_id = "com.dometicapp:id/notification-pushNotificationShowMore-cardTitle";
    public static final String ManageNotifications_push_show_more_text_navigation_access_id = "com.dometicapp:id/notification-pushNotificationShowMore-expandIcon";
    public static final String ManageNotifications_push_show_less_text_access_id = "com.dometicapp:id/notification-pushNotificationShowMore-cardTitle";
    public static final String ManageNotifications_push_show_less_navigation_access_id = "com.dometicapp:id/notification-pushNotificationShowMore-expandIcon";
    public static final String ManageNotifications_push_alerts_text_access_id = "com.dometicapp:id/notification-pushNotificationAlertText";
    public static final String ManageNotifications_push_alerts_info_access_id = "com.dometicapp:id/notification-pushNotificationAlert-TooltipComponent";
    public static final String ManageNotifications_push_alerts_toggle_access_id = "com.dometicapp:id/notification-pushNotificationAlertSwitch";
    public static final String ManageNotifications_push_warnings_text_access_id = "com.dometicapp:id/notification-pushNotificationWarningText";
    public static final String ManageNotifications_push_warnings_info_access_id = "com.dometicapp:id/notification-pushNotificationWarning-TooltipComponent";
    public static final String ManageNotifications_push_warnings_toggle_access_id = "com.dometicapp:id/notification-pushNotificationWarningSwitch";
    public static final String ManageNotifications_Email_text_expected = "E-mail";
    public static final String ManageNotifications_Email_text_access_id = "com.dometicapp:id/notification-emailContainer-cardTitle";
    public static final String ManageNotifications_Email_toggle_access_id = "com.dometicapp:id/notification-emailNotification-switchComponent";
    public static final String ManageNotifications_Email_showmore_text_access_id = "com.dometicapp:id/notification-emailShowMore-cardTitle";
    public static final String ManageNotifications_Email_showmore_dropdown_access_id = "com.dometicapp:id/notification-emailShowMore-expandIcon";
    public static final String ManageNotifications_EmailList_Email_text_access_id = "com.dometicapp:id/notification-emailList-listTitle";
    public static final String ManageNotifications_EmailList_below_Email_text_access_id = "com.dometicapp:id/notification-emailListElement0-Text";
    public static final String ManageNotifications_EmailList_Email_field_text_access_id = "com.dometicapp:id/notification-emailListElement0-Subtext";
    public static final String ManageNotifications_Editlist_Email_toggle_access_id = "com.dometicapp:id/notification-emailListElement0-Switch";
    public static final String ManageNotifications_Editlist_text_access_id = "com.dometicapp:id/notification-emailList-subTitle";
    public static final String ManageNotifications_Editlist_navigation_access_id = "com.dometicapp:id/notification-emailList-expandIcon";
    public static final String ManageNotifications_EmailList_Alerts_text_access_id ="com.dometicapp:id/notification-emailNotificationAlertText";
    public static final String ManageNotifications_EmailList_Alerts_info_button_access_id = "com.dometicapp:id/notification-emailNotificationAlert-TooltipComponent";
    public static final String ManageNotifications_Emaillist_alerts_toggle_button_access_id = "com.dometicapp:id/notification-emailNotificationAlertSwitch";
    public static final String ManageNotifications_Emaillist_warnings_text_access_id = "com.dometicapp:id/notification-emailNotificationWarningContainerText";
    public static final String ManageNotifications_Emaillist_warnings_info_button_access_id = "com.dometicapp:id/notification-emailNotificationWarningContainerContainer";
    public static final String ManageNotifications_Emaillist_warnings_toggle_button_access_id = "com.dometicapp:id/notification-emailNotificationWarningContainerSwitch";
    public static final String ManageNotifications_sms_text_expected = "SMS";
    public static final String ManageNotifications_sms_text_access_id = "com.dometicapp:id/notification-smsContainer-cardTitle";
    public static final String ManageNotifications_sms_field_Container_access_id = "com.dometicapp:id/notification-smsNotification-container";
    public static final String ManageNotifications_sms_tooltipcomponent_access_id = "com.dometicapp:id/notification-smsNotification-tooltipComponent";
    public static final String ManageNotifications_sms_toggle_switch_access_id = "com.dometicapp:id/notification-smsNotification-switchComponent";
    public static final String ManageNotifications_Advanced_text_expected = "ADVANCED";
    public static final String ManageNotifications_Advanced_text_access_id = "com.dometicapp:id/notification-advanceText";
    public static final String ManageNotifications_Advanced_Caravan_logo_access_id = "AdvancedNotificationSetings-GW_20e97c-icon";
    public static final String ManageNotifications_Advanced_Caravan_text_expected = "Lmc";
    public static final String ManageNotifications_Advanced_Caravan_name_access_id = "com.dometicapp:id/notification-AdvancedNotificationSetings-GW_20e97c-name";
    public static final String ManageNotifications_Advanced_Caravan_field_container_access_id = "com.dometicapp:id/notification-AdvancedNotificationSetings-GW_20e97c-container";
    public static final String ManageNotifications_Advanced_Collapse_icon_access_id = "com.dometicapp:id/notification-AdvancedNotificationSetings-GW_20e97c-iconCollapse";


    public static final String Settings_add_new_button_accessid="com.dometicapp:id/DeviceManagementScreen-BotomScreenButton";
    public static final String Settings_Onboarding_screen_header="//android.widget.TextView[contains(@text,'ONBOARDING') or @content-desc='com.dometicapp:id/header-TitleText']";
    public static final String Settings_Onboarding_screen_header_text="ONBOARDING";
    public static final String Settings_Onboarding_close_button_accessid="com.dometicapp:id/onBoarding-closeImage";
    public static final String Settings_Onboarding_No_device_found_text_Xpath="//android.widget.TextView[contains(@text,'No device found') or @content-desc='com.dometicapp:id/onBoarding-noDeviceTitle']";
    public static final String Settings_Onboarding_No_device_found_text="No device found";
    public static final String Settings_Onboarding_attention_image_accessid="com.dometicapp:id/onBoarding-attentionImage";
    public static final String Settings_Onboarding_search_again_button_accessid=           "com.dometicapp:id/onBoarding-searchAgainButton";

    //-------------------Needed Accessibility Id-----------------//
    public static final String Settings_Language_Page_title_access_id="";
    public static final String Settings_language_Back_button_access_id="";
    public static final String Settings_Language_English_access_id="";
    public static final String Settings_back_button_access_id="";
    public static final String Settings_page_title_access_id="";
    public static final String Settings_temperature_unit_C_access_id="";
    public static final String Settings_temperature_unit_F_access_id="com.dometicapp:id/setting-logOutContainer";

    // ----------------------xpath-----------------------------//
    public static final String Settings_text_xpath="(//*[@content-desc='com.dometicapp:id/setting-selectedLanguage'])[1]";
    public static final String Settings_Language_select_xpath="(//*[@content-desc='com.dometicapp:id/setting-languageContainer'])[1]";
    public static final String Settings_Temperature_unit_xpath="(//*[@class='android.view.ViewGroup'])[17]";
    public static final String Settings_Upgrade_Firmware_xpath="(//*[@content-desc='com.dometicapp:id/setting-languageContainer'])[2]";
    public static final String Settings_Version_xpath="//*[@content-desc='com.dometicapp:id/setting-versionContainer']";
    public static final String Settings_Logout_xpath="//*[@content-desc='com.dometicapp:id/setting-logOutContainer']";
    public static final String Settings_Language_Page_title_xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView";
    public static final String Settings_language_Back_button_xpath="//android.widget.Button[@content-desc=\" , back\"]/android.view.ViewGroup/android.widget.ImageView";
    public static final String Settings_Language_English_xpath="//android.widget.TextView[@content-desc=\"com.dometicapp:id/language-englishContainer\"]";
    public static final String Settings_back_button_xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]";
    public static final String Settings_page_title_xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView";
    public static final String Settings_temperature_unit_C_xpath="//android.view.ViewGroup[@content-desc=\"com.dometicapp:id/setting-temperatureButtons\"]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView";
    public static final String Settings_temperature_unit_F_xpath="//android.view.ViewGroup[@content-desc=\"com.dometicapp:id/setting-temperatureButtons\"]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView\n";
    public static final String Settings_language_Spanish_xpath="//*[@text='Spanish (US)']";
    public static final String Settings_language_French_xpath="//*[@text='French']";
    public static final String Settings_language_xpath="(//*[@content-desc='com.dometicapp:id/setting-languageText'])[1]";

    public static final String Edit_vessel_close_button_xpath ="//android.view.ViewGroup[@content-desc='com.dometicapp:id/header-rightButton']/android.widget.TextView";
    public static final String Settings_ok_button_xpath="//*[@text='OK']";

    // ----------------------Data-----------------------------//
    public static final String Device_management_text = "DEVICE MANAGEMENT";
    public static final String Vessel_info_text = "VESSEL INFORMATION";
    public static final String Name_text = "Name";
    public static final String MAC_Address_text = "MAC Address";
    public static final String Edit_vessel_text = "Edit vessel";
    public static final String Advanced_text = "ADVANCED";
    public static final String Check_updates_text = "Check updates";
    public static final String Unreg_Del_Off_text = "Unregister/Delete/Offboard";
    public static final String Edit_vessel_header = "EDIT VESSEL";
    public static final String Edit_vessel_Mac_address = "Mac Address";
    public static final String New_device_name = "LMC ERIBA";
    public static final String Settings_sms = "SMS";
    public static final String ManageNotifications_sms_accessid = "com.dometicapp:id/notification-smsNotification-cardTitle";
    public static final String Settings_email = "E-mail";
    public static final String Notification_email_access_id  = "com.dometicapp:id/notification-emailNotification-cardTitle";

}


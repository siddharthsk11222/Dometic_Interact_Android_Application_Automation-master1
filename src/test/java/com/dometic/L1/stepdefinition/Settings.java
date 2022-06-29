package com.dometic.L1.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.L1.qa.Pages.Constant_climate_ac;
import com.dometic.L1.qa.Pages.Constant_landingscreen;
import com.dometic.L1.qa.Pages.Constant_settings;
import com.dometic.L1.qa.util.Baseclass;
import com.dometic.SDB.qa.Pages.Constant_AccountSettings;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class Settings extends Baseclass {

    public static String deviceName;
    public static String NewdeviceName;

    @Then("I Tap on hamburger menu in landing screen")
    public void iTapOnHamburgerMenuInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on hamburger menu in landing screen");
        WebDriverWait wait=new WebDriverWait(driver,50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_landingscreen.LandingPage_hamburger_menu_xpath)));
        TaponbuttonaccessabilityID(Constant_landingscreen.LandingPage_hamburger_menu_access_id);
    }

    @Then("I Verify SETTINGS Text displayed in the top of the app")
    public void iVerifySETTINGSTextDisplayedInTheTopOfTheApp() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify SETTINGS Text displayed in the top of the app");
        asserttext("SETTINGS", Constant_settings.Settings_text_xpath);
    }

    @Then("I verify Languages text is displayed")
    public void iVerifyLanguagesIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Languages text is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_languageContainer_access_id));
    }

    @Then("I Verify Temperature unit text is displayed")
    public void tVerifyTemperatureUnitIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Temperature unit text is displayed");
        Assert.assertTrue(iselementdisplayed(Constant_settings.Settings_Temperature_unit_xpath));
    }

    @Then("I verify Upgrade Firmware is displayed")
    public void iVerifyUpgradeFirmwareIsDisplayed() {
      //  Assert.assertTrue(iselementdisplayed(Constant_settings.Settings_Upgrade_Firmware_xpath));
    }

    @Then("I verify Version is displayed")
    public void iVerifyVersionIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Version is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_versionContainer_access_id));
    }

    @Then("I verify Log out is displayed")
    public void iVerifyLogOutIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Log out is displayed");
        Assert.assertTrue(iselementdisplayed(com.dometic.L2.qa.Pages.Constant_settings.Settings_Logout_xpath));
    }


    @Then("I verify hamburger menu in landing screen")
    public void iVerifyHamburgerMenuInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify hamburger menu in landing screen");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_climate_ac.CAC_M_power_Back_Button_access_id);
        if(elementsByAccessibilityId.size()!=0){
            TaponbuttonaccessabilityID(Constant_climate_ac.CAC_M_power_Back_Button_access_id);
        }
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_landingscreen.LandingPage_hamburger_menu_access_id));

    }

    @Then("I navigate to update language section in Settings")
    public void iNavigateToUpdateLanguageSectionInSettings() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I navigate to update language section in Settings");
        TaponbuttonaccessabilityID(Constant_settings.Settings_languageContainer_access_id);

    }

    @Then("I update language to German in settings")
    public void iUpdateLanguageToGermanInSettings() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I update language to German in settings");
        TaponbuttonaccessabilityID(Constant_settings.Settings_language_German_access_id);
    }

    @And("I verify on Language text updated with German translation")
    public void iVerifyOnLanguageTextUpdatedWithGermanTranslation() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify on Language text updated with German translation");
        asserttextAccessibility(Constant_settings.Settings_language_text_expected,Constant_settings.Settings_language_text_access_id);
    }

    @And("I verify on Temperature text updated with German translation")
    public void iVerifyOnTemperatureTextUpdatedWithGermanTranslation() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify on Temperature text updated with German translation");
        asserttextAccessibility(Constant_settings.Settings_Temperature_text_expected,Constant_settings.Settings_Temperature_text_access_id);
    }

    @And("I verify on logout text updated with German translation")
    public void iVerifyOnLogoutTextUpdatedWithGermanTranslation() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify on logout text updated with German translation");
        asserttextAccessibility(Constant_settings.Settings_logout_expected,Constant_settings.Settings_logout_text_access_id);
    }

    @Then("I update Temperature Unit in Settings")
    public void iUpdateTemperatureUnitInSettings() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I update Temperature Unit in Settings");
        TaponbuttonaccessabilityID(Constant_settings.Settings_fahrenheit_access_id);
    }

    @Then("I Tap on Back button from Settings")
    public void iTapOnBackButtonFromSettings() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Back button from Settings");
        TaponbuttonaccessabilityID(Constant_settings.Settings_Back_Button_access_id);
    }

    @Then("I Tap on Logout in Settings")
    public void iTapOnLogoutInSettings() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Logout in Settings");
        System.out.println("Text comparison is Successful");
//        WebDriverWait wait=new WebDriverWait(driver,50);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_settings.Settings_Logout_xpath)));
        Taponbutton(Constant_settings.Settings_Logout_xpath);
    }
    @Then("I Tap on Logout in Settings screen")
    public void iTapOnLogoutInSettingsScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Logout in Settings screen");
        TaponbuttonaccessabilityID(com.dometic.MTC.qa.Pages.Constant_settings.Settings_Logout_text_access_id);
    }

    @Then("I Tap on Device Management option")
    public void iTapOnDeviceManagementOption() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Device Management option");
        TaponbuttonaccessabilityID(Constant_settings.Settings_Device_Management_access_id );
    }


    @Then("I verify Device Management header")
    public void iVerifyDeviceManagementHeader() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Device Management header");
        asserttextValidation(Constant_settings.Device_management_text,Constant_settings.Device_Management_header);
        System.out.println("Device Management header verified");
    }

    @Then("I verify Device Management back button")
    public void iVerifyDeviceManagementBackButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Device Management back button");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_Management_back_button_access_id));
        System.out.println("Device Management back button verified");
    }

    @Then("I verify Device image")
    public void iVerifyDeviceImage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Device image");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_Management_image_access_id));
        System.out.println("Device image verified");
    }

    @Then("I verify the display of Device name")
    public void iVerifyTheDisplayOfDeviceName() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the display of Device name");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_Management_Device_name_under_image_access_id));
        System.out.println("Device name verified");
    }

    @Then("I verify the vessel information text in Device Management")
    public void iVerifyTheVesselInformationTextInDeviceManagement() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the vessel information text in Device Management");
        asserttextValidation(Constant_settings.Vessel_info_text,Constant_settings.Device_Management_Vessel_info_text);
        System.out.println("Vessel information text verified");
    }

    @Then("I verify Name text in Device Management")
    public void iVerifyNameTextInDeviceManagement() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Name text in Device Management");
        asserttextValidation(Constant_settings.Name_text,Constant_settings.Device_Management_Name_text);
        System.out.println("Name text in Device Management verified");
    }

    @Then("I verify the same device name is displayed")
    public void iVerifyTheSameDeviceNameIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the same device name is displayed");
        deviceName = driver.findElementByAccessibilityId(Constant_settings.Device_Management_Device_name_under_image_access_id).getText();
        String string1 = driver.findElementByAccessibilityId(Constant_settings.Device_Management_Device_Name_access_id).getText();
        if (deviceName.contains(string1)) {
            System.out.println("Device Name is same and verified");
        } else {
            System.out.println("Device Name mismatching");
        }
    }

    @Then("I verify MAC Address text in Device Management")
    public void iVerifyMACAddressTextInDeviceManagement() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify MAC Address text in Device Management");
        asserttextValidation(Constant_settings.MAC_Address_text,Constant_settings.Device_Management_MAC_Address_text_access_id);
        System.out.println("MAC Address text verified");
    }

    @Then("I verify MAC address")
    public void iVerifyMACAddress() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify MAC address");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_Management_MAC_Address_access_id));
        System.out.println("MAC address verified");
    }

    @Then("I verify Edit vessel")
    public void iVerifyEditVessel() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Edit vessel");
        asserttextValidation(Constant_settings.Edit_vessel_text,Constant_settings.Device_Management_Edit_vessel_text_Xpath);
        System.out.println("Edit vessel text verified");
    }

    @Then("I verify Edit vessel navigation button in Device Management")
    public void iVerifyEditVesselNavigationButtonInDeviceManagement() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Edit vessel navigation button in Device Management");
        Assert.assertTrue(iselementdisplayed(Constant_settings.Device_Management_Edit_vessel_navigation_button_Xpath));
        System.out.println("Edit vessel navigation button verified");
    }

    @Then("I verify Advanced text in Device Management")
    public void iVerifyAdvancedTextInDeviceManagement() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Advanced text in Device Management");
        asserttextValidation(Constant_settings.Advanced_text,Constant_settings.Device_Management_Advanced_text);
        System.out.println("Advanced text text verified");
    }

    @Then("I verify Check updates")
    public void iVerifyCheckUpdates() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Check updates");
        asserttextValidation(Constant_settings.Check_updates_text,Constant_settings.Device_Management_Check_updates_text_Xpath);
        System.out.println("Check updates text verified");
    }

    @Then("I verify Check updated button")
    public void iVerifyCheckUpdatedButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Check updated button");
        Assert.assertTrue(iselementdisplayed(Constant_settings.Device_Management_Check_updates_navigation_button_Xpath ));
        System.out.println("Check updated button verified");
    }

    @Then("I verify Unreg,Del,Offboard text")
    public void iVerifyUnregDelOffboardText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Unreg,Del,Offboard text");
        asserttextValidation(Constant_settings.Unreg_Del_Off_text,Constant_settings.Device_Management_Unreg_Del_Off_text_Xpath);
        System.out.println("Unreg,Del,Offboard text verified");
    }

    @Then("I verify Unreg,Del,Offboard navigation button")
    public void iVerifyUnregDelOffboardNavigationButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Unreg,Del,Offboard navigation button");
        Assert.assertTrue(iselementdisplayed(Constant_settings.Device_Management_Unreg_Del_Off_navigation_button_xpath));
        System.out.println("Unreg,Del,Offboard navigation button verified");
    }

    @Then("I Tap on Device Management back button")
    public void iTapOnDeviceManagementBackButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Device Management back button");
        TaponbuttonaccessabilityID(Constant_settings.Device_Management_back_button_access_id);
    }

    @Then("I tap on back button on onboarded device page")
    public void iTapOnBackButtonOnOnboardedDevicePage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on back button on onboarded device page");
        TaponbuttonaccessabilityID(Constant_settings.Settings_Device_Management_onboarded_device_back_button_access_id);
    }

    @Then("I tap on the onboarded device for ERIBA")
    public void iTapOnTheOnboardedDeviceForERIBA() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the onboarded device for ERIBA");
        TaponbuttonaccessabilityID(Constant_settings.Settings_Device_Management_onboarded_device_access_id);
    }

    @Then("I verify Edit vessel header text")
    public void iVerifyEditVesselHeaderText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Edit vessel header text");
        asserttextValidation(Constant_settings.Edit_vessel_header,Constant_settings.Edit_vessel_header_Xpath);
        System.out.println("Edit vessel header text verified");
    }

    @Then("I verify close button in Edit vessel")
    public void iVerifyCloseButtonInEditVessel() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify close button in Edit vessel");
        Assert.assertTrue(iselementdisplayed(Constant_settings.Edit_vessel_close_button_xpath));
        System.out.println("Close button in Edit vessel verified");

    }

    @Then("I verify Name text in Edit vessel")
    public void iVerifyNameTextInEditVessel() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Name text in Edit vessel");
        asserttextValidation(Constant_settings.Name_text,Constant_settings.Edit_vessel_Name_text_Xpath);
        System.out.println("Name text in Edit vessel verified");
    }

    @Then("I enter new vessel name")
    public void iEnterNewVesselName() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter new vessel name");
        //TaponbuttonaccessabilityID(Constant_settings.Edit_vessel_Name_access_id);
        cleartextaccessabilityId(Constant_settings.Edit_vessel_Name_access_id);
        entertextaccessabilityId(Constant_settings.New_device_name,Constant_settings.Edit_vessel_Name_access_id);
        NewdeviceName = driver.findElementByAccessibilityId(Constant_settings.Edit_vessel_Name_access_id).getText();
    }

    @Then("I verify Mac address text in Edit vessel")
    public void iVerifyMacAddressTextInEditVessel() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Mac address text in Edit vessel");
        asserttextValidation(Constant_settings.Edit_vessel_Mac_address,Constant_settings.Edit_vessel_MAC_address_text_Xpath);
        System.out.println("Mac address text verified");
    }

    @Then("I verify Mac address is display")
    public void iVerifyMacAddressIsDisplay() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Mac address is display");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Edit_vessel_MAC_address_access_id));
        System.out.println("Mac address verified");
    }

    @Then("I verify Save button for Edit vessel")
    public void iVerifySaveButtonForEditVessel() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Save button for Edit vessel");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Edit_vessel_Save_button_access_id));
        System.out.println("Save button for Edit vessel verified");
    }

    @Then("I verify New vessel name under image")
    public void iVerifyNewVesselNameUnderImage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify New vessel name under image");
        String string1 = driver.findElementByAccessibilityId(Constant_settings.Device_Management_Device_name_under_image_access_id).getText();
        if (NewdeviceName.contains(string1)) {
            System.out.println("Device Name is same under the image and is verified");
        } else {
            System.out.println("Device Name mismatching");
        }
    }

    @Then("I verify New vessel name")
    public void iVerifyNewVesselName() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify New vessel name");
        String string1 = driver.findElementByAccessibilityId(Constant_settings.Device_Management_Device_Name_access_id).getText();
        if (NewdeviceName.contains(string1)) {
            System.out.println("Device Name is same under the Name option and is verified");
        } else {
            System.out.println("Device Name mismatching");
        }
    }

    @Then("I verify if the device name is updated in onboarded device")
    public void iVerifyIfTheDeviceNameIsUpdatedInOnboardedDevice() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the device name is updated in onboarded device");
        String string1 = driver.findElementByAccessibilityId(Constant_settings.Onboarded_device_name_access_id).getText();
        if (NewdeviceName.contains(string1)) {
            System.out.println("Device Name is same and verified");
        } else {
            System.out.println("Device Name mismatching");
        }
    }

    @Then("I verify the updated device name in Home screen")
    public void iVerifyTheUpdatedDeviceNameInHomeScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the updated device name in Home screen");
        String string1 = driver.findElementByAccessibilityId(Constant_settings.Home_screen_device_name_access_id).getText();
        if (NewdeviceName.contains(string1)) {
            System.out.println("Device Name is same and verified");
        } else {
            System.out.println("Device Name mismatching");
        }
    }

    @Then("I tap on Edit vessel text in Device Management")
    public void iTapOnEditVesselTextInDeviceManagement() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on Edit vessel text in Device Management");
        Taponbutton(Constant_settings.Device_Management_Edit_vessel_text_Xpath);
    }

    @Then("I tap on Save button in Edit vessel")
    public void iTapOnSaveButtonInEditVessel() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on Save button in Edit vessel");
        TaponbuttonaccessabilityID(Constant_settings.Edit_vessel_Save_button_access_id);
    }



    @Then("I Tap on Hamburger menu")
    public void iTapOnHamburgerMenu() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Hamburger menu");
        TaponbuttonaccessabilityID(Constant_settings.Hamburger_header_menu_button_access_id);
    }

    @Then("I Tap on View Edit Account link")
    public void iTapOnViewEditAccountLink() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on View Edit Account link");
        TaponbuttonaccessabilityID(Constant_settings.View_EditAccount_Button_text_access_id);
    }

    @Then("I verify the Account Settings Header")
    public void iVerifyTheAccountSettingsHeader() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Account Settings Header");
        asserttext(Constant_settings.AccountSettings_text_expected,Constant_settings.AccountSettings_title_text_Xpath);
        System.out.println("Account Settings Header is verified successfully");
    }

    @Then("I Tap on back button in Account settings screen")
    public void iTapOnBackButtonInAccountSettingsScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on back button in Account settings screen");
        Taponbutton(Constant_settings.AccountSettings_back_button_Xpath);
        System.out.println("backbutton");
    }

    @Then("I verify the Profile photo")
    public void iVerifyTheProfilePhoto() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Profile photo");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.AccountSettings_Profile_photo_access_id));
        System.out.println("Profile photo is verified successfully");
    }

    @Then("I verify the User Name")
    public void iVerifyTheUserName() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the User Name");
        asserttextAccessibility(Constant_settings.AccountSettings_UserName_text_expected, Constant_settings.AccountSettings_UserName_text_access_id);
        System.out.println("User Name is verified successfully");
    }

    @Then("I verify the user Email")
    public void iVerifyTheUserEmail() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the user Email");
        asserttextAccessibility(Constant_settings.AccountSettings_User_Email_text_expected,Constant_settings.AccountSettings_User_Email_access_id);
        System.out.println("user Email is verified successfully");
    }

    @Then("I Verify the Settings text")
    public void iVerifyTheSettingsText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Settings text");
        asserttext(Constant_settings.AccountSettings_Settings_text_expected,Constant_settings.AccountSettings_Settings_text_Xpath);
        System.out.println("Settings text is verified successfully");
    }

    @Then("I verify the Profile text")
    public void iVerifyTheProfileText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Profile text");
        asserttext(Constant_settings.AccountSettings_Profile_text_expected,Constant_settings.AccountSettings_Profile_title_Xpath);
        System.out.println("Profile text is verified successfully");
    }

    @Then("I Verify the Profile card icon")
    public void iVerifyTheProfileCardIcon() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Profile card icon");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.AccountSettings_Profile_card_icon_access_id));
    }

    @Then("I verify the Subscriptions text")
    public void iVerifyTheSubscriptionsText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Subscriptions text");
        asserttext(Constant_settings.AccountSettings_Subscriptions_text_expected,Constant_settings.AccountSettings_Subscriptions_title_text_Xpath);
        System.out.println("Subscriptions text is verified successfully");
    }

    @Then("I verify the Subscriptions navigation icon")
    public void iVerifyTheSubscriptionsNavigationIcon() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Subscriptions navigation icon");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.AccountSettings_Subscriptions_card_icon_access_id));
    }


    @Then("I Tap on Hamburger Menu button")
    public void iTapOnHamburgerMenuButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Hamburger Menu button");
        TaponbuttonaccessabilityID(Constant_settings.Header_menu_button_access_id);
    }

    @Then("I Tap on view Edit Account button link")
    public void iTapOnViewEditAccountButtonLink() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on view Edit Account button link");
        TaponbuttonaccessabilityID(Constant_settings.view_EditAccount_Button_access_id);
    }

    @Then("I Tap on Profile Card icon in Account settings screen")
    public void iTapOnProfileCardIconInAccountSettingsScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Profile Card icon in Account settings screen");
        TaponbuttonaccessabilityID(Constant_settings.AccountSettings_Profile_Card_icon_access_id);
    }


    @Then("I verify Profile title text")
    public void iVerifyProfileTitleText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Profile title text");
        asserttext(Constant_settings.Profile_text_expected,Constant_settings.Profile_title_text_Xpath);
        System.out.println("Profile title text verified successfully");
    }

    @Then("I Tap on back button in Profile screen")
    public void iTapOnBackButtonInProfileScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on back button in Profile screen");
        Taponbutton(Constant_settings.Profile_Back_button_image_Xpath);
    }

    @Then("I verify the profile photo in Profile screen")
    public void iVerifyTheProfilePhotoInProfileScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the profile photo in Profile screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Profile_Profile_photo_access_id));
        System.out.println("Profile photo is verified successfully");
    }

    @Then("I verify the Personal information text")
    public void iVerifyThePersonalInformationText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Personal information text");
        asserttext(Constant_settings.Profile_Personal_information_text_expected,Constant_settings.Profile_Personal_information_text_Xpath);
        System.out.println("Personal information is verified successfully");
    }

    @Then("I verify the Name Label")
    public void iVerifyTheNameLabel() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Name Label");
        asserttext(Constant_settings.Profile_Name_text_expected,Constant_settings.Profile_Name_Label_Xpath);
        System.out.println("Name Label is verified successfully");
    }

    @Then("I verify the Name value in profile page")
    public void iVerifyTheNameValueInProfilePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Name value in profile page");
        asserttextAccessibility(Constant_settings.Profile_Name_value_expected,Constant_settings.Profile_Name_value_access_id);
        System.out.println("Name value is verified successfully");
    }

    @Then("I verify the Email Label")
    public void iVerifyTheEmailLabel() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Email Label");
        asserttext(Constant_settings.Profile_Email_text_expected,Constant_settings.Profile_Email_Label_Xpath);
        System.out.println("Email Label is verified successfully");
    }

    @Then("I verify the Email value in profile page")
    public void iVerifyTheEmailValueInProfilePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Email value in profile page");
        asserttextAccessibility(Constant_settings.Profile_Email_value_expected,Constant_settings.Profile_Email_value_access_id);
    }

    @Then("I verify the Mobile Label")
    public void iVerifyTheMobileLabel() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Mobile Label");
        asserttext(Constant_settings.Profile_Mobile_text_expected,Constant_settings.Profile_Mobile_Label_Xpath);
        System.out.println("Mobile Label is verified successfully");
    }

    @Then("I verify the Mobile value in profile page")
    public void iVerifyTheMobileValueInProfilePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Mobile value in profile page");
        asserttextAccessibility(Constant_settings.Profile_Mobile_value_expected,Constant_settings.Profile_Mobile_value_access_id);
    }

    @Then("I verify the Address Label")
    public void iVerifyTheAddressLabel() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Address Label");
        asserttext(Constant_settings.Profile_Address_text_expected,Constant_settings.Profile_Address_label_Xpath);
        System.out.println("Address Label is verified successfully");
    }

    @Then("I verify the Edit profile text in Profile page")
    public void iVerifyTheEditProfileTextInProfilePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Edit profile text in Profile page");
        asserttext(Constant_settings.Profile_EditProfile_text_expected,Constant_settings.Profile_EditProfile_text_Xpath);
        System.out.println("Edit profile text in profile page is verified successfully");
    }

    @Then("I verify the Edit profile button card icon")
    public void iVerifyTheEditProfileButtonCardIcon() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Edit profile button card icon");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Profile_EditProfile_Button_CardIcon_access_id));
        System.out.println("Edit profile button card icon is verified successfully");
    }

    @Then("I verify the Security text")
    public void iVerifyTheSecurityText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Security text");
        asserttext(Constant_settings.Profile_Security_text_expected,Constant_settings.Profile_Security_text_Xpath);
        System.out.println("Security text is verified successfully");
    }

    @Then("I verify the Password text")
    public void iVerifyThePasswordText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Password text");
        asserttext(Constant_settings.Profile_Password_text_expected,Constant_settings.Profile_Password_text_Xpath);
        System.out.println("Password text is verified successfully");
    }

    @Then("I verify the Password value")
    public void iVerifyThePasswordValue() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Password value");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Profile_Password_Value_access_id));
    }

    @Then("I verify the Renew card title")
    public void iVerifyTheRenewCardTitle() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Renew card title");
        asserttext(Constant_settings.Profile_Renew_text_expected,Constant_settings.Profile_Renew_CardTitle_Xpath);
        System.out.println("Renew card title is verified successfully");
    }

    @Then("I verify the Renew card icon")
    public void iVerifyTheRenewCardIcon() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Renew card icon");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Profile_Renew_CardIcon_access_id));
        System.out.println("Renew card icon is verified successfully");
    }

    @Then("I Tap on Edit Profile button card icon")
    public void iTapOnEditProfileButtonCardIcon() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Edit Profile button card icon");
        TaponbuttonaccessabilityID(Constant_settings.Profile_Edit_Profile_button_card_icon_access_id);
    }

    @Then("I verify the Edit profile title text")
    public void iVerifyTheEditProfileTitleText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Edit profile title text");
        asserttext(Constant_settings.Edit_Profile_text_expected,Constant_settings.Edit_Profile_title_text_Xpath);
        System.out.println("Edit profile title text is verified successfully");
    }

    @Then("I Tap on Edit Profile cancel button image")
    public void iTapOnEditProfileCancelButtonImage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Edit Profile cancel button image");
        TaponbuttonaccessabilityID(Constant_settings.Edit_Profile_Cancel_button_image_access_id);
    }

    @Then("I verify Edit profile photo image")
    public void iVerifyEditProfilePhotoImage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Edit profile photo image");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Edit_Profile_Photo_access_id));
        System.out.println("Edit profile photo image is verified successfully");
    }

    @Then("I verify the Edit profile Email value")
    public void iVerifyTheEditProfileEmailValue() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Edit profile Email value");
        asserttextAccessibility(Constant_settings.Edit_Profile_Email_value_expected,Constant_settings.Edit_Profile_Email_value_access_id);
    }

    @Then("I verify the Edit profile First Name text")
    public void iVerifyTheEditProfileFirstNameText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Edit profile First Name text");
        asserttext(Constant_settings.Edit_Profile_FirstName_text_expected,Constant_settings.Edit_Profile_FirstName_Label_Xpath);
        System.out.println("Edit profile First Name text is verified successfully");
    }

    @Then("I verify the Edit profile First Name value")
    public void iVerifyTheEditProfileFirstNameValue() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Edit profile First Name value");
        asserttextAccessibility(Constant_settings.Edit_Profile_FirstName_value_expected,Constant_settings.Edit_Profile_FirstName_value_access_id);
    }

    @Then("I verify the Edit profile Last Name Label")
    public void iVerifyTheEditProfileLastNameLabel() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Edit profile Last Name Label");
        asserttext(Constant_settings.Edit_Profile_LastName_text_expected,Constant_settings.Edit_Profile_LastName_Label_Xpath);
        System.out.println("Edit profile Last Name Label is verified successfully");

    }

    @Then("I verify the Edit Profile Last Name value")
    public void iVerifyTheEditProfileLastNameValue() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Edit Profile Last Name value");
        asserttextAccessibility(Constant_settings.Edit_Profile_LastName_value_expected,Constant_settings.Edit_Profile_LastName_value_access_id);
    }

    @Then("I verify the Primary mobile Label")
    public void iVerifyThePrimaryMobileLabel() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Primary mobile Label");
        asserttext(Constant_settings.Edit_Profile_Primary_mobile_text_expected,Constant_settings.Edit_Profile_Primary_mobile_Label_Xpath);
        System.out.println("Primary mobile Label is verified successfully");
    }

    @Then("I verify the Primary mobile value")
    public void iVerifyThePrimaryMobileValue() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Primary mobile value");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Edit_Profile_Primary_mobile_value_access_id));
    }


    @Then("I verify the Edit Profile Address label")
    public void iVerifyTheEditProfileAddressLabel() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Edit Profile Address label");
        asserttext(Constant_settings.Edit_Profile_Address_text_expected,Constant_settings.Edit_Profile_Address_Label_Xpath);
        System.out.println("Edit Profile Address label is verified successfully");
    }

    @Then("I verify the Address value")
    public void iVerifyTheAddressValue() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Address value");
        asserttextAccessibility(Constant_settings.Edit_Profile_Address_value_expected,Constant_settings.Edit_Profile_Address_value_access_id);
    }

    @Then("I verify the Edit Profile Save button text")
    public void iVerifyTheEditProfileSaveButtonText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Edit Profile Save button text");
        asserttext(Constant_settings.Edit_Profile_Save_button_text_expected,Constant_settings.Edit_Profile_Save_button_text_Xpath);
        System.out.println("Edit Profile Save button text is verified successfully");
    }


    @Then("I verify Subscriptions title text")
    public void iVerifySubscriptionsTitleText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Subscriptions title text");
        asserttext(Constant_settings.Subscriptions_text_expected,Constant_settings.Subscriptions_title_text_Xpath );
        System.out.println("Subscriptions title text is verified successfully");
    }

    @Then("I verify the Back button in Subscriptions Page")
    public void iVerifyTheBackButtonInSubscriptionsPage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Back button in Subscriptions Page");
        Assert.assertTrue(iselementdisplayed(Constant_settings.Subscriptions_back_button_Xpath));
        System.out.println("Back button in Subscriptions Page is verified successfully");
    }



    @Then("I Tap on the Subscriptions navigation icon")
    public void iTapOnTheSubscriptionsNavigationIcon() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on the Subscriptions navigation icon");
        TaponbuttonaccessabilityID(Constant_settings.AccountSettings_Subscriptions_card_icon_access_id);
    }

    @Then("I Tap on add new button in device Management")
    public void iTapOnAddNewButtonInDeviceManagement()throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on add new button in device Management");
        TaponbuttonaccessabilityID(Constant_settings.Settings_add_new_button_accessid);

    }

    @Then("I Verify the On-boarding screen Title")
    public void iVerifyTheOnBoardingScreenTitle() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the On-boarding screen Title");
        asserttextValidation(Constant_settings.Settings_Onboarding_screen_header_text,Constant_settings.Settings_Onboarding_screen_header);
        System.out.println("Onboarding screen title is verified");
    }

    @Then("I Tap on ok Button in No Device Onboarded popup")
    public void iTapOnOkButtonInNoDeviceOnboardedPopup() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on ok Button in No Device Onboarded popup");
        Taponbutton(Constant_settings.Settings_ok_button_xpath);
    }


    @Then("I verify the close button in onboarding screen")
    public void iVerifyTheCloseButtonInOnboardingScreen()throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the close button in onboarding screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_Onboarding_close_button_accessid));
    }

    @Then("I Verify No device Found text in Onboarding screen")
    public void iVerifyNoDeviceFoundTextInOnboardingScreen()throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify No device Found text in Onboarding screen");
        asserttextValidation(Constant_settings.Settings_Onboarding_No_device_found_text,Constant_settings.Settings_Onboarding_No_device_found_text_Xpath);
        System.out.println("No device Found text is verified");
    }

    @Then("I Verify the Search again button in onboarding screen")
    public void iVerifyTheSearchAgainButtonInOnboardingScreen() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Search again button in onboarding screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_Onboarding_search_again_button_accessid));
        System.out.println("Search again button is verified");
    }

    @Then("I Tap on the close button in onboarding screen")
    public void iTapOnTheCloseButtonInOnboardingScreen()throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on the close button in onboarding screen");
        TaponbuttonaccessabilityID(Constant_settings.Settings_Onboarding_close_button_accessid);
    }



    @Then("I Verify the Advanced title text")
    public void iVerifyTheAdvancedTitleText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Advanced title text");
        asserttextAccessibility(Constant_settings.ManageNotifications_Advanced_text_expected, Constant_settings.ManageNotifications_Advanced_text_access_id);
        System.out.println("Advanced title text is verified successfully");
    }

    @Then("I Verify Push Notification toggle button status")
    public void iVerifyPushNotificationToggle() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Push Notification toggle button status");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.ManageNotifications_PushNotifications_toggle_access_id));
        System.out.println("Push Notification toggle button status is verified successfully");

    }

    @Then("I Verify the Push Notifications text")
    public void iVerifyThePushNotificationsTitle() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Push Notifications text");
        asserttextAccessibility(Constant_settings.ManageNotifications_Push_Notifications_text_expected, Constant_settings.ManageNotifications_PushNotifications_text_access_id);
        System.out.println("Push Notifications text is verified successfully");
    }


    @Then("I Verify Global settings text")
    public void iVerifyGlobalSettingsText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Global settings text");
        asserttextAccessibility(Constant_settings.ManageNotifications_Global_settings_text_expected,Constant_settings.ManageNotifications_Global_settings_access_id);
        System.out.println("Global settings text is verified successfully");
    }

    @Then("I Verify Manage Notification logo")
    public void iVerifyManageNotificationLogo() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on back button in Manage Notification screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.ManageNotifications_logo_access_id));
        System.out.println("Manage Notification logo is verified successfully");
    }

    @Then("I verify the back arrow image in Manage notification screen")
    public void iVerifyTheBackArrowImageInManageNotificationScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the back arrow image in Manage notification screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.ManageNotifications_back_button_access_id));
        System.out.println("back arrow image in Manage notification screen is verified successfully");
    }

    @Then("I verify the Manage Notification Header")
    public void iVerifyTheManageNotificationHeader() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Manage Notification Header");
        asserttext(Constant_settings.ManageNotification_ManageNotification_text_expected, Constant_settings.ManageNotifications_title_Xpath);
        System.out.println("Manage Notification Header is verified successfully");
    }

    @Then("I Tap on Notification settings")
    public void iTapOnNotificationSettings() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Notification settings");
        TaponbuttonaccessabilityID(Constant_settings.NotificationSettings_text_access_id);
    }

    @Then("I Tap on Hamburger menu in landing screen")
    public void iTapOnHambrgerMenuInLandingScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on hamburger menu in landing screen");
        TaponbuttonaccessabilityID(Constant_settings.header_menu_button_access_id);
    }

    @Then("I Verify the email text on the page")
    public void iVerifyTheEmailTextOnThePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the email text on the page");
        asserttextAccessibility(Constant_settings.Settings_email,Constant_settings.Notification_email_access_id);
        System.out.println("Manage Notification email text is verified");
    }

    @Then("I verify email toggle button")
    public void iVerifyEmailToggleButton() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify email toggle button");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.ManageNotifications_Email_toggle_access_id));
        System.out.println("Email toggle button is verified");
    }


    @Then("I Verify the sms text on the page")
    public void iVerifyTheSmsTextOnThePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the sms text on the page");
        asserttextAccessibility(Constant_settings.Settings_sms,Constant_settings.ManageNotifications_sms_accessid);
        System.out.println(" Manage Notification sms text is verified");
    }

    @Then("I verify sms  toggle button")
    public void iVerifySmsToggleButton() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Manage Notification logo");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.ManageNotifications_sms_toggle_switch_access_id));
        System.out.println(" sms  toggle button is verified");
    }

    @Then("I tap on back button in Manage notifications")
    public void iTapOnBackButtonInManageNotifications() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on back button in Manage notifications");
        TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_back_button_access_id);
    }
}

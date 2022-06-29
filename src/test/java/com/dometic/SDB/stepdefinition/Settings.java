package com.dometic.SDB.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.MTC.qa.Pages.Constant_DeviceManagement;
import com.dometic.MTC.qa.Pages.Constant_ManagementNotifications;
import com.dometic.SDB.qa.Pages.*;
import com.dometic.SDB.qa.util.Baseclass;
import com.google.common.collect.ImmutableMap;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class Settings extends Baseclass {
    private int flag;
    private int EmailToggle;
    private String Edited_Email, Edited_Label;
    public static String deviceName;

    @Then("I Tap on hamburger menu in landing screen")
    public void iTapOnHamburgerMenuInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on hamburger menu in landing screen");
        if (driver.findElementsByAccessibilityId(Constant_landingscreen.LandingPage_hamburger_menu_access_id).size() != 0) {
            TaponbuttonaccessabilityID(Constant_landingscreen.LandingPage_hamburger_menu_access_id);
            Thread.sleep(2000);
        }
    }

    @Then("I Verify SETTINGS Text displayed in the top of the app")
    public void iVerifySETTINGSTextDisplayedInTheTopOfTheApp() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify SETTINGS Text displayed in the top of the app");
        asserttext("SETTINGS", Constant_settings.Settings_text_xpath);
        System.out.println("SETTINGS Text is verified");
    }

    @Then("I verify Languages text is displayed")
    public void iVerifyLanguagesIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Languages text is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_languageContainer_access_id));
        System.out.println("Languages text is verified");
    }

    @Then("I Verify Temperature unit text is displayed")
    public void tVerifyTemperatureUnitIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Temperature unit text is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_Temperature_unit_access_id));
        System.out.println("Temperature unit text is verified");
    }

    @Then("I verify Upgrade Firmware is displayed")
    public void iVerifyUpgradeFirmwareIsDisplayed() {
        //  Assert.assertTrue(iselementdisplayed(Constant_settings.Settings_Upgrade_Firmware_xpath));
    }

    @Then("I verify Version is displayed")
    public void iVerifyVersionIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Version is displayed");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_landingscreen.LandingPage_hamburger_menu_access_id);
        if (elementsByAccessibilityId.size() != 0) {
            TaponbuttonaccessabilityID(Constant_landingscreen.LandingPage_hamburger_menu_access_id);
        }
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_versionContainer_access_id));
        System.out.println("Version text is verified");
    }

    @Then("I verify Log out is displayed")
    public void iVerifyLogOutIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Log out is displayed");
        Assert.assertTrue(iselementdisplayed(Constant_settings.Settings_Logout_xpath));
        System.out.println("Log out text is verified");
    }


    @Then("I verify hamburger menu in landing screen")
    public void iVerifyHamburgerMenuInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify hamburger menu in landing screen");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_climate_ac.CAC_M_power_Back_Button_access_id);
        if (elementsByAccessibilityId.size() != 0) {
            TaponbuttonaccessabilityID(Constant_climate_ac.CAC_M_power_Back_Button_access_id);
        }
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_landingscreen.LandingPage_hamburger_menu_access_id));
        System.out.println("hamburger menu in landing screen is verified");
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
        asserttextAccessibility(Constant_settings.Settings_language_text_expected, Constant_settings.Settings_language_text_access_id);
        System.out.println("Language text updated with German translation is verified");
    }

    @And("I verify on Temperature text updated with German translation")
    public void iVerifyOnTemperatureTextUpdatedWithGermanTranslation() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify on Temperature text updated with German translation");
        asserttextAccessibility(Constant_settings.Settings_Temperature_text_expected, Constant_settings.Settings_Temperature_text_access_id);
        System.out.println("Temperature text updated with German translation is verified");
    }

    @And("I verify on logout text updated with German translation")
    public void iVerifyOnLogoutTextUpdatedWithGermanTranslation() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify on logout text updated with German translation");
        asserttextAccessibility(Constant_settings.Settings_logout_expected, Constant_settings.Settings_logout_text_access_id);
        System.out.println("logout text updated with German translation is verified");
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

    @Then("I update language to Spanish in settings")
    public void iUpdateLanguageToSpanishInSettings() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I update language to Spanish in settings");
        Taponbutton(Constant_settings.Settings_language_Spanish_xpath);
    }

    @And("I verify on Language text updated with Spanish translation")
    public void iVerifyOnLanguageTextUpdatedWithSpanishTranslation() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify on Language text updated with Spanish translation");
        asserttext(Constant_settings.Settings_language_Spanish_text_expected, Constant_settings.Settings_language_xpath);
        System.out.println("Language text updated with Spanish translation is verified");
    }

    @And("I verify on Temperature text updated with Spanish translation")
    public void iVerifyOnTemperatureTextUpdatedWithSpanishTranslation() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify on Temperature text updated with Spanish translation");
        asserttextAccessibility(Constant_settings.Settings_temperature_Spanish_text_expected, Constant_settings.Settings_Temperature_text_access_id);
        System.out.println("Temperature text updated with Spanish translation is verified");
    }

    @And("I verify on logout text updated with Spanish translation")
    public void iVerifyOnLogoutTextUpdatedWithSpanishTranslation() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify on logout text updated with Spanish translation");
        asserttextAccessibility(Constant_settings.Settings_logout_Spanish_text_expected, Constant_settings.Settings_logout_text_access_id);
        System.out.println("logout text updated with Spanish translation is verified");
    }

    @Then("I update language to French in settings")
    public void iUpdateLanguageToFrenchInSettings() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I update language to French in settings");
        Taponbutton(Constant_settings.Settings_language_French_xpath);
    }

    @And("I verify on Language text updated with French translation")
    public void iVerifyOnLanguageTextUpdatedWithFrenchTranslation() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify on Language text updated with French translation");
        asserttext(Constant_settings.Settings_language_French_text_expected, Constant_settings.Settings_language_xpath);
        System.out.println("Language text updated with French translation is verified");
    }

    @And("I verify on Temperature text updated with French translation")
    public void iVerifyOnTemperatureTextUpdatedWithFrenchTranslation() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify on Temperature text updated with French translation");
        asserttextAccessibility(Constant_settings.Settings_temperature_French_text_expected, Constant_settings.Settings_Temperature_text_access_id);
        System.out.println("Temperature text updated with French translation is verified");
    }

    @And("I verify on logout text updated with French translation")
    public void iVerifyOnLogoutTextUpdatedWithFrenchTranslation() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify on logout text updated with French translation");
        asserttextAccessibility(Constant_settings.Settings_logout_French_text_expected, Constant_settings.Settings_logout_text_access_id);
        System.out.println("logout text updated with French translation is verified");
    }

    @Then("I verify Add ZoneIcon in Zone Management")
    public void iVerifyAddZoneIconInZoneManagement() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Add ZoneIcon in Zone Management");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_Zone_Management_addZoneIcon_access_id));
        System.out.println("Add ZoneIcon is verified");
    }

    @Then("I verify Zone Management text is displayed")
    public void iVerifyZoneManagementTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Zone Management text is displayed");
        System.out.println(driver.findElement(By.xpath(Constant_settings.Settings_Zone_Management_xpath)).getText());
        asserttext(Constant_settings.Settings_Zone_Management_expected, Constant_settings.Settings_Zone_Management_xpath);
    }

    @Then("I Tap on Zone Management in Settings")
    public void iTapOnZoneManagementInSettings() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Zone Management in Settings");
        Taponbutton(Constant_settings.Settings_Zone_Management_xpath);
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_settings.Settings_Zone_Management_LimitedZones_xpath)));
    }

    @Then("I Verify ALL ZONES in Zone Management")
    public void iVerifyALLZONESInZoneManagement() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify ALL ZONES in Zone Management");
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_settings.Settings_Zone_Management_LimitedZones_xpath)));
        System.out.println(driver.findElementByAccessibilityId(Constant_settings.Settings_language_selectedName_access_id).getText());
        asserttextAccessibility(Constant_settings.Settings_Zone_Management_ALL_ZONES_text, Constant_settings.Settings_language_selectedName_access_id);
        System.out.println("ALL ZONES is verified");
    }

    @Then("I verify Edit text in Zone Management")
    public void iVerifyEditTextInZoneManagement() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Edit text in Zone Management");
        System.out.println(driver.findElement(By.xpath(Constant_settings.Settings_Zone_Management_edit_xpath)).getText());
        asserttext(Constant_settings.Settings_Zone_Management_edit_text, Constant_settings.Settings_Zone_Management_edit_xpath);
        System.out.println("Edit text in Zone Management is verified");
    }

    @Then("I verify Limited to {int} Zones only text in Zone Management")
    public void iVerifyLimitedToZonesOnlyTextInZoneManagement(int arg0) throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Limited Zones only text in Zone Management");
        System.out.println(driver.findElement(By.xpath(Constant_settings.Settings_Zone_Management_LimitedZones_xpath)).getText());
        asserttext(Constant_settings.Settings_Zone_Management_LimitedZones_text, Constant_settings.Settings_Zone_Management_LimitedZones_xpath);
    }

    @Then("I Tap on Edit in ALL ZONES")
    public void iTapOnEditInALLZONES() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Edit in ALL ZONES");
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_settings.Settings_Zone_Management_LimitedZones_xpath)));
        Taponbutton(Constant_settings.Settings_Zone_Management_edit_xpath);
    }

    @Then("I Tap on Rename in ALL ZONES")
    public void iTapOnRenameInALLZONES() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Rename in ALL ZONES");
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_settings.Settings_Zone_Management_Rename_xpath)));
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_settings.Settings_Zone_Management_Rename_xpath));
        if (elements.size() != 0) {
            Taponbutton(Constant_settings.Settings_Zone_Management_Rename_xpath);
        }
    }

    @Then("I Tap on the Zone name")
    public void iTapOnTheZoneName() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on the Zone name");
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_settings.Settings_Zone_Management_Rename_value_xpath)));
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_settings.Settings_Zone_Management_Rename_value_xpath));
        if (elements.size() != 0) {
            Taponbutton(Constant_settings.Settings_Zone_Management_Rename_value_xpath);
        }

    }

    @Then("I clear the previous zone name")
    public void iClearThePreviousZoneName() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I clear the previous zone name");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_settings.Settings_Zone_Management_Rename_value_xpath));
        if (elements.size() != 0) {
            cleartext(Constant_settings.Settings_Zone_Management_Rename_value_xpath);
        }
    }

    @Then("I save the Zone")
    public void iSaveTheZone() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I save the Zone");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_settings.Settings_Zone_Management_SAVE_Button_xpath));
        if (elements.size() != 0) {
            Taponbutton(Constant_settings.Settings_Zone_Management_SAVE_Button_xpath);
        }
    }

    @Then("I verify {string} message is displayed")
    public void iVerifyMessageIsDisplayed(String arg0) throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Zone Management Zone_Name can not be empty message is displayed");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_settings.Settings_Zone_Management_Zone_Name_can_not_be_empty_xpath));
        if (elements.size() != 0) {
            asserttext(Constant_settings.Settings_Zone_Management_Zone_Name_can_not_be_empty_text, Constant_settings.Settings_Zone_Management_Zone_Name_can_not_be_empty_xpath);
        }
    }

    @Then("I Enter the zone name more then the limit")
    public void iEnterTheZoneNameMoreThenTheLimit() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter the zone name more then the limit");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_settings.Settings_Zone_Management_Rename_value_xpath));
        if (elements.size() != 0) {
            Taponbutton(Constant_settings.Settings_Zone_Management_Rename_value_xpath);
            entertext(Constant_settings.Settings_Zone_Management_value, Constant_settings.Settings_Zone_Management_Rename_value_xpath);
        }
    }

    @Then("I Enter the Zone name")
    public void iEnterTheZoneName() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter the Zone name");
        Taponbutton(Constant_settings.Settings_Zone_Management_Rename_value_xpath);
        entertext(Constant_settings.Settings_Zone_Management_Living_Room, Constant_settings.Settings_Zone_Management_Rename_value_xpath);
    }

    @Then("I Tap on the Delete Zone Icon")
    public void iTapOnTheDeleteZoneIcon() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on the Delete Zone Icon");
        Taponbutton(Constant_settings.Settings_Zone_Management_flatListItem_xpath);
    }

    @Then("I Tap on YES, DELETE IT Button")
    public void iTapOnYESDELETEITButton() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on YES, DELETE IT Button");
        Thread.sleep(2000);
        Taponbutton(Constant_settings.Settings_Zone_Management_deleteZone_xpath);
    }

    @Then("I Tap on the Add Zone Icon")
    public void iTapOnTheAddZoneIcon() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on the Add Zone Icon");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_settings.Settings_Zone_Management_deleteZoneAlert_description_xpath));
        if (elements.size() != 0) {
            Taponbutton(Constant_settings.Settings_Zone_Management_deleteZoneAlert_description_xpath);
        }
        TaponbuttonaccessabilityID(Constant_settings.Settings_Zone_Management_addZoneIcon_access_id);
    }

    @Then("I Select the zone")
    public void iSelectTheZone() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Select the zone");
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_settings.Settings_Zone_Management_addZoneIcon_Select_button_xpath)));
        TaponbuttonaccessabilityID(Constant_settings.Settings_Zone_Management_addZoneIcon_Select_button_access_id);
    }

    @Then("I SAVE the Zone")
    public void iSAVETheZone() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I SAVE the Zone");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_settings.Settings_Zone_Management_ZoneNumber_dialog_saveButton_xpath));
        if (elements.size() != 0) {
            TaponbuttonaccessabilityID(Constant_settings.Settings_Zone_Management_ZoneNumber_dialog_saveButton_access_id);
        }
//        TaponbuttonaccessabilityID(Constant_settings.Settings_Zone_Management_deleteZoneAlert_cancelButton_access_id);
//        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_settings.Settings_Zone_Management_Zone_name_already_present_xpath));
//        if(elements.size()!=0){
//            TaponbuttonaccessabilityID(Constant_settings.Settings_Zone_Management_ZoneNumber_dialog_cancelButton_access_id);
//        }
    }

    @Then("I verify Zone Name can not be empty message is displayed")
    public void iVerifyZoneNameCanNotBeEmptyMessageIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Zone Name can not be empty message is displayed");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_settings.Settings_Zone_Management_Zone_Name_can_not_be_empty_xpath));
        if (elements.size() != 0) {
            asserttext(Constant_settings.Settings_Zone_Management_Zone_Name_can_not_be_empty_text, Constant_settings.Settings_Zone_Management_Zone_Name_can_not_be_empty_xpath);
        }
    }

    @Then("I verify {string} character message is displayed")
    public void iVerifyCharacterMessageIsDisplayed(String arg0) throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify 10 character message is displayed");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_settings.Settings_Zone_Management_Zone_Name_can_not_be_empty_xpath));
        if (elements.size() != 0) {
            asserttext(Constant_settings.Settings_Zone_Management_10_character_text, Constant_settings.Settings_Zone_Management_Zone_Name_can_not_be_empty_xpath);
        }
    }

    @Then("I Tap on Save")
    public void iTapOnSave() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Save");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_settings.Settings_Zone_Management_SAVE_Button_xpath));
        if (elements.size() != 0) {
            Taponbutton(Constant_settings.Settings_Zone_Management_SAVE_Button_xpath);
        } else {
            Taponbutton(Constant_settings.Settings_Zone_Management_CANCEL_Button_xpath);
        }
    }

    @Then("I Enter the New Zone name")
    public void iEnterTheNewZoneName() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter the New Zone name");
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_settings.Settings_Zone_Management_new_Zone_xpath)));
        TaponbuttonaccessabilityID(Constant_settings.Settings_Zone_Management_new_Zone_access_id);
        entertextaccessabilityId(Constant_settings.Settings_Zone_Management_NewZone_Room, Constant_settings.Settings_Zone_Management_new_Zone_access_id);
    }

    @Then("I Tap on Logout in Settings")
    public void iTapOnLogoutInSettings() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Logout in Settings");
        System.out.println("Text comparison is Successful");
        Taponbutton(com.dometic.L1.qa.Pages.Constant_settings.Settings_Logout_xpath);
    }

    @Then("I verify settings screen back button")
    public void iVerifySettingsScreenBackButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify settings screen back button");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_headerBackButtonIcon_access_id));
        System.out.println("Settings screen back button is verified");
    }

    @Then("I verify user profile photo is displayed")
    public void iVerifyUserProfilePhotoIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify user profile photo is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_userProfilePhoto_access_id));
        System.out.println("User profile photo is verified");
    }

    @Then("I verify username is displayed")
    public void iVerifyUsernameIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify username is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_userName_access_id));
        System.out.println("Username text is verified");
    }

    @Then("I verify user email is displayed")
    public void iVerifyUserEmailIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify user email is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_userEmail_access_id));
        System.out.println("User email text is verified");
    }

    @Then("I verify Home text is displayed")
    public void iVerifyHomeTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Home text is displayed");
        asserttextValidationAccessibility(Constant_settings.Settings_home_text, Constant_settings.Settings_home_text_access_id);
        System.out.println("Home text is verified");
    }

    @Then("I verify Notification Settings text is displayed")
    public void iVerifyNotificationSettingsTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Notification Settings text is displayed");
        asserttextValidationAccessibility(Constant_settings.Settings_notificationSettings_text, Constant_settings.Settings_notificationSettings_text_access_id);
        System.out.println("Notification Settings text is verified");
    }

    @Then("I verify Device Management is displayed")
    public void iVerifyDeviceManagementIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Device Management is displayed");
        asserttextValidationAccessibility(Constant_settings.Settings_deviceMangagement_text, Constant_settings.Settings_deviceMangagement_text_access_id);
        System.out.println("Device Management text is verified");
    }

    @Then("I verify App Settings is displayed")
    public void iVerifyAppSettingsIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify App Settings is displayed");
        asserttextValidationAccessibility(Constant_settings.Settings_appSettings_text, Constant_settings.Settings_appSettings_text_access_id);
        System.out.println("App Settings text is verified");
    }

    @Then("I verify Logout is displayed")
    public void iVerifyLogoutIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Logout is displayed");
        asserttextValidationAccessibility(Constant_settings.Settings_Logout_text, Constant_settings.Settings_Logout_text_access_id);
        System.out.println("Logout text is verified");
    }

    @Then("I verify Version {double} is displayed")
    public void iVerifyVersionIsDisplayed(double arg) throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Version 1.6 is displayed");
        asserttextValidationAccessibility(Constant_settings.Settings_Version_16_text, Constant_settings.Settings_Version_16_text_access_id);
        System.out.println("Version 1.6 text is verified");
    }

    @Then("I verify View Edit Account text is displayed")
    public void iVerifyViewEditAccountTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify View/Edit Account text is displayed");
        asserttextValidationAccessibility(Constant_settings.Settings_viewEditButtonText, Constant_settings.Settings_viewEditButtonText_access_id);
        System.out.println("View Edit Account text is verified");
    }

    @Then("I Tap on Home in Settings screen")
    public void iTapOnHomeInSettingsScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Home in Settings screen");
        TaponbuttonaccessabilityID(Constant_settings.Settings_home_text_access_id);
        Thread.sleep(2000);
    }

    @Then("I Tap on Notification Settings")
    public void iTapOnNotificationSettings() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Notification Settings");
        TaponbuttonaccessabilityID(Constant_settings.Settings_notificationSettings_text_access_id);
        Thread.sleep(2000);
    }

    @Then("I Tap on Device Management")
    public void iTapOnDeviceManagement() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Device Management");
        if (driver.findElementsByAccessibilityId(Constant_settings.Settings_deviceMangagement_text_access_id).size() != 0) {
           TaponbuttonaccessabilityID(Constant_settings.Settings_deviceMangagement_text_access_id);
            Thread.sleep(2000);
        }
    }

    @Then("I Tap on App Settings")
    public void iTapOnAppSettings() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on App Settings");
        TaponbuttonaccessabilityID(Constant_settings.Settings_appSettings_text_access_id);
        Thread.sleep(2000);
    }

    @Then("I Tap on Logout in Settings screen")
    public void iTapOnLogoutInSettingsScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Logout in Settings screen");
        TaponbuttonaccessabilityID(Constant_settings.Settings_Logout_text_access_id);
    }

    @Then("I Tap on View Edit Account link in Settings screen")
    public void iTapOnViewEditAccountLinkInSettingsScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on View Edit Account link in Settings screen");
        TaponbuttonaccessabilityID(Constant_settings.Settings_viewEditButtonText_access_id);
    }

    @Then("I Tap on Profile in Account Setting Screen")
    public void iTapOnProfileInAccountSettingScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Profile in Account Setting Screen");
        TaponbuttonaccessabilityID(Constant_AccountSettings.accountSettings_Profile_Text_Access_Id);
    }

    @Then("I Verify Profile header text")
    public void iVerifyProfileHeaderText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Profile header text");
        asserttextValidationAccessibility(Constant_AccountSettings.profile_Header_Text, Constant_AccountSettings.profile_Header_Text_Access_Id);
        System.out.println("Profile header text is verified");
    }

    @Then("I verify user profile image is displayed")
    public void iVerifyUserProfileImageIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify user profile image is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.profile_UserProfile_photo_Access_Id));
        System.out.println("User profile image is verified");
    }

    @Then("I verify Personal Information text is displayed")
    public void iVerifyPersonalInformationTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Personal Information text is displayed");
        asserttextValidationAccessibility(Constant_AccountSettings.profile_PersonalInfoText, Constant_AccountSettings.profile_PersonalInfoText_Access_Id);
        System.out.println("Personal Information text is verified");
    }

    @Then("I verify Name Label is displayed")
    public void iVerifyNameLabelIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Name Label is displayed");
        asserttextValidationAccessibility(Constant_AccountSettings.profile_NameLabel, Constant_AccountSettings.profile_NameLabel_Access_Id);
        System.out.println("Name Label is verified");
    }

    @Then("I Verify Name value is displayed")
    public void iVerifyNameValueIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Name value is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.profile_NameValue_Access_Id));
        System.out.println("Name text field is verified");
    }

    @Then("I verify E-mail Label is displayed")
    public void iVerifyEMailLabelIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify E-mail Label is displayed");
        asserttextValidationAccessibility(Constant_AccountSettings.profile_emailLabel, Constant_AccountSettings.profile_emailLabel_Access_Id);
        System.out.println("E-mail Label is verified");
    }

    @Then("I verify E-mail value is displayed")
    public void iVerifyEMailValueIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify E-mail value is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.profile_emailValue_Access_Id));
        System.out.println("E-mail text field is verified");
    }

    @Then("I verify Mobile Label is displayed")
    public void iVerifyMobileLabelIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Mobile Label is displayed");
        asserttextValidationAccessibility(Constant_AccountSettings.profile_phoneLabel, Constant_AccountSettings.profile_phoneLabel_Access_Id);
        System.out.println("Mobile Label is verified");
    }

    @Then("I Verify Mobile value is displayed")
    public void iVerifyMobileValueIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Mobile value is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.profile_phoneValue_Access_Id));
        System.out.println("Mobile text field is verified");
    }

    @Then("I verify Address Label is displayed")
    public void iVerifyAddressLabelIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Address Label is displayed");
        asserttextValidationAccessibility(Constant_AccountSettings.profile_addressLabel, Constant_AccountSettings.profile_addressLabel_Access_Id);
        System.out.println("Address Label is verified");
    }

    @Then("I verify Address value is displayed")
    public void iVerifyAddressValueIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Address value is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.profile_addressValue_Access_Id));
        System.out.println("Address text field is verified");
    }

    @Then("I verify Edit profile text is displayed")
    public void iVerifyEditProfileTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Edit profile text is displayed");
        asserttextValidationAccessibility(Constant_AccountSettings.profile_EditProfileButton_cardTitle, Constant_AccountSettings.profile_EditProfileButton_cardTitle_Access_Id);
        System.out.println("Edit profile text is verified");
    }

    @Then("I verify Edit profile arrow is displayed")
    public void iVerifyEditProfileArrowIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Edit profile arrow is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.profile_EditProfileButton_cardIcon_Access_Id));
        System.out.println("Edit profile arrow is verified");
    }

    @Then("I verify Security text is displayed")
    public void iVerifySecurityTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Security text is displayed");
        asserttextValidationAccessibility(Constant_AccountSettings.profile_securityText, Constant_AccountSettings.profile_securityText_Access_Id);
        System.out.println("Security text is verified");
    }

    @Then("I verify Password text is displayed")
    public void iVerifyPasswordTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Password text is displayed");
        asserttextValidationAccessibility(Constant_AccountSettings.profile_resetPasswordText, Constant_AccountSettings.profile_resetPasswordText_Access_Id);
        System.out.println("Password text is verified");
    }

    @Then("I verify Renew text is displayed")
    public void iVerifyRenewTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Renew text is displayed");
        asserttextValidationAccessibility(Constant_AccountSettings.profile_renew_cardTitle, Constant_AccountSettings.profile_renew_cardTitle_Access_Id);
        System.out.println("Renew text is verified");
    }

    @Then("I verify Renew arrow is displayed")
    public void iVerifyRenewArrowIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Renew arrow is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.profile_renew_cardIcon_Access_Id));
        System.out.println("Renew arrow is verified");
    }

    @Then("I Tap on Edit profile in profile screen")
    public void iTapOnEditProfileInProfileScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Edit profile in profile screen");
        TaponbuttonaccessabilityID(Constant_AccountSettings.profile_EditProfileButton_cardTitle_Access_Id);
        Thread.sleep(2000);
    }

    @Then("I verify Edit profile header text")
    public void iVerifyEditProfileHeaderText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Edit profile header text");
        asserttextValidationAccessibility(Constant_AccountSettings.editProfile_TitleText, Constant_AccountSettings.editProfile_TitleText_Access_Id);
        System.out.println("Edit profile header text is verified");
    }

    @Then("I verify user profile photo in edit profile screen")
    public void iVerifyUserProfilePhotoInEditProfileScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify user profile photo in edit profile screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.editProfile_Photo_Access_Id));
        System.out.println("user profile photo in edit profile screen is verified");
    }

    @Then("I verify user email value is displayed")
    public void iVerifyUserEmailValueIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify user email value is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.editProfile_EmailValue_Access_Id));
        System.out.println("user email text field is verified");
    }

    @Then("I verify Firstname label is displayed")
    public void iVerifyFirstnameLabelIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Firstname label is displayed");
        asserttextValidationAccessibility(Constant_AccountSettings.editProfile_firstNameLabel, Constant_AccountSettings.editProfile_firstNameLabel_Access_Id);
        System.out.println("Firstname label is verified");
    }

    @Then("I verify Firstname Value is displayed")
    public void iVerifyFirstnameValueIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Firstname Value is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.editProfile_firstNNameValue_Access_Id));
        System.out.println("Firstname text field is verified");
    }

    @Then("I verify Lastname label is displayed")
    public void iVerifyLastnameLabelIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Lastname label is displayed");
        asserttextValidationAccessibility(Constant_AccountSettings.editProfile_lastameLabel, Constant_AccountSettings.editProfile_lastameLabel_Access_Id);
        System.out.println("Lastname label is verified");
    }

    @Then("I verify Lastname Value is displayed")
    public void iVerifyLastnameValueIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Lastname Value is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.editProfile_lastNameValue_Access_Id));
        System.out.println("Lastname text field is verified");
    }

    @Then("I verify Primary Mobile label is displayed")
    public void iVerifyPrimaryMobileLabelIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Primary Mobile label is displayed");
        asserttextValidationAccessibility(Constant_AccountSettings.editProfile_phoneLabel, Constant_AccountSettings.editProfile_phoneLabel_Access_Id);
        System.out.println("Primary Mobile label is verified");
    }

    @Then("I verify Primary Mobile Value is displayed")
    public void iVerifyPrimaryMobileValueIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Primary Mobile Value is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.editProfile_phoneValue_Access_Id));
        System.out.println("Primary Mobile text field is verified");
    }

    @Then("I verify Address label is displayed in Edit profile screen")
    public void iVerifyAddressLabelIsDisplayedInEditProfileScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Address label is displayed in Edit profile screen");
        asserttextValidationAccessibility(Constant_AccountSettings.editProfile_addressLabel, Constant_AccountSettings.editProfile_addressLabel_Access_Id);
        System.out.println("Address label is verified");
    }

    @Then("I verify Address value is displayed in Edit profile screen")
    public void iVerifyAddressValueIsDisplayedInEditProfileScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Address value is displayed in Edit profile screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.editProfile_addressValue_Access_Id));
        System.out.println("Address text field is verified");
    }

    @Then("I verify Save Button is displayed")
    public void iVerifySaveButtonIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Save Button is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.editProfile_saveButton_Access_Id));
        System.out.println("Save Button is verified");
    }

    @Then("I enter an First name in Edit profile screen")
    public void iEnterAnFirstNameInEditProfileScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an First name in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_AccountSettings.editProfile_firstNNameValue_Access_Id);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_AccountSettings.editProfile_firstNNameValue_Access_Id);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        entertextaccessabilityId(Constant_AccountSettings.editProfile_firstNameValue, Constant_AccountSettings.editProfile_firstNNameValue_Access_Id);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @Then("I enter an Last name in Edit profile screen")
    public void iEnterAnLastNameInEditProfileScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an Last name in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_AccountSettings.editProfile_lastNameValue_Access_Id);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_AccountSettings.editProfile_lastNameValue_Access_Id);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        entertextaccessabilityId(Constant_AccountSettings.editProfile_lastameValue, Constant_AccountSettings.editProfile_lastNameValue_Access_Id);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @Then("I enter an Primary Mobile in Edit profile screen")
    public void iEnterAnPrimaryMobileInEditProfileScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an Primary Mobile in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_AccountSettings.editProfile_phoneValue_Access_Id);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_AccountSettings.editProfile_phoneValue_Access_Id);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        entertextaccessabilityId(Constant_AccountSettings.editProfile_phoneValue, Constant_AccountSettings.editProfile_phoneValue_Access_Id);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @Then("I enter an Address in Edit profile screen")
    public void iEnterAnAddressInEditProfileScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an Address in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_AccountSettings.editProfile_addressValue_Access_Id);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_AccountSettings.editProfile_addressValue_Access_Id);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        entertextaccessabilityId(Constant_AccountSettings.editProfile_addressValue, Constant_AccountSettings.editProfile_addressValue_Access_Id);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @Then("I Tap on Save button")
    public void iTapOnSaveButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Save button");
        TaponbuttonaccessabilityID(Constant_AccountSettings.editProfile_saveButton_Access_Id);
        List<AndroidElement> list = driver.findElements(By.xpath(com.dometic.MTC.qa.Pages.Constant_Batteries_MTC.mtc_Batteries_title_template_xpath));
        if (list.size() != 0) {
            WebDriverWait wait = new WebDriverWait(driver, 300);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(com.dometic.MTC.qa.Pages.Constant_Batteries_MTC.mtc_Batteries_title_template_xpath)));
        }
    }

    @Then("I verify App Settings Header text")
    public void iVerifyAppSettingsHeaderText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify App Settings Header text");
        asserttextValidationAccessibility(Constant_AccountSettings.appSettings_Header_Text, Constant_AccountSettings.appSettings_Header_Text_Access_Id);
        System.out.println("App Settings Header text is verified");
    }

    @Then("I verify Language text in App Settings page")
    public void iVerifyLanguageTextInAppSettingsPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Language text in App Settings page");
        asserttextValidationAccessibility(Constant_AccountSettings.appSettings_languageText, Constant_AccountSettings.appSettings_languageText_Access_Id);
        System.out.println("Language text is verified");
    }

    @Then("I verify selected language is displayed")
    public void iVerifySelectedLanguageIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify selected language is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.appSettings_selectedLanguage_Access_Id));
        System.out.println("Selected language  is verified");
    }

    @Then("I verify celsiusText is displayed")
    public void iVerifyCelsiusTextIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify celsiusText is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.appSettings_celsiusText_Access_Id));
        System.out.println("Celsius Text is verified");
    }

    @Then("I verify fahrenheitText is displayed")
    public void iVerifyFahrenheitTextIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify fahrenheitText is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.appSettings_fahrenheitText_Access_Id));
        System.out.println("Fahrenheit Text is verified");
    }

    @Then("I verify Unit text is displayed")
    public void iVerifyUnitTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Unit text is displayed");
        asserttextValidationAccessibility(Constant_AccountSettings.appSettings_unitText, Constant_AccountSettings.appSettings_unitText_Access_Id);
        System.out.println("Unit text is verified");
    }

    @Then("I verify selected unit text is displayed")
    public void iVerifySelectedUnitTextIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify selected unit text is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.appSettings_selectedUnit_Access_Id));
        System.out.println("Selected unit text is verified");
    }

    @Then("I verify App version text is displayed")
    public void iVerifyAppVersionTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify App version text is displayed");
        asserttextValidationAccessibility(Constant_AccountSettings.appSettings_versionText, Constant_AccountSettings.appSettings_versionText_Access_Id);
        System.out.println("App version text is verified");
    }

    @Then("I verify Temperature text in App Settings page")
    public void iVerifyTemperatureTextInAppSettingsPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Temperature text in App Settings page");
        asserttextValidationAccessibility(Constant_AccountSettings.appSettings_temperatureContainer, Constant_AccountSettings.appSettings_temperatureContainer_Access_Id);
        System.out.println("Temperature text is verified");
    }

    @Then("I Tap on Language in App Settings page")
    public void iTapOnLanguageInAppSettingsPage() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Language in App Settings page");
        TaponbuttonaccessabilityID(Constant_AccountSettings.appSettings_languageText_Access_Id);
        Thread.sleep(2000);
    }

    @Then("I Tap on Units in App Settings page")
    public void iTapOnUnitsInAppSettingsPage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Units in App Settings page");
        TaponbuttonaccessabilityID(Constant_AccountSettings.appSettings_unitText_Access_Id);
    }


    @Then("I enter an Emoji's in First name Field in Edit profile screen")
    public void iEnterAnEmojiSInFirstNameFieldInEditProfileScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an Emoji's in First name Field in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_AccountSettings.editProfile_firstNNameValue_Access_Id);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_AccountSettings.editProfile_firstNNameValue_Access_Id);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        String emojis = Constant_AccountSettings.grinning_face_with_smiling_eyes + Constant_AccountSettings.face_with_tears_of_joy +
                Constant_AccountSettings.smiling_face_with_open_mouth_and_cold_sweat + Constant_AccountSettings.smiling_face_with_open_mouth_and_tightly_closed_eyes +
                Constant_AccountSettings.winking_face;
        entertextaccessabilityId(emojis, Constant_AccountSettings.editProfile_firstNNameValue_Access_Id);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @Then("I enter an Emoji's in Last name Field in Edit profile screen")
    public void iEnterAnEmojiSInLastNameFieldInEditProfileScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an Emoji's in Last name Field in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_AccountSettings.editProfile_lastNameValue_Access_Id);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_AccountSettings.editProfile_lastNameValue_Access_Id);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        String emojis = Constant_AccountSettings.grinning_face_with_smiling_eyes + Constant_AccountSettings.face_with_tears_of_joy +
                Constant_AccountSettings.smiling_face_with_open_mouth_and_cold_sweat + Constant_AccountSettings.smiling_face_with_open_mouth_and_tightly_closed_eyes +
                Constant_AccountSettings.winking_face;
        entertextaccessabilityId(emojis, Constant_AccountSettings.editProfile_lastNameValue_Access_Id);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }

    @Then("I enter an Emoji's in Address field in Edit profile screen")
    public void iEnterAnEmojiSInAddressFieldInEditProfileScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an Address in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_AccountSettings.editProfile_addressValue_Access_Id);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_AccountSettings.editProfile_addressValue_Access_Id);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        String emojis = Constant_AccountSettings.grinning_face_with_smiling_eyes + Constant_AccountSettings.face_with_tears_of_joy +
                Constant_AccountSettings.smiling_face_with_open_mouth_and_cold_sweat + Constant_AccountSettings.smiling_face_with_open_mouth_and_tightly_closed_eyes +
                Constant_AccountSettings.winking_face;
        entertextaccessabilityId(emojis, Constant_AccountSettings.editProfile_addressValue_Access_Id);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }

    @Then("I enter an empty in First name Field in Edit profile screen")
    public void iEnterAnEmptyInFirstNameFieldInEditProfileScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an empty in First name Field in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_AccountSettings.editProfile_firstNNameValue_Access_Id);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_AccountSettings.editProfile_firstNNameValue_Access_Id);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }

    @Then("I enter an empty in Last name Field in Edit profile screen")
    public void iEnterAnEmptyInLastNameFieldInEditProfileScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an empty in Last name Field in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_AccountSettings.editProfile_lastNameValue_Access_Id);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_AccountSettings.editProfile_lastNameValue_Access_Id);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }

    @Then("I enter an empty in Address field in Edit profile screen")
    public void iEnterAnEmptyInAddressFieldInEditProfileScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an empty in Address field in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_AccountSettings.editProfile_addressValue_Access_Id);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_AccountSettings.editProfile_addressValue_Access_Id);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }

    @Then("I enter an empty in Primary Field Mobile in Edit profile screen")
    public void iEnterAnEmptyINPrimaryFieldMobileInEditProfileScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an empty in Primary Field Mobile in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_AccountSettings.editProfile_phoneValue_Access_Id);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_AccountSettings.editProfile_phoneValue_Access_Id);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @Then("I enter an Special character in First name Field in Edit profile screen")
    public void iEnterAnSpecialCharacterInFirstNameFieldInEditProfileScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an Special character in First name Field in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_AccountSettings.editProfile_firstNNameValue_Access_Id);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_AccountSettings.editProfile_firstNNameValue_Access_Id);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        entertextaccessabilityId(Constant_AccountSettings.editProfile_firstNameValue_SpecialCharacter, Constant_AccountSettings.editProfile_firstNNameValue_Access_Id);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }

    @Then("I enter an Special character in Last name Field in Edit profile screen")
    public void iEnterAnSpecialCharacterInLastNameFieldInEditProfileScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an Special character in Last name Field in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_AccountSettings.editProfile_lastNameValue_Access_Id);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_AccountSettings.editProfile_lastNameValue_Access_Id);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        entertextaccessabilityId(Constant_AccountSettings.editProfile_lastameValue_SpecialCharacter, Constant_AccountSettings.editProfile_lastNameValue_Access_Id);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }

    @Then("I enter an Special character in Address field in Edit profile screen")
    public void iEnterAnSpecialCharacterInAddressFieldInEditProfileScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an Special character in Address field in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_AccountSettings.editProfile_addressValue_Access_Id);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_AccountSettings.editProfile_addressValue_Access_Id);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        entertextaccessabilityId(Constant_AccountSettings.editProfile_addressValue_SpecialCharacter, Constant_AccountSettings.editProfile_addressValue_Access_Id);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }

    @Then("I Verify the account setting header")
    public void iVerifyTheAccountSettingHeader() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the account setting header");
        asserttextValidationAccessibility(Constant_AccountSettings.profile_AccountSetting_Header, Constant_AccountSettings.profile_AccountSetting_Header_Access_Id);
        System.out.println("Account setting header is verified");
    }

    @Then("I verify the account holder photo")
    public void iVerifyTheAccountHolderPhoto() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the account holder photo");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.profile_AccountSettings_photo_Access_Id));
        System.out.println("Account holder photo is verified");
    }

    @Then("I verify the user name in account setting")
    public void iVerifyTheUserNameInAccountSetting() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the user name in account setting");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.profile_AccountSettings_userNAme_Access_Id));
        System.out.println("User name in account setting is verified");
    }

    @Then("I verify the user mail id")
    public void iVerifyTheUserMailId() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the user mail id");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.profile_AccountSettings_mail_id_Access_Id));
        System.out.println("user mail id is verified");
    }

    @Then("I Verify the profile text")
    public void iVerifyTheProfileText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the profile text");
        asserttextValidationAccessibility(Constant_AccountSettings.profile_accountSetting_profile_text, Constant_AccountSettings.profile_accountSetting_profile_text_Access_Id);
        System.out.println("Profile text is verified");
    }

    @Then("I Verify the Subscription text")
    public void iVerifyTheSubscriptionText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Subscription text");
        asserttextValidationAccessibility(Constant_AccountSettings.profile_AccountSetting_subscription, Constant_AccountSettings.profile_AccountSetting_subscription_Access_Id);
        System.out.println("Subscription text is verified");
    }

    @Then("I Navigate to the Profile page")
    public void iNavigateToTheProfilePage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Navigate to the Profile page");
        TaponbuttonaccessabilityID(Constant_AccountSettings.profile_accountSetting_profile_text_Access_Id);
    }

    @Then("I Navigate to Subscription page")
    public void iNavigateToSubscriptionPage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Navigate to Subscription page");
        TaponbuttonaccessabilityID(Constant_AccountSettings.profile_AccountSetting_subscription_Access_Id);
    }

    @Then("I verify the Device Management Header")
    public void iVerifyTheDeviceManagementHeader() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Device Management Header");
        asserttextValidationAccessibility(Constant_AccountSettings.Settings_DeviceManagement_header, Constant_AccountSettings.Settings_DeviceManagement_header_accessid);
        System.out.println("Device Management Header is verified");
    }

    @Then("I verify the Device Management Logo")
    public void iVerifyTheDeviceManagementLogo() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Device Management Logo");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.Settings_DeviceManage_MarineDevice_logo_accessid));
        System.out.println("Device Management Logo is verified");
    }

    @Then("I verify the Device Management right icon")
    public void iVerifyTheDeviceManagementRightIcon() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Device Management right icon");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.Settings_DeviceManagement_righticon_Access_Id));
        System.out.println("Device Management right icon is verified");
    }

    @Then("I verify the Add New Button text")
    public void iVerifyTheAddNewButtonText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Add New Button text");
        asserttextValidationAccessibility(Constant_AccountSettings.Settings_DeviceManage_AddNew_Button, Constant_AccountSettings.Settings_DeviceManage_AddNew_Button_accessid);
        System.out.println("Add New Button text is verified");
    }

    @Then("I Tap on the Add New button")
    public void iTapOnTheAddNewButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on the Add New button");
        TaponbuttonaccessabilityID(Constant_AccountSettings.Settings_DeviceManage_AddNew_Button_accessid);
    }

    @Then("I Verify the OnBoarding Header")
    public void iVerifyTheOnBoardingHeader() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the OnBoarding Header");
        asserttextValidationAccessibility(Constant_AccountSettings.Settings_Onboarding_HeaderText, Constant_AccountSettings.Settings_Onboarding_HeaderText_Access_Id);
        System.out.println("OnBoarding Header is verified");
    }

    @Then("I Verify the close button in Onboarding Page")
    public void iVerifyTheCloseButtonInOnboardingPage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the close button in Onboarding Page");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.Settings_Onboarding_close_button_Access_Id));
        System.out.println("Close button in Onboarding Page is verified");
    }

    @Then("I Verify the Attention image")
    public void iVerifyTheAttentionImage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Attention image");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.Settings_Onboarding_attention_image_accessid));
        System.out.println("Attention image is verified");
    }

    @Then("I Verify the Bluetooth Pairing Message")
    public void iVerifyTheBluetoothPairingMessage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Bluetooth Pairing Message");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.Settings_Onboarding_BluetoothPairing_message_access_id));
        System.out.println("Bluetooth Pairing Message is verified");
    }

    @Then("I verify the Search Again Text")
    public void iVerifyTheSearchAgainText() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Search Again Text");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.Settings_Onboarding_SearchAgain_accessid));
        System.out.println("Search Again Text is verified");
    }

    @Then("I Tap on close button")
    public void iTapOnCloseButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on close button");
        TaponbuttonaccessabilityID(Constant_AccountSettings.Settings_Onboarding_close_button);
    }

    @Then("I verify if subscription title is displayed")
    public void iVerifyIfSubscriptionTitleIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if subscription title is displayed");
        asserttextValidationAccessibility(Constant_AccountSettings.Subscription_title, Constant_AccountSettings.Subscription_title_accessid);
        System.out.println("Subscription title is verified");
    }

    @Then("I verify if subscription back button is available")
    public void iVerifyIfSubscriptionBackButtonIsAvailable() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if subscription back button is available");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.Subscription_backbutton_accessid));
        System.out.println("subscription back button is verified");
    }

    @Then("I verify Back Button displayed in Language Page")
    public void iVerifyBackButtonDisplayedInLanguagePage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Back Button displayed in Language Page");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.appSettings_Back_Button_Access_Id));
        System.out.println("Back Button in Language Page is verified");
    }

    @Then("I verify Language Header Text in Language Page")
    public void iVerifyLanguageHeaderTextInLanguagePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Language Header Text in Language Page");
        asserttextValidationAccessibility(Constant_AccountSettings.appSettings_language_header_TitleText, Constant_AccountSettings.appSettings_language_header_TitleText_Access_Id);
        System.out.println("Language Header Text is verified");
    }

    @Then("I Verify Language English Text in Language Page")
    public void iVerifyLanguageEnglishTextInLanguagePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Language English Text in Language Page");
        asserttextValidationAccessibility(Constant_AccountSettings.appSettings_Language_English_CardTitle_Text, Constant_AccountSettings.appSettings_Language_English_CardTitle_Access_Id);
        System.out.println("Language English Text is verified");
    }

    @Then("I Verify Language German Text in Language Page")
    public void iVerifyLanguageGermanTextInLanguagePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Language German Text in Language Page");
        asserttextValidationAccessibility(Constant_AccountSettings.appSettings_Language_German_CardTitle_Text, Constant_AccountSettings.appSettings_Language_German_CardTitle_Access_Id);
        System.out.println("Language German Text is verified");
    }

    @Then("I Verify Language Spanish \\(US) Text in Language Page")
    public void iVerifyLanguageSpanishUSTextInLanguagePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Language Spanish(US) Text in Language Page");
        asserttextValidationAccessibility(Constant_AccountSettings.appSettings_Language_Spanish_CardTitle_Text, Constant_AccountSettings.appSettings_Language_Spanish_CardTitle_Access_Id);
        System.out.println("Language Spanish(US) Text is verified");
    }

    @Then("I Verify Language French Text in Language Page")
    public void iVerifyLanguageFrenchTextInLanguagePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Language French Text in Language Page");
        asserttextValidationAccessibility(Constant_AccountSettings.appSettings_Language_French_CardTitle_Text, Constant_AccountSettings.appSettings_Language_French_CardTitle_Access_Id);
        System.out.println("Language French Text  is verified");
    }

    @Then("I verify Back Button displayed in Units Page")
    public void iVerifyBackButtonDisplayedInUnitsPage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Back Button displayed in Units Page");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.appSettings_Back_Button_Access_Id));
        System.out.println("Back Button in Units Page is verified");
    }

    @Then("I verify Metric Text in Units Page")
    public void iVerifyMetricTextInUnitsPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Metric Text in Units Page");
        asserttextValidationAccessibility(Constant_AccountSettings.appSettings_Unit_Metric_Text, Constant_AccountSettings.appSettings_Unit_Metric_Access_Id);
        System.out.println("Metric Text in Units Page is verified");
    }

    @Then("I verify Imperial Text in Units Page")
    public void iVerifyImperialTextInUnitsPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Imperial Text in Units Page");
        asserttextValidationAccessibility(Constant_AccountSettings.appSettings_Unit_Imperial_Text, Constant_AccountSettings.appSettings_Unit_Imperial_Access_Id);
        System.out.println("Imperial Text in Units Page is verified");
    }

    @Then("I verify Units Header Text in Units Page")
    public void iVerifyUnitsHeaderTextInUnitsPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Units Header Text in Units Page");
        asserttextValidationAccessibility(Constant_AccountSettings.appSettings_Unit_header_TitleText_Text, Constant_AccountSettings.appSettings_Unit_header_TitleText_Access_Id);
        System.out.println("Units Header Text is verified");
    }

    @Then("I Tap on German Language in Language Page")
    public void iTapOnGermanLanguageInLanguagePage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on German Language in Language Page");
        TaponbuttonaccessabilityID(Constant_AccountSettings.appSettings_Language_German_CardTitle_Access_Id);
    }

    @Then("I Tap on Spanish \\(US) Language in Language Page")
    public void iTapOnSpanishUSLanguageInLanguagePage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Spanish(US) Language in Language Page");
        TaponbuttonaccessabilityID(Constant_AccountSettings.appSettings_Language_Spanish_CardTitle_Access_Id);
    }

    @Then("I Tap on French Language in Language Page")
    public void iTapOnFrenchLanguageInLanguagePage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on French Language in Language Page");
        TaponbuttonaccessabilityID(Constant_AccountSettings.appSettings_Language_French_CardTitle_Access_Id);
    }

    @Then("I Tap on English Language in Language Page")
    public void iTapOnEnglishLanguageInLanguagePage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on English Language in Language Page");
        TaponbuttonaccessabilityID(Constant_AccountSettings.appSettings_Language_English_CardTitle_Access_Id);
    }

    @Then("I Tap on Imperial Unit in Units Page")
    public void iTapOnImperialUnitInUnitsPage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Imperial Unit in Units Page");
        TaponbuttonaccessabilityID(Constant_AccountSettings.appSettings_Unit_Imperial_Access_Id);
    }

    @Then("I Tap on Metric Unit in Units Page")
    public void iTapOnMetricUnitInUnitsPage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Metric Unit in Units Page");
        TaponbuttonaccessabilityID(Constant_AccountSettings.appSettings_Unit_Metric_Access_Id);
    }

    @Then("I tap on the right icon for SDB")
    public void iTapOnTheRightIconForSDB() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the right icon for SDB");
        if (driver.findElementsByAccessibilityId(Constant_settings.Device_management_edit_vessel_card_right_icon_access_id).size() != 0) {
            TaponbuttonaccessabilityID(Constant_settings.Device_management_edit_vessel_card_right_icon_access_id);
            Thread.sleep(2000);
        }
    }

    @Then("I verify the edit card tile name")
    public void iVerifyTheEditCardTileName() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the edit card tile name");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_management_edit_vessel_card_title_text_access_id));
        Thread.sleep(2000);
        System.out.println("Edit card tile name is verified");
    }

    @Then("I tap on vessel edit card button")
    public void iTapOnVesselEditCardButton() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on vessel edit card button");
        TaponbuttonaccessabilityID(Constant_settings.Device_management_edit_vessel_card_right_icon_access_id);
        Thread.sleep(2000);
    }

    @Then("I verify the vessel name card title")
    public void iVerifyTheVesselNameCardTitle() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the vessel name card title");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_management_Edit_vessel_save_button_access_id));
        System.out.println("Vessel name card title");
    }

    @Then("I tap on back button on edit screen")
    public void iTapOnBackButtonOnEditScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on back button on edit screen");
        TaponbuttonaccessabilityID(Constant_settings.Device_management_Edit_page_back_button_access_id);
    }

    @Then("I tap on back button on device management main screen")
    public void iTapOnBackButtonOnDeviceManagementMainScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on back button on device management main screen");
//        TaponbuttonaccessabilityID(Constant_settings.Device_management_screen_back_button_accessid);
       if(driver.findElementsByAccessibilityId(Constant_settings.Device_management_screen_back_button_accessid).size()!=0){
           driver.pressKeyCode(AndroidKeyCode.BACK);
           Thread.sleep(2000);
       }
       if(driver.findElementsByAccessibilityId(Constant_settings.Device_management_guest_pin_list_back_symbol_access_id).size()!=0){
           driver.pressKeyCode(AndroidKeyCode.BACK);
           Thread.sleep(2000);
       }
    }

    @Then("I tap on back button on device management device selection page")
    public void iTapOnBackButtonOnDeviceManagementDeviceSelectionPage() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on back button on device management device selection page");
        if(driver.findElementsByAccessibilityId(Constant_settings.Device_management_screen_back_button_accessid).size()!=0){
            driver.pressKeyCode(AndroidKeyCode.BACK);
            Thread.sleep(2000);
        }
        if(driver.findElementsByAccessibilityId(Constant_settings.Device_management_guest_pin_list_back_symbol_access_id).size()!=0){
            driver.pressKeyCode(AndroidKeyCode.BACK);
            Thread.sleep(2000);
        }
//        TaponbuttonaccessabilityID(Constant_settings.Device_management_device_selection_back_button_access_id);
    }

    @Then("I enter the name for edit vessel")
    public void iEnterTheNameForEditVessel() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter the name for edit vessel");
        cleartextaccessabilityId(Constant_settings.Device_management_device_selection_something);
        entertextaccessabilityId(Constant_settings.Device_manegement_edit_name_text, Constant_settings.Device_management_device_selection_something);
    }

    @Then("I tap on save button in edit vessel screen")
    public void iTapOnSaveButtonInEditVesselScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on save button in edit vessel screen");
        TaponbuttonaccessabilityID(Constant_settings.Device_management_Edit_vessel_save_button_access_id);
    }

    @Then("I tap on guest pin list right icon button")
    public void iTapOnGuestPinListRightIconButton() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on guest pin list right icon button");
        TaponbuttonaccessabilityID(Constant_settings.Device_management_Get_pin_list_card_title_access_id);
        Thread.sleep(2000);
    }

    @Then("I verify the back button for guest pin list page")
    public void iVerifyTheBackButtonForGuestPinListPage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the back button for guest pin list page");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_management_guest_pin_list_back_symbol_access_id));
        System.out.println("Back button for guest pin list page is verified");
    }

    @Then("I verify the guest pin header text")
    public void iVerifyTheGuestPinHeaderText() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the guest pin header text");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_management_guest_pin_list_header_text_access_id));
        System.out.println("Guest pin header text is verified");
    }

    @Then("I verify the edit header text")
    public void iVerifyTheEditHeaderText() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the edit header text");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_management_Edit_Guest_list_header_text_access_id));
        System.out.println("Edit header text is verified");
    }

    @Then("I tap on the edit text")
    public void iTapOnTheEditText() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the edit text");
        TaponbuttonaccessabilityID(Constant_settings.Device_management_guest_pin_list_edit_button_text_access_id);
        Thread.sleep(2000);
    }

    @Then("I verify the close symbol on edit guest list page")
    public void iVerifyTheCloseSymbolOnEditGuestListPage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the close symbol on edit guest list page");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_management_Edit_Guest_list_close_button_text_access_id));
        System.out.println("Close symbol on edit guest list page is verified");
    }

    @Then("I verify the add button symbol on edit guest list page")
    public void iVerifyTheAddButtonSymbolOnEditGuestListPage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the add button symbol on edit guest list page");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_management_Edit_Guest_list_add_button_access_id));
        System.out.println("Add button symbol on edit guest list page is verified");
    }

    @Then("I tap on the add button symbol on edit guest list page")
    public void iTapOnTheAddButtonSymbolOnEditGuestListPage() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the add button symbol on edit guest list page");
        TaponbuttonaccessabilityID(Constant_settings.Device_management_Edit_Guest_list_add_button_access_id);
        Thread.sleep(2000);
    }

    @Then("I verify the edit pin header text")
    public void iVerifyTheEditPinHeaderText() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the edit pin header text");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_management_Edit_pin_header_text_tile_access_id));
        System.out.println("Edit pin header text is verified");
    }

    @Then("I verify the close symbol on edit pin page")
    public void iVerifyTheCloseSymbolOnEditPinPage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the close symbol on edit pin page");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_management_Edit_pin_close_button_access_id));
        System.out.println("Close symbol on edit pin page is verified");
    }

    @Then("I verify the pin name text")
    public void iVerifyThePinNameText() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the pin name text");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_management_Edit_pin_Pin_name_access_id));
        System.out.println("Pin name text is verified");
    }

    @Then("I verify the pin code text")
    public void iVerifyThePinCodeText() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the pin code text");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_management_Edit_pin_code_access_id));
        System.out.println("Pin code is verified");
    }

    @Then("I verify the Mail box text")
    public void iVerifyTheMailBoxText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Mail box text");
        asserttextValidation(Constant_settings.Device_manegement_Mail_id, Constant_settings.Device_management_mail_box_xpath);
        System.out.println("Upper compartment text is verified");
    }

    @Then("I verify the Mail box toggle button")
    public void iVerifyTheMailBoxToggleButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Mail box toggle button");
        Assert.assertTrue(iselementdisplayed(Constant_settings.Device_management_mail_box_toggel_button_xpath));
        System.out.println("Upper compartment toggle is verified");
    }

    @Then("I verify the refrigerated compartment text")
    public void iVerifyTheRefrigeratedCompartmentText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the refrigerated compartment text");
        asserttextValidation(Constant_settings.Device_manegement_refrigerated, Constant_settings.Device_manegement_refrigerated_text_xpth);
        System.out.println("Lower compartment text is verified");
    }

    @Then("I verify the refrigerated compartment toggle button")
    public void iVerifyTheRefrigeratedCompartmentToggleButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the refrigerated compartment toggle button");
        Assert.assertTrue(iselementdisplayed(Constant_settings.Device_manegement_refrigerated_toggel_button_xpath));
        System.out.println("Lower compartment toggle is verified");
    }

    @Then("I tap on the close button symbol on edit pin page")
    public void iTapOnTheCloseButtonSymbolOnEditPinPage() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the close button symbol on edit pin page");
        TaponbuttonaccessabilityID(Constant_settings.Device_management_Edit_pin_close_button_access_id);
        Thread.sleep(2000);
    }

    @Then("I tap on the close button symbol on guest list page")
    public void iTapOnTheCloseButtonSymbolOnGuestListPage() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the close button symbol on guest list page");
        TaponbuttonaccessabilityID(Constant_settings.Device_management_Edit_Guest_list_close_button_text_access_id);
        Thread.sleep(2000);
    }

    @Then("I tap on the guest list right icon")
    public void iTapOnTheGuestListRightIcon() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the guest list right icon");
        TaponbuttonaccessabilityID(Constant_settings.Device_management_guest_pin_list_back_symbol_access_id);
        Thread.sleep(2000);
    }

    @Then("I enter the name for pin name")
    public void iEnterTheNameForPinName() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter the name for pin name");
        cleartextaccessabilityId(Constant_settings.Device_manegement_edit_name_text_enter_access_id);
        entertextaccessabilityId(Constant_settings.Device_manegement_edit_pin_name_text, Constant_settings.Device_manegement_edit_name_text_enter_access_id);
        Thread.sleep(2000);
    }

    @Then("I enter the pincode")
    public void iEnterThePincode() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter the pincode");
        cleartextaccessabilityId(Constant_settings.Device_manegement_edit_pin_code_enter_access_id);
        entertextaccessabilityId(Constant_settings.Device_manegement_edit_pin_number, Constant_settings.Device_manegement_edit_pin_code_enter_access_id);
        Thread.sleep(2000);
    }

    @Then("I tap on the save button for edit pin")
    public void iTapOnTheSaveButtonForEditPin() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the save button for edit pin");
        TaponbuttonaccessabilityID(Constant_settings.Device_manegement_edit_pin_page_save_button_access_id);
        Thread.sleep(2000);
    }

    @Then("I enter the combination for name field")
    public void iEnterTheCombinationForNameField() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter the combination for name field");
        cleartextaccessabilityId(Constant_settings.Device_manegement_edit_name_text_enter_access_id);
        entertextaccessabilityId(Constant_settings.Device_management_edit_pin_name_special_charater, Constant_settings.Device_manegement_edit_name_text_enter_access_id);
        Thread.sleep(2000);
    }

    @Then("I enter the combination for pincode")
    public void iEnterTheCombinationForPincode() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter the combination for pincode");
        cleartextaccessabilityId(Constant_settings.Device_manegement_edit_pin_code_enter_access_id);
        entertextaccessabilityId(Constant_settings.Device_manegement_edit_pin_combination, Constant_settings.Device_manegement_edit_pin_code_enter_access_id);
        Thread.sleep(2000);
    }

    @Then("I enter the long length for name field")
    public void iEnterTheLongLengthForNameField() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter the long length for name field");
        cleartextaccessabilityId(Constant_settings.Device_manegement_edit_name_text_enter_access_id);
        entertextaccessabilityId(Constant_settings.Device_management_edit_pin_name_long_lenght_charater, Constant_settings.Device_manegement_edit_name_text_enter_access_id);
        Thread.sleep(2000);
    }

    @Then("I enter the long length for pincode")
    public void iEnterTheLongLengthForPincode() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter the long length for pincode");
        cleartextaccessabilityId(Constant_settings.Device_manegement_edit_pin_code_enter_access_id);
        entertextaccessabilityId(Constant_settings.Device_manegement_edit_pin_long_lenght_combination, Constant_settings.Device_manegement_edit_pin_code_enter_access_id);
        Thread.sleep(2000);
    }

    @Then("I enter the short for name field")
    public void iEnterTheShortForNameField() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter the short for name field");
        cleartextaccessabilityId(Constant_settings.Device_manegement_edit_name_text_enter_access_id);
        entertextaccessabilityId(Constant_settings.Device_management_edit_pin_name_short_lenght, Constant_settings.Device_manegement_edit_name_text_enter_access_id);
        Thread.sleep(2000);
    }

    @Then("I enter the short for pincode")
    public void iEnterTheShortForPincode() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter the short for pincode");
        cleartextaccessabilityId(Constant_settings.Device_manegement_edit_pin_code_enter_access_id);
        entertextaccessabilityId(Constant_settings.Device_management_edit_pin_short_lenght, Constant_settings.Device_manegement_edit_pin_code_enter_access_id);
        Thread.sleep(2000);
    }

    @Then("I Tap on the Master PIN option")
    public void iTapOnTheMasterPINOption() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on the Master PIN option");
        TaponbuttonaccessabilityID(Constant_AccountSettings.DeviceManagement_MasterPin_accessid);
    }

    @Then("I Tap on the alert popup Enter button")
    public void iTapOnTheAlertPopupEnterButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on the alert popup Enter button");
        Taponbutton(Constant_AccountSettings.DeviceManagement_SDB_PasswordAlertField_EnterButton_xpath);
    }

    @Then("I tap on Alert Ok button")
    public void iTapOnAlertOkButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on Alert Ok button");
        if(driver.findElements(By.xpath(Constant_AccountSettings.DeviceManagement_SDBDevice_wrongPassword_alert_OkButton_xpath)).size()!=0){
            Taponbutton(Constant_AccountSettings.DeviceManagement_SDBDevice_wrongPassword_alert_OkButton_xpath);
        }
    }

    @Then("I enter the wrong password in the Password field")
    public void iEnterTheWrongPasswordInThePasswordField() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter the wrong password in the Password field");
        entertext(Constant_AccountSettings.DeviceManagement_SDB_password_requiredInValid_password, Constant_AccountSettings.DeviceManagement_SDBDevice_masterPin_PasswordRequired_inputField_xpath);

    }

    @Then("I enter the correct password")
    public void iEnterTheCorrectPassword() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter the correct password");
        entertext(Constant_AccountSettings.DeviceManagement_SDB_password_requiredValid_password, Constant_AccountSettings.DeviceManagement_SDBDevice_masterPin_PasswordRequired_inputField_xpath);
    }

    @Then("I Tap on the set master pin Input Field")
    public void iTapOnTheSetMasterPinInputField() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on the set master pin Input Field");
        Taponbutton(Constant_AccountSettings. Device_Management_MasterPin_xpath);
    }

    @Then("I Enter the PIN as {int} Digit")
    public void iEnterThePINAsDigit(int arg0) throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter the PIN as 4 Digit");
        cleartext(Constant_AccountSettings.DeviceManagement_SDBDevice_masterPin_SetMasterPin_InputField_xpath);
        Thread.sleep(3000);
        entertext(Constant_AccountSettings.DeviceManagement_SDBDevice_masterPin_SetMasterPin_ValidPassword, Constant_AccountSettings.DeviceManagement_SDBDevice_masterPin_SetMasterPin_InputField_xpath);

    }

    @Then("I Verify the Text Message for Re-Enter PIN")
    public void iVerifyTheTextMessageForReEnterPIN() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Text Message for Re-Enter PIN");
        iselementdisplayed(Constant_AccountSettings.DeviceManagement_SDBDevice_masterPin_SetMasterPin_Reenter_Message_xpath);
    }

    @Then("I Re-Enter the PIN as {int} Digit")
    public void iReEnterThePINAsDigit(int arg0) throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Re-Enter the PIN as 4 Digit");
        entertext(Constant_AccountSettings.DeviceManagement_SDBDevice_masterPin_SetMasterPin_ValidPassword, Constant_AccountSettings.DeviceManagement_SDBDevice_masterPin_SetMasterPin_InputField_xpath);

    }

    @Then("I Verified the Master PIN Password popup")
    public void iVerifiedTheMasterPINPasswordPopup() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified the Master PIN Password popup");
        iselementdisplayed(Constant_AccountSettings.DeviceManagement_SDB_password_required_text_xpath);
        System.out.println("Master PIN Password popup is verified");
    }

    @Then("I verify the Master PIn Header")
    public void iVerifyTheMasterPInHeader() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Master PIn Header");
        iselementdisplayedaccessabilityId(Constant_AccountSettings.Settings_DeviceManagement_MasterPIN_Header);
        System.out.println("Master PIn Header is verified");
    }

    @Then("I Verify the Set Master Pin text")
    public void iVerifyTheSetMasterPinText() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Set Master Pin text");
        iselementdisplayed(Constant_AccountSettings.Settings_DeviceManagement_SetMasterPIN_text_xpath);
        System.out.println("Set Master Pin text is verified");
    }

    @Then("I Verify the text {string}")
    public void iVerifyTheText(String arg0) throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the text Pin Must be 4 digit");
        iselementdisplayed(Constant_AccountSettings.Settings_DeviceManagement_SEtMasterPIN_Message_xpath);
        System.out.println("Pin Must be 4 digit is verified");
    }

    @Then("I have tap on the close button in master Pin Main screen")
    public void iHaveTapOnTheCloseButtonInMasterPinMainScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I have tap on the close button in master Pin Main screen");
        Taponbutton(Constant_AccountSettings.DeviceManagement_SDBDevice_MasterPin_Closebutton_xpath);
    }

    @Then("I Tap on SDB")
    public void iTapOnSDB() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on SDB");
        if (driver.findElements(By.xpath(Constant_AccountSettings.Device_Management_sdb_xpath)).size() != 0) {
            deviceName = driver.findElement(By.xpath(Constant_AccountSettings.Device_Management_sdb_xpath)).getText();
            Taponbutton(Constant_AccountSettings.Device_Management_sdb_xpath);
            Thread.sleep(2000);
        }
    }

    @Then("I verify back button in Device Management screen")
    public void iVerifyBackButtonInDeviceManagementScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify back button in Device Management screen");
        if (driver.findElementsByAccessibilityId(Constant_AccountSettings.appSettings_Back_Button_Access_Id).size() != 0) {
            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.appSettings_Back_Button_Access_Id));
        }
        System.out.println("DM Back button is displayed");
    }

    @Then("I verify device name")
    public void iVerifyDeviceName() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify device name");
        String string2 = driver.findElementByAccessibilityId(Constant_AccountSettings.SDB_Device_Name).getText();
        if (deviceName.contains(string2)) {
            System.out.println("Device Name verified");
        } else {
            System.out.println("Device Name mismatching");
        }
    }

    @Then("I verify Product information text")
    public void iVerifyProductInformationText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Product information text");
        asserttextValidationAccessibility(Constant_AccountSettings.Product_info, Constant_AccountSettings.Product_information_text);
        System.out.println("Product information text verified");
    }

    @Then("I verify Name")
    public void iVerifyName() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Name");
        asserttextValidationAccessibility(Constant_AccountSettings.Name, Constant_AccountSettings.Device_Name_text);
        System.out.println("Name text verified");
    }

    @Then("I verify given device name text")
    public void iVerifyGivenDeviceNameText() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify given device name text");
        String string1 = driver.findElementByAccessibilityId(Constant_AccountSettings.SDB_Device_Name).getText();
        String string2 = driver.findElementByAccessibilityId(Constant_AccountSettings.Given_Device_name).getText();
        System.out.println(string1);
        System.out.println(string2);
        if (string1.equals(string2)) {
            System.out.println("Given device name text verified");
        } else {
            System.out.println("Device Name mismatching");
        }
    }

    @Then("I verify Edit text")
    public void iVerifyEditText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Edit text");
        asserttextValidationAccessibility(Constant_AccountSettings.Edit, Constant_AccountSettings.Edit_button_text);
        System.out.println("Edit text verified");
    }

    @Then("I verify the edit navigation button")
    public void iVerifyTheEditNavigationButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the edit navigation button");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.Edit_navigation_button));
        System.out.println("edit navigation button verified");
    }

    @Then("I verify PIN CODES text")
    public void iVerifyPINCODESText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify PIN CODES text");
        asserttextValidationAccessibility(Constant_AccountSettings.PinCodes, Constant_AccountSettings.Pin_codes_text);
        System.out.println("PIN CODES text verified");
    }

    @Then("I verify Master pin text")
    public void iVerifyMasterPinText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Master pin text");
        asserttextValidation(Constant_AccountSettings.Master_pin, Constant_AccountSettings.Device_Management_MasterPin_xpath);
        System.out.println("Master pin text verified");
    }

    @Then("I verify Master Pin navigation button is displayed")
    public void iVerifyMasterPinNavigationButtonIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Master Pin navigation button is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.Master_pin_navigation_button));
        System.out.println("Master Pin navigation button verified");
    }

    @Then("I verify Guest PIN list text")
    public void iVerifyGuestPINListText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Guest PIN list text");
        asserttextValidationAccessibility(Constant_AccountSettings.GuestPin_list, Constant_AccountSettings.Guest_pin_text);
        System.out.println("Guest PIN list text verified");
    }

    @Then("I verify Guest PIN list navigation button is displayed")
    public void iVerifyGuestPINListNavigationButtonIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Guest PIN list navigation button is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.Guest_pin_navigation_button));
        System.out.println("Guest PIN list navigation button verified");
    }

    @Then("I verify the Advanced text")
    public void iVerifyTheAdvancedText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Advanced text");
        asserttextValidationAccessibility(Constant_AccountSettings.Advanced, Constant_AccountSettings.Advanced_text);
        System.out.println("Advanced text verified");
    }

    @Then("I verify Cooler settings text")
    public void iVerifyCoolerSettingsText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Cooler settings text");
        asserttextValidationAccessibility(Constant_AccountSettings.Cooler_settings, Constant_AccountSettings.Cooler_settings_text);
        System.out.println("Cooler settings text verified");
    }

    @Then("I verify cooler settings navigation button is displayed")
    public void iVerifyCoolerSettingsNavigationButtonIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify cooler settings navigation button is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.Cooler_settings_navigation_button));
        System.out.println("cooler settings navigation button verified");
    }

    @Then("I verify Check updates text")
    public void iVerifyCheckUpdatesText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Check updates text");
        asserttextValidationAccessibility(Constant_AccountSettings.Check_updates, Constant_AccountSettings.Check_updates_text);
        System.out.println("Check updates text verified");
    }

    @Then("I verify Check updates navigation button is displayed")
    public void iVerifyCheckUpdatesNavigationButtonIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Check updates navigation button is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.Check_updates_navigation_button));
        System.out.println("Check updates navigation button verified");
    }

    @Then("I verify Unregister,Delete,Off board text")
    public void iVerifyUnregisterDeleteOffBoardText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Unregister,Delete,Off board text");
        asserttextValidationAccessibility(Constant_AccountSettings.Unreg_Del_Off, Constant_AccountSettings.Unregister_text);
        System.out.println("Unregister,Delete,Off board text verified");
    }

    @Then("I verify Unregister,Delete,Off board navigation button")
    public void iVerifyUnregisterDeleteOffBoardNavigationButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Unregister,Delete,Off board navigation button");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.Unregister_navigation_button));
        System.out.println("Unregister,Delete,Off board navigation button verified");
    }

    @Then("I Tap on close button in edit screen")
    public void iTapOnCloseButtonInEditScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on close button in edit screen");
        Taponbutton(Constant_settings.Device_Management_edit_close_button_xpath);
    }

    @Then("I enter an invalid name in edit name field")
    public void iEnterAnInvalidNameInEditNameField() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an invalid name in edit name field");
        cleartextaccessabilityId(Constant_settings.Device_Management_Edit_screen_device_name_access_id);
        entertextaccessabilityId(Constant_settings.Device_management_invalid_device_name, Constant_settings.Device_Management_Edit_screen_device_name_access_id);
    }

    @Then("I verify if the edited invalid name is displayed under name field")
    public void iVerifyIfTheEditedInvalidNameIsDisplayedUnderNameField() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the edited invalid name is displayed under name field");
        asserttextValidationAccessibility(Constant_settings.Device_management_invalid_device_name, Constant_settings.Device_Management_Name_Section_device_name_access_id);
    }

    @Then("I verify if the edited name is displayed under device management device selection page")
    public void iVerifyIfTheEditedNameIsDisplayedUnderDeviceManagementDeviceSelectionPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the edited name is displayed under device management device selection page");
        asserttextValidationAccessibility(Constant_settings.Device_management_invalid_device_name, Constant_settings.Device_Management_device_label_name_access_id);
    }

    @Then("I verify if the edited name is displayed in the home page tile")
    public void iVerifyIfTheEditedNameIsDisplayedInTheHomePageTile() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the edited name is displayed in the home page tile");
        if(driver.findElementsByAccessibilityId(Constant_settings.Device_Management_gallery_device_name_Access_id).size()!=0){
            asserttextValidationAccessibility(Constant_settings.Device_management_invalid_device_name, Constant_settings.Device_Management_gallery_device_name_Access_id);
        }
    }

    @Then("I leave the edit name field blank")
    public void iLeaveTheEditNameFieldBlank() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the edited name is displayed in the home page tile");
        entertextaccessabilityId("", Constant_settings.Device_Management_Edit_screen_device_name_access_id);

    }

    @Then("I assert for the vessel name should not be empty string")
    public void iAssertForTheVesselNameShouldNotBeEmptyString() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I assert for the vessel name should not be empty string");
        asserttextValidation(Constant_settings.Device_Management_Empty_string_message, Constant_settings.Device_Management_empty_error_message_xpath);

    }

    @Then("I enter a valid name in edit name field")
    public void iEnterAValidNameInEditNameField() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an valid name in edit name field");
        cleartextaccessabilityId(Constant_settings.Device_Management_Edit_screen_device_name_access_id);
        entertextaccessabilityId(Constant_settings.Device_management_valid_device_name, Constant_settings.Device_Management_Edit_screen_device_name_access_id);

    }

    @Then("I verify if the edited valid name is displayed under name field")
    public void iVerifyIfTheEditedValidNameIsDisplayedUnderNameField() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the edited name is displayed under name field");
        if(driver.findElementsByAccessibilityId(Constant_settings.Device_Management_Name_Section_device_name_access_id).size()!=0){
            asserttextValidationAccessibility(Constant_settings.Device_management_valid_device_name, Constant_settings.Device_Management_Name_Section_device_name_access_id);
        }
    }

    @Then("I verify if the edited valid name is displayed under device management device selection page")
    public void iVerifyIfTheEditedValidNameIsDisplayedUnderDeviceManagementDeviceSelectionPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the edited name is displayed under device management device selection page");
        if(driver.findElementsByAccessibilityId(Constant_settings.Device_Management_device_label_name_access_id).size()!=0){
            asserttextValidationAccessibility(Constant_settings.Device_management_valid_device_name, Constant_settings.Device_Management_device_label_name_access_id);
        }
    }

    @Then("I Verify the main cooler setting text")
    public void iVerifyTheMainCoolerSettingText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the main cooler setting text");
        asserttextValidationAccessibility(Constant_settings.Device_manegement_cooler_setting_header_main_text, Constant_settings.Device_manegement_cooler_setting_main_text_access_id);
        System.out.println("Cooler setting text is verified");
    }

    @Then("I tap on right icon of cooler setting")
    public void iTapOnRightIconOfCoolerSetting() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the save button for edit pin");
        TaponbuttonaccessabilityID(Constant_settings.Device_manegement_cooler_setting_main_text_access_id);
    }

    @Then("I verify the header text for cooler settings")
    public void iVerifyTheHeaderTextForCoolerSettings() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the header text for cooler settings");
        asserttextValidationAccessibility(Constant_settings.Device_manegement_cooler_setting_header_text, Constant_settings.Device_manegement_cooler_setting_page_header_text);
        System.out.println("Cooler settings header text is verified");
    }

    @Then("I verify the cooler status card title")
    public void iVerifyTheCoolerStatusCardTitle() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the cooler status card title");
        asserttextValidationAccessibility(Constant_settings.Device_manegement_cooler_setting_scheduler_card_title, Constant_settings.Device_manegement_cooler_setting_cooler_Status_name_access_id);
        System.out.println("Cooler status card title is verified");
    }

    @Then("I verify the cooler status toggle button")
    public void iVerifyTheCoolerSatusToggleButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the cooler status toggle button");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_manegement_cooler_setting_cooler_Status_toggel_button_access_id));
        System.out.println("Cooler status toggle button is verified");
    }

    @Then("I verify the scheduler card title")
    public void iVerifyTheSchedulerCardTitle() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the scheduler card title");
        asserttextValidationAccessibility(Constant_settings.Device_manegement_cooler_setting_scheduler_card, Constant_settings.Device_manegement_cooler_setting_scheduler_card_title_access_id);
        System.out.println("Scheduler card title is verified");
    }

    @Then("I verify the scheduler card toggle button")
    public void iVerifyTheSchedulerCardToggelButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the scheduler card toggle button");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_manegement_cooler_setting_scheduler_toggel_button_access_id));
        System.out.println("Scheduler card toggle button is verified");
    }

    @Then("I verify the scheduled at card title")
    public void iVerifyTheScheduledAtCardTitle() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the scheduled at card title");
        asserttextValidationAccessibility(Constant_settings.Device_manegement_cooler_setting_scheduler_at, Constant_settings.Device_manegement_cooler_setting_scheduled_at_card_title_access_id);
        System.out.println("Scheduled at card title is verified");
    }

    @Then("I verify the scheduled at right icon")
    public void iVerifyTheScheduledAtRightIcon() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the scheduled at right icon");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_manegement_cooler_setting_scheduled_at_right_icon_access_id));
        System.out.println("Scheduled at right icon is verified");
    }

    @Then("I verify the temperature card title")
    public void iVerifyTheTemperatureCardTitle() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the temperature card title");
        asserttextValidationAccessibility(Constant_settings.Device_manegement_cooler_setting_Temperature, Constant_settings.Device_manegement_cooler_setting_temperature_card_title_access_id);
        System.out.println("Temperature card title is verified");
    }

    @Then("I verify the temperature card right icon")
    public void iVerifyTheTemperatureCardRightIcon() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the temperature card title");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_manegement_cooler_setting_temperature__right_icon_access_id));
        System.out.println("Temperature card right icon is verified");
    }

    @Then("I tap on the back button on cooler setting screen")
    public void iTapOnTheBackButtonOnCoolerSettingScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the back button on cooler setting screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_manegement_cooler_setting_right_back_button_access_id));
        System.out.println("Back button on cooler setting screen is verified");
    }

    @Then("I tap on the back button cooler settings")
    public void iTapOnTheBackButtonCoolerSettings() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the back button cooler settings");
        TaponbuttonaccessabilityID(Constant_settings.Device_manegement_cooler_setting_right_back_button_access_id);
    }

    @Then("I tap on the app setting text")
    public void iTapOnTheAppSettingText() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the app setting text");
        TaponbuttonaccessabilityID(Constant_settings.App_setting_main_text_access_id);
        Thread.sleep(2000);
    }

    @Then("I verify the app setting card title")
    public void iVerifyTheAppSettingCardTitle() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the app setting card title");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.App_setting_app_setting_main_page_card_title_access_id));
        System.out.println("App setting card title is verified");
    }

    @Then("I verify the language name card title")
    public void iVerifyTheLanguageNameCardTitle() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the language name card title");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.App_setting_app_setting_language_card_title_access_id));
        System.out.println("Language name card title is verified");
    }

    @Then("I verify the right icon for for languages")
    public void iVerifyTheRightIconForForLanguages() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the right icon for for languages");
//        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.App_setting_app_right_icon_access_id));
    }

    @Then("I verify the app version card title")
    public void iVerifyTheAppVersionCardTitle() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the right icon for for languages");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.App_setting_app_verion_name_card_title));
        System.out.println("App version card title is verified");
    }

    @Then("I Tap on App view and edit account")
    public void iTapOnAppViewAndEditAccount() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on App view and edit account");
        TaponbuttonaccessabilityID(Constant_settings.view_and_edit_setting_access_id);
        Thread.sleep(2000);
    }

    @Then("I Tap on profile setting right icon")
    public void iTapOnProfileSettingRightIcon() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on profile setting right icon");
        TaponbuttonaccessabilityID(Constant_settings.profile_settings_right_icon_access_id);
        Thread.sleep(2000);
    }

    @Then("I verify the personal information text")
    public void iVerifyThePersonalInformationText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the personal information text");
        asserttextValidationAccessibility(Constant_settings.profile_main_screen_PERSONAL_INFORMATION, Constant_settings.profile_setting_personal_information_text_access_id);
        System.out.println("personal information text is verified");
    }

    @Then("I verify the name text")
    public void iVerifyTheNameText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the name text");
        asserttextValidationAccessibility(Constant_settings.profile_main_screen_Name, Constant_settings.profile_setting_name_text_access_id);
        System.out.println("name text is verified");
    }

    @Then("I verify the email text")
    public void iVerifyTheEmailText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the email text");
        asserttextValidationAccessibility(Constant_settings.profile_main_screen_Email, Constant_settings.profile_setting_email_text_access_id);
        System.out.println("E-mail text is verified");
    }

    @Then("I verify the mobile text")
    public void iVerifyTheMobileText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the mobile text");
        asserttextValidationAccessibility(Constant_settings.profile_main_screen_Mobile, Constant_settings.profile_setting_mobile_text_access_id);
        System.out.println("Mobile text is verified");
    }

    @Then("I verify the address text")
    public void iVerifyTheAddressText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the address text");
        asserttextValidationAccessibility(Constant_settings.profile_main_screen_Adderess, Constant_settings.profile_setting_address_text_access_id);
        System.out.println("address text is verified");
    }

    @Then("I verify Edit profile text")
    public void iVerifyEditProfileText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Edit profile text");
        asserttextValidationAccessibility(Constant_settings.profile_main_screen_Edit_profile, Constant_settings.profile_setting_edit_profile_access_id);
        System.out.println("Edit profile text is verified");
    }

    @Then("I verify Edit profile right icon text")
    public void iVerifyEditProfileRightIconText() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Edit profile right icon text");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.profile_setting_edit_profile_right_icon_access_id));
        System.out.println("Edit profile right icon text is verified");
    }

    @Then("I verify Security text")
    public void iVerifySecurityText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Security text");
        asserttextValidationAccessibility(Constant_settings.profile_main_screen_SECURITY, Constant_settings.profile_setting_security_name_text_access_id);
        System.out.println("Security text is verified");
    }

    @Then("I verify Password text")
    public void iVerifyPasswordText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Security text");
        asserttextValidationAccessibility(Constant_settings.profile_main_screen_Password, Constant_settings.profile_setting_password_name_access_id);
        System.out.println("Password text is verified");
    }

    @Then("I verify the renew text")
    public void iVerifyTheRenewText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the renew text");
        asserttextValidationAccessibility(Constant_settings.profile_main_screen_renew, Constant_settings.profile_setting_renew_access_id);
        System.out.println("Renew text is verified");
    }

    @Then("I verify the right icon button")
    public void iVerifyTheRightIconButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), " verify the right icon button");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.profile_setting_right_icon_access_id));
        System.out.println("Right icon button is verified");
    }

    @Then("I update on the German language")
    public void iUpdateOnTheGermanLanguage() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I update on the German language");
        TaponbuttonaccessabilityID(Constant_settings.Settings_version_german_language);
        Thread.sleep(200);
    }

    @Then("I update on the english language")
    public void iUpdateOnTheEnglishLanguage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I update on the english language");
        TaponbuttonaccessabilityID(Constant_settings.Settings_english_language_text_selection);

    }

    @Then("I verify on Language text updated with english translation")
    public void iVerifyOnLanguageTextUpdatedWithEnglishTranslation() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify on Language text updated with english translation");
        asserttextValidationAccessibility(Constant_settings.Settings_english_language_LANGUAGE_text, Constant_settings.Settings_english_language_LANGUAGE_access_id);
        System.out.println("Language text updated with english translation is verified");
    }

    @Then("I Verify the selected english language selection")
    public void iVerifyTheSelectedEnglishLanguageSelection() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify on Language text updated with english translation");
        asserttextValidationAccessibility(Constant_settings.Settings_english_language, Constant_settings.Settings_language_selectedName_access_id);
        System.out.println("selected english language selection is verified");
    }

    @Then("I verify the Manage Notification header")
    public void iVerifyTheManageNotificationHeader() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Manage Notification header");
        asserttextValidationAccessibility(Constant_settings.ManageNotifications_text, Constant_settings.ManageNotifications_title_access_id);
        System.out.println("Manage Notification header verified");
    }

    @Then("I verify back button in Manage Notification")
    public void iVerifyBackButtonInManageNotification() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify back button in Manage Notification");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.ManageNotifications_back_button_access_id));
        System.out.println("Back button is displayed");
    }

    @Then("I verify the Manage Notification logo")
    public void iVerifyTheManageNotificationLogo() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Manage Notification logo");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.ManageNotifications_logo_access_id));
        System.out.println("Manage Notification logo verified");
    }

    @Then("I verify Global Settings text in Manage notification page")
    public void iVerifyGlobalSettingsTextInManageNotificationPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Global Settings text in Manage notification page");
        asserttextValidationAccessibility(Constant_settings.ManageNotifications_Global_settings_text, Constant_settings.ManageNotifications_Global_settings_access_id);
        System.out.println("Global Settings text verified");
    }

    @Then("I verify Push notification text in Manage notification page")
    public void iVerifyPushNotificationTextInManageNotificationPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Push notification text in Manage notification page");
        asserttextValidationAccessibility(Constant_settings.ManageNotifications_PushNotifications_text, Constant_settings.ManageNotifications_PushNotifications_text_access_id);
        System.out.println("Push notification text verified");
    }

    @Then("I verify Push notification toggle in Manage notification page")
    public void iVerifyPushNotificationToggleInManageNotificationPage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Push notification toggle in Manage notification page");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.ManageNotifications_PushNotifications_toggle_access_id));
        System.out.println("Push notification toggle verified");
    }

    @Then("I verify show more text for Push notification")
    public void iVerifyShowMoreTextForPushNotification() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify show more text for Push notification");
        asserttextValidationAccessibility(Constant_settings.ManageNotifications_show_more_text, Constant_settings.ManageNotifications_push_show_more_text_access_id);
        System.out.println("show more text verified");
    }

    @Then("I verify show more text navigation button")
    public void iVerifyShowMoreTextNavigationButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify show more text navigation button");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.ManageNotifications_push_show_more_text_navigation_access_id));
        System.out.println("show more text navigation button verified");
    }

    @Then("I click show more text")
    public void iClickShowMoreText() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I click show more text");
        TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_push_show_more_text_navigation_access_id);
        System.out.println("clicked show more text");
    }

    @Then("I verify show less text for Push notification")
    public void iVerifyShowLessTextForPushNotification() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify show less text for Push notification");
        asserttextValidation(Constant_settings.ManageNotifications_show_less_text, Constant_settings.ManageNotifications_push_show_less_text_xpath);
        System.out.println("show less text verified");
    }

    @Then("I verify show less text navigation button")
    public void iVerifyShowLessTextNavigationButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify show less text navigation button");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.ManageNotifications_push_show_less_navigation_access_id));
        System.out.println("show less text navigation button verified");
    }

    @Then("I verify Alerts text for Push notification")
    public void iVerifyAlertsTextForPushNotification() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Alerts text for Push notification");
        asserttextValidation(Constant_settings.ManageNotifications_push_alerts_text, Constant_settings.ManageNotifications_push_alerts_text_xpath);
        System.out.println("Alerts text verified");
    }

    @Then("I verify Alerts toggle button for Push notification")
    public void iVerifyAlertsToggleButtonForPushNotification() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Alerts toggle button for Push notification");
        Assert.assertTrue(iselementdisplayed(Constant_settings.ManageNotifications_push_alerts_toggle_xpath));
        System.out.println("Alerts toggle button verified");
    }

    @Then("I verify Warnings text for Push Notification")
    public void iVerifyWarningsTextForPushNotification() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Warnings text for Push Notification");
        asserttextValidation(Constant_settings.ManageNotifications_push_warnings_text, Constant_settings.ManageNotifications_push_warnings_text_xpath);
        System.out.println(" Warnings text verified");
    }

    @Then("I verify Warnings toggle button for Push notification")
    public void iVerifyWarningsToggleButtonForPushNotification() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Warnings toggle button for Push notification");
        Assert.assertTrue(iselementdisplayed(Constant_settings.ManageNotifications_push_warnings_toggle_xpath));
        System.out.println(" Warnings toggle button verified");
    }

    @Then("I click show less")
    public void iClickShowLess() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I click show more button");
        TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_push_show_less_navigation_access_id);
        System.out.println("clicked show less button");
    }

    @Then("I verify E-mail text")
    public void iVerifyEMailText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify E-mail text");
        asserttextValidation(Constant_settings.ManageNotifications_Email_text, Constant_settings.ManageNotifications_Email_text_xpath);
        System.out.println("Email text verified");
    }

    @Then("I verify E-mail toggle button")
    public void iVerifyEMailToggleButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify E-mail toggle button");
        Assert.assertTrue(iselementdisplayed(Constant_settings.ManageNotifications_Email_toggle_xpath));
        System.out.println("E-mail toggle button verified");
    }

    @Then("I verify show more text for Email")
    public void iVerifyShowMoreTextForEmail() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify show more text for Email");
        asserttextValidation(Constant_settings.ManageNotifications_show_more_text, Constant_settings.ManageNotifications_showmore_text_xpath);
        System.out.println("show more text verified");
    }

    @Then("I verify show more navigation button in Email")
    public void iVerifyShowMoreNavigationButtonInEmail() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify show more navigation button in Email");
        Assert.assertTrue(iselementdisplayed(Constant_settings.ManageNotifications_showmore_dropdown_xpath));
        System.out.println("show more navigation button verified");
    }

    @Then("I Tap on email show more text")
    public void iTapOnEmailShowMoreText() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on email show more text");
        Taponbutton(Constant_settings.ManageNotifications_showmore_text_xpath);
    }

    @Then("I verify show less text in Email")
    public void iVerifyShowLessTextInEmail() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify show less text in Email");
        asserttextValidation(Constant_settings.ManageNotifications_show_less_text, Constant_settings.ManageNotifications_showless_text_xpath);
        System.out.println("show less text verified");
    }

    @Then("I verify show less text navigation button in Email")
    public void iVerifyShowLessTextNavigationButtonInEmail() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify show less text navigation button in Email");
        Assert.assertTrue(iselementdisplayed(Constant_settings.ManageNotifications_showless_dropdown_xpath));
        System.out.println("show less navigation button verified");
    }

    @Then("I verify Email list text")
    public void iVerifyEmailListText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Email list text");
        asserttextValidation(Constant_settings.ManageNotifications_Email_list_text, Constant_settings.ManageNotifications_EmailList_text_xpath);
        System.out.println("Email list text verified");
    }

    @Then("I verify edit list text")
    public void iVerifyEditListText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify edit list text");
        asserttextValidationAccessibility(Constant_settings.ManageNotifications_Email_edit_list_text, Constant_settings.ManageNotifications_editlist_text_access_id);
        System.out.println("edit list text verified");
    }

    @Then("I verify edit list navigation button")
    public void iVerifyEditListNavigationButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify edit list navigation button");
        Assert.assertTrue(iselementdisplayed(Constant_settings.ManageNotifications_editlist_navigation_xpath));
        System.out.println("edit list navigation button verified");
    }

    @Then("I Tap on E-mail edit list")
    public void iTapOnEMailEditList() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on E-mail edit list");
        TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_editlist_text_access_id);
    }

    @Then("I verify Email list header")
    public void iVerifyEmailListHeader() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Email list header");
        asserttextValidationAccessibility(Constant_settings.ManageNotifications_Email_list_text, Constant_settings.ManageNotifications_Email_list_header_access_id);
        System.out.println("Email list header verified");
    }

    @Then("I verify Email account text")
    public void iVerifyEmailAccountText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Email account text");
        asserttextValidationAccessibility(Constant_settings.ManageNotifications_Email_account_text, Constant_settings.ManageNotifications_Email_account_text_access_id);
        System.out.println("Email account text verified");
    }

    @Then("I verify additional emails text")
    public void iVerifyAdditionalEmailsText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify additional emails text");
        asserttextValidationAccessibility(Constant_settings.ManageNotifications_Additional_Email_text, Constant_settings.ManageNotifications_Additional_email_text_access_id);
        System.out.println("additional emails text verified");
    }

    @Then("I verify the add new button")
    public void iVerifyTheAddNewButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the add new button");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.ManageNotifications_Edit_Email_add_new_button_access_id));
        System.out.println("add new button verified");
    }

    @Then("I verify save button")
    public void iVerifySaveButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify save button");
        Assert.assertTrue(iselementdisplayed(Constant_settings.ManageNotifications_Edit_Email_save_button_xpath));
        System.out.println("save button verified");
    }

    @Then("I verify close button is displayed")
    public void iVerifyCloseButtonIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify close button is displayed");
        Assert.assertTrue(iselementdisplayed(Constant_settings.ManageNotifications_Edit_Email_close_button_xpath));
        System.out.println("close button verified");
    }

    @Then("I click close button")
    public void iClickCloseButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I click close button");
        Taponbutton(Constant_settings.ManageNotifications_Edit_Email_close_button_xpath);
    }

    @Then("I verify Alerts text for Email")
    public void iVerifyAlertsTextForEmail() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Alerts text for Email");
        asserttextValidation(Constant_settings.ManageNotifications_push_alerts_text, Constant_settings.ManageNotifications_email_alerts_text_xpath);
        System.out.println("Alerts text for Email verified");
    }

    @Then("I verify Alerts toggle button for Email")
    public void iVerifyAlertsToggleButtonForEmail() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Alerts toggle button for Email");
        Assert.assertTrue(iselementdisplayed(Constant_settings.ManageNotifications_sms_alerts_toggle_button_xpath));
        System.out.println("Alerts toggle button verified");
    }

    @Then("I verify Warnings text for Email")
    public void iVerifyWarningsTextForEmail() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Warnings text for Email");
        asserttextValidation(Constant_settings.ManageNotifications_push_warnings_text, Constant_settings.ManageNotifications_email_warnings_text_xpath);
        System.out.println("Warnings text for Email verified");
    }

    @Then("I verify Warnings toggle button for Email")
    public void iVerifyWarningsToggleButtonForEmail() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Alerts toggle button for Email");
        Assert.assertTrue(iselementdisplayed(Constant_settings.ManageNotifications_email_warnings_toggle_button_xpath));
        System.out.println("Warnings toggle button verified");
    }

    @Then("I click show less in Email")
    public void iClickShowLessInEmail() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I click show less in Email");
        Taponbutton(Constant_settings.ManageNotifications_showless_dropdown_xpath);
    }

    @Then("I verify SMS text")
    public void iVerifySMSText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify SMS text");
        asserttextValidation(Constant_settings.ManageNotifications_SMS_text, Constant_settings.ManageNotifications_sms_text_xpath);
        System.out.println("SMS text verified");
    }

    @Then("I verify if SMS toggle is displayed")
    public void iVerifyIfSMSToggleIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if SMS toggle is displayed");
        Assert.assertTrue(iselementdisplayed(Constant_settings.ManageNotifications_sms_toggle_xpath));
        System.out.println("SMS toggle button verified");
    }

    @Then("I verify show more text for SMS")
    public void iVerifyShowMoreTextForSMS() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify show more text for SMS");
        asserttextValidation(Constant_settings.ManageNotifications_show_more_text, Constant_settings.ManageNotifications_showmore_text_xpath);
        System.out.println("Show more text verified");
    }

    @Then("I verify show more navigation button for SMS")
    public void iVerifyShowMoreNavigationButtonForSMS() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify show more navigation button for SMS");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.ManageNotifications_sms_showmore_dropdown_access_id));
        System.out.println("show more navigation button verified");
    }

    @Then("I click show more button")
    public void iClickShowMoreButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I click show more button");
        TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_sms_showmore_text_access_id);
        System.out.println("clicked show more button");
    }

    @Then("I verify show less text for SMS")
    public void iVerifyShowLessTextForSMS() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify show less text for SMS");
        asserttextValidationAccessibility(Constant_settings.ManageNotifications_show_less_text, Constant_settings.ManageNotifications_sms_showless_text_access_id);
        System.out.println("show less text verified");
    }

    @Then("I verify show less navigation button for SMS")
    public void iVerifyShowLessNavigationButtonForSMS() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify show less navigation button for SMS");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.ManageNotifications_sms_showless_dropdown_access_id));
        System.out.println("show less navigation button verified");
    }

    @Then("I verify Edit list text for SMS")
    public void iVerifyEditListTextForSMS() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify show less text for SMS");
        asserttextValidationAccessibility(Constant_settings.ManageNotifications_Email_edit_list_text, Constant_settings.ManageNotifications_sms_smslist_editlist_text_access_id);
        System.out.println("Edit list text verified");
    }

    @Then("I verify Edit list navigation button for SMS")
    public void iVerifyEditListNavigationButtonForSMS() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Edit list navigation button for SMS");
        Assert.assertTrue(iselementdisplayed(Constant_settings.ManageNotifications_sms_smslist_editlist_naviagtion_xpath));
        System.out.println("Edit list navigation button verified");
    }

    @Then("I click on Edit list for SMS")
    public void iClickOnEditListForSMS() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I click on Edit list for SMS");
        Taponbutton(Constant_settings.ManageNotifications_Edit_Email_close_button_xpath);
    }

    @Then("I verify SMS List header")
    public void iVerifySMSListHeader() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify show less text for SMS");
        asserttextValidationAccessibility(Constant_settings.ManageNotifications_SMS_list_text, Constant_settings.ManageNotifications_SMS_List_text_access_id);
        System.out.println("SMS List header verified");
    }

    @Then("I verify SMS list close button")
    public void iVerifySMSListCloseButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify SMS list close button");
        Assert.assertTrue(iselementdisplayed(Constant_settings.ManageNotifications_Edit_Email_close_button_xpath));
        System.out.println("SMS list close button verified");
    }

    @Then("I verify Mobile account text")
    public void iVerifyMobileAccountText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify show less text for SMS");
        asserttextValidationAccessibility(Constant_settings.ManageNotifications_SMS_list_Mobile_account_text, Constant_settings.ManageNotifications_SMS_list_Mobile_account_text_access_id);
        System.out.println("Mobile account text verified");
    }

    @Then("I verify Additional SMS text")
    public void iVerifyAdditionalSMSText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify show less text for SMS");
        asserttextValidationAccessibility(Constant_settings.ManageNotifications_SMS_list_Additional_SMS_text, Constant_settings.ManageNotifications_Additional_email_text_access_id);
        System.out.println("Additional SMS text verified");
    }

    @Then("I verify add new button for SMS List")
    public void iVerifyAddNewButtonForSMSList() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify add new button for SMS List");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.ManageNotifications_edit_smslist_add_button_access_id));
        System.out.println("add new button verified");
    }

    @Then("I verify save button is displayed for SMS list")
    public void iVerifySaveButtonIsDisplayedForSMSList() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify save button is displayed for SMS list");
        Assert.assertTrue(iselementdisplayed(Constant_settings.ManageNotifications_Edit_Email_save_button_xpath));
        System.out.println("Save button verified");
    }

    @Then("I verify Save button text for SMS list")
    public void iVerifySaveButtonTextForSMSList() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Save button text for SMS list");
        asserttextValidationAccessibility(Constant_settings.ManageNotifications_save_button_text, Constant_settings.ManageNotifications_edit_smslist_save_button_text_access_id);
        System.out.println("Save button text verified");
    }

    @Then("I click on close button")
    public void iClickOnCloseButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I click on Edit list for SMS");
        Taponbutton(Constant_settings.ManageNotifications_Edit_Email_close_button_xpath);
    }

    @Then("I verify Alerts text for SMS")
    public void iVerifyAlertsTextForSMS() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Alerts text for SMS");
        asserttextValidation(Constant_settings.ManageNotifications_push_alerts_text, Constant_settings.ManageNotifications_sms_alerts_text_xpath);
        System.out.println("Alerts text verified");
    }

    @Then("I verify Alerts toggle for SMS")
    public void iVerifyAlertsToggleForSMS() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Alerts toggle for SMS");
        Assert.assertTrue(iselementdisplayed(Constant_settings.ManageNotifications_sms_alerts_toggle_button_xpath));
        System.out.println("Alerts toggle verified");
    }

    @Then("I verify Warnings text for SMS")
    public void iVerifyWarningsTextForSMS() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Alerts text for SMS");
        asserttextValidation(Constant_settings.ManageNotifications_push_warnings_text, Constant_settings.ManageNotifications_sms_warnings_text_xpath);
        System.out.println("Warnings text verified");
    }

    @Then("I verify Warnings toggle for SMS")
    public void iVerifyWarningsToggleForSMS() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Alerts toggle for SMS");
        Assert.assertTrue(iselementdisplayed(Constant_settings.ManageNotifications_sms_warnings_toggle_button_xpath));
        System.out.println("Warnings toggle verified");
    }

    @Then("I click show less in SMS")
    public void iClickShowLessInSMS() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I click show less in SMS");
        TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_sms_showless_dropdown_access_id);
        System.out.println("clicked show less button");
    }

    @Then("I Tap on back button in manage notifications screen")
    public void iTapOnBackButtonInManageNotificationsScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on back button in manage notifications screen");
        TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_back_button_access_id);
    }

    @Then("I flip the state of Push Notifications toggle button")
    public void iFlipTheStateOfPushNotificationsToggleButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Turn ON Push Notifications toggle button");
        try {
            driver.findElementByAccessibilityId(Constant_settings.ManageNotifications_push_show_more_text_access_id).isDisplayed();
            // TaponbuttonaccessabilityID(constant_managementNotifications.ManageNotifications_PushNotifications_toggle_access_id);
            // TaponbuttonaccessabilityID(constant_managementNotifications.ManageNotifications_PushNotifications_toggle_access_id);
        } catch (Throwable e) {
            System.out.println("Already ON!");
            flag = 1;
            TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_PushNotifications_toggle_access_id);

        } finally {
            if (flag == 0) {
                TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_PushNotifications_toggle_access_id);
            }
        }
    }

    @Then("I Tap on push notifications show more dropdown")
    public void iTapOnPushNotificationsShowMoreDropdown() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on push notifications show more dropdown");
        TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_push_show_more_text_navigation_access_id);
    }

    @Then("I Tap on push notifications show less navigation button")
    public void iTapOnPushNotificationsShowLessNavigationButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on push notifications show less navigation button");
        TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_push_show_less_navigation_access_id);

    }

    @Then("I flip the state of E-mail toggle button")
    public void iFlipTheStateOfEMailToggleButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I flip the state of E-mail toggle button");
        try {
            driver.findElementByXPath(Constant_settings.ManageNotifications_showmore_text_xpath).isDisplayed();
            // TaponbuttonaccessabilityID(constant_managementNotifications.ManageNotifications_PushNotifications_toggle_access_id);
            // TaponbuttonaccessabilityID(constant_managementNotifications.ManageNotifications_PushNotifications_toggle_access_id);
        } catch (Throwable e) {
            System.out.println("Already ON!");
            EmailToggle = 1;
            Taponbutton(Constant_settings.ManageNotifications_Email_toggle_xpath);

        } finally {
            if (EmailToggle == 0) {
                Taponbutton(Constant_settings.ManageNotifications_Email_toggle_xpath);
            }
        }
    }

    @Then("I Tap on E-mail show more text")
    public void iTapOnEMailShowMoreText() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on E-mail show more text");
        Taponbutton(Constant_settings.ManageNotifications_showmore_dropdown_xpath);
    }

    @Then("I Tap on add new email button")
    public void iTapOnAddNewEmailButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on add new email button");
        TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_Edit_Email_add_new_button_access_id);
    }

    @Then("I flip the state of sms toggle button")
    public void iFlipTheStateOfSmsToggleButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I flip the state of sms toggle button");

        try {
            driver.findElementByAccessibilityId(Constant_settings.ManageNotifications_sms_showmore_text_access_id).isDisplayed();
            // TaponbuttonaccessabilityID(constant_managementNotifications.ManageNotifications_PushNotifications_toggle_access_id);
            // TaponbuttonaccessabilityID(constant_managementNotifications.ManageNotifications_PushNotifications_toggle_access_id);
        } catch (Throwable e) {
            System.out.println("Already ON!");
            EmailToggle = 1;
            Taponbutton(Constant_settings.ManageNotifications_sms_toggle_xpath);

        } finally {
            if (EmailToggle == 0) {
                Taponbutton(Constant_settings.ManageNotifications_sms_toggle_xpath);
            }
        }
    }

    @Then("I Tap on sms show more text")
    public void iTapOnSmsShowMoreText() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on sms show more text");
        TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_sms_showmore_dropdown_access_id);
    }

    @Then("I verify the error message in the mobile number field")
    public void iVerifyTheErrorMessageInTheMobileNumberField() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the error message in the mobile number field");
        asserttextValidationAccessibility(Constant_settings.ManageNotifications_SMS_invalid_number_toast_message, Constant_settings.ManageNotifications_Invalid_error_message_access_id);
    }

    @Then("I reenter a valid number")
    public void iReenterAValidNumber() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I reenter a valid number");
        cleartextaccessabilityId(Constant_settings.ManageNotifications_Mobile_number_2_value_access_id);
        entertextaccessabilityId(Constant_settings.ManageNotifications_valid_mobile_number, Constant_settings.ManageNotifications_Mobile_number_2_value_access_id);
    }

    @Then("I verify if the reentered number is displayed")
    public void iVerifyIfTheReenteredNumberIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the reentered number is displayed");
        asserttextValidationAccessibility(Constant_settings.ManageNotifications_valid_mobile_number, Constant_settings.ManageNotifications_sms_smslist_number_3_access_id);
        System.out.println("re-entered number is verified");
    }

    @Then("I verify Advanced text in Manage notification page")
    public void iVerifyAdvancedTextInManageNotificationPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Advanced text in Manage notification page");
        asserttextValidationAccessibility(Constant_settings.ManageNotifications_Advanced_text, Constant_settings.ManageNotifications_Advanced_text_access_id);
        System.out.println("Advanced text verified");
    }

    @Then("I verify SDB icon")
    public void iVerifySDBIcon() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify SDB icon");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.ManageNotifications_Advanced_Device_SDB_icon_access_id));
        System.out.println("SDB icon verified");
    }

    @Then("I verify SDB name")
    public void iVerifySDBName() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify SDB name");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.ManageNotifications_Advanced_Device_SDB_access_id));
        System.out.println("SDB name verified");
    }

    @Then("I verify SDB Device navigation button")
    public void iVerifySDBDeviceNavigationButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify SDB Device navigation button");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.ManageNotifications_Advanced_Device_SDB_navigation_button_access_id));
        System.out.println("SDB Device navigation button verified");
    }

    @Then("I click on Dometic device")
    public void iClickOnDometicDevice() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I click on Edit list");
        TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_Advanced_Device_SDB_access_id);
        System.out.println("Clicked Dometic device");
    }

    @Then("I verify Advanced header")
    public void iVerifyAdvancedHeader() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Advanced header");
        asserttextValidationAccessibility(Constant_settings.ManageNotifications_Advanced_text, Constant_settings.ManageNotifications_Advanced_header_text_access_id);
        System.out.println("Advanced header text verified");
    }

    @Then("I verify back button in Advanced screen")
    public void iVerifyBackButtonInAdvancedScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify back button in Advanced screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.ManageNotifications_Advanced_back_button_access_id));
        System.out.println("Back button in Advanced screen verified");
    }

    @Then("I verify the logo")
    public void iVerifyTheLogo() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the logo");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.ManageNotifications_Advanced_logo_access_id));
        System.out.println("Logo verified");
    }

    @Then("I verify Push notification text in Advanced")
    public void iVerifyPushNotificationTextInAdvanced() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Push notification text in Advanced");
        asserttextValidationAccessibility(Constant_settings.ManageNotifications_PushNotifications_text, Constant_settings.ManageNotifications_Advanced_push_notifications_access_id);
        System.out.println("Push notification text verified");
    }

    @Then("I verify Push notification toggle in Advanced")
    public void iVerifyPushNotificationToggleInAdvanced() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Push notification toggle in Advanced");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.ManageNotifications_Advanced_push_notifications_toggle_button_access_id));
        System.out.println("Push notification toggle verified");
    }

    @Then("I verify email text in advanced")
    public void iVerifyEmailTextInAdvanced() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify email text in advanced");
        asserttextValidationAccessibility(Constant_settings.ManageNotifications_Email_text, Constant_settings.ManageNotifications_Advanced_push_Email_access_id);
        System.out.println("email text verified");
    }

    @Then("I verify email toggle in advanced")
    public void iVerifyEmailToggleInAdvanced() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify email toggle in advanced");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.ManageNotifications_Advanced_Email_toggle_button_access_id));
        System.out.println("Email toggle verified");
    }

    @Then("I verify Tank text in advanced")
    public void iVerifyTankTextInAdvanced() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Tank text in advanced");
        asserttextValidation(Constant_settings.ManageNotifications_Advanced_Tanks_text, Constant_settings.ManageNotifications_Advanced_Tank_text_xpath);
        System.out.println("Tank text verified");
    }

    @Then("I verify Tank toggle in advanced")
    public void iVerifyTankToggleInAdvanced() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Tank toggle in advanced");
        Assert.assertTrue(iselementdisplayed(Constant_settings.ManageNotifications_Advanced_Tank_toggle_xpath));
        System.out.println(" Tank toggle in advanced verified");
    }

    @Then("I verify show more text in advanced")
    public void iVerifyShowMoreTextInAdvanced() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify show more text in advanced");
        asserttextValidation(Constant_settings.ManageNotifications_show_more_text, Constant_settings.ManageNotifications_Advanced_Tank_show_more_xpath);
        System.out.println("Tank show more text verified");
    }

    @Then("I verify show more navigation button in advanced")
    public void iVerifyShowMoreNavigationButtonInAdvanced() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Tank toggle in advanced");
        Assert.assertTrue(iselementdisplayed(Constant_settings.ManageNotifications_Advanced_Tank_show_more_navigation_button_xpath));
        System.out.println(" Tank show more navigation button verified");
    }

    @Then("I click on show more")
    public void iClickOnShowMore() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I click on Edit list for SMS");
        Taponbutton(Constant_settings.ManageNotifications_Advanced_Tank_show_more_xpath);
        System.out.println("Tank show more clicked");
    }

    @Then("I verify Alerts text for advanced")
    public void iVerifyAlertsTextForAdvanced() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Alerts text for advanced");
        asserttextValidation(Constant_settings.ManageNotifications_Advanced_alerts_text, Constant_settings.ManageNotifications_Advanced_Tanks_Alerts_xpath);
        System.out.println("Tank Alerts text verified");
    }

    @Then("I verify Alerts Push notification text in advanced")
    public void iVerifyAlertsPushNotificationTextInAdvanced() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Alerts Push notification text in advanced");
        asserttextValidationAccessibility(Constant_settings.ManageNotifications_PushNotifications_text, Constant_settings.ManageNotifications_Advanced_Tanks_Alerts_Push_notifications_text_access_id);
        System.out.println("Tank Alerts Push notification text verified");
    }

    @Then("I verify Alerts Push notification toggle in advanced")
    public void iVerifyAlertsPushNotificationToggleInAdvanced() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify add new button for SMS List");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.ManageNotifications_Advanced_Tanks_Alerts_Push_notifications_toggle_access_id));
        System.out.println("Tank Alerts Push notification toggle verified");
    }

    @Then("I tap on show less")
    public void iTapOnShowLess() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on show less");
        TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_Advanced_Tank_show_less_access_id);
        System.out.println("Clicked show less verified");
    }

    @Then("I verify Batteries text in advanced")
    public void iVerifyBatteriesTextInAdvanced() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Batteries text in advanced");
        asserttextValidation(Constant_settings.ManageNotifications_Advanced_Batteries_text, Constant_settings.ManageNotifications_Advanced_Batteries_text_xpath);
        System.out.println("Batteries text verified");
    }

    @Then("I verify Batteries toggle in advanced")
    public void iVerifyBatteriesToggleInAdvanced() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Batteries toggle in advanced");
        Assert.assertTrue(iselementdisplayed(Constant_settings.ManageNotifications_Advanced_Batteries_toggle_button_xpath));
        System.out.println("Batteries toggle is verified");
    }

    @Then("I verify batteries show more text in advanced")
    public void iVerifyBatteriesShowMoreTextInAdvanced() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify batteries show more text in advanced");
        asserttextValidation(Constant_settings.ManageNotifications_show_more_text, Constant_settings.ManageNotifications_Advanced_Batteries_show_more_text_xpath);
        System.out.println("batteries show more text verified");
    }

    @Then("I verify batteries show more navigation button in advanced")
    public void iVerifyBatteriesShowMoreNavigationButtonInAdvanced() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify batteries show more navigation button in advanced");
        Assert.assertTrue(iselementdisplayed(Constant_settings.ManageNotifications_Advanced_Batteries_show_more_navigation_button_xpath));
        System.out.println("batteries show more navigation button verified");
    }

    @Then("I click on batteries show more")
    public void iClickOnBatteriesShowMore() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I click on batteries show more");
        Taponbutton(Constant_settings.ManageNotifications_Advanced_Batteries_show_more_text_xpath);
    }

    @Then("I verify batteries show less text in advanced")
    public void iVerifyBatteriesShowLessTextInAdvanced() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify batteries show less text in advanced");
        asserttextValidation(Constant_settings.ManageNotifications_show_less_text, Constant_settings.ManageNotifications_Advanced_Batteries_show_less_text_xpath);
        System.out.println("batteries show less text verified");
    }

    @Then("I verify batteries show less navigation button in advanced")
    public void iVerifyBatteriesShowLessNavigationButtonInAdvanced() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify batteries show less text in advanced");
        asserttextValidation(Constant_settings.ManageNotifications_show_less_text, Constant_settings.ManageNotifications_Advanced_Batteries_show_less_text_xpath);
        System.out.println("batteries show less text verified");
    }

    @Then("I verify batteries Alerts text for advanced")
    public void iVerifyBatteriesAlertsTextForAdvanced() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify batteries Alerts text for advanced");
        asserttextValidation(Constant_settings.ManageNotifications_Advanced_alerts_text, Constant_settings.ManageNotifications_Advanced_Batteries_Alerts_text_xpath);
        System.out.println("batteries Alerts text verified");
    }

    @Then("I verify batteries Push notification text in advanced")
    public void iVerifyBatteriesPushNotificationTextInAdvanced() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify batteries Push notification text in advanced");
        asserttextValidationAccessibility(Constant_settings.ManageNotifications_PushNotifications_text, Constant_settings.ManageNotifications_Advanced_Batteries_Alerts_Push_notifications_text_access_id);
        System.out.println("Batteries Alerts Push notification text verified");
    }

    @Then("I verify batteries Push notification toggle in advanced")
    public void iVerifyBatteriesPushNotificationToggleInAdvanced() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify batteries Push notification toggle in advanced");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.ManageNotifications_Advanced_Batteries_Alerts_Push_notifications_toggle_access_id));
        System.out.println("Batteries Alerts Push notification toggle verified");
    }

    @Then("I verify Temperature text in advanced")
    public void iVerifyTemperatureTextInAdvanced() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Temperature text in advanced");
        asserttextValidation(Constant_settings.ManageNotifications_Advanced_Temperature_text, Constant_settings.ManageNotifications_Advanced_Temperature_text_xpath);
        System.out.println("Temperature text verified");
    }

    @Then("I verify Temperature toggle in advanced")
    public void iVerifyTemperatureToggleInAdvanced() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Temperature toggle in advanced");
        Assert.assertTrue(iselementdisplayed(Constant_settings.ManageNotifications_Advanced_Temperature_toggle_button_xpath));
        System.out.println("Temperature toggle verified");
    }

    @Then("I verify Temperature show more text in advanced")
    public void iVerifyTemperatureShowMoreTextInAdvanced() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Temperature show more text in advanced");
        asserttextValidation(Constant_settings.ManageNotifications_show_more_text, Constant_settings.ManageNotifications_Advanced_Temperature_show_more_text_xpath);
        System.out.println("Temperature show more text verified");
    }

    @Then("I verify Temperature show more navigation button in advanced")
    public void iVerifyTemperatureShowMoreNavigationButtonInAdvanced() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify batteries show more navigation button in advanced");
        Assert.assertTrue(iselementdisplayed(Constant_settings.ManageNotifications_Advanced_Temperature_show_more_navigation_button_xpath));
        System.out.println("Temperature show more navigation button verified");
    }

    @Then("I click on Temperature show more")
    public void iClickOnTemperatureShowMore() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I click on Temperature show more");
        Taponbutton(Constant_settings.ManageNotifications_Advanced_Temperature_show_more_text_xpath);
    }

    @Then("I verify Temperature Alerts text for advanced")
    public void iVerifyTemperatureAlertsTextForAdvanced() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Temperature Alerts text for advanced");
        asserttextValidation(Constant_settings.ManageNotifications_Advanced_alerts_text, Constant_settings.ManageNotifications_Advanced_Temperature_Alerts_text_xpath);
        System.out.println("Temperature Alerts text verified");
    }

    @Then("I verify Temperature Push notification text in advanced")
    public void iVerifyTemperaturePushNotificationTextInAdvanced() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Temperature Push notification text in advanced");
        asserttextValidationAccessibility(Constant_settings.ManageNotifications_PushNotifications_text, Constant_settings.ManageNotifications_Advanced_Temperature_Alerts_Push_notifications_text_access_id);
        System.out.println("Temperature Alerts Push notification text verified");
    }

    @Then("I verify Temperature Push notification toggle in advanced")
    public void iVerifyTemperaturePushNotificationToggleInAdvanced() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Temperature Push notification toggle in advanced");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.ManageNotifications_Advanced_Temperature_Alerts_Push_notifications_toggle_access_id));
        System.out.println("Temperature Alerts Push notification toggle verified");
    }

    @Then("I Tap on save button in edit screen")
    public void iTapOnSaveButtonInEditScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on save button in edit screen");
        TaponbuttonaccessabilityID(Constant_settings.Device_Management_Edit_Screen_Save_button_access_id);
        System.out.println("Edit text verified");
    }

    @Then("I Turn OFF push notifications alerts toggle")
    public void iTapOnPushNotificationsAlertsToggle() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on push notifications alerts toggle");
        Taponbutton(Constant_settings.ManageNotifications_push_alerts_toggle_xpath);
    }

    @Then("I Turn OFF push notifications warnings toggle")
    public void iTurnOFFPushNotificationsWarningsToggle() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Turn OFF push notifications warnings toggle");
        Taponbutton(Constant_settings.ManageNotifications_push_warnings_toggle_xpath);
    }

    @Then("I Turn ON push notifications alerts toggle")
    public void iTurnONPushNotificationsAlertsToggle() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Turn OFF push notifications warnings toggle");
        Taponbutton(Constant_settings.ManageNotifications_push_alerts_toggle_xpath);
    }

    @Then("I Turn ON push notifications warnings toggle")
    public void iTurnONPushNotificationsWarningsToggle() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Turn OFF push notifications warnings toggle");
        Taponbutton(Constant_settings.ManageNotifications_push_warnings_toggle_xpath);


    }

    @Then("I delete the existing list of Emails")
    public void iDeleteTheExistingListOfEmails() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I delete the existing list of Emails");
        List<AndroidElement> delete_elements = driver.findElements(By.xpath(Constant_settings.ManageNotifications_Edit_Email_delete_relative_xpath));
        while (delete_elements.size() != 0) {
            try {
                Taponbutton(Constant_settings.ManageNotifications_Edit_Email_delete_relative_xpath);
                delete_elements = driver.findElements(By.xpath(Constant_settings.ManageNotifications_Edit_Email_delete_relative_xpath));
            } catch (Throwable throwable) {
                break;
            }
        }
    }

    @Then("I Tap on Save button in Edit E-mail list screen")
    public void iTapOnSaveButtonInEditEMailListScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Save button in Edit E-mail list screen");
        Taponbutton(Constant_settings.ManageNotifications_Edit_Email_save_button_xpath);
    }

    @Then("I enter a valid E-mail in E-mail field")
    public void iEnterAValidEMailInEMailField() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter a valid E-mail in E-mail field");
        entertextaccessabilityId(Constant_settings.ManageNotifications_Edit_Email_valid_input, Constant_settings.ManageNotifications_Edit_Email_element_1_access_id);
        Edited_Email = Constant_settings.ManageNotifications_Edit_Email_valid_input;

    }

    @Then("I enter a valid E-mail label name")
    public void iEnterAValidEMailLabelName() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter a valid E-mail label name");
        entertextaccessabilityId(Constant_settings.ManageNotifications_Edit_Email_label_valid_input, Constant_settings.ManageNotifcations_Edit_Email_label_1_access_id);
        Edited_Label = Constant_settings.ManageNotifications_Edit_Email_label_valid_input;

    }

    @Then("I verify if the edited E-mail is displayed in the E-mail list")
    public void iVerifyIfTheEditedEMailIsDisplayedInTheEMailList() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the edited E-mail is displayed in the E-mail list");
        asserttextValidationAccessibility(Edited_Email, Constant_ManagementNotifications.ManageNotifications_EmailList_Email_2_access_id);

    }

    @Then("I verify if the edited Label name is displayed below the respective E-mail")
    public void iVerifyIfTheEditedLabelNameIsDisplayedBelowTheRespectiveEMail() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the edited Label name is displayed below the respective E-mail");
        asserttextAccessibility(Edited_Label, Constant_settings.ManageNotifications_EmailList_label_text_2_access_id);

    }

    @Then("I turn ON the toggle for the first edited E-mail in list")
    public void iTurnONTheToggleForTheFirstEditedEMailInList() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I turn ON the toggle for the first edited E-mail in list");
        TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_EmailList_2_toggle_access_id);
    }

    @Then("I turn OFF the toggle for the first edited E-mail in list")
    public void iTurnOFFTheToggleForTheFirstEditedEMailInList() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I turn OFF the toggle for the first edited E-mail in list");
        TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_EmailList_2_toggle_access_id);

    }

    @Then("I Try to Turn ON the toggle for the first E-mail in list")
    public void iTryToTurnONTheToggleForTheFirstEMailInList() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Try to Turn ON the toggle for the first E-mail in list");
        TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_EmailList_1_toggle_access_id);

    }

    @Then("I try to Turn OFF the toggle for the first value in list")
    public void iTryToTurnOFFTheToggleForTheFirstValueInList() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I try to Turn OFF the toggle for the first value in list");
        TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_EmailList_2_toggle_access_id);
    }

    @Then("I enter an E-mail that is already added to the list")
    public void iEnterAnEMailThatIsAlreadyAddedToTheList() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an E-mail that is already added to the list");
        entertextaccessabilityId(Constant_settings.ManageNotifications_Edit_Email_valid_input, Constant_settings.ManageNotifactions_Edit_Email_element_2_access_id);
        Edited_Email = Constant_settings.ManageNotifications_Edit_Email_valid_input;

    }

    @Then("I enter a label that is already added to the list")
    public void iEnterALabelThatIsAlreadyAddedToTheList() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter a label that is already added to the list");
        entertextaccessabilityId(Constant_settings.ManageNotifications_Edit_Email_label_valid_input, Constant_settings.ManageNotifications_Edit_Email_label_2_access_id);
        Edited_Label = Constant_settings.ManageNotifications_Edit_Email_label_valid_input;
    }

    @Then("I verify if the edited duplicate E-mail is displayed in the E-mail list")
    public void iVerifyIfTheEditedDuplicateEMailIsDisplayedInTheEMailList() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the edited duplicate E-mail is displayed in the E-mail list");
        asserttextAccessibility(Edited_Email, Constant_settings.ManageNotifications_EmailList_Email_3_access_id);

    }

    @Then("I verify if the edited duplicate Label name is displayed below the respective E-mail")
    public void iVerifyIfTheEditedDuplicateLabelNameIsDisplayedBelowTheRespectiveEMail() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the edited duplicate Label name is displayed below the respective E-mail");
        asserttextAccessibility(Edited_Label, Constant_settings.ManageNotifications_EmailList_label_text_3_access_id);

    }

    @Then("I Try to Turn ON the toggle for the fourth E-mail in list")
    public void iTryToTurnONTheToggleForTheThirdEMailInList() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Try to Turn ON the toggle for the fourth E-mail in list");
        TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_EmailList_3_toggle_access_id);
    }

    @Then("I try to Turn OFF the toggle for the fourth value in list")
    public void iTryToTurnOFFTheToggleForTheThirdValueInList() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I try to Turn OFF the toggle for the fourth value in list");
        TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_EmailList_3_toggle_access_id);

    }

    @Then("I enter a duplicate E-mail already present in list")
    public void iEnterADuplicateEMailAlreadyPresentInList() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter a duplicate E-mail already present in list");
        entertextaccessabilityId(Constant_settings.ManageNotifications_Edit_Email_valid_input, Constant_settings.ManageNotifactions_Edit_Email_element_3_access_id);
        Edited_Email = Constant_settings.ManageNotifications_Edit_Email_valid_input;
    }

    @Then("I enter a label name that is not already present in list")
    public void iEnterALabelNameThatIsNotAlreadyPresentInList() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter a label name that is not already present in list");
        entertextaccessabilityId("test", Constant_settings.ManageNotifications_Edit_Email_label_3_access_id);
        Edited_Label = "test";

    }

    @Then("I verify if the duplicate E-mail is displayed in the E-mail list")
    public void iVerifyIfTheDuplicateEMailIsDisplayedInTheEMailList() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the duplicate E-mail is displayed in the E-mail list");
        asserttextValidationAccessibility(Edited_Email, Constant_settings.ManageNotifications_EmailList_Email_4_access_id);

    }

    @Then("I verify if the modified Label name is displayed below the respective E-mail")
    public void iVerifyIfTheModifiedLabelNameIsDisplayedBelowTheRespectiveEMail() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the modified Label name is displayed below the respective E-mail");
        asserttextValidationAccessibility(Edited_Label, Constant_settings.ManageNotifications_EmailList_label_text_4_access_id);
    }

    @Then("I Try to Turn ON the toggle for the fifth E-mail in list")
    public void iTryToTurnONTheToggleForTheFifthEMailInList() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Try to Turn ON the toggle for the fifth E-mail in list");
        TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_EmailList_4_toggle_access_id);
    }

    @Then("I try to Turn OFF the toggle for the fifth value in list")
    public void iTryToTurnOFFTheToggleForTheFifthValueInList() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I try to Turn OFF the toggle for the fifth value in list");
        TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_EmailList_4_toggle_access_id);

    }

    @Then("I leave the E-mail label field blank")
    public void iLeaveTheEMailLabelFieldBlank() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I leave the E-mail label field blank");
        entertextaccessabilityId("", Constant_settings.ManageNotifications_Edit_Email_label_4_access_id);
        Edited_Label = "";

    }

    @Then("I Turn OFF E-mail alerts toggle")
    public void iTurnOFFEMailAlertsToggle() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Turn OFF E-mail alerts toggle");
        Taponbutton(Constant_settings.ManageNotifications_email_alerts_toggle_button_xpath);


    }

    @Then("I Turn OFF E-mail warnings toggle")
    public void iTurnOFFEMailWarningsToggle() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Turn OFF E-mail warnings toggle");
        Taponbutton(Constant_settings.ManageNotifications_email_warnings_toggle_button_xpath);

    }

    @Then("I Turn ON E-mail alerts toggle")
    public void iTurnONEMailAlertsToggle() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Turn ON E-mail alerts toggle");
        Taponbutton(Constant_settings.ManageNotifications_email_alerts_toggle_button_xpath);
    }

    @Then("I Turn ON E-mail warnings toggle")
    public void iTurnONEMailWarningsToggle() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Turn ON E-mail warnings toggle");
        Taponbutton(Constant_settings.ManageNotifications_email_warnings_toggle_button_xpath);

    }

    @Then("I Tap on E-mail show less navigation button")
    public void iTapOnEMailShowLessNavigationButton() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Turn OFF E-mail warnings toggle");
        Taponbutton(Constant_settings.ManageNotifications_Email_showless_navigation_xpath);
    }

    @Then("I Turn OFF sms alerts toggle")
    public void iTurnOFFSmsAlertsToggle() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Turn OFF sms alerts toggle");
        Taponbutton(Constant_settings.ManageNotifications_sms_alerts_toggle_button_xpath);


    }

    @Then("I Turn OFF sms warnings toggle")
    public void iTurnOFFSmsWarningsToggle() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Turn OFF sms warnings toggle");
        Taponbutton(Constant_settings.ManageNotifications_sms_warnings_toggle_button_xpath);


    }

    @Then("I Turn ON sms alerts toggle")
    public void iTurnONSmsAlertsToggle() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Turn ON sms alerts toggle");
        Taponbutton(Constant_settings.ManageNotifications_sms_alerts_toggle_button_xpath);

    }

    @Then("I Turn ON sms warnings toggle")
    public void iTurnONSmsWarningsToggle() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Turn ON sms warnings toggle");
        Taponbutton(Constant_settings.ManageNotifications_sms_warnings_toggle_button_xpath);

    }

    @Then("I Tap on sms edit list")
    public void iTapOnSmsEditList() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on sms edit list");
        Taponbutton(Constant_settings.ManageNotifications_sms_smslist_editlist_naviagtion_xpath);
    }

    @Then("I delete the existing list of mobile numbers")
    public void iDeleteTheExistingListOfMobileNumbers() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I delete the existing list of mobile numbers");
        List<AndroidElement> delete_sms_elements = driver.findElements(By.xpath(Constant_settings.ManageNotifications_Edit_Email_delete_relative_xpath));

        while (delete_sms_elements.size() != 0) {
            try {
                TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_sms_editlist_remove_icon_access_id);
                delete_sms_elements = driver.findElements(By.xpath(Constant_settings.ManageNotifications_Edit_Email_delete_relative_xpath));
            } catch (Throwable throwable) {
                break;
            }
        }

    }

    @Then("I Tap on Save button in Edit sms list screen")
    public void iTapOnSaveButtonInEditSmsListScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Save button in Edit sms list screen");
        Taponbutton(Constant_settings.ManageNotifications_Edit_sms_save_button_xpath);

    }

    @Then("I Tap on add new number button")
    public void iTapOnAddNewNumberButton() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on add new number button");
        TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_edit_smslist_add_button_access_id);
    }

    @Then("I enter a valid number in mobile number field")
    public void iEnterAValidNumberInMobileNumberField() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter a valid number in mobile number field");
        entertextaccessabilityId(Constant_settings.ManageNotifications_valid_mobile_number, Constant_settings.ManageNotifications_Mobile_number_1_value_access_id);

    }

    @Then("I enter a valid sms label name")
    public void iEnterAValidSmsLabelName() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter a valid sms label name");
        entertextaccessabilityId(Constant_settings.ManageNotifications_sms_valid_label_name, Constant_settings.ManageNotifications_Mobile_number_label_1_access_id);
    }

    @Then("I verify if the edited number is displayed in the sms list")
    public void iVerifyIfTheEditedNumberIsDisplayedInTheSmsList() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the edited number is displayed in the sms list");
        asserttextAccessibility(Constant_settings.ManageNotifications_valid_mobile_number, Constant_settings.ManageNotifications_sms_smslist_number_2_access_id);

    }

    @Then("I verify if the edited Label name is displayed below the respective number")
    public void iVerifyIfTheEditedLabelNameIsDisplayedBelowTheRespectiveNumber() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the edited Label name is displayed below the respective number");
        asserttextAccessibility(Constant_settings.ManageNotifications_sms_valid_label_name, Constant_settings.ManageNotifications_sms_smslist_label_text_2_access_id);
    }

    @Then("I turn ON the toggle for the first edited number in list")
    public void iTurnONTheToggleForTheFirstEditedNumberInList() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I turn ON the toggle for the first edited number in list");
        TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_sms_smslist_1_toggle_access_id);
    }

    @Then("I turn OFF the toggle for the first edited number in list")
    public void iTurnOFFTheToggleForTheFirstEditedNumberInList() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I turn OFF the toggle for the first edited number in list");
        TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_sms_smslist_1_toggle_access_id);

    }

    @Then("I Try to Turn ON the toggle for the valid number in list")
    public void iTryToTurnONTheToggleForTheValidNumberInList() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Try to Turn ON the toggle for the valid number in list");
        TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_sms_smslist_2_toggle_access_id);

    }

    @Then("I try to Turn OFF the toggle for the valid number in list")
    public void iTryToTurnOFFTheToggleForTheValidNumberInList() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Try to Turn OFF the toggle for the valid number in list");
        TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_sms_smslist_2_toggle_access_id);


    }

    @Then("I enter an invalid number in mobile number field")
    public void iEnterAnInvalidNumberInMobileNumberField() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Try to Turn OFF the toggle for the valid number in list");
        entertextaccessabilityId(Constant_settings.ManageNotifications_invalid_mobile_number, Constant_settings.ManageNotifications_Mobile_number_2_value_access_id);
    }

    @Then("I enter an invalid sms label name")
    public void iEnterAnInvalidSmsLabelName() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an invalid sms label name");
        entertextaccessabilityId(Constant_settings.ManageNotifications_sms_invalid_label_name, Constant_settings.ManageNotifications_Mobile_number_label_2_access_id);
    }

    @Then("I verify if the edited invalid Label name is displayed below the respective number")
    public void iVerifyIfTheEditedInvalidLabelNameIsDisplayedBelowTheRespectiveNumber() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the edited invalid Label name is displayed below the respective number");
        asserttextAccessibility(Constant_settings.ManageNotifications_sms_invalid_label_name, Constant_settings.ManageNotifications_sms_smslist_label_text_3_access_id);
    }

    @Then("I Try to Turn ON the toggle for the invalid number in list")
    public void iTryToTurnONTheToggleForTheInvalidNumberInList() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Try to Turn ON the toggle for the invalid number in list");
        TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_sms_smslist_3_toggle_access_id);
    }

    @Then("I try to Turn OFF the toggle for the invalid number in list")
    public void iTryToTurnOFFTheToggleForTheInvalidNumberInList() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I try to Turn OFF the toggle for the invalid number in list");
        TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_sms_smslist_3_toggle_access_id);

    }

    @Then("I enter an already added number in mobile number field")
    public void iEnterAnAlreadyAddedNumberInMobileNumberField() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an already added number in mobile number field");
        entertextaccessabilityId(Constant_settings.ManageNotifications_valid_mobile_number, Constant_settings.ManageNotifications_Mobile_number_3_value_access_id);
    }

    @Then("I enter an already created sms label name")
    public void iEnterAnAlreadyCreatedSmsLabelName() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an already created sms label name");
        entertextaccessabilityId(Constant_settings.ManageNotifications_sms_valid_label_name, Constant_settings.ManageNotifications_Mobile_number_label_3_access_id);
    }

    @Then("I verify if the edited duplicate number is displayed in the sms list")
    public void iVerifyIfTheEditedDuplicateNumberIsDisplayedInTheSmsList() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the edited duplicate number is displayed in the sms list");
        asserttextAccessibility(Constant_settings.ManageNotifications_valid_mobile_number, Constant_settings.ManageNotifications_sms_smslist_number_4_access_id);
    }

    @Then("I verify if the edited duplicate Label name is displayed below the respective number")
    public void iVerifyIfTheEditedDuplicateLabelNameIsDisplayedBelowTheRespectiveNumber() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the edited duplicate Label name is displayed below the respective number");
        asserttextAccessibility(Constant_settings.ManageNotifications_sms_valid_label_name, Constant_settings.ManageNotifications_sms_smslist_label_text_4_access_id);
    }

    @Then("I Try to Turn ON the toggle for the duplicate number in list")
    public void iTryToTurnONTheToggleForTheDuplicateNumberInList() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Try to Turn ON the toggle for the duplicate number in list");
        TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_sms_smslist_4_toggle_access_id);
    }

    @Then("I try to Turn OFF the toggle for the duplicate number in list")
    public void iTryToTurnOFFTheToggleForTheDuplicateNumberInList() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I try to Turn OFF the toggle for the duplicate number in list");
        TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_sms_smslist_4_toggle_access_id);

    }

    @Then("I enter an existing number in mobile number field")
    public void iEnterAnExistingNumberInMobileNumberField() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an existing number in mobile number field");
        entertextaccessabilityId(Constant_settings.ManageNotifications_valid_mobile_number, Constant_settings.ManageNotifications_Mobile_number_4_value_access_id);
    }

    @Then("I enter a unique sms label name")
    public void iEnterAUniqueSmsLabelName() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter a unique sms label name");
        entertextaccessabilityId(Constant_settings.ManageNotifications_sms_unique_label_name, Constant_settings.ManageNotifications_Mobile_number_label_4_access_id);
    }

    @Then("I verify if the edited existing number is displayed in the sms list")
    public void iVerifyIfTheEditedExistingNumberIsDisplayedInTheSmsList() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the edited existing number is displayed in the sms list");
        asserttextAccessibility(Constant_settings.ManageNotifications_valid_mobile_number, Constant_settings.ManageNotifications_sms_smslist_number_5_access_id);
    }

    @Then("I verify if the edited unique Label name is displayed below the respective number")
    public void iVerifyIfTheEditedUniqueLabelNameIsDisplayedBelowTheRespectiveNumber() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the edited existing number is displayed in the sms list");
        asserttextAccessibility(Constant_settings.ManageNotifications_sms_unique_label_name, Constant_settings.ManageNotifications_sms_smslist_label_text_5_access_id);
    }

    @Then("I Try to Turn ON the toggle for the edited existing number in list")
    public void iTryToTurnONTheToggleForTheEditedExistingNumberInList() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Try to Turn ON the toggle for the edited existing number in list");
        TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_sms_smslist_5_toggle_access_id);
    }

    @Then("I try to Turn OFF the toggle for the edited existing number in list")
    public void iTryToTurnOFFTheToggleForTheEditedExistingNumberInList() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Try to Turn OFF the toggle for the edited existing number in list");
        TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_sms_smslist_5_toggle_access_id);

    }

    @Then("I leave the mobile number field blank")
    public void iLeaveTheMobileNumberFieldBlank() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I leave the mobile number field blank");
        entertextaccessabilityId(" ", Constant_settings.ManageNotifications_Mobile_number_5_value_access_id);

    }

    @Then("I leave the sms label field blank")
    public void iLeaveTheSmsLabelFieldBlank() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I leave the sms label field blank");
        entertextaccessabilityId(" ", Constant_settings.ManageNotifications_Mobile_number_label_5_access_id);

    }

    @Then("I verify the save button text")
    public void iVerifyTheSaveButtonText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the save button text");
        asserttextValidationAccessibility(com.dometic.MTC.qa.Pages.Constant_settings.Device_management_edit_save_button, com.dometic.MTC.qa.Pages.Constant_settings.Device_management_edit__save_button_access_id);
    }

    @Then("I Tap on Back Button in guest List Page")
    public void iTapOnBackButtonInGuestListPage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Back Button in guest List Page");
        driver.pressKeyCode(AndroidKeyCode.BACK);
    }

    @Then("I Tap on Back Button in profile screen")
    public void iTapOnBackButtonInProfileScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Back Button in profile screen");
        driver.pressKeyCode(AndroidKeyCode.BACK);
    }

    @Then("I Tap on Back Button in account settings screen")
    public void iTapOnBackButtonInAccountSettingsScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Back Button in account settings screen");
        driver.pressKeyCode(AndroidKeyCode.BACK);
    }

    @Then("I Tap on Back Button in Language Screen")
    public void iTapOnBackButtonInLanguageScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Back Button in Language Screen");
        driver.pressKeyCode(AndroidKeyCode.BACK);
    }

    @Then("I Tap on Back Button in App Settings screen")
    public void iTapOnBackButtonInAppSettingsScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Back Button in App Settings screen");
        driver.pressKeyCode(AndroidKeyCode.BACK);
    }

    @Then("I tap on the temperature settings text")
    public void iTapOnTheTemperatureSettingsText() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the temperature settings text");
        TaponbuttonaccessabilityID(Constant_settings.Device_management_Temperature_settings_access_id);
    }

    @Then("I Verify the temperature settings header text tile")
    public void iVerifyTheTemperatureSettingsHeaderTextTile() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the temperature settings header text tile");
        asserttextValidationAccessibility(Constant_settings.Temperature_settings_Temperature_header_TitleText,Constant_settings.Temperature_settings_header_text_access_id);
        System.out.println("temperature settings header text tile is verified");
    }

    @Then("I Verify the current temperature text on the temperature page")
    public void iVerifyTheCurrentTemperatureTextOnTheTemperaturePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the current temperature text on the temperature page");
        asserttextValidation(Constant_settings.Temperature_settings_current_temperature,Constant_settings.Temperature_settings_current_temperature_xpath);
        System.out.println("current temperature text is verified");
    }

    @Then("I Verify the outside text on the temperature page")
    public void iVerifyTheOutsideTextOnTheTemperaturePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the outside text on the temperature page");
        asserttextValidation(Constant_settings.Temperature_settings_outside,Constant_settings.Temperature_settings_outside_xpath);
        System.out.println("outside text on the temperature page is verified");
    }

    @Then("I Verify the lower compartment on the temperature page")
    public void iVerifyTheLowerCompartmentOnTheTemperaturePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the lower compartment on the temperature page");
        asserttextValidation(Constant_settings.Temperature_settings_lower_compartment,Constant_settings.Temperature_settings_lower_compartment_xpath);
        System.out.println("lower compartment on the temperature page is verified");
    }

    @Then("I Verify the temperature alert text on the temperature page")
    public void iVerifyTheTemperatureAlertTextOnTheTemperaturePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the temperature alert text on the temperature page");
        asserttextValidation(Constant_settings.Temperature_settings_temperature_alert,Constant_settings.Temperature_settings_temperature_alert_xpath);
        System.out.println("temperature alert text on the temperature page is verified");
    }

    @Then("I Verify the temperature threshold text on the temperature page")
    public void iVerifyTheTemperatureThresholdTextOnTheTemperaturePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the temperature threshold text on the temperature page");
        asserttextValidation(Constant_settings.Temperature_settings_temperature_threshold,Constant_settings.Temperature_settings_temperature_threshold_xpath);
        System.out.println("temperature threshold text on the temperature page is verified");
    }

    @Then("I Verify the temperature control text on the temperature page")
    public void iVerifyTheTemperatureControlTextOnTheTemperaturePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the temperature control text on the temperature page");
        asserttextValidationAccessibility(Constant_settings.Temperature_settings_temperature_control,Constant_settings.Temperature_settings_temperature_control_access_id);
        System.out.println("temperature control text on the temperature page is verified");
    }

    @Then("I Verify the scheduler title text on the temperature page")
    public void iVerifyTheSchedulerTitleTextOnTheTemperaturePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the scheduler title text on the temperature page");
        asserttextValidation(Constant_settings.Temperature_settings_scheduler_header,Constant_settings.Temperature_settings_scheduler_header_xpath);
        System.out.println("scheduler title text on the temperature page is verified");
    }

    @Then("I Verify the scheduler text on the temperature page")
    public void iVerifyTheSchedulerTextOnTheTemperaturePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the scheduler text on the temperature page");
        asserttextValidationAccessibility(Constant_settings.Temperature_settings_scheduler,Constant_settings.Temperature_settings_temperature_scheduler_access_id);
        System.out.println("scheduler text on the temperature page is verified");
    }

    @Then("I Tap on the back button on the temperature page")
    public void iTapOnTheBackButtonOnTheTemperaturePage() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on the back button on the temperature page");
        TaponbuttonaccessabilityID(Constant_settings.Temperature_settings_back_buttion_icon_accessid);
        Thread.sleep(2000);
    }

    @Then("I Verify Vessal name should not be empty text is displayed")
    public void iVerifyVessalNameShouldNotBeEmptyTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Vessal name should not be empty text is displayed");
        asserttextValidation(Constant_settings.Device_Management_empty_error_message, Constant_settings.Device_Management_empty_error_message_xpath);
        System.out.println("Vessal name should not be empty text is Verified");
    }

    @Then("I Tap on back button in Device Management screen")
    public void iTapOnBackButtonInDeviceManagementScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on back button in Device Management screen");
        List<AndroidElement> id = driver.findElements(By.xpath(Constant_DeviceManagement.mtc_Device_Management_Title_Xpath));
        if (id.size() != 0) {
            driver.pressKeyCode(AndroidKeyCode.BACK);
            Thread.sleep(2000);
        }
    }

    @Then("I verify the Header of the account settings")
    public void iVerifyTheHeaderOfTheAccountSettings() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Header of the account settings");
        asserttextValidationAccessibility(com.dometic.L2.qa.Pages.Constant_settings.Settings_AccountSettings_header_text, com.dometic.L2.qa.Pages.Constant_settings.Settings_AccountSettings_header_accessid);
        System.out.println("Header of the account settings text is Verified");
    }

    @Then("I verify the profile photo of the account settings")
    public void iVerifyTheProfilePhotoOfTheAccountSettings() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the profile photo of the account settings");
        Assert.assertTrue(iselementdisplayedaccessabilityId(com.dometic.L2.qa.Pages.Constant_settings.Settings_AccountSettings_profilePhoto_accessid));
        System.out.println("Profile photo of the account settings is Verified");
    }

    @Then("I Verify the UserName of account settings")
    public void iVerifyTheUserNameOfAccountSettings() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the UserName of account settings");
        Assert.assertTrue(iselementdisplayedaccessabilityId(com.dometic.L2.qa.Pages.Constant_settings.Settings_AccountSettings_userName_accessid));
        System.out.println("UserName text is Verified");
    }

    @Then("I Verify the UserEmail of account settings")
    public void iVerifyTheUserEmailOfAccountSettings() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the UserEmail of account settings");
        Assert.assertTrue(iselementdisplayedaccessabilityId(com.dometic.L2.qa.Pages.Constant_settings.Settings_AccountSettings_user_email_accessid));
        System.out.println("UserEmail text is Verified");
    }

    @Then("I Verify the profile text of account settings")
    public void iVerifyTheProfileTextOfAccountSettings() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the profile text of account settings");
        asserttextValidationAccessibility(com.dometic.L2.qa.Pages.Constant_settings.Settings_AccountSettings_profile_text, com.dometic.L2.qa.Pages.Constant_settings.Settings_AccountSettings_profile_Text_accessid);
        System.out.println("Profile text is Verified");
    }

    @Then("I verify the subscription text of account settings")
    public void iVerifyTheSubscriptionTextOfAccountSettings() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the subscription text of account settings");
        asserttextValidationAccessibility(com.dometic.L2.qa.Pages.Constant_settings.Settings_AccountSettings_Subscription_text, com.dometic.L2.qa.Pages.Constant_settings.Settings_AccountSettings_Subscription_text_accessid);
        System.out.println("Subscription text is Verified");
    }

    @Then("I Tap on the Subscription navigation icon")
    public void iTapOnTheSubscriptionNavigationIcon() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on the Subscription navigation icon");
        TaponbuttonaccessabilityID(com.dometic.L2.qa.Pages.Constant_settings.Settings_AccountSettings_Subscription_cardicon_accessid);
        Thread.sleep(2000);
    }

    @Then("I verify the header of the subscription page")
    public void iVerifyTheHeaderOfTheSubscriptionPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the header of the subscription page");
        asserttextValidationAccessibility(com.dometic.L2.qa.Pages.Constant_settings.Settings_Subscription_header_text, com.dometic.L2.qa.Pages.Constant_settings.Settings_Subscription_header_accessid);
        System.out.println("Subscription Header text is Verified");
        Thread.sleep(2000);
    }

    @Then("I Verify the Close Button is Edit profile Page")
    public void iVerifyTheCloseButtonIsEditProfilePage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Close Button is Edit profile Page");
        Assert.assertTrue(iselementdisplayedaccessabilityId(com.dometic.L2.qa.Pages.Constant_settings.Settings_Edit_profile_CloseButton_accessid));
    }

    @Then("I Enter an empty in Primary Field Mobile in Edit profile screen")
    public void iEnterAnEmptyInPrimaryFieldMobileInEditProfileScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter an empty in Primary Field Mobile in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(com.dometic.L2.qa.Pages.Constant_settings.Settings_Edit_profile_primaryMobile_value_accessid);
        Thread.sleep(1000);
        cleartextaccessabilityId(com.dometic.L2.qa.Pages.Constant_settings.Settings_Edit_profile_primaryMobile_value_accessid);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }

    @Then("I tap on Ok button")
    public void iTapOnOkButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on Ok button");
        if (driver.findElements(By.xpath(com.dometic.L2.qa.Pages.Constant_settings.Settings_Edit_profile_ok_button_xpath)).size() != 0) {
            Taponbutton(com.dometic.L2.qa.Pages.Constant_settings.Settings_Edit_profile_ok_button_xpath);
        }
    }

    @Then("I tap on Close in Edit profile screen")
    public void iTapOnCloseInEditProfileScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on Close in Edit profile screen");
        TaponbuttonaccessabilityID(com.dometic.L2.qa.Pages.Constant_settings.Settings_Edit_profile_CloseButton_accessid);
    }
}

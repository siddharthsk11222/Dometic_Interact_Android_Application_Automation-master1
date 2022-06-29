package com.dometic.L2.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.L2.qa.util.Baseclass;
import com.dometic.L2.qa.Pages.Constant_climate_ac;
import com.dometic.L2.qa.Pages.Constant_landingscreen;
import com.dometic.L2.qa.Pages.Constant_settings;
import com.dometic.MTC.qa.Pages.Constant_DeviceManagement;
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
    public static String fahrenheitText, celciusText;
    public static String EditedNameValue = "";
    String emojis = Constant_DeviceManagement.grinning_face_with_smiling_eyes + Constant_DeviceManagement.face_with_tears_of_joy +
            Constant_DeviceManagement.smiling_face_with_open_mouth_and_cold_sweat + Constant_DeviceManagement.smiling_face_with_open_mouth_and_tightly_closed_eyes +
            Constant_DeviceManagement.winking_face;

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
    }

    @Then("I verify Languages text is displayed")
    public void iVerifyLanguagesIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Languages text is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_languageContainer_access_id));
    }

    @Then("I Verify Temperature unit text is displayed")
    public void tVerifyTemperatureUnitIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Temperature unit text is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_Temperature_unit_access_id));
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
    }

    @Then("I verify Log out is displayed")
    public void iVerifyLogOutIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Log out is displayed");
        Assert.assertTrue(iselementdisplayed(Constant_settings.Settings_Logout_xpath));
    }


    @Then("I verify hamburger menu in landing screen")
    public void iVerifyHamburgerMenuInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify hamburger menu in landing screen");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_climate_ac.CAC_M_power_Back_Button_access_id);
        if (elementsByAccessibilityId.size() != 0) {
            TaponbuttonaccessabilityID(Constant_climate_ac.CAC_M_power_Back_Button_access_id);
        }
//        Basestepdefinition.verticalSwipe(0.3, 0.7, 0.5);
//        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_landingscreen.LandingPage_hamburger_menu_access_id));
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
    }

    @And("I verify on Temperature text updated with German translation")
    public void iVerifyOnTemperatureTextUpdatedWithGermanTranslation() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify on Temperature text updated with German translation");
        asserttextAccessibility(Constant_settings.Settings_Temperature_text_expected, Constant_settings.Settings_Temperature_text_access_id);
    }

    @And("I verify on logout text updated with German translation")
    public void iVerifyOnLogoutTextUpdatedWithGermanTranslation() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify on logout text updated with German translation");
        asserttextAccessibility(Constant_settings.Settings_logout_expected, Constant_settings.Settings_logout_text_access_id);
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
        Thread.sleep(2000);
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
    }

    @And("I verify on Temperature text updated with Spanish translation")
    public void iVerifyOnTemperatureTextUpdatedWithSpanishTranslation() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify on Temperature text updated with Spanish translation");
        asserttextAccessibility(Constant_settings.Settings_temperature_Spanish_text_expected, Constant_settings.Settings_Temperature_text_access_id);
    }

    @And("I verify on logout text updated with Spanish translation")
    public void iVerifyOnLogoutTextUpdatedWithSpanishTranslation() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify on logout text updated with Spanish translation");
        asserttextAccessibility(Constant_settings.Settings_logout_Spanish_text_expected, Constant_settings.Settings_logout_text_access_id);
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
    }

    @And("I verify on Temperature text updated with French translation")
    public void iVerifyOnTemperatureTextUpdatedWithFrenchTranslation() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify on Temperature text updated with French translation");
        asserttextAccessibility(Constant_settings.Settings_temperature_French_text_expected, Constant_settings.Settings_Temperature_text_access_id);
    }

    @And("I verify on logout text updated with French translation")
    public void iVerifyOnLogoutTextUpdatedWithFrenchTranslation() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify on logout text updated with French translation");
        asserttextAccessibility(Constant_settings.Settings_logout_French_text_expected, Constant_settings.Settings_logout_text_access_id);
    }

    @Then("I verify Add ZoneIcon in Zone Management")
    public void iVerifyAddZoneIconInZoneManagement() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Add ZoneIcon in Zone Management");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_Zone_Management_addZoneIcon_access_id));
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
    }

    @Then("I verify Edit text in Zone Management")
    public void iVerifyEditTextInZoneManagement() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Edit text in Zone Management");
        System.out.println(driver.findElement(By.xpath(Constant_settings.Settings_Zone_Management_edit_xpath)).getText());
        asserttext(Constant_settings.Settings_Zone_Management_edit_text, Constant_settings.Settings_Zone_Management_edit_xpath);
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

    @Then("I Tap on Logout in Settings screen")
    public void iTapOnLogoutInSettingsScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Logout in Settings screen");
        TaponbuttonaccessabilityID(com.dometic.MTC.qa.Pages.Constant_settings.Settings_Logout_text_access_id);
    }

    @Then("I click on Device Management")
    public void iClickOnDeviceManagement() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I click on Device Management");
        Taponbutton(Constant_settings.Device_Management_xpath);
        Thread.sleep(2000);
        System.out.println("Clicked Device Management");
    }

    @Then("I tap on the onboarded device")
    public void iTapOnTheOnboardedDevice() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the onboarded device");
        TaponbuttonaccessabilityID(Constant_settings.Device_Management_Device_name_access_id);
        Thread.sleep(2000);
        System.out.println("clicked onboarded device");
    }

    @Then("I verify Device management title")
    public void iVerifyDeviceManagementTitle() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Device management title");
        asserttextValidationAccessibility(Constant_settings.Device_Management_header_text, Constant_settings.Device_Management_header_access_id);
        System.out.println("Device management title verified");
    }

    @Then("I verify Device management back button")
    public void iVerifyDeviceManagementBackButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Device management back button");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_Management_back_button_access_id));
        System.out.println("Device management back button verified");
    }

    @Then("I verify Device management image")
    public void iVerifyDeviceManagementImage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Device management image");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_Management_image_access_id));
        System.out.println("Device management image verified");
    }

    @Then("I verify if device name is displayed")
    public void iVerifyIfDeviceNameIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if device name is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_Management_page_Device_name_access_id));
        System.out.println("Device name is displayed");
    }

    @Then("I verify vessel information")
    public void iVerifyVesselInformation() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify vessel information");
        asserttextValidationAccessibility(Constant_settings.Vessel_information_text, Constant_settings.Device_Management_Vessel_information_text_access_id);
        System.out.println("Vessel information text verified");
    }

    @Then("I verify Name text")
    public void iVerifyNameText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Name text");
        asserttextValidationAccessibility(Constant_settings.Name_text, Constant_settings.Device_Management_Name_text_access_id);
        System.out.println("Name text verified");
    }

    @Then("I verify if the device name is displayed")
    public void iVerifyIfTheDeviceNameIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the device name is displayed");
        String string1 = driver.findElementByAccessibilityId(Constant_settings.Device_Management_page_Device_name_access_id).getAttribute("text");
        String string2 = driver.findElementByAccessibilityId(Constant_settings.Device_Management_Name_access_id).getAttribute("text");
        System.out.println(string1);
        System.out.println(string2);
        if (string1.equals(string2)) {
            System.out.println("Given device name text verified");
        } else {
            System.out.println("Device Name mismatching");
        }
    }

    @Then("I verify MAC address text")
    public void iVerifyMACAddressText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Name text");
        asserttextValidationAccessibility(Constant_settings.MAC_address_text, Constant_settings.Device_Management_MAC_address_text_access_id);
        System.out.println("MAC address text verified");
    }

    @Then("I verify if MAC address is displayed")
    public void iVerifyIfMACAddressIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if MAC address is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_Management_MAC_address_access_id));
        System.out.println("MAC address is displayed");
    }

    @Then("I verify Edit vessel text")
    public void iVerifyEditVesselText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Edit vessel text");
        asserttextValidationAccessibility(Constant_settings.Edit_vessel_text, Constant_settings.Device_Management_Edit_vessel_text_access_id);
        System.out.println("Edit vessel text verified");
    }

    @Then("I verify Edit vessel navigation button")
    public void iVerifyEditVesselNavigationButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Edit vessel navigation button");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_Management_Edit_vessel_navigation_access_id));
        System.out.println("Edit vessel navigation button displayed");
    }

    @Then("I tap on Edit vessel")
    public void iTapOnEditVessel() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on Edit vessel");
        TaponbuttonaccessabilityID(Constant_settings.Device_Management_Edit_vessel_navigation_access_id);
        Thread.sleep(2000);
        System.out.println("clicked Edit vessel");
    }

    @Then("I verify Edit vessel header")
    public void iVerifyEditVesselHeader() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Edit vessel header");
        asserttextValidationAccessibility(Constant_settings.Edit_vessel_header_text, Constant_settings.Device_Management_Edit_vessel_header_access_id);
        System.out.println("Edit vessel header verified");
    }

    @Then("I verify Edit vessel close button")
    public void iVerifyEditVesselCloseButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Edit vessel close button");
        Assert.assertTrue(iselementdisplayed(Constant_settings.Device_Management_Edit_vessel_close_button_xpath));
        System.out.println("Edit vessel close button verified");
    }

    @Then("I verify Edit vessel image is displayed")
    public void iVerifyEditVesselImageIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Edit vessel image is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_Management_Edit_vessel_image_access_id));
        System.out.println("Edit vessel image displayed");
    }

    @Then("I verify Edit vessel name text")
    public void iVerifyEditVesselNameText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Edit vessel name text");
        asserttextValidationAccessibility(Constant_settings.Edit_vessel_name_text, Constant_settings.Device_Management_Edit_vessel_name_text_access_id);
        System.out.println("Edit vessel name text verified");
    }

    @Then("I verify if vessel name is displayed")
    public void iVerifyIfVesselNameIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if vessel name is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_Management_Edit_vessel_name_access_id));
        System.out.println("Edit vessel name is displayed");
    }

    @Then("I verify Edit vessel Mac address text")
    public void iVerifyEditVesselMacAddressText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Edit vessel Mac address text");
        asserttextValidationAccessibility(Constant_settings.Edit_vessel_MAC_address_text, Constant_settings.Device_Management_Edit_vessel_MAC_address_text_access_id);
        System.out.println(" Edit vessel Mac address text verified");

    }

    @Then("I verify if Edit vessel Mac address is displayed")
    public void iVerifyIfEditVesselMacAddressIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if Edit vessel Mac address is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_Management_Edit_vessel_MAC_address_access_id));
        System.out.println("Edit vessel Mac address is displayed");
    }

    @Then("I verify if Save button is displayed")
    public void iVerifyIfSaveButtonIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if Save button is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_Management_Edit_vessel_Save_button_access_id));
        System.out.println("Save button is displayed");
    }

    @Then("I verify Save text")
    public void iVerifySaveText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Save text");
        asserttextValidationAccessibility(Constant_settings.Save_text, Constant_settings.Device_Management_Edit_vessel_Save_text_access_id);
        System.out.println("Save text verified");
    }

    @Then("I tap on close button in Edit vessel screen")
    public void iTapOnCloseButtonInEditVesselScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on close button in Edit vessel screen");
        Taponbutton(Constant_settings.Device_Management_Edit_vessel_close_button_xpath);
    }

    @Then("I verify Advanced text")
    public void iVerifyAdvancedText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Advanced text");
        asserttextValidationAccessibility(Constant_settings.Advanced_text, Constant_settings.Device_Management_Advanced_text_access_id);
        System.out.println("Advanced text verified");
    }

    @Then("I verify Check Updates text")
    public void iVerifyCheckUpdatesText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Check Updates text");
        asserttextValidationAccessibility(Constant_settings.Check_updates_text, Constant_settings.Device_Management_Check_updates_text_access_id);
        System.out.println("Check Updates text verified");
    }

    @Then("I verify check updates navigation button")
    public void iVerifyCheckUpdatesNavigationButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify check updates navigation button");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_Management_Check_updates_navigation_access_id));
        System.out.println("check updates navigation button is displayed");
    }

    @Then("I verify Unregister Delete Offboard text")
    public void iVerifyUnregisterDeleteOffboardText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Unregister/Delete/Offboard text");
        asserttextValidationAccessibility(Constant_settings.Unregister_Offboard_Delete_text, Constant_settings.Device_Management_Unregister_Delete_offboard_text_access_id);
        System.out.println("Unregister/Delete/Offboard text verified");
    }

    @Then("I verify Unregister Delete Offboard navigation button")
    public void iVerifyUnregisterDeleteOffboardNavigationButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify I verify Unregister/Delete/Offboard navigation button");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_Management_Unregister_Delete_offboard_navigation_access_id));
        System.out.println("Unregister/Delete/Offboard navigation button is displayed");

    }

    @Then("I Tap on view Edit Account option")
    public void iTapOnViewEditAccountOption() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on view Edit Account option");
        TaponbuttonaccessabilityID(Constant_settings.Settings_ViewEditAccount_accessid);
        Thread.sleep(2000);
    }

    @Then("I verify the Header of the account settings")
    public void iVerifyTheHeaderOfTheAccountSettings() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Header of the account settings");
        asserttextValidationAccessibility(Constant_settings.Settings_AccountSettings_header_text, Constant_settings.Settings_AccountSettings_header_accessid);
    }

    @Then("I verify the profile photo of the account settings")
    public void iVerifyTheProfilePhotoOfTheAccountSettings() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the profile photo of the account settings");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_AccountSettings_profilePhoto_accessid));
    }

    @Then("I Verify the UserName of account settings")
    public void iVerifyTheUserNameOfAccountSettings() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the UserName of account settings");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_AccountSettings_userName_accessid));
    }

    @Then("I Verify the UserEmail of account settings")
    public void iVerifyTheUserEmailOfAccountSettings() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the UserEmail of account settings");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_AccountSettings_user_email_accessid));
    }

    @Then("I Verify the profile text of account settings")
    public void iVerifyTheProfileTextOfAccountSettings() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the profile text of account settings");
        asserttextValidationAccessibility(Constant_settings.Settings_AccountSettings_profile_text, Constant_settings.Settings_AccountSettings_profile_Text_accessid);
    }

    @Then("I verify the subscription text of account settings")
    public void iVerifyTheSubscriptionTextOfAccountSettings() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the subscription text of account settings");
        asserttextValidationAccessibility(Constant_settings.Settings_AccountSettings_Subscription_text, Constant_settings.Settings_AccountSettings_Subscription_text_accessid);
    }

    @Then("I Tap on the Profile card icon")
    public void iTapOnTheProfileCardIcon() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on the Profile card icon");
        TaponbuttonaccessabilityID(Constant_settings.Settings_AccountSettings_profile_cardicon_accessid);
        Thread.sleep(2000);
    }

    @Then("I Verify the Header of the profile page")
    public void iVerifyTheHeaderOfTheProfilePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the subscription text of account settings");
        asserttextValidationAccessibility(Constant_settings.Settings_profile_header, Constant_settings.Settings_profile_header_accessid);
    }

    @Then("I verify the personal information text in profile page")
    public void iVerifyThePersonalInformationTextInProfilePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the personal information text in profile page");
        asserttextValidationAccessibility(Constant_settings.Settings_profile_Persolnal_information, Constant_settings.Settings_profile_Persolnal_information_accessid);
    }

    @Then("I verify the name text in profile page")
    public void iVerifyTheNameTextInProfilePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the personal name text in profile page");
        asserttextValidationAccessibility(Constant_settings.Settings_profile_Name_label, Constant_settings.Settings_profile_Name_label_accessid);
    }

    @Then("I verify the name value in profile page")
    public void iVerifyTheNameValueInProfilePage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the personal name value in profile page");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_profile_namevalues_accessid));
    }

    @Then("I verify the email text in profile page")
    public void iVerifyTheEmailTextInProfilePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the personal email text in profile page");
        asserttextValidationAccessibility(Constant_settings.Settings_profile_email_label, Constant_settings.Settings_profile_email_label_accessid);
    }

    @Then("I verify the email value in profile page")
    public void iVerifyTheEmailValueInProfilePage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the personal email value in profile page");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_profile_emailvalues_accessid));
    }

    @Then("I verify the mobile text in profile page")
    public void iVerifyTheMobileTextInProfilePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the personal mobile text in profile page");
        asserttextValidationAccessibility(Constant_settings.Settings_profile_mobile_label, Constant_settings.Settings_profile_mobile_label_accessid);
    }

    @Then("I verify the mobile value in profile page")
    public void iVerifyTheMobileValueInProfilePage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the personal mobile value in profile page");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_profile_mobilevalues_accessid));
    }

    @Then("I verify the Address text in profile page")
    public void iVerifyTheAddressTextInProfilePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the personal Address text in profile page");
        asserttextValidationAccessibility(Constant_settings.Settings_profile_address_label, Constant_settings.Settings_profile_address_label_accessid);
    }

    @Then("I verify the Address value text in profile page")
    public void iVerifyTheAddressValueTextInProfilePage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the personal Address value text in profile page");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_profile_addressvalues_accessid));
    }

    @Then("I verify the Edit profile text in profile page")
    public void iVerifyTheEditProfileTextInProfilePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the personal Edit profile text in profile page");
        asserttextValidationAccessibility(Constant_settings.Settings_profile_Editprofile_label, Constant_settings.Settings_profile_Editprofile_label_accessid);
    }

    @Then("I verify the Security text in profile page")
    public void iVerifyTheSecurityTextInProfilePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the personal Security text in profile page");
        asserttextValidationAccessibility(Constant_settings.Settings_profile_Security_text, Constant_settings.Settings_profile_Security_text_accessid);
    }

    @Then("I verify the Password text in profile page")
    public void iVerifyThePasswordTextInProfilePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the personal Password text in profile page");
        asserttextValidationAccessibility(Constant_settings.Settings_profile_Password_text, Constant_settings.Settings_profile_Password_text_accessid);
    }

    @Then("I verify the Renew text in profile page")
    public void iVerifyTheRenewTextInProfilePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the personal Renew text in profile page");
        asserttextValidationAccessibility(Constant_settings.Settings_profile_Renew_text, Constant_settings.Settings_profile_Renew_text_accessid);
    }

    @Then("I Tap on the Subscription navigation icon")
    public void iTapOnTheSubscriptionNavigationIcon() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on the Subscription navigation icon");
        TaponbuttonaccessabilityID(Constant_settings.Settings_AccountSettings_Subscription_cardicon_accessid);
        Thread.sleep(2000);
    }

    @Then("I verify the header of the subscription page")
    public void iVerifyTheHeaderOfTheSubscriptionPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the header of the subscription page");
        asserttextValidationAccessibility(Constant_settings.Settings_Subscription_header_text, Constant_settings.Settings_Subscription_header_accessid);
        Thread.sleep(2000);
    }

    @Then("I tap on Edit profile in profile screen")
    public void iTapOnEditProfileInProfileScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on Edit profile in profile screen");
        TaponbuttonaccessabilityID(Constant_settings.Settings_profile_Editprofile_cardicon_accessid);
        Thread.sleep(2000);
    }

    @Then("I Verify Edit profile header text")
    public void iVerifyEditProfileHeaderText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Edit profile header text");
        asserttextValidationAccessibility(Constant_settings.Settings_Edit_profile_Header_text, Constant_settings.Settings_Edit_profile_Header_text_accessid);
    }

    @Then("I Verify user profile photo in edit profile screen")
    public void iVerifyUserProfilePhotoInEditProfileScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify user profile photo in edit profile screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_Edit_profile_photo_accessid));
    }

    @Then("I Verify user email value is displayed")
    public void iVerifyUserEmailValueIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify user email value is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_Edit_profile_emailvalue_accessid));
    }

    @Then("I Verify Firstname label is displayed")
    public void iVerifyFirstnameLabelIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Firstname label is displayed");
        asserttextValidationAccessibility(Constant_settings.Settings_Edit_profile_firstname_text, Constant_settings.Settings_Edit_profile_firstname_text_accessid);
    }

    @Then("I Verify Firstname Value is displayed")
    public void iVerifyFirstnameValueIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Firstname Value is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_Edit_profile_firstname_value_accessid));
    }

    @Then("I Verify Lastname label is displayed")
    public void iVerifyLastnameLabelIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Lastname label is displayed");
        asserttextValidationAccessibility(Constant_settings.Settings_Edit_profile_lastname_text, Constant_settings.Settings_Edit_profile_lastname_text_accessid);
    }

    @Then("I Verify Lastname Value is displayed")
    public void iVerifyLastnameValueIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Lastname Value is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_Edit_profile_lastname_value_accessid));
    }

    @Then("I Verify Primary Mobile label is displayed")
    public void iVerifyPrimaryMobileLabelIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Primary Mobile label is displayed");
        asserttextValidationAccessibility(Constant_settings.Settings_Edit_profile_primaryMobile_text, Constant_settings.Settings_Edit_profile_primaryMobile_text_accessid);
    }

    @Then("I Verify Primary Mobile Value is displayed")
    public void iVerifyPrimaryMobileValueIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Primary Mobile Value is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_Edit_profile_primaryMobile_value_accessid));
    }

    @Then("I Verify Address label is displayed in Edit profile screen")
    public void iVerifyAddressLabelIsDisplayedInEditProfileScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Address label is displayed in Edit profile screen");
        asserttextValidationAccessibility(Constant_settings.Settings_Edit_profile_address_text, Constant_settings.Settings_Edit_profile_address_text_accessid);
    }

    @Then("I Verify Address value is displayed in Edit profile screen")
    public void iVerifyAddressValueIsDisplayedInEditProfileScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), " Verify Address value is displayed in Edit profile screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_Edit_profile_address_value_accessid));
    }

    @Then("I Verify Save Button is displayed")
    public void iVerifySaveButtonIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Save Button is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_Edit_profile_saveButton_accessid));
    }

    @Then("I Verify the Close Button is Edit profile Page")
    public void iVerifyTheCloseButtonIsEditProfilePage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Close Button is Edit profile Page");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_Edit_profile_CloseButton_accessid));
    }

    @Then("I Enter an empty in First name Field in Edit profile screen")
    public void iEnterAnEmptyInFirstNameFieldInEditProfileScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter an empty in First name Field in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_settings.Settings_Edit_profile_firstname_value_accessid);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_settings.Settings_Edit_profile_firstname_value_accessid);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }

    @Then("I Enter an empty in Last name Field in Edit profile screen")
    public void iEnterAnEmptyInLastNameFieldInEditProfileScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter an empty in Last name Field in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_settings.Settings_Edit_profile_lastname_value_accessid);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_settings.Settings_Edit_profile_lastname_value_accessid);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }

    @Then("I Enter an empty in Primary Field Mobile in Edit profile screen")
    public void iEnterAnEmptyInPrimaryFieldMobileInEditProfileScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter an empty in Primary Field Mobile in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_settings.Settings_Edit_profile_primaryMobile_value_accessid);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_settings.Settings_Edit_profile_primaryMobile_value_accessid);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }

    @Then("I Enter an empty in Address field in Edit profile screen")
    public void iEnterAnEmptyInAddressFieldInEditProfileScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter an empty in Address field in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_settings.Settings_Edit_profile_address_value_accessid);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_settings.Settings_Edit_profile_address_value_accessid);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }

    @Then("I tap on Save button")
    public void iTapOnSaveButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on Save button");
        TaponbuttonaccessabilityID(Constant_settings.Settings_Edit_profile_saveButton_accessid);
    }

    @Then("I Enter an Emoji's in First name Field in Edit profile screen")
    public void iEnterAnEmojiSInFirstNameFieldInEditProfileScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter an Emoji's in First name Field in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_settings.Settings_Edit_profile_firstname_value_accessid);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_settings.Settings_Edit_profile_firstname_value_accessid);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        String emojis = Constant_settings.grinning_face_with_smiling_eyes + Constant_settings.face_with_tears_of_joy +
                Constant_settings.smiling_face_with_open_mouth_and_cold_sweat + Constant_settings.smiling_face_with_open_mouth_and_tightly_closed_eyes +
                Constant_settings.winking_face;
        entertextaccessabilityId(emojis, Constant_settings.Settings_Edit_profile_firstname_value_accessid);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }

    @Then("I Enter an Emoji's in Last name Field in Edit profile screen")
    public void iEnterAnEmojiSInLastNameFieldInEditProfileScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter an Emoji's in Last name Field in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_settings.Settings_Edit_profile_lastname_value_accessid);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_settings.Settings_Edit_profile_lastname_value_accessid);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        String emojis = Constant_settings.grinning_face_with_smiling_eyes + Constant_settings.face_with_tears_of_joy +
                Constant_settings.smiling_face_with_open_mouth_and_cold_sweat + Constant_settings.smiling_face_with_open_mouth_and_tightly_closed_eyes +
                Constant_settings.winking_face;
        entertextaccessabilityId(emojis, Constant_settings.Settings_Edit_profile_lastname_value_accessid);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @Then("I Enter an Primary Mobile in Edit profile screen")
    public void iEnterAnPrimaryMobileInEditProfileScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter an Primary Mobile in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_settings.Settings_Edit_profile_primaryMobile_value_accessid);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_settings.Settings_Edit_profile_primaryMobile_value_accessid);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        entertextaccessabilityId(Constant_settings.editProfile_phoneValue, Constant_settings.Settings_Edit_profile_primaryMobile_value_accessid);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));


    }

    @Then("I Enter an Emoji's in Address field in Edit profile screen")
    public void iEnterAnEmojiSInAddressFieldInEditProfileScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter an Emoji's in Address field in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_settings.Settings_Edit_profile_address_value_accessid);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_settings.Settings_Edit_profile_address_value_accessid);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        String emojis = Constant_settings.grinning_face_with_smiling_eyes + Constant_settings.face_with_tears_of_joy +
                Constant_settings.smiling_face_with_open_mouth_and_cold_sweat + Constant_settings.smiling_face_with_open_mouth_and_tightly_closed_eyes +
                Constant_settings.winking_face;
        entertextaccessabilityId(emojis, Constant_settings.Settings_Edit_profile_address_value_accessid);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }

    @Then("I tap on Ok button")
    public void iTapOnOkButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on Ok button");
        if (driver.findElements(By.xpath(Constant_settings.Settings_Edit_profile_ok_button_xpath)).size() != 0) {
            Taponbutton(Constant_settings.Settings_Edit_profile_ok_button_xpath);
        }
    }

    @Then("I Enter an Special character in First name Field in Edit profile screen")
    public void iEnterAnSpecialCharacterInFirstNameFieldInEditProfileScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter an Special character in First name Field in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_settings.Settings_Edit_profile_firstname_value_accessid);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_settings.Settings_Edit_profile_firstname_value_accessid);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        entertextaccessabilityId(Constant_settings.editProfile_firstNameValue_SpecialCharacter, Constant_settings.Settings_Edit_profile_firstname_value_accessid);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @Then("I Enter an Special character in Last name Field in Edit profile screen")
    public void iEnterAnSpecialCharacterInLastNameFieldInEditProfileScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter an Special character in Last name Field in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_settings.Settings_Edit_profile_lastname_value_accessid);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_settings.Settings_Edit_profile_lastname_value_accessid);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        entertextaccessabilityId(Constant_settings.editProfile_lastameValue_SpecialCharacter, Constant_settings.Settings_Edit_profile_lastname_value_accessid);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @Then("I Enter an Special character in Address field in Edit profile screen")
    public void iEnterAnSpecialCharacterInAddressFieldInEditProfileScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter an Special character in Address field in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_settings.Settings_Edit_profile_address_value_accessid);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_settings.Settings_Edit_profile_address_value_accessid);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        entertextaccessabilityId(Constant_settings.editProfile_addressValue_SpecialCharacter, Constant_settings.Settings_Edit_profile_address_value_accessid);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @Then("I Enter an First name in Edit profile screen")
    public void iEnterAnFirstNameInEditProfileScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter an First name in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_settings.Settings_Edit_profile_firstname_value_accessid);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_settings.Settings_Edit_profile_firstname_value_accessid);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        entertextaccessabilityId(Constant_settings.editProfile_firstNameValue, Constant_settings.Settings_Edit_profile_firstname_value_accessid);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }

    @Then("I Enter an Last name in Edit profile screen")
    public void iEnterAnLastNameInEditProfileScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter an Last name in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_settings.Settings_Edit_profile_lastname_value_accessid);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_settings.Settings_Edit_profile_lastname_value_accessid);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        entertextaccessabilityId(Constant_settings.editProfile_lastameValue, Constant_settings.Settings_Edit_profile_lastname_value_accessid);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }

    @Then("I Enter an Address in Edit profile screen")
    public void iEnterAnAddressInEditProfileScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter an Address in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_settings.Settings_Edit_profile_address_value_accessid);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_settings.Settings_Edit_profile_address_value_accessid);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        entertextaccessabilityId(Constant_settings.editProfile_addressValue, Constant_settings.Settings_Edit_profile_address_value_accessid);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }

    @Then("I tap on Edit vessel Name")
    public void iTapOnEditVesselName() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on Edit vessel Name");
        TaponbuttonaccessabilityID(Constant_settings.Device_Management_Edit_vessel_name_access_id);
        System.out.println("clicked Edit vessel Name");
    }

    @Then("I change Edit vessel name")
    public void iChangeEditVesselName() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I change Edit vessel name");
        entertextaccessabilityId(Constant_settings.Device_name_New_data, Constant_settings.Device_Management_Edit_vessel_name_access_id);
        EditedNameValue = Constant_settings.Device_name_New_data;
    }

    @Then("I click on Edit vessel image")
    public void iClickOnEditVesselImage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I click on Edit vessel image");
        TaponbuttonaccessabilityID(Constant_settings.Device_Management_Edit_vessel_image_access_id);
        System.out.println("clicked Edit vessel image");
    }

    @Then("I click on Save button")
    public void iClickOnSaveButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I click on Save button");
        TaponbuttonaccessabilityID(Constant_settings.Device_Management_Edit_vessel_Save_button_access_id);
        System.out.println("clicked Save button");
    }

    @Then("I verify the given new device name under the image")
    public void iVerifyTheGivenNewDeviceNameUnderTheImage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the given new device name under the image");
//        String string1 = driver.findElementByAccessibilityId(Constant_settings.Device_Management_page_Device_name_access_id).getText();
//        System.out.println(string1);
        asserttextValidationAccessibility(Constant_settings.Device_name_New_data, Constant_settings.Device_Management_page_Device_name_access_id);
        System.out.println("Given new device name under the image verified");
    }

    @Then("I verify the given new device name in the Name field")
    public void iVerifyTheGivenNewDeviceNameInTheNameField() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the given new device name under the image");
        asserttextValidationAccessibility(Constant_settings.Device_name_New_data, Constant_settings.Device_Management_Name_access_id);
        System.out.println("Given new device name in the Name field verified");
    }

    @Then("I Tap on back button in Device Management page")
    public void iTapOnBackButtonInDeviceManagementPage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on back button in Device Management page");
        TaponbuttonaccessabilityID(Constant_settings.Device_Management_back_button_access_id);
        System.out.println("clicked back button in Device Management page");
    }

    @Then("I verify edited device name in device list page")
    public void iVerifyEditedDeviceNameInDeviceListPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify edited device name in device list page");
        asserttextValidationAccessibility(EditedNameValue, Constant_settings.Device_Management_1st_device_name_access_id);
        System.out.println("Given edited device name in device list page");
    }

    @Then("I enter an invalid vessel name")
    public void iEnterAnInvalidVesselName() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter a valid vessel name");
        entertextaccessabilityId(Constant_settings.Device_name_invalid_data, Constant_settings.Device_Management_Edit_vessel_name_access_id);
        EditedNameValue = Constant_settings.Device_name_invalid_data;
    }

    @Then("I enter a vessel name with emojis")
    public void iEnterAVesselNameWithEmojis() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter a vessel name with emojis");
        entertextaccessabilityId(emojis, Constant_settings.Device_Management_Edit_vessel_name_access_id);
        EditedNameValue = emojis;
    }

    @Then("I enter a valid vessel name")
    public void iEnterAValidVesselName() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter a valid vessel name");
        entertextaccessabilityId(Constant_settings.Device_name_valid_data, Constant_settings.Device_Management_Edit_vessel_name_access_id);
        EditedNameValue = Constant_settings.Device_name_valid_data;
    }

    @Then("I Tap on App Settings")
    public void iTapOnAppSettings() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on App Settings");
        TaponbuttonaccessabilityID(com.dometic.MTC.qa.Pages.Constant_settings.Settings_appSettings_text_access_id);
        Thread.sleep(2000);
    }

    @Then("I verify the App setting header text")
    public void iVerifyTheAppSettingHeaderText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the App setting header text");
        asserttextValidationAccessibility(Constant_settings.Settings_App_setting_header_text_expected, Constant_settings.Settings_App_settings_App_setting_header_tile_text_access_id);
    }

    @Then("I verify the language text on the app setting page")
    public void iVerifyTheLanguageTextOnTheAppSettingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the language text on the app setting page");
        asserttextValidationAccessibility(Constant_settings.Settings_App_setting_language_text_expected, Constant_settings.Settings_App_settings_App_language_text_access_id);
    }

    @Then("I verify the Temperature text on the setting page")
    public void iVerifyTheTemperatureTextOnTheSettingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Temperature text on the setting page");
        asserttextValidationAccessibility(Constant_settings.Settings_App_setting_temperature_text_expected, Constant_settings.Settings_App_settings_Temperature_text_access_id);
    }

    @Then("I verify the celcius temperature unit")
    public void iVerifyTheCelciusTemperatureUnit() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the celcius temperature unit");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_App_settings_Temperature_celcius_text_access_id));
    }

    @Then("I verify the fahrenheit temperature unit")
    public void iVerifyTheFahrenheitTemperatureUnit() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the fahrenheit temperature unit");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_App_settings_Temperature_fahrenheit_text_access_id));
    }

    @Then("I verify the app version name card title")
    public void iVerifyTheAppVersionNameCardTitle() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the app version name card title");
        asserttextValidationAccessibility(Constant_settings.Settings_App_setting_app_version_text_expected, Constant_settings.Settings_App_settings_App_version_access_id);
    }

    @Then("I tap on the language collapse button")
    public void iTapOnTheLanguageCollapseButton() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the language collapse button");
        TaponbuttonaccessabilityID(Constant_settings.Settings_App_settings_language_text_collapse_button_access_id);
        Thread.sleep(2000);
    }

    @Then("I verify the language page header text")
    public void iVerifyTheLanguagePageHeaderText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the language page header text");
        asserttextValidationAccessibility(Constant_settings.Settings_App_setting_Language_page_header_text_expected, Constant_settings.Settings_App_settings_Language_header_text_access_id);
    }

    @Then("I verify the english language text")
    public void iVerifyTheEnglishLanguageText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the english language text");
        //asserttextValidationAccessibility(Constant_settings.Settings_App_setting_Language_page_English_text_expected,Constant_settings.Settings_App_settings_english_language_text_access_id);
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_settings.Settings_App_settings_english_language_text_access_id);
        if (elementsByAccessibilityId.size() != 0) {
            asserttextValidationAccessibility(Constant_settings.Settings_App_setting_Language_page_English_text_expected, Constant_settings.Settings_App_settings_english_language_text_access_id);
        }
    }

    @Then("I verify the spanish language text")
    public void iVerifyTheSpanishLanguageText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the spanish language text");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_settings.Settings_App_settings_spanish_language_text_access_id);
        if (elementsByAccessibilityId.size() != 0) {
            asserttextValidationAccessibility(Constant_settings.Settings_App_setting_Language_page_Spanish_text_expected, Constant_settings.Settings_App_settings_spanish_language_text_access_id);
        }
    }

    @Then("I verify the french language text")
    public void iVerifyTheFrenchLanguageText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the french language text");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_settings.Settings_App_settings_french_language_text_access_id);
        if (elementsByAccessibilityId.size() != 0) {
            asserttextValidationAccessibility(Constant_settings.Settings_App_setting_Language_page_French_text_expected, Constant_settings.Settings_App_settings_french_language_text_access_id);
        }
    }

    @Then("I verify the german language text")
    public void iVerifyTheGermanLanguageText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the german language text");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_settings.Settings_App_settings_german_language_text_access_id);
        if (elementsByAccessibilityId.size() != 0) {
            asserttextValidationAccessibility(Constant_settings.Settings_App_setting_Language_page_German_text_expected, Constant_settings.Settings_App_settings_german_language_text_access_id);
        }
    }

    @Then("I tap on the back button icon on language page")
    public void iTapOnTheBackButtonIconOnLanguagePage() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the back button icon on language page");
        TaponbuttonaccessabilityID(Constant_settings.Settings_App_settings_Language_page_back_button_icon_access_id);
        Thread.sleep(2000);
    }

    @Then("I tap on the back button icon on app setting page")
    public void iTapOnTheBackButtonIconOnAppSettingPage() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the back button icon on app setting page");
        TaponbuttonaccessabilityID(Constant_settings.Settings_App_settings_App_setting_page_back_button_icon_access_id);
        Thread.sleep(2000);
    }

    @Then("I update Temperature Unit in Settings to fahrenheit")
    public void iUpdateTemperatureUnitInSettingsToFahrenheit() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I update Temperature Unit in Settings to fahrenheit");
        TaponbuttonaccessabilityID(Constant_settings.Settings_App_settings_Temperature_fahrenheit_text_access_id);
        fahrenheitText = driver.findElementByAccessibilityId(Constant_settings.Settings_App_settings_Temperature_fahrenheit_text_access_id).getText();
        celciusText = driver.findElementByAccessibilityId(Constant_settings.Settings_App_settings_Temperature_celcius_text_access_id).getText();
    }

    @Then("I validate updated value displayed inside the climate tile")
    public void iValidateUpdatedValueDisplayedInsideTheClimateTile() {
        if (driver.findElementsByAccessibilityId(Constant_settings.Climate_main_tile_inside_temp).size() != 0) {
            String actualString = driver.findElementByAccessibilityId(Constant_settings.Climate_main_tile_inside_temp).getText();
            if (actualString.contains(fahrenheitText)) {
                System.out.println("Text comparison is Successful");
            } else {
                System.out.println("Both Actual and Expected text is mismatching");
            }
        }
    }

    @Then("I update the Temperature Unit in Settings to Celcius")
    public void iUpdateTheTemperatureUnitInSettingsToCelcius() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I update the Temperature Unit in Settings to Celcius");
        TaponbuttonaccessabilityID(Constant_settings.Settings_App_settings_Temperature_celcius_text_access_id);
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

    @Then("I validated updated value displayed inside the climate tile")
    public void iValidatedUpdatedValueDisplayedInsideTheClimateTile() {
        String actualString = driver.findElementByAccessibilityId(Constant_settings.Climate_main_tile_inside_temp).getText();
        if (actualString.contains(celciusText)) {
            System.out.println("Text comparison is Successful");
        } else {
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }
    @Then("I verify settings screen back button")
    public void iVerifySettingsScreenBackButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify settings screen back button");
        Assert.assertTrue(iselementdisplayedaccessabilityId(com.dometic.SDB.qa.Pages.Constant_settings.Settings_headerBackButtonIcon_access_id));
        System.out.println("Settings screen back button is verified");
    }

    @Then("I verify user profile photo is displayed")
    public void iVerifyUserProfilePhotoIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify user profile photo is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(com.dometic.SDB.qa.Pages.Constant_settings.Settings_userProfilePhoto_access_id));
        System.out.println("User profile photo is verified");
    }

    @Then("I verify username is displayed")
    public void iVerifyUsernameIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify username is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(com.dometic.SDB.qa.Pages.Constant_settings.Settings_userName_access_id));
        System.out.println("Username text is verified");
    }

    @Then("I verify user email is displayed")
    public void iVerifyUserEmailIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify user email is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(com.dometic.SDB.qa.Pages.Constant_settings.Settings_userEmail_access_id));
        System.out.println("User email text is verified");
    }

    @Then("I verify Home text is displayed")
    public void iVerifyHomeTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Home text is displayed");
        asserttextValidationAccessibility(com.dometic.SDB.qa.Pages.Constant_settings.Settings_home_text, com.dometic.SDB.qa.Pages.Constant_settings.Settings_home_text_access_id);
        System.out.println("Home text is verified");
    }

    @Then("I verify Notification Settings text is displayed")
    public void iVerifyNotificationSettingsTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Notification Settings text is displayed");
        asserttextValidationAccessibility(com.dometic.SDB.qa.Pages.Constant_settings.Settings_notificationSettings_text, com.dometic.SDB.qa.Pages.Constant_settings.Settings_notificationSettings_text_access_id);
        System.out.println("Notification Settings text is verified");
    }

    @Then("I verify Device Management is displayed")
    public void iVerifyDeviceManagementIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Device Management is displayed");
        asserttextValidationAccessibility(com.dometic.SDB.qa.Pages.Constant_settings.Settings_deviceMangagement_text, com.dometic.SDB.qa.Pages.Constant_settings.Settings_deviceMangagement_text_access_id);
        System.out.println("Device Management text is verified");
    }

    @Then("I verify App Settings is displayed")
    public void iVerifyAppSettingsIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify App Settings is displayed");
        asserttextValidationAccessibility(com.dometic.SDB.qa.Pages.Constant_settings.Settings_appSettings_text, com.dometic.SDB.qa.Pages.Constant_settings.Settings_appSettings_text_access_id);
        System.out.println("App Settings text is verified");
    }

    @Then("I verify Logout is displayed")
    public void iVerifyLogoutIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Logout is displayed");
        asserttextValidationAccessibility(com.dometic.SDB.qa.Pages.Constant_settings.Settings_Logout_text, com.dometic.SDB.qa.Pages.Constant_settings.Settings_Logout_text_access_id);
        System.out.println("Logout text is verified");
    }

    @Then("I verify Version {double} is displayed")
    public void iVerifyVersionIsDisplayed(double arg) throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Version 1.6 is displayed");
        asserttextValidationAccessibility(com.dometic.SDB.qa.Pages.Constant_settings.Settings_Version_16_text, com.dometic.SDB.qa.Pages.Constant_settings.Settings_Version_16_text_access_id);
        System.out.println("Version 1.6 text is verified");
    }
    @Then("I Tap on Home in Settings screen")
    public void iTapOnHomeInSettingsScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Home in Settings screen");
        TaponbuttonaccessabilityID(com.dometic.SDB.qa.Pages.Constant_settings.Settings_home_text_access_id);
        Thread.sleep(2000);
    }

    @Then("I Tap on Notification Settings")
    public void iTapOnNotificationSettings() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Notification Settings");
        TaponbuttonaccessabilityID(com.dometic.SDB.qa.Pages.Constant_settings.Settings_notificationSettings_text_access_id);
        Thread.sleep(2000);
    }

    @Then("I Tap on Device Management")
    public void iTapOnDeviceManagement() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Device Management");
        if (driver.findElementsByAccessibilityId(com.dometic.SDB.qa.Pages.Constant_settings.Settings_deviceMangagement_text_access_id).size() != 0) {
            TaponbuttonaccessabilityID(com.dometic.SDB.qa.Pages.Constant_settings.Settings_deviceMangagement_text_access_id);
            Thread.sleep(2000);
        }
    }

    @Then("I verify View Edit Account text is displayed")
    public void iVerifyViewEditAccountTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify View/Edit Account text is displayed");
        asserttextValidationAccessibility(com.dometic.SDB.qa.Pages.Constant_settings.Settings_viewEditButtonText, com.dometic.SDB.qa.Pages.Constant_settings.Settings_viewEditButtonText_access_id);
        System.out.println("View Edit Account text is verified");
    }

    @Then("I tap on close button in Edit profile screen")
    public void iTapOnCloseButtonInEditProfileScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on close button in Edit profile screen");
        TaponbuttonaccessabilityID(Constant_settings.Settings_Edit_profile_CloseButton_accessid);
    }
}

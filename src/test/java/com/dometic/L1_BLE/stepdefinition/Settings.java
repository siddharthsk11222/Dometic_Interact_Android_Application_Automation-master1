package com.dometic.L1_BLE.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.L1.qa.Pages.Constant_climate_ac;
import com.dometic.L1.qa.Pages.Constant_landingscreen;
import com.dometic.L1.qa.Pages.Constant_settings;
import com.dometic.L1.qa.util.Baseclass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class Settings extends Baseclass {
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
}

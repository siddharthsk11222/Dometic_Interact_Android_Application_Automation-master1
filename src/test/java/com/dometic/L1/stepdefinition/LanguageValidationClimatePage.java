package com.dometic.L1.stepdefinition;

import com.dometic.L1.qa.Pages.Constant_Language;
import com.dometic.L1.qa.Pages.Constant_climate_ac;
import com.dometic.L1.qa.Pages.Constant_climate_heater;
import com.dometic.L1.qa.util.Baseclass;
import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LanguageValidationClimatePage extends Baseclass {
    @Then("I Tap on Klima tile in landing screen")
    public void iTapOnKlimaTileInLandingScreen() {
        WebDriverWait wait=new WebDriverWait(driver,50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_Language.Climate_German_Klima_text_xpath)));
        Taponbutton(Constant_Language.Climate_German_Klima_text_xpath);
    }

    @Then("I Verify Klima title in top of the app")
    public void iVerifyKlimaTitleInTopOfTheApp() throws Throwable {
        asserttextAccessibility(Constant_Language.Climate_German_Klima_text_expected, Constant_climate_ac.CAC_M_Climate_Text_access_id);
    }

    @Then("I Verify Innen text displayed in Klima screen")
    public void iVerifyInnenTextDisplayedInKlimaScreen() throws Throwable {
        asserttextAccessibility(Constant_Language.Climate_Inside_German_Text_expected,Constant_climate_ac.CAC_M_Inside_Text_access_id);
    }

    @Then("I Verify Innen field is displayed in klima screen")
    public void iVerifyInnenFieldIsDisplayedInKlimaScreen() {
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_M_Inside_Value_access_id));
    }

    @Then("I verify Außen text displayed in klima screen")
    public void iVerifyAußenTextDisplayedInKlimaScreen() throws Throwable {
        asserttextAccessibility(Constant_Language.Climate_Outside_German_Text_expected,Constant_climate_ac.CAC_M_Outside_Text_access_id);
    }

    @Then("I verify Außen field displayed in klima screen")
    public void iVerifyAußenFieldDisplayedInKlimaScreen() {
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_M_Outside_Value_access_id));
    }

    @Then("I verify fan icon is displayed in klima screen")
    public void iVerifyFanIconIsDisplayedInKlimaScreen() {
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_FanSpeed_icon_access_id));
    }

    @Then("I verify fan Speed is displayed in klima screen")
    public void iVerifyFanSpeedIsDisplayedInKlimaScreen() {
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_FanSpeed_text_access_id));
    }

    @Then("I verify Energie text is displayed in klima screen")
    public void iVerifyEnergieTextIsDisplayedInKlimaScreen() throws Throwable {
        asserttextAccessibility(Constant_Language.Power_German_Energie_text_expected,Constant_climate_ac.CAC_M_Power_Text_access_id);
    }

    @Then("I verify Energie toggle displayed in klima screen")
    public void iVerifyEnergieToggleDisplayedInKlimaScreen() {
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_M_Power_Button_access_id));
    }

    @Then("I verify Temperatur text displayed in klima screen")
    public void iVerifyTemperaturTextDisplayedInKlimaScreen() throws Throwable {
        asserttextAccessibility(Constant_Language.Climate_Temperature_German_Klima_text_expected,Constant_climate_ac.CAC_M_Temp_Text_access_id);
    }

    @Then("I verify Temperatur toggle displayed in klima screen")
    public void iVerifyTemperaturToggleDisplayedInKlimaScreen() {
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_M_Temp_Value_access_id));
    }

    @Then("I verify AC text displayed in klima screen")
    public void iVerifyACTextDisplayedInKlimaScreen() throws Throwable {
        asserttextAccessibility(Constant_climate_ac.CAC_M_AC_Text_expected,Constant_climate_ac.CAC_M_AC_Text_access_id);
    }

    @Then("I verify Heizung text displayed in klima screen")
    public void iVerifyHeizungTextDisplayedInKlimaScreen() throws Throwable {
        asserttextAccessibility(Constant_Language.Climate_Heater_German_Klima_text_expected,Constant_climate_ac.CAC_M_Heater_Text_access_id);
    }

    @Then("I verify AC Mode in klima screen")
    public void iVerifyACModeInKlimaScreen() throws Throwable {
        asserttextAccessibility(Constant_Language.Climate_ACMODE_German_text_expected,Constant_climate_ac.CAC_M_AC_Mode_Text_access_id);
    }

    @Then("I verify AC Fan Speed in klima screen")
    public void iVerifyACFanSpeedInKlimaScreen() throws Throwable {
        asserttextAccessibility(Constant_Language.Climate_ACFanSpeed_German_Klima_text_expected,Constant_climate_ac.CAC_M_AC_FanSpeed_Text_access_id);
    }

    @Then("I Tap on Ac Mode in Klima screen")
    public void iTapOnAcModeInKlimaScreen() {
        TaponbuttonaccessabilityID(Constant_climate_ac.CAC_M_climate_acModeContainer_access_id);
    }

    @Then("I Verify Innen text displayed in Ac Mode")
    public void iVerifyInnenTextDisplayedInAcMode() throws Throwable {
        asserttextAccessibility(Constant_Language.Climate_Inside_German_Text_expected,Constant_climate_ac.CAC_AM_Inside_Text_access_id);
    }

    @Then("I Verify Innen field is displayed in Ac Mode")
    public void iVerifyInnenFieldIsDisplayedInAcMode() {
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_AM_Inside_Value_access_id));
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_AM_Inside_Units_access_id));
    }

    @Then("I verify Außen text displayed in Ac Mode")
    public void iVerifyAußenTextDisplayedInAcMode() throws Throwable {
        asserttextAccessibility(Constant_Language.Climate_Outside_German_Text_expected,Constant_climate_ac.CAC_AM_Outside_Text_access_id);
    }

    @Then("I verify Außen field displayed in Ac Mode")
    public void iVerifyAußenFieldDisplayedInAcMode() {
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_AM_Outside_Value_access_id));
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_AM_Outside_Units_access_id));
    }

    @Then("I verify fan icon is displayed in Ac Mode")
    public void iVerifyFanIconIsDisplayedInAcMode() {
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_AM_Fan_Symbol_access_id));
    }

    @Then("I verify fan Speed is displayed in Ac Mode")
    public void iVerifyFanSpeedIsDisplayedInAcMode() {
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_AM_Fan_Value_access_id));
    }

    @Then("I verify AC MODE text is displayed in Ac Mode")
    public void iVerifyACMODETextIsDisplayedInAcMode() throws Throwable {
        asserttextAccessibility(Constant_Language.Climate_ACMODE_German_text_expected,Constant_climate_ac.CAC_AM_AC_Mode_Title_access_id);
    }


    @Then("I verify Anwenden button is displayed in Ac Mode")
    public void iVerifyAnwendenButtonIsDisplayedInAcMode() throws Throwable {
        asserttextAccessibility(Constant_Language.Climate_Apply_German_text_expected,Constant_climate_ac.CAC_AM_Apply_Button_text_access_id);
    }

    @Then("I Tap on Ac Lüftergeschwindigkeit in Klima screen")
    public void iTapOnAcLüftergeschwindigkeitInKlimaScreen() {
        driver.pressKeyCode(AndroidKeyCode.BACK);
        WebDriverWait wait=new WebDriverWait(driver,50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_climate_ac.CAC_M_AC_FanSpeed_Text_xpath)));
        TaponbuttonaccessabilityID(Constant_climate_ac.CAC_M_AC_FanSpeed_Text_access_id);
    }

    @Then("I Verify Innen text displayed in Ac Lüftergeschwindigkeit")
    public void iVerifyInnenTextDisplayedInAcLüftergeschwindigkeit() throws Throwable {
        asserttextAccessibility(Constant_Language.Climate_Inside_German_Text_expected, Constant_climate_ac.CAC_AFS_Inside_Text_access_id);
    }

    @Then("I Verify Innen field is displayed in Ac Lüftergeschwindigkeit")
    public void iVerifyInnenFieldIsDisplayedInAcLüftergeschwindigkeit() {
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_AFS_Inside_Value_access_id));
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_AFS_Inside_Units_access_id));
    }

    @Then("I verify Außen text displayed in Ac Lüftergeschwindigkeit")
    public void iVerifyAußenTextDisplayedInAcLüftergeschwindigkeit() throws Throwable {
        asserttextAccessibility(Constant_Language.Climate_Outside_German_Text_expected, Constant_climate_ac.CAC_AFS_Outside_Text_access_id);
    }

    @Then("I verify Außen field displayed in Ac Lüftergeschwindigkeit")
    public void iVerifyAußenFieldDisplayedInAcLüftergeschwindigkeit() {
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_AFS_Outside_Value_access_id));
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_AFS_Outside_Units_access_id));
    }

    @Then("I verify fan icon is displayed in Ac Lüftergeschwindigkeit")
    public void iVerifyFanIconIsDisplayedInAcLüftergeschwindigkeit() {
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_AFS_Fan_Symbol_access_id));
    }

    @Then("I verify fan Speed is displayed in Ac Lüftergeschwindigkeit")
    public void iVerifyFanSpeedIsDisplayedInAcLüftergeschwindigkeit() {
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_AFS_Fan_Value_access_id));
    }

    @Then("I verify Ac Lüftergeschwindigkeit text is displayed in Ac Mode")
    public void iVerifyAcLüftergeschwindigkeitTextIsDisplayedInAcMode() throws Throwable {
        asserttextAccessibility(Constant_Language.Climate_ACFanSpeed_German_Klima_text_expected,Constant_climate_ac.CAC_AFS_AC_Mode_Title_access_id);
    }

    @Then("I verify Anwenden button is displayed in Ac Lüftergeschwindigkeit")
    public void iVerifyAnwendenButtonIsDisplayedInAcLüftergeschwindigkeit() throws Throwable {
        asserttextAccessibility(Constant_Language.Climate_Apply_German_text_expected,Constant_climate_ac.CAC_AFS_Apply_Button_text_access_id);
    }

    @Then("I Tap on Heizung in Klima screen")
    public void iTapOnHeizungInKlimaScreen() {
        driver.pressKeyCode(AndroidKeyCode.BACK);
        WebDriverWait wait=new WebDriverWait(driver,50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_climate_ac.CAC_M_AC_FanSpeed_Text_xpath)));
        TaponbuttonaccessabilityID(Constant_climate_ac.CAC_M_Heater_Text_access_id);
    }

    @Then("I verify Heißwasserstand text displayed in Klima screen")
    public void iVerifyHeißwasserstandTextDisplayedInKlimaScreen() throws Throwable {
        asserttextAccessibility(Constant_Language.HotWaterLevel_German_Energie_text_expected, Constant_climate_heater.CHeater_M_hot_water_level_text_access_id);
    }

    @Then("I verify Energie text displayed in Klima screen")
    public void iVerifyEnergieTextDisplayedInKlimaScreen() throws Throwable {
        asserttextAccessibility(Constant_Language.Energy_German_Energie_text_expected,Constant_climate_heater.CHeater_M_energy_text_access_id);
    }

    @Then("I Tap on Heißwasserstand in Klima screen")
    public void iTapOnHeißwasserstandInKlimaScreen() {
        TaponbuttonaccessabilityID(Constant_climate_heater.CHeater_M_hot_water_level_text_access_id);
    }

    @Then("I Verify Innen text displayed in Heißwasserstand screen")
    public void iVerifyInnenTextDisplayedInHeißwasserstandScreen() throws Throwable {
        asserttextAccessibility(Constant_Language.Climate_Inside_German_Text_expected,Constant_climate_heater.CHeater_HWL_inside_text_access_id);
    }

    @Then("I Verify Innen field is displayed in Heißwasserstand screen")
    public void iVerifyInnenFieldIsDisplayedInHeißwasserstandScreen() {
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_heater.CHeater_HWL_inside_value_access_id));
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_heater.CHeater_HWL_inside_units_access_id));
    }

    @Then("I verify Außen text displayed in Heißwasserstand screen")
    public void iVerifyAußenTextDisplayedInHeißwasserstandScreen() throws Throwable {
        asserttextAccessibility(Constant_Language.Climate_Outside_German_Text_expected,Constant_climate_heater.CHeater_HWL_outside_text_access_id);
    }

    @Then("I verify Außen field displayed in Heißwasserstand screen")
    public void iVerifyAußenFieldDisplayedInHeißwasserstandScreen() {
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_heater.CHeater_HWL_outside_value_access_id));
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_heater.CHeater_HWL_outside_units_access_id));
    }
    @Then("I verify THERME text displayed in Heißwasserstand screen")
    public void iVerifyTHERMETextDisplayedInHeißwasserstandScreen() throws Throwable {
        asserttextAccessibility(Constant_climate_heater.CHeater_HWL_therme_expected,Constant_climate_heater.CHeater_HWL_therme_text_access_id);
    }

    @Then("I verify Anwenden button is displayed in Heißwasserstand screen")
    public void iVerifyAnwendenButtonIsDisplayedInHeißwasserstandScreen() throws Throwable {
        asserttextAccessibility(Constant_Language.Climate_Apply_German_text_expected,Constant_climate_heater.CHeater_HWL_therme_apply_button_text_access_id);
    }

    @Then("I Tap on Energie in Klima screen")
    public void iTapOnEnergieInKlimaScreen() {
        driver.pressKeyCode(AndroidKeyCode.BACK);
        WebDriverWait wait=new WebDriverWait(driver,50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_climate_heater.CHeater_M_hot_water_level_text_xpath)));
        TaponbuttonaccessabilityID(Constant_climate_heater.CHeater_M_energy_text_access_id);
    }

    @Then("I Verify Innen text displayed in Energie screen")
    public void iVerifyInnenTextDisplayedInEnergieScreen() throws Throwable {
        asserttextAccessibility(Constant_Language.Climate_Inside_German_Text_expected,Constant_climate_heater.CHeater_Energy_inside_text_access_id);
    }

    @Then("I Verify Innen field is displayed in Energie screen")
    public void iVerifyInnenFieldIsDisplayedInEnergieScreen() {
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_heater.CHeater_Energy_inside_value_access_id));
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_heater.CHeater_Energy_inside_units_access_id));
    }

    @Then("I verify Außen text displayed in Energie screen")
    public void iVerifyAußenTextDisplayedInEnergieScreen() throws Throwable {
        asserttextAccessibility(Constant_Language.Climate_Outside_German_Text_expected,Constant_climate_heater.CHeater_Energy_outside_text_access_id);
    }

    @Then("I verify Außen field displayed in Energie screen")
    public void iVerifyAußenFieldDisplayedInEnergieScreen() {
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_heater.CHeater_Energy_outside_value_access_id));
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_heater.CHeater_Energy_outside_units_access_id));
    }

    @Then("I verify ENERGIE text displayed in Energie screen")
    public void iVerifyTHERMETextDisplayedInEnergieScreen() throws Throwable {
        asserttextAccessibility(Constant_Language.Energy_German_Energie_text_expected,Constant_climate_heater.CHeater_Energy_energy_text_access_id);
    }

    @Then("I verify Anwenden button is displayed in Energie screen")
    public void iVerifyAnwendenButtonIsDisplayedInEnergieScreen() throws Throwable {
        asserttextAccessibility(Constant_Language.Climate_Apply_German_text_expected,Constant_climate_heater.CHeater_Energy_energy_apply_button_text_access_id);
    }
}

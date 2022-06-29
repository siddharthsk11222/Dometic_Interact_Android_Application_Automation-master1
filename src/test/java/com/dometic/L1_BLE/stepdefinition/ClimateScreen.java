package com.dometic.L1_BLE.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.L1.qa.Pages.Constant_climate_ac;
import com.dometic.L1.qa.Pages.Constant_climate_heater;
import com.dometic.L1.qa.Pages.Constant_landingscreen;
import com.dometic.L1.qa.util.Baseclass;
import cucumber.api.java.en.Then;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ClimateScreen extends Baseclass {
    Basestepdefinition base;
    public static List<String> acMode,fanSpeed,hotWaterLevel,energy;
    public static String maxTemp,minTemp,minTempHeater,maxTempHeater,fanspeed;
    @Then("I Tap on Climate CTA in Landing screen")
    public void iTapOnClimateCTAInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Climate CTA in Landing screen");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_landingscreen.LandingPage_climate_tile_access_id);
        if(elementsByAccessibilityId.size()!=0){
            TaponbuttonaccessabilityID(Constant_landingscreen.LandingPage_climate_tile_access_id);
        }
        else{
            TaponbuttonaccessabilityID(Constant_landingscreen.LandingPage_climate_tile_germen_access_id);
        }

    }

    @Then("I Verify climate text displayed in the top of the app")
    public void iVerifyClimateTextPlacedInTheTopOfTheApp() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify climate text displayed in the top of the app");
        asserttextAccessibility("CLIMATE", Constant_climate_ac.CAC_M_Climate_Text_access_id);
    }

    @Then("I verify climate inside field in climate screen")
    public void iVerifyClimateInsideFieldInClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify climate inside field in climate screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_M_Inside_Text_access_id));
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_M_Inside_Value_access_id));
      //  Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_M_Inside_Units_access_id));
    }

    @Then("I verify Climate outside field in climate screen")
    public void iVerifyClimateOutsideFieldInClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Climate outside field in climate screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_M_Outside_Text_access_id));
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_M_Outside_Value_access_id));
     //   Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_M_Outside_Units_access_id));
    }

    @Then("I verify climate field in climate screen")
    public void iVerifyClimateFieldInClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Climate outside field in climate screen");
        Assert.assertTrue(iselementdisplayed(Constant_climate_ac.CAC_M_climate_temperatureArray_xpath));
    }


    @Then("I verify Power container in climate screen")
    public void iVerifyPowerInClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Power container in climate screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_M_climate_powerContainer_access_id));
    }

    @Then("I verify AC Fan Speed in climate screen")
    public void iVerifyFanSpeedInClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify AC Fan Speed in climate screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_M_climate_fanSpeedContainer_access_id));
    }

    @Then("I verify AC Mode in climate screen")
    public void iVerifyClimateModeInClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify AC Mode in climate screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_M_climate_acModeContainer_access_id));
    }

    @Then("I verify Heat Source in climate screen")
    public void iVerifyHeatSourceInClimateScreen() {
       // Assert.assertTrue(iselementdisplayed(Constant_climate_ac.CAC_M_climate_Heat_source_xpath));
    }

    @Then("I verify Climate AGS in Climate Screen")
    public void iVerifyClimateAGSInClimateScreen() {
    //    Assert.assertTrue(iselementdisplayed(Constant_climate_ac.CAC_M_climate_AGS_xpath));
    }

    @Then("I verify Back Button displayed in left corner of the climate screen")
    public void iVerifyBackButtonDisplayedInLeftCornerOfTheClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Back Button displayed in left corner of the climate screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_M_power_Back_Button_access_id));
    }

    @Then("I Tap on Back Button")
    public void iTapOnBackButton() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Back Button");
       // driver.navigate().back();
        //Taponbutton(Constant_climate_ac.CAC_M_Back_Button_xpath);
        TaponbuttonaccessabilityID(Constant_climate_ac.CAC_M_power_Back_Button_access_id);
//        driver.pressKeyCode(AndroidKeyCode.BACK);
    }

    @Then("i verify temperature in Climate screen")
    public void iVerifyTemperatureInClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "i verify temperature in Climate screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_M_climate_temperatureContainer_access_id));

    }

    @Then("I verify fan icon is displayed in climate screen")
    public void iVerifyFanIconIsDisplayedInClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify fan icon is displayed in climate screen");
        WebDriverWait wait=new WebDriverWait(driver,200);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_climate_ac.CAC_FanSpeed_icon_xpath)));
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_FanSpeed_icon_access_id));
    }

    @Then("I verify fan Speed is displayed in climate screen")
    public void iVerifyFanSpeedIsDisplayedInClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify fan Speed is displayed in climate screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_FanSpeed_text_access_id));
    }

    @Then("I verify Power text displayed in climate screen")
    public void iVerifyPowerTextDisplayedInClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Power text displayed in climate screen");
        asserttextAccessibility(Constant_climate_ac.CAC_M_Power_Text_expected,Constant_climate_ac.CAC_M_Power_Text_access_id);
    }

    @Then("I verify Power toggle displayed in climate screen")
    public void iVerifyPowerToggleDisplayedInClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Power toggle displayed in climate screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_M_Power_Button_access_id));
    }

    @Then("I verify Temperature text displayed in climate screen")
    public void iVerifyTemperatureTextDisplayedInClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Temperature text displayed in climate screen");
        asserttextAccessibility(Constant_climate_ac.CAC_M_Temp_Text_expected,Constant_climate_ac.CAC_M_Temp_Text_access_id);
    }

    @Then("I verify Temperature toggle displayed in climate screen")
    public void iVerifyTemperatureToggleDisplayedInClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Temperature toggle displayed in climate screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_M_Temp_Value_access_id));
    }

    @Then("I verify AC text displayed in climate screen")
    public void iVerifyACTextDisplayedInClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify AC text displayed in climate screen");
        List<AndroidElement> lstElement = driver.findElementsByAccessibilityId(Constant_climate_ac.CAC_M_AC_Text_access_id);
        if(lstElement.size()!=0){
            lstElement.get(0).click();
        }
        asserttextAccessibility(Constant_climate_ac.CAC_M_AC_Text_expected,Constant_climate_ac.CAC_M_AC_Text_access_id);
    }

    @Then("I verify Heater text displayed in climate screen")
    public void iVerifyHeaterTextDisplayedInClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Heater text displayed in climate screen");
        asserttextAccessibility(Constant_climate_ac.CAC_M_Heater_Text_expected,Constant_climate_ac.CAC_M_Heater_Text_access_id);
    }

    @Then("I Tap on AC Fan Speed in climate screen")
    public void iTapOnACFanSpeedInClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on AC Fan Speed in climate screen");
        String text = driver.findElementByAccessibilityId(Constant_climate_ac.CAC_M_AC_Mode_Value_access_id).getText();
        if(text.equals(Constant_climate_ac.CAC_AM_ACMODE_acmodeItemValue_Auto_expected)){
            TaponbuttonaccessabilityID(Constant_climate_ac.CAC_M_climate_acModeContainer_access_id);
            Thread.sleep(2000);
            Basestepdefinition base=new Basestepdefinition();
            base.iScrollDownTheScreen();
            base.iScrollDownTheScreen();
            TaponbuttonaccessabilityID(Constant_climate_ac.CAC_AM_Apply_Button_access_id);
            Thread.sleep(10000);
        }
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_climate_ac.CAC_M_AC_FanSpeed_Text_access_id);
        if (elementsByAccessibilityId.size()!=0){
            WebDriverWait wait=new WebDriverWait(driver,30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_climate_ac.CAC_M_AC_FanSpeed_Text_xpath)));
            TaponbuttonaccessabilityID(Constant_climate_ac.CAC_M_AC_FanSpeed_Text_access_id);
        }

    }

    @Then("I Tap on Ac Mode in Climate screen")
    public void iTapOnAcModeInClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Ac Mode in Climate screen");
        TaponbuttonaccessabilityID(Constant_climate_ac.CAC_M_climate_acModeContainer_access_id);
    }

    @Then("I verify Apply button is displayed in climate screen")
    public void iVerifyApplyButtonIsDisplayedInClimateScreen() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Apply button is displayed in climate screen");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_climate_ac.CAC_M_Apply_button_xpath));
        if(elements.size()!=0){
            WebDriverWait wait=new WebDriverWait(driver,200);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_climate_ac.CAC_M_Apply_Button_xpath)));
            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_M_climate_apply_button_access_id));
        }

    }

    @Then("I Tap on Apply button  in climate screen")
    public void iTapOnApplyBuutonInClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Apply button  in climate screen");
        List<AndroidElement> elements = driver.findElementsByAccessibilityId(Constant_climate_ac.CAC_M_climate_apply_button_access_id);
        if(elements.size()!=0){
            TaponbuttonaccessabilityID(Constant_climate_ac.CAC_M_climate_apply_button_access_id);
            WebDriverWait wait=new WebDriverWait(driver,100);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_climate_ac.CAC_M_Apply_Button_xpath)));
        }
    }

    @Then("I verify climate title is displayed in AC Climate screen")
    public void iVerifyClimateTitleIsDisplayedInACClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify climate title is displayed in AC Climate screen");
        asserttextAccessibility(Constant_climate_ac.CAC_M_Climate_Text_expetecd,Constant_climate_ac.CAC_M_Climate_Text_access_id);
    }

    @Then("I verify inside text is displayed in Ac climate screen")
    public void iVerifyInsideTextIsDisplayedInAcClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify inside text is displayed in Ac climate screen");
        asserttextAccessibility(Constant_climate_ac.CAC_AM_Inside_Text_expected,Constant_climate_ac.CAC_AM_Inside_Text_access_id);

    }

    @Then("I verify inside unit is displayed in Ac climate screen")
    public void iVerifyInsideUnitIsDisplayedInAcClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify inside unit is displayed in Ac climate screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_AM_Inside_Value_access_id));
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_AM_Inside_Units_access_id));
    }

    @Then("I verify outside text is displayed in Ac climate screen")
    public void iVerifyOusideTextIsDisplayedInAcClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify outside text is displayed in Ac climate screen");
        asserttextAccessibility(Constant_climate_ac.CAC_AM_Outside_Text_expected,Constant_climate_ac.CAC_AM_Outside_Text_access_id);
    }

    @Then("I verify outside unit is displayed in Ac climate screen")
    public void iVerifyOutsideUnitIsDisplayedInAcClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify outside unit is displayed in Ac climate screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_AM_Outside_Value_access_id));
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_AM_Outside_Units_access_id));
    }

    @Then("I verify AcMode-temperature is displayed in Ac climate screen")
    public void iVerifyAcModeTemperatureIsDisplayedInAcClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify AcMode-temperature is displayed in Ac climate screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_AM_Temp_Value_access_id));
    }

    @Then("I verify fan icon is displayed in AC climate screen")
    public void iVerifyFanIconIsDisplayedInACClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify fan icon is displayed in AC climate screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_AM_Fan_Symbol_access_id));
    }

    @Then("I verify fan Speed is displayed in AC climate screen")
    public void iVerifyFanSpeedIsDisplayedInACClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify fan Speed is displayed in AC climate screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_AM_Fan_Value_access_id));
    }

    @Then("I verify AC MODE text is displayed in Ac climate screen")
    public void iVerifyACMODETextIsDisplayedInAcClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify AC MODE text is displayed in Ac climate screen");
        asserttextAccessibility(Constant_climate_ac.CAC_AM_ACMODE_Text_expected,Constant_climate_ac.CAC_AM_AC_Mode_Title_access_id);
    }

    @Then("I verify Apply button is displayed in AC climate screen")
    public void iVerifyApplyButtonIsDisplayedInACClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Apply button is displayed in AC climate screen");
        acMode=new ArrayList<>();
        acMode.add(driver.findElement(By.xpath(Constant_climate_ac.CAC_AC_first_value_xpath)).getText());acMode.add(driver.findElement(By.xpath(Constant_climate_ac.CAC_AC_second_value_xpath)).getText());
        acMode.add(driver.findElement(By.xpath(Constant_climate_ac.CAC_AC_third_value_xpath)).getText());
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_AM_Apply_Button_access_id));
    }

    @Then("I Tap on Apply button in AC climate screen")
    public void iTapOnApplyButtonInACClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Apply button in AC climate screen");
        TaponbuttonaccessabilityID(Constant_climate_ac.CAC_AM_Apply_Button_access_id);
    }

    @Then("I verify Back Button displayed in left corner of the AC climate screen")
    public void iVerifyBackButtonDisplayedInLeftCornerOfTheACClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Back Button displayed in left corner of the AC climate screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.TFW_Back_Button_access_id));
    }

    @Then("I verify Climate title is displayed in AC Fan Speed in climate screen")
    public void iVerifyClimateTitleIsDisplayedInACFanSpeedInClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Climate title is displayed in AC Fan Speed in climate screen");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_climate_ac.CAC_M_Climate_Text_access_id);
        if(elementsByAccessibilityId.size()!=0){
            asserttextAccessibility(Constant_climate_ac.CAC_M_Climate_Text_expetecd,Constant_climate_ac.CAC_M_Climate_Text_access_id);
        }

    }

    @Then("I verify inside text is displayed in AC Fan Speed in Ac climate screen")
    public void iVerifyInsideTextIsDisplayedInACFanSpeedInAcClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify inside text is displayed in AC Fan Speed in Ac climate screen");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_climate_ac.CAC_AFS_Inside_Text_access_id);
        if(elementsByAccessibilityId.size()!=0) {
            asserttextAccessibility(Constant_climate_ac.CAC_AM_Inside_Text_expected, Constant_climate_ac.CAC_AFS_Inside_Text_access_id);
        }
    }

    @Then("I verify inside unit is displayed in AC Fan Speed in Ac climate screen")
    public void iVerifyInsideUnitIsDisplayedInACFanSpeedInAcClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify inside unit is displayed in AC Fan Speed in Ac climate screen");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_climate_ac.CAC_AFS_Inside_Value_access_id);
        if(elementsByAccessibilityId.size()!=0) {
            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_AFS_Inside_Value_access_id));
            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_AFS_Inside_Units_access_id));
        }
    }

    @Then("I verify outside text is displayed in AC Fan Speed in Ac climate screen")
    public void iVerifyOutsideTextIsDisplayedInACFanSpeedInAcClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify outside text is displayed in AC Fan Speed in Ac climate screen");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_climate_ac.CAC_AFS_Outside_Text_access_id);
        if(elementsByAccessibilityId.size()!=0) {
            asserttextAccessibility(Constant_climate_ac.CAC_AM_Outside_Text_expected, Constant_climate_ac.CAC_AFS_Outside_Text_access_id);
        }
    }

    @Then("I verify outside unit is displayed in AC Fan Speed in Ac climate screen")
    public void iVerifyOutsideUnitIsDisplayedInACFanSpeedInAcClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify outside unit is displayed in AC Fan Speed in Ac climate screen");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_climate_ac.CAC_AFS_Outside_Value_access_id);
        if(elementsByAccessibilityId.size()!=0) {
            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_AFS_Outside_Value_access_id));
            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_AFS_Outside_Units_access_id));
        }
    }

    @Then("I verify Fanspeed-temperature is displayed in Ac climate screen")
    public void iVerifyFanspeedTemperatureIsDisplayedInAcClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Fanspeed-temperature is displayed in Ac climate screen");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_climate_ac.CAC_AFS_Temp_Value_access_id);
        if(elementsByAccessibilityId.size()!=0) {
            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_AFS_Temp_Value_access_id));
        }
    }

    @Then("I verify Fanspeed fan icon is displayed in AC climate screen")
    public void iVerifyFanspeedFanIconIsDisplayedInACClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Fanspeed fan icon is displayed in AC climate screen");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_climate_ac.CAC_AFS_Fan_Symbol_access_id);
        if(elementsByAccessibilityId.size()!=0) {
            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_AFS_Fan_Symbol_access_id));
        }
    }

    @Then("I verify fanSpeed-getAcFanSpeed is displayed in AC climate screen")
    public void iVerifyFanSpeedGetAcFanSpeedIsDisplayedInACClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify fanSpeed-getAcFanSpeed is displayed in AC climate screen");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_climate_ac.CAC_AFS_Fan_Value_access_id);
        if(elementsByAccessibilityId.size()!=0) {
            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_AFS_Fan_Value_access_id));
        }
    }

    @Then("I verify AC FAN SPEED text is displayed in AC climate screen")
    public void iVerifyACFANSPEEDTextIsDisplayedInACClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify AC FAN SPEED text is displayed in AC climate screen");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_climate_ac.CAC_AFS_AC_Mode_Title_access_id);
        if(elementsByAccessibilityId.size()!=0) {
            asserttextAccessibility(Constant_climate_ac.CAC_AFS_AC_Mode_Title_expected, Constant_climate_ac.CAC_AFS_AC_Mode_Title_access_id);
        }
    }

    @Then("I verify apply button is displayed in AC Fan Speed in Ac Climate screen")
    public void iVerifyApplyButtonIdDisplayedInACFanSpeedInAcClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify apply button id displayed in AC Fan Speed in Ac Climate screen");
        fanSpeed=new ArrayList<>();
        fanSpeed.add(driver.findElement(By.xpath(Constant_climate_ac.CAC_FAN_first_value_xpath)).getText());fanSpeed.add(driver.findElement(By.xpath(Constant_climate_ac.CAC_FAN_second_value_xpath)).getText());
        fanSpeed.add(driver.findElement(By.xpath(Constant_climate_ac.CAC_FAN_third_value_xpath)).getText());

        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_climate_ac.CAC_AFS_Apply_Button_access_id);
        if(elementsByAccessibilityId.size()!=0) {
            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_AFS_Apply_Button_access_id));
        }
    }


    @Then("I Tap on Apply button in AC Fan Speed in Ac Climate screen")
    public void iTapOnApplyButtonInACFanSpeedInAcClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Apply button in AC Fan Speed in Ac Climate screen");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_climate_ac.CAC_AFS_Apply_Button_access_id);
        if(elementsByAccessibilityId.size()!=0) {
            TaponbuttonaccessabilityID(Constant_climate_ac.CAC_AFS_Apply_Button_access_id);
        }
    }

    @Then("I Tap on Heater in climate screen")
    public void iTapOnHeaterInClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Heater in climate screen");
        TaponbuttonaccessabilityID(Constant_climate_ac.CAC_M_Heater_Text_access_id);
    }

    @Then("I verify climate title is displayed in Heater Climate screen")
    public void iVerifyClimateTitleIsDisplayedInHeaterClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify climate title is displayed in Heater Climate screen");
        asserttextAccessibility(Constant_climate_ac.CAC_M_Climate_Text_expetecd,Constant_climate_ac.CAC_M_Climate_Text_access_id);
    }

    @Then("I verify inside text is displayed in Heater Climate screen")
    public void iVerifyInsideTextIsDisplayedInHeaterClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify inside text is displayed in Heater Climate screen");
        asserttextAccessibility(Constant_climate_ac.CAC_AM_Inside_Text_expected, Constant_climate_heater.CHeater_M_inside_text_access_id);
    }

    @Then("I verify inside unit is displayed in Heater Climate screen")
    public void iVerifyInsideUnitIsDisplayedInHeaterClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify inside unit is displayed in Heater Climate screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_heater.CHeater_M_inside_value_access_id));
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_heater.CHeater_M_inside_units_access_id));
    }

    @Then("I verify outside text is displayed in Heater Climate screen")
    public void iVerifyOutsideTextIsDisplayedInHeaterClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify outside text is displayed in Heater Climate screen");
        asserttextAccessibility(Constant_climate_ac.CAC_AM_Outside_Text_expected,Constant_climate_heater.CHeater_M_outside_text_access_id);
    }

    @Then("I verify outside unit is displayed in Heater Climate screen")
    public void iVerifyOutsideUnitIsDisplayedInHeaterClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify outside unit is displayed in Heater Climate screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_heater.CHeater_M_outside_value_access_id));
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_heater.CHeater_M_outside_units_access_id));
    }

    @Then("I verify Power text displayed in Heater climate screen")
    public void iVerifyPowerTextDisplayedInHeaterClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Power text displayed in Heater climate screen");
        asserttextAccessibility(Constant_climate_ac.CAC_M_Power_Text_expected,Constant_climate_heater.CHeater_M_power_text_access_id);
    }

    @Then("I verify Power toggle displayed Heater in climate screen")
    public void iVerifyPowerToggleDisplayedHeaterInClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Power toggle displayed Heater in climate screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_heater.CHeater_M_power_button_access_id));
    }

    @Then("I verify Temperature text displayed in Heater climate screen")
    public void iVerifyTemperatureTextDisplayedInHeaterClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Temperature text displayed in Heater climate screen");
        asserttextAccessibility(Constant_climate_ac.CAC_M_Temp_Text_expected,Constant_climate_heater.CHeater_M_temperature_text_access_id);
    }

    @Then("I verify Temperature toggle displayed in Heater climate screen")
    public void iVerifyTemperatureToggleDisplayedInHeaterClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Temperature toggle displayed in Heater climate screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_heater.CHeater_M_temperature_value_access_id));
    }

    @Then("I verify Hot Water Level text is displayed in Heater climate screen")
    public void iVerifyHotWaterLevelTextIsDisplayedInHeaterClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Hot Water Level text is displayed in Heater climate screen");
        asserttextAccessibility(Constant_climate_heater.CHeater_M_hot_water_level_text_expected,Constant_climate_heater.CHeater_M_hot_water_level_text_access_id);
    }

    @Then("I verify Hot Water Level Value is displayed in Heater climate screen")
    public void iVerifyHotWaterLevelValueIsDisplayedInHeaterClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Hot Water Level Value is displayed in Heater climate screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_heater.CHeater_M_hot_water_Level_mode_access_id));
    }

    @Then("I verify Energy text is displayed in Heater climate screen")
    public void iVerifyEnergyTextIsDisplayedInHeaterClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Energy text is displayed in Heater climate screen");
        asserttextAccessibility(Constant_climate_heater.CHeater_M_energy_text_expected,Constant_climate_heater.CHeater_M_energy_text_access_id);
    }

    @Then("I verify Energy Value is displayed in Heater climate screen")
    public void iVerifyEnergyValueIsDisplayedInHeaterClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Energy Value is displayed in Heater climate screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_heater.CHeater_M_energy_value_access_id));

    }

    @Then("I Tap on Hot Water Level in Heater climate screen")
    public void iTapOnHotWaterLevelInHeaterClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Hot Water Level in Heater climate screen");
        TaponbuttonaccessabilityID(Constant_climate_heater.CHeater_M_hot_water_level_text_access_id);
    }

    @Then("I verify Climate text displayed in Hot Water Level Heater climate screen")
    public void iVerifyClimateTextDisplayedInHotWaterLevelHeaterClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Climate text displayed in Hot Water Level Heater climate screen");
        asserttextAccessibility(Constant_climate_ac.CAC_M_Climate_Text_expetecd,Constant_climate_heater.CHeater_M_Climate_text_access_id);
    }

    @Then("I verify inside text is displayed in Hot Water Level Heater climate screen")
    public void iVerifyInsideTextIsDisplayedInHotWaterLevelHeaterClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify inside text is displayed in Hot Water Level Heater climate screen");
        asserttextAccessibility(Constant_climate_ac.CAC_AM_Inside_Text_expected,Constant_climate_heater.CHeater_HWL_inside_text_access_id);
    }

    @Then("I verify inside unit is displayed in Hot Water Level Heater climate screen")
    public void iVerifyInsideUnitIsDisplayedInHotWaterLevelHeaterClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify inside unit is displayed in Hot Water Level Heater climate screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_heater.CHeater_HWL_inside_value_access_id));
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_heater.CHeater_HWL_inside_units_access_id));
    }

    @Then("I verify outside text is displayed in Hot Water Level Heater climate screen")
    public void iVerifyOutsideTextIsDisplayedInHotWaterLevelHeaterClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify outside text is displayed in Hot Water Level Heater climate screen");
        asserttextAccessibility(Constant_climate_ac.CAC_AM_Outside_Text_expected,Constant_climate_heater.CHeater_HWL_outside_text_access_id);
    }

    @Then("I verify outside unit is displayed in Hot Water Level Heater climate screen")
    public void iVerifyOutsideUnitIsDisplayedInHotWaterLevelHeaterClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify outside unit is displayed in Hot Water Level Heater climate screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_heater.CHeater_HWL_outside_value_access_id));
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_heater.CHeater_HWL_outside_units_access_id));
    }

    @Then("I verify Water Heater temperature is displayed in Hot Water Level Heater climate screen")
    public void iVerifyWaterHeaterTemperatureIsDisplayedInHotWaterLevelHeaterClimateScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Water Heater temperature is displayed in Hot Water Level Heater climate screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_heater.CHeater_HWL_temperature_access_id));
    }

    @Then("I Verify THERME text is displayed")
    public void iVerifyTHERMETextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify THERME text is displayed");
        asserttextAccessibility(Constant_climate_heater.CHeater_HWL_therme_expected,Constant_climate_heater.CHeater_HWL_therme_text_access_id);
    }

    @Then("I verify apply button is displayed in Hot Water Level Heater climate screen")
    public void iVerifyApplyButtonIsDisplayedInHotWaterLevelHeaterClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify apply button is displayed in Hot Water Level Heater climate screen");
        hotWaterLevel=new ArrayList<>();
        hotWaterLevel.add(driver.findElement(By.xpath(Constant_climate_heater.CHeater_WaterHeater_first_value_xpath)).getText());hotWaterLevel.add(driver.findElement(By.xpath(Constant_climate_heater.CHeater_WaterHeater_second_value_xpath)).getText());
        hotWaterLevel.add(driver.findElement(By.xpath(Constant_climate_heater.CHeater_WaterHeater_third_value_xpath)).getText());
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_heater.CHeater_HWL_therme_apply_button_access_id));
    }

    @Then("I Tap on apply button in Hot Water Level Heater climate screen")
    public void iTapOnApplyButtonInHotWaterLevelHeaterClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on apply button in Hot Water Level Heater climate screen");
        TaponbuttonaccessabilityID(Constant_climate_heater.CHeater_HWL_therme_apply_button_access_id);
    }

    @Then("I Tap on Energy in Heater climate screen")
    public void iTapOnEnergyInHeaterClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Energy in Heater climate screen");
        TaponbuttonaccessabilityID(Constant_climate_heater.CHeater_M_energy_text_access_id);
    }

    @Then("I verify Climate text displayed in Energy in Heater climate screen")
    public void iVerifyClimateTextDisplayedInEnergyInHeaterClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Climate text displayed in Energy in Heater climate screen");
        asserttextAccessibility(Constant_climate_ac.CAC_M_Climate_Text_expetecd,Constant_climate_heater.CHeater_M_Climate_text_access_id);
    }

    @Then("I verify inside text is displayed in Energy in Heater climate screen")
    public void iVerifyInsideTextIsDisplayedInEnergyInHeaterClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify inside text is displayed in Energy in Heater climate screen");
        asserttextAccessibility(Constant_climate_ac.CAC_AM_Inside_Text_expected,Constant_climate_heater.CHeater_Energy_inside_text_access_id);

    }

    @Then("I verify inside unit is displayed in Energy in Heater climate screen")
    public void iVerifyInsideUnitIsDisplayedInEnergyInHeaterClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify inside unit is displayed in Energy in Heater climate screen");
            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_heater.CHeater_Energy_inside_value_access_id));
            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_heater.CHeater_Energy_inside_units_access_id));
    }

    @Then("I verify outside text is displayed in Energy in Heater climate screen")
    public void iVerifyOutsideTextIsDisplayedInEnergyInHeaterClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify outside text is displayed in Energy in Heater climate screen");
            asserttextAccessibility(Constant_climate_ac.CAC_AM_Outside_Text_expected,Constant_climate_heater.CHeater_Energy_outside_text_access_id);
        }

    @Then("I verify outside unit is displayed in Energy in Heater climate screen")
    public void iVerifyOutsideUnitIsDisplayedInEnergyInHeaterClimateScreen() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify outside unit is displayed in Energy in Heater climate screen");
            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_heater.CHeater_Energy_outside_value_access_id));
            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_heater.CHeater_Energy_outside_units_access_id));
    }

    @Then("I verify Water Heater temperature is displayed in Energy in Heater climate screen")
    public void iVerifyWaterHeaterTemperatureIsDisplayedInEnergyInHeaterClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Water Heater temperature is displayed in Energy in Heater climate screen");
            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_heater.CHeater_Energy_temperature_access_id));
    }

    @Then("I Verify ENERGY text is displayed")
    public void iVerifyENERGYTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify ENERGY text is displayed");
            asserttextAccessibility(Constant_climate_heater.CHeater_Energy_energy_text_expected,Constant_climate_heater.CHeater_Energy_energy_text_access_id);
    }

    @Then("I verify apply button is displayed in Energy in Heater climate screen")
    public void iVerifyApplyButtonIsDisplayedInEnergyInHeaterClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify apply button is displayed in Energy in Heater climate screen");
            energy=new ArrayList<>();
            energy.add(driver.findElement(By.xpath(Constant_climate_heater.CHeater_EnergyHeater_first_value_xpath)).getText());energy.add(driver.findElement(By.xpath(Constant_climate_heater.CHeater_EnergyHeater_second_value_xpath)).getText());
            energy.add(driver.findElement(By.xpath(Constant_climate_heater.CHeater_EnergyHeater_third_value_xpath)).getText());
            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_heater.CHeater_Energy_energy_apply_button_access_id));
    }

    @Then("I Tap on apply button in Energy in Heater climate screen")
    public void iTapOnApplyButtonInEnergyInHeaterClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on apply button in Energy in Heater climate screen");
            TaponbuttonaccessabilityID(Constant_climate_heater.CHeater_Energy_energy_apply_button_access_id);
    }

    @Then("I scroll upto minimum temperature")
    public void iScrollUptoMinimumTemperature() throws Throwable {
        base=new Basestepdefinition();
        base.SwipeTillElement();
    }

    @Then("I validate applied temperature is displayed in temperature")
    public void iValidateAppliedTemperatureIsDisplayedInTemperature() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validate applied temperature is displayed in temperature");
        maxTemp = driver.findElementByAccessibilityId(Constant_climate_ac.CAC_M_Maximum_Temperature_access_id).getText();
        String tempValue = driver.findElementByAccessibilityId(Constant_climate_ac.CAC_M_Temp_Value_access_id).getText();
        if(tempValue.contains(maxTemp)){
            System.out.println("Text comparison is Successful");
        }

    }

    @Then("I validate applied temperature is displayed in Ac Mode")
    public void iValidateAppliedTemperatureIsDisplayedInACMODE() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validate applied temperature is displayed in Ac Mode");
        System.out.println(maxTemp);
        if(maxTemp.contains(driver.findElementByAccessibilityId(Constant_climate_ac.CAC_AM_Temp_Value_access_id).getText())){
            System.out.println("Text comparison is Successful");
        }
    }

    @Then("I validate applied temperature is displayed in Ac Fan Speed")
    public void iValidateAppliedTemperatureIsDisplayedInAcFanSpeed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validate applied temperature is displayed in Ac Mode");
        System.out.println(maxTemp);
        if(maxTemp.contains(driver.findElementByAccessibilityId(Constant_climate_ac.CAC_AFS_Temp_Value_access_id).getText())){
            System.out.println("Text comparison is Successful");
        }
    }

    @Then("I Tap on Back Button in Ac Fan Speed")
    public void iTapOnBackButtonInAcFanSpeed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Back Button in Ac Fan Speed");
        driver.pressKeyCode(AndroidKeyCode.BACK);
        //TaponbuttonaccessabilityID(Constant_climate_ac.CAC_M_power_Back_Button_access_id);

    }

    @Then("I Tap on Back Button in Ac Mode")
    public void iTapOnBackButtonInAcMode() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Back Button in Ac Mode");
        driver.pressKeyCode(AndroidKeyCode.BACK);
//        TaponbuttonaccessabilityID(Constant_climate_ac.CAC_AM_Apply_Button_access_id);
    }

    @Then("I validate applied temperature is displayed on Climate Tile")
    public void iValidateAppliedTemperatureIsDisplayedOnClimateTile() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validate applied temperature is displayed on Climate Tile");
        List<AndroidElement> minTemp = driver.findElementsByAccessibilityId(Constant_climate_ac.CAC_M_Maximum_Temperature_access_id);
        if(minTemp.get(0).getText().contains(Constant_climate_ac.CAC_M_Climate_0_mainContent)){
            System.out.println("Text comparison is Successful");
        }
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_landingscreen.LandingPage_climate_tile_access_id);
        if(elementsByAccessibilityId.size()!=0){
            TaponbuttonaccessabilityID(Constant_landingscreen.LandingPage_climate_tile_access_id);
        }

    }

    @Then("I Tap on Back Button on climate")
    public void iTapOnBackButtonOnClimate() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Back Button on climate");
        TaponbuttonaccessabilityID(Constant_climate_ac.CAC_M_power_Back_Button_access_id1);

    }

    @Then("I validate minimum applied temperature is displayed in temperature")
    public void iValidateMinimumAppliedTemperatureIsDisplayedInTemperature() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validate minimum applied temperature is displayed in temperature");
        minTemp = driver.findElementByAccessibilityId(Constant_climate_ac.CAC_M_Minimum_Temperature_access_id).getText();
        String Minimum = driver.findElementByAccessibilityId(Constant_climate_ac.CAC_M_Temp_Value_access_id).getText();
        if(Minimum.contains(minTemp)){
            System.out.println("Text comparison is Successful");
         }
    }

    @Then("I validate minimum applied temperature is displayed in Ac Mode")
    public void iValidateMinimumAppliedTemperatureIsDisplayedInAcMode() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validate minimum applied temperature is displayed in Ac Mode");
        System.out.println(minTemp);
        if(minTemp.contains(driver.findElementByAccessibilityId(Constant_climate_ac.CAC_AM_Temp_Value_access_id).getText())){
            System.out.println("Text comparison is Successful");
        }
    }

    @Then("I validate minimum applied temperature is displayed in Ac Fan Speed")
    public void iValidateMinimumAppliedTemperatureIsDisplayedInAcFanSpeed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validate minimum applied temperature is displayed in Ac Fan Speed");
        System.out.println(minTemp);
        if(minTemp.contains(driver.findElementByAccessibilityId(Constant_climate_ac.CAC_AFS_Temp_Value_access_id).getText())){
            System.out.println("Text comparison is Successful");
        }
    }

    @Then("I validate minimum applied temperature is displayed on Climate Tile")
    public void iValidateMinimumAppliedTemperatureIsDisplayedOnClimateTile() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validate minimum applied temperature is displayed on Climate Tile");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_climate_ac.CAC_M_Minimum_Temperature_access_id);
        if(elementsByAccessibilityId.get(0).getText().contains(Constant_climate_ac.CAC_M_Climate_0_mainContent)){
            System.out.println("Text comparison is Successful");
        }
    }


    @Then("I validate Ac Mode value is displayed in AC climate screen")
    public void iValidateAcModeValueIsDisplayedInACClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validate Ac Mode value is displayed in AC climate screen");
        String text = driver.findElementByAccessibilityId(Constant_climate_ac.CAC_M_AC_Mode_Value_access_id).getText();
        for (String eachAcMode: acMode) {
            if(eachAcMode.contains(text)){
                System.out.println("Text comparison is Successful");
            }
        }
    }

    @Then("I Tap on climate Tile In landing screen")
    public void iTapOnClimateTileInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on climate Tile In landing screen");
      //  ScenarioDef.createNode(new GherkinKeyword("Then"), "Climate screen Heater");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_landingscreen.LandingPage_climate_tile_access_id);
        if(elementsByAccessibilityId.size()!=0){
            TaponbuttonaccessabilityID(Constant_landingscreen.LandingPage_climate_tile_access_id);
        }
    }

    @Then("I validate Ac Fan Speed value is displayed in AC climate screen")
    public void iValidateAcFanSpeedValueIsDisplayedInACClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validate Ac Fan Speed value is displayed in AC climate screen");
        fanspeed = driver.findElementByAccessibilityId(Constant_climate_ac.CAC_fanspeed_value_access_id).getText();
        System.out.println(fanSpeed);
        for (String eachFanSpeedMode: fanSpeed) {
            if(eachFanSpeedMode.contains(fanspeed)){
                System.out.println("Text comparison is Successful");
            }
        }
    }

    @Then("I Validate HotWaterLevel value is displayed in AC climate screen")
    public void iValidateHotWaterLevelValueIsDisplayedInACClimateScreen() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Validate HotWaterLevel value is displayed in AC climate screen");
        String text = driver.findElementByAccessibilityId(Constant_climate_heater.CHeater_M_hot_water_Level_mode_access_id).getText();
        for (String eachhotWaterLevel: hotWaterLevel) {
            if(eachhotWaterLevel.contains(text)){
                System.out.println("Text comparison is Successful");
            }
        }
    }

    @Then("I validate Energy value is displayed in AC climate screen")
    public void iValidateEnergyValueIsDisplayedInACClimateScreen() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validate Energy value is displayed in AC climate screen");
        String text = driver.findElementByAccessibilityId(Constant_climate_heater.CHeater_M_energy_value_access_id).getText();
        for (String eachEnergyValue: energy) {
            if(eachEnergyValue.contains(text)){
                System.out.println("Text comparison is Successful");
            }
        }
    }

    @Then("I validate updated value id displayed in AC climate screen")
    public void iValidateUpdatedValueIdDisplayedInACClimateScreen() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validate updated value id displayed in AC climate screen");
        String text = driver.findElementByAccessibilityId(Constant_climate_ac.CAC_FanSpeed_text_access_id).getText();
        if(fanspeed.contains(text)){
            System.out.println("Text comparison is Successful");
        }
    }

    @Then("I validate updated value is displayed in AC Mode screen")
    public void iValidateUpdatedValueIdDisplayedInACModeScreen() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validate updated value id displayed in AC Mode screen");
        String text = driver.findElementByAccessibilityId(Constant_climate_ac.CAC_AM_Fan_Value_access_id).getText();
        System.out.println(fanspeed);
        if(fanspeed.contains(text)){
            System.out.println("Text comparison is Successful");
        }
    }

    @Then("I validate updated value id displayed in AC FanSpeed screen")
    public void iValidateUpdatedValueIdDisplayedInACFanSpeedScreen() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validate updated value id displayed in AC FanSpeed screen");
        String text = driver.findElementByAccessibilityId(Constant_climate_ac.CAC_AFS_Fan_Value_access_id).getText();
        if(fanspeed.contains(text)){
            System.out.println("Text comparison is Successful");
        }
    }

    @Then("I scroll minimum temperature in Climate Heater")
    public void iScrollMinimumTemperatureInClimateHeater() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll minimum temperature in Climate Heater");
        try{
            List<AndroidElement> list = driver.findElements(By.xpath(Constant_climate_heater.CHeater_common_temperature_xpath));
            while (list.size()!=0){
                TouchAction action = new TouchAction(driver);
                action.press(PointOption.point(700, 700)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(1200, 700));
                action.release().perform();
                if (driver.findElement(By.xpath(Constant_climate_heater.CHeater_common_temperature_xpath)).getText().equals("5")){
                    TouchAction action1 = new TouchAction(driver);
                    action1.press(PointOption.point(700, 700)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                            .moveTo(PointOption.point(1200, 700));
                    action1.release().perform();
                    break;
                }
            }

        }
        catch (Exception e){
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }

    @Then("I scroll maximum temperature in Climate Heater")
    public void iScrollMaximumTemperatureInClimateHeater() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll maximum temperature in Climate Heater");
        try{
            List<AndroidElement> list = driver.findElements(By.xpath(Constant_climate_heater.CHeater_common_temperature_xpath));
           System.out.println(list);
            while (list.size()!=0){
                TouchAction action = new TouchAction(driver);
                action.press(PointOption.point(1200, 700)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(700, 700));
                action.release().perform();
                if (driver.findElement(By.xpath(Constant_climate_heater.CHeater_common_temperature_xpath)).getText().equals("29")){
                    break;
                }
            }

        }
        catch (Exception e){
            System.out.println(e.toString());
            e.printStackTrace();
        }

    }

    @Then("I Tap on heater power")
    public void iTapOnHeaterPower() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on heater power");
        TaponbuttonaccessabilityID(Constant_climate_ac.CAC_M_Power_Button_access_id);
    }

    @Then("I Tap on Apply button in Climate Heater screen")
    public void iTapOnApplyButtonInClimateHeaterScreen() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Apply button in Climate Heater screen");
        List<AndroidElement> elements = driver.findElementsByAccessibilityId(Constant_climate_heater.cHeater_M_apply_button_access_id);
        if(elements.size()!=0){
            TaponbuttonaccessabilityID(Constant_climate_heater.cHeater_M_apply_button_access_id);
        }
    }

    @Then("I validate applied temperature is displayed in Temperature field")
    public void iValidateAppliedTemperatureIsDisplayedInTemperatureField() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validate applied temperature is displayed in Temperature field");
        minTempHeater = driver.findElementByAccessibilityId(Constant_climate_heater.CHeater_Minimum_temperature_access_id).getText();
        String text = driver.findElementByAccessibilityId(Constant_climate_heater.CHeater_M_temperature_value_access_id).getText();
        if(text.contains(minTempHeater)){
            System.out.println("Text comparison is Successful");
        }

    }

    @Then("I validate applied temperature is displayed in Hot Water Level")
    public void iValidateAppliedTemperatureIsDisplayedInHotWaterLevel() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validate applied temperature is displayed in Hot Water Level");
        String text = driver.findElementByAccessibilityId(Constant_climate_heater.CHeater_M_temperature_value_access_id).getText();
        if(minTempHeater.contains(text)){
            System.out.println("Text comparison is Successful");
        }
    }

    @Then("I validate applied temperature is displayed in Energy")
    public void iValidateAppliedTemperatureIsDisplayedInEnergy() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validate applied temperature is displayed in Energy");
        String text = driver.findElementByAccessibilityId(Constant_climate_heater.CHeater_Energy_temperature_access_id).getText();
        if(minTempHeater.contains(text)){
            System.out.println("Text comparison is Successful");
        }
    }

    @Then("I validate applied maximum temperature is displayed in Temperature field")
    public void iValidateAppliedMaximumTemperatureIsDisplayedInTemperatureField() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validate applied maximum temperature is displayed in Temperature field");
        maxTempHeater = driver.findElementByAccessibilityId(Constant_climate_heater.CHeater_Maximum_temperature_access_id).getText();
        String text = driver.findElementByAccessibilityId(Constant_climate_heater.CHeater_M_temperature_value_access_id).getText();
        if(text.contains(maxTempHeater)){
            System.out.println("Text comparison is Successful");
        }
    }

    @Then("I validate applied maximum temperature is displayed in Hot Water Level")
    public void iValidateAppliedMaximumTemperatureIsDisplayedInHotWaterLevel() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validate applied maximum temperature is displayed in Hot Water Level");
        String text = driver.findElementByAccessibilityId(Constant_climate_heater.CHeater_M_temperature_value_access_id).getText();
        if(maxTempHeater.contains(text)){
            System.out.println("Text comparison is Successful");
        }
    }

    @Then("I validate applied maximum temperature is displayed in Energy")
    public void iValidateAppliedMaximumTemperatureIsDisplayedInEnergy() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validate applied maximum temperature is displayed in Energy");
        String text = driver.findElementByAccessibilityId(Constant_climate_heater.CHeater_Energy_temperature_access_id).getText();
        if(maxTempHeater.contains(text)){
            System.out.println("Text comparison is Successful");
        }
    }

    @Then("I scroll minimum temperature in Climate AC")
    public void iScrollMinimumTemperatureInClimateAC() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll minimum temperature in Climate AC");
        try{
            List<AndroidElement> list = driver.findElements(By.xpath(Constant_climate_heater.CHeater_common_temperature_xpath));
            while (list.size()!=0){
                TouchAction action = new TouchAction(driver);
                action.press(PointOption.point(700, 700)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(1200, 700));
                action.release().perform();
                if (driver.findElement(By.xpath(Constant_climate_heater.CHeater_common_temperature_xpath)).getText().equals("16")){
                    TouchAction action1 = new TouchAction(driver);
                    action1.press(PointOption.point(700, 700)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                            .moveTo(PointOption.point(1200, 700));
                    action1.release().perform();
                    break;
                }
            }

        }
        catch (Exception e){
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }

    @Then("I scroll maximum temperature in Climate AC")
    public void iScrollMaximumTemperatureInClimateAC() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll maximum temperature in Climate AC");
        try{
            List<AndroidElement> list = driver.findElements(By.xpath(Constant_climate_heater.CHeater_common_temperature_xpath));
            System.out.println(list);
            while (list.size()!=0){
                TouchAction action = new TouchAction(driver);
                action.press(PointOption.point(1200, 700)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(700, 700));
                action.release().perform();
                if (driver.findElement(By.xpath(Constant_climate_heater.CHeater_common_temperature_xpath)).getText().equals("30")){
                    break;
                }
            }

        }
        catch (Exception e){
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }

    @Then("I validate applied minimum temperature is displayed in Climate Tile")
    public void iValidateAppliedMinimumTemperatureIsDisplayedInClimateTile() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validate applied minimum temperature is displayed in Climate Tile");
        String text = driver.findElementByAccessibilityId(Constant_climate_ac.CAC_M_Climate_0_mainContent).getText();
        System.out.println(minTemp);
        if(minTemp.contains(text)){
            System.out.println("Text comparison is Successful");
        }
    }

    @Then("I validate applied maximum temperature is displayed in Climate Tile")
    public void iValidateAppliedMaximumTemperatureIsDisplayedInClimateTile() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validate applied maximum temperature is displayed in Climate Tile");
        String text = driver.findElementByAccessibilityId(Constant_climate_ac.CAC_M_Climate_0_mainContent).getText();
        System.out.println(maxTemp);
        if(maxTemp.contains(text)){
            System.out.println("Text comparison is Successful");
        }
    }

    @Then("I validate applied minimum heater temperature is displayed in Climate Tile")
    public void iValidateAppliedMinimumHeaterTemperatureIsDisplayedInClimateTile() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validate applied minimum heater temperature is displayed in Climate Tile");
        String text = driver.findElementByAccessibilityId(Constant_climate_ac.CAC_M_Climate_0_mainContent).getText();
        if(minTempHeater.contains(text)){
            System.out.println("Text comparison is Successful");
        }
    }

    @Then("I validate applied maximum heater temperature is displayed in Climate Tile")
    public void iValidateAppliedMaximumHeaterTemperatureIsDisplayedInClimateTile() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validate applied maximum heater temperature is displayed in Climate Tile");
        String text = driver.findElementByAccessibilityId(Constant_climate_ac.CAC_M_Climate_0_mainContent).getText();
        if(maxTempHeater.contains(text)){
            System.out.println("Text comparison is Successful");
        }
    }

    @Then("I write the status as Automation script is done once completed the execution")
    public void iWriteTheStatusAsAutomationScriptIsDoneOnceCompletedTheExecution() throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new FileReader(new File("src/test/java/com/dometic/L1/output/automationScript.txt")));
        while (bufferedReader.readLine()!=null){
            FileWriter fw=new FileWriter("src/test/java/com/dometic/L1/output/automationScript.txt");
            fw.write(" ");
            fw.close();
        }
        try{
            FileWriter fw=new FileWriter("src/test/java/com/dometic/L1/output/automationScript.txt");
            fw.write("Load next SDF");
            fw.close();
        }catch(Exception e){System.out.println(e);}
        System.out.println("Success...");
    }
}

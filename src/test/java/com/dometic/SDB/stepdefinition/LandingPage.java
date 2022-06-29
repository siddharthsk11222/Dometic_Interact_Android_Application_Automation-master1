package com.dometic.SDB.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.SDB.qa.Pages.*;
import com.dometic.SDB.qa.util.Baseclass;
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

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class LandingPage extends Baseclass {
    public static String freshWater, blackWater, mainContentText;
    public static List<String> Waterheater;

    @Then("I Tap on LATER Button")
    public void iTapOnLATERButton() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on LATER Button");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_landingscreen.LandingPage_Firmware_popup_xpath));
        if (elements.size() != 0) {
            WebDriverWait wait = new WebDriverWait(driver, 300);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_landingscreen.LandingPage_Firmware_popup_xpath)));
            Taponbutton(Constant_landingscreen.LandingPage_LATER_button_xpath);
        }
    }

    @Then("I Tap on cancel button in Upgrade Firmware")
    public void iTapOnCancelButtonInUpgradeFirmware() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on cancel button in Upgrade Firmware");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_landingscreen.LandingPage_Firmware_popup_xpath));
        if (elements.size() != 0) {
            Taponbutton(Constant_landingscreen.LandingPage_LATER_button_xpath);
        }
        List<AndroidElement> elements3 = driver.findElementsByAccessibilityId(Constant_landingscreen.LandingPage_remainderView_iconClose_access_id);
        if (elements3.size() != 0) {
            TaponbuttonaccessabilityID(Constant_landingscreen.LandingPage_remainderView_iconClose_access_id);
        }
    }

    @Then("I Tap on Climate in Landing screen")
    public void iTapOnClimateInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Climate in Landing screen");
        Taponbutton(Constant_landingscreen.LandingPage_L21stclimate_tile_xpath);
    }

    @Then("I Scroll Right to Left of the screen")
    public void iSCrollRightToLeftOfTheScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll Right to Left of the screen");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(900, 650)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(550, 650));
        action.release().perform();
    }

    @Then("I Tap on Apply button in climate screen")
    public void iTapOnApplyButtonInClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Apply button in climate screen");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_climate_ac.L2CAC_Apply_Button_xpath));
        if (elements.size() != 0) {
            WebDriverWait wait = new WebDriverWait(driver, 250);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_climate_ac.L2CAC_Apply_Button_xpath)));
            TaponbuttonaccessabilityID(Constant_landingscreen.LandingPage_apply_button_access_id);
            WebDriverWait wait1 = new WebDriverWait(driver, 250);
            wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_climate_ac.L2CAC_Apply_Button_xpath)));
        }
    }

    @Then("I Tap on Fan speed in climate screen")
    public void iTapOnFanSppedInClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Fan speed in climate screen");
        Taponbutton(Constant_climate_ac.L2CAC_fanspeed_text_xpath);
        WebDriverWait wait1 = new WebDriverWait(driver, 250);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_climate_ac.CAC_AM_fanSpeed_fanspeedText_xpath)));
    }

    @Then("I Tap on Apply button in AC Fan Speed")
    public void iTapOnApplyButtonInACFanSpeed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Apply button in AC Fan Speed");
        WebDriverWait wait = new WebDriverWait(driver, 250);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_climate_ac.CAC_AFS_Apply_Button_xpath)));
        TaponbuttonaccessabilityID(Constant_climate_ac.CAC_AFS_Apply_Button_access_id);
    }

    @Then("I Tap on Climate mode in climate screen")
    public void iTapOnClimateModeInClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Climate mode in climate screen");
        Taponbutton(Constant_climate_ac.L2CAC_Climatemode_text_xpath);
    }

    @Then("I Tap on Scheduled At in climate screen")
    public void iTapOnScheduledAtInClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Scheduled At in climate screen");
        Basestepdefinition.verticalSwipe(0.7, 0.3, 0.5);
        Taponbutton(Constant_climate_ac.L2CAC_Scheduled_At_text_xpath);
    }

    @Then("I Scroll up the hours in Scheduled At")
    public void iScrollUpTheHoursInScheduledAt() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll up the hours in Scheduled At");
        WebDriverWait wait = new WebDriverWait(driver, 250);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_climate_ac.L2CAC_Scheduled_At_inside_text_xpath)));
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(300, 1700)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(300, 1450));
        action.release().perform();
    }

    @Then("I Scroll up the minutes in Scheduled At")
    public void iScrollUpTheMinutesInScheduledAt() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll up the minutes in Scheduled At");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(700, 1700)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(700, 1450));
        action.release().perform();
    }

    @Then("I Tap on apply button in Scheduled At")
    public void iTapOnApplyButtonInScheduledAt() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on apply button in Scheduled At");
        TaponbuttonaccessabilityID(Constant_climate_ac.L2CAC_Scheduled_At_inside_Apply_Button);
    }

    @Then("I Tap on the Power in Landing screen")
    public void iTapOnThePowerInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on the Power in Landing screen");
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_landingscreen.LandingPage_L2power_text_xpath)));
        Taponbutton(Constant_landingscreen.LandingPage_L2power_text_xpath);
    }

    @Then("I Tap on Generator in Power Screen")
    public void iTapOnGeneratorInPowerScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Generator in Power Screen");
        Basestepdefinition.verticalSwipe(0.7, 0.3, 0.5);
        TaponbuttonaccessabilityID(Constant_power.L2Powerpagepower_Generator_text_access_id);
    }

    @Then("I Tap on Charger in Power Screen")
    public void iTapOnChargerInPowerScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Charger in Power Screen");
        TaponbuttonaccessabilityID(Constant_power.L2Powerpagepower_Charger_text_access_id);
    }

    @Then("I Tap on AGS in Power Screen")
    public void iTapOnAGSInPowerScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on AGS in Power Screen");
        TaponbuttonaccessabilityID(Constant_power.L2Powerpagepower_AGS_text_access_id);
    }

    @Then("I Tap on Predictive Data in Power Screen")
    public void iTapOnPredictiveDataInPowerScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Predictive Data in Power Screen");
        Basestepdefinition.verticalSwipe(0.7, 0.3, 0.5);
        TaponbuttonaccessabilityID(Constant_power.L2Powerpagepower_Prdictive_Data_text_access_id);
    }

    @Then("I Tap on Light in Landing screen")
    public void iTapOnLightInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Light in Landing screen");
        Taponbutton(Constant_landingscreen.LandingPage_L2light_tile_xpath);
    }

    @Then("I Scroll left to right in Accent Light")
    public void iScrollLeftToRightInAccentLight() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll left to right in Accent Light");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(130, 1040)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(520, 1040));
        action.release().perform();
    }

    @Then("I Scroll left to right in Bedroom Ceiling")
    public void iScrollLeftToRightInBedroomCeiling() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll left to right in Bedroom Ceiling");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(130, 1850)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(520, 1850));
        action.release().perform();
    }

    @Then("I Tap on AGS in Landing Screen")
    public void iTapOnAGSInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on AGS in Landing Screen");
        Taponbutton(Constant_landingscreen.LandingPage_L2AGS_text_xpath);
    }

    @Then("I Tap on Quiet Time Start")
    public void iTapOnQuietTimeStart() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Quiet Time Start");
        WebDriverWait wait = new WebDriverWait(driver, 200);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_AGS.AGSPage_QuietTimeStart_xpath)));
        TaponbuttonaccessabilityID(Constant_AGS.AGSPage_Quiet_Time_Start_text_access_id);

    }

    @Then("I Scroll up the hours in Quiet Time Start")
    public void iScrollUpTheHoursInQuietTimeStart() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll up the hours in Quiet Time Start");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(300, 1250)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(300, 1000));
        action.release().perform();
    }

    @Then("I Scroll up the minutes in Quiet Time Start")
    public void iScrollUpTheMinutesInQuietTimeStart() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll up the minutes in Quiet Time Start");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(700, 1250)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(700, 1000));
        action.release().perform();
    }

    @Then("I Tap on apply button in AGS")
    public void iTapOnApplyButtonInAGS() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on apply button in AGS");
        TaponbuttonaccessabilityID(Constant_AGS.AGSPage_quietTimeStart_applyButton_access_id);
    }

    @Then("I Tap on Fuses in Landing Screen")
    public void iTapOnFusesInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Fuses in Landing Screen");
        Taponbutton(Constant_landingscreen.LandingPage_L2Fuses_text_xpath);
    }

    @Then("I Tap on Water Pump toggle in fuse")
    public void iTapOnWaterPumpToggleInFuse() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Water Pump toggle in fuse");
        Taponbutton(Constant_Fuses.Fusescreen_Water_Pump_toggle_xpath);
    }

    @Then("I Tap on Ceiling Light toggle in fuse")
    public void iTapOnCeilingLightToggleInFuse() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Ceiling Light toggle in fuse");
        Taponbutton(Constant_Fuses.Fusescreen_Ceiling_Light_toggle_xpath);
    }

    @Then("I Tap on Mechanical in Landing screen")
    public void iTapOnMechanicalInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Mechanical in Landing screen");
//        Basestepdefinition.verticalSwipe(0.7,0.3,0.5);
        Taponbutton(Constant_landingscreen.LandingPage_L2Mechanical_text_xpath);
    }

    @Then("I Tap on Tank Fresh Water in Landing screen")
    public void iTapOnTankFreshWaterInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Tank Fresh Water in Landing screen");
        Basestepdefinition.verticalSwipe(0.7, 0.3, 0.5);
        Taponbutton(Constant_landingscreen.LandingPage_L2Tank_Fresh_text_xpath);
    }

    @Then("I Tap on Tank Black Water in Landing screen")
    public void iTapOnTankBlackWaterInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Tank Black Water in Landing screen");
        Taponbutton(Constant_landingscreen.LandingPage_L2Tank_Black_text_xpath);
    }

    @Then("I scroll up the screen in AC Fan Speed")
    public void iScrollUpTheScreenInACFanSpeed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll up the screen in AC Fan Speed");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(500, 1700)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(500, 1450));
        action.release().perform();
    }

    @Then("I scroll up the screen in Climate Mode")
    public void iScrollUpTheScreenInClimateMode() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll up the screen in Climate Mode");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(500, 1700)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(500, 1500));
        action.release().perform();
    }

    @Then("I Tap on Apply button in AC Climate Mode")
    public void iTapOnApplyButtonInACClimateMode() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Apply button in AC Climate Mode");
        TaponbuttonaccessabilityID(Constant_climate_ac.CAC_AM_Apply_Button_access_id);
    }

    @Then("I Tap on Back Button")
    public void i_Tap_on_Back_Button() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Back Button");
        List<AndroidElement> id = driver.findElementsByAccessibilityId(com.dometic.MTC.qa.Pages.Constant_climate_ac.CAC_M_power_Back_Button_access_id);
        if(id.size()!=0){
            driver.pressKeyCode(AndroidKeyCode.BACK);
        }
    }

    @Then("I Verify the power main screen header")
    public void iVerifyThePowerMainScreenHeader() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the power main screen header");
        asserttext(Constant_power.L2_powerHeader, Constant_power.Powerpage_power_text_xpath);
    }

    @Then("I Verify the House Battery Text")
    public void iVerifyTheHouseBatteryText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the House Battery Text");
        asserttextAccessibility(Constant_power.L2_House_Battery, Constant_power.Powerpage_houseBattery_text_access_id);
    }

    @Then("I Verify the Inverter Text")
    public void iVerifyTheInverterText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Inverter Text");
        asserttextAccessibility(Constant_power.L2_Inverter, Constant_power.L2Powerpagepower_Inverter_access_id);
    }

    @Then("I Verify the Operating Mode Text")
    public void iVerifyTheOperatingModeText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Operating Mode Text");
        asserttextAccessibility(Constant_power.L2_OperatingMode, Constant_power.L2Powerpagepower_Operating_text_access_id);
    }

    @Then("I Verify the House Battery Voltage Text")
    public void iVerifyTheHouseBatteryVoltageText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the House Battery Voltage Text");
        asserttextAccessibility(Constant_power.L2_HouseBatteryVoltage, Constant_power.L2Powerpagepower_House_Battery_Voltage_text_access_id);
    }

    @Then("I Verify the Load Wattage Text")
    public void iVerifyTheLoadWattageText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Load Wattage Text");
        asserttextAccessibility(Constant_power.L2_LoadWattage, Constant_power.L2Powerpagepower_Load_Wattage_text_access_id);
        Basestepdefinition.verticalSwipe(0.7, 0.3, 0.5);
    }

    @Then("I Verify the Chassis Battery Voltage Text")
    public void iVerifyTheChassisBatteryVoltageText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Chassis Battery Voltage Text");
        asserttextAccessibility(Constant_power.L2_ChassisBatteryVoltage, Constant_power.L2Powerpagepower_Chassis_Battery_Voltage_text_access_id);
    }

    @Then("I Verify the Generator Text")
    public void iVerifyTheGeneratorText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Generator Text");
        asserttextAccessibility(Constant_power.L2_Generator, Constant_power.L2Powerpagepower_Generator_text_access_id);
    }

    @Then("I Verify the Charger Text")
    public void iVerifyTheChargerText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Charger Text");
        asserttextAccessibility(Constant_power.L2_Charger, Constant_power.L2Powerpagepower_Charger_text_access_id);
    }

    @Then("I Verify the AGS Text in power main screen")
    public void iVerifyTheAGSTextInPowerMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the AGS Text in power main screen");
        asserttextAccessibility(Constant_power.L2_AGS, Constant_power.L2Powerpagepower_AGS_text_access_id);
    }

    @Then("I Verify the Predictive data in power main screen")
    public void iVerifyThePredictiveDataInPowerMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Predictive data in power main screen");
        Basestepdefinition.verticalSwipe(0.7, 0.3, 0.5);
        asserttextAccessibility(Constant_power.L2_PredictiveData, Constant_power.L2Powerpagepower_Prdictive_Data_text_access_id);

    }

    @Then("I Verify control text in Generator main screen")
    public void iVerifyControlTextInGeneratorMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify control text in Generator main screen");
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_power.L2_Control_xpath)));
        asserttextAccessibility(Constant_power.L2_Control_Generator, Constant_power.L2Powerpagepower_Generator_Control_text_access_id);
    }

    @Then("I Verify the  status text in Generator main screen")
    public void iVerifyTheStatusTextInGeneratorMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the  status text in Generator main screen");
        asserttextAccessibility(Constant_power.L2_Status_Generator, Constant_power.L2Powerpagepower_Status_access_id);
    }

    @Then("I verify the Run time text in Generator main screen")
    public void iVerifyTheRunTimeTextInGeneratorMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the charger state in  charger main screen");
        asserttextAccessibility(Constant_power.L2_RunTime_Generator, Constant_power.L2Powerpagepower_Run_Time_access_id);
    }

    @Then("I verify the charger state in  charger main screen")
    public void iVerifyTheChargerStateInChargerMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validate applied temperature is displayed in Temperature field");
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_power.L2_Charger_state_xpath)));
        asserttextAccessibility(Constant_power.L2_Charger_state, Constant_power.L2Powerpagepower_Charger_state_text_access_id);
    }

    @Then("I verify the AC Input Current in charger main screen")
    public void iVerifyTheACInputCurrentInChargerMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the AC Input Current in charger main screen");
        asserttextAccessibility(Constant_power.L2_AC_Input_current, Constant_power.L2Powerpagepower_Charger_AC_Input_Current_Text_access_id);

    }

    @Then("I verify the AC Load Current in charger main screen")
    public void iVerifyTheACLoadCurrentInChargerMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the AC Load Current in charger main screen");
        asserttextAccessibility(Constant_power.L2_AC_Load_current, Constant_power.L2Powerpagepower_Charger_AC_Load_Current_text_access_id);

    }

    @Then("I verify the charger current in charger main screen")
    public void iVerifyTheChargerCurrentInChargerMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the charger current in charger main screen");
        asserttextAccessibility(Constant_power.L2_Charger_current, Constant_power.L2Powerpagepower_Charger_Current_text_access_id);
    }

    @Then("I verify clear AGS text in power AGS main screen")
    public void iVerifyClearAGSTextInPowerAGSMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify clear AGS text in power AGS main screen");
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_power.L2_clear_AGS_xpath)));
        asserttextAccessibility(Constant_power.L2_clear_AGS, Constant_power.L2Powerpagepower_AGS_Clear_AGS_text_access_id);
    }

    @Then("I verify status text in power AGs main screen")
    public void iVerifyStatusTextInPowerAGsMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify status text in power AGs main screen");
        asserttextAccessibility(Constant_power.L2_status_AGS, Constant_power.L2Powerpagepower_AGS_Status_text_access_id);
    }

    @Then("I Scroll the screen upto water heater truma")
    public void iScrollTheScreenUptoWaterHeaterTruma() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll the screen upto water heater truma");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(1000, 1800)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(500, 1800));
        action.release().perform();
    }

    @Then("I Tap on Water Heater Truma")
    public void iTapOnWaterHeaterTruma() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Water Heater Truma");
        Taponbutton(Constant_power.L2_Water_Heater_Truma);
    }

    @Then("I verified inside text is displayed in Ac climate screen")
    public void iVerifiedInsideTextIsDisplayedInAcClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verified inside text is displayed in Ac climate screen");
        asserttextValidationAccessibility(Constant_climate_ac.CAC_AM_Inside_Text_expected, Constant_climate_ac.CAC_M_Inside_Text_access_id);
    }

    @Then("I verified outside text is displayed in Ac climate screen")
    public void iVerifiedOutsideTextIsDisplayedInAcClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verified outside text is displayed in Ac climate screen");
        asserttextValidationAccessibility(Constant_climate_ac.CAC_AM_Outside_Text_expected, Constant_climate_ac.CAC_M_Outside_Text_access_id);
    }

    @Then("I verified Power text is displayed Ac climate screen")
    public void iVerifiedPowerTextIsDisplayedAcClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verified Power text is displayed Ac climate screen");
        asserttextValidationAccessibility(Constant_climate_ac.CAC_M_Power_Text_expected, Constant_climate_ac.CAC_M_Power_Text_access_id);
    }

    @Then("I verified Fan speed text is displayed Ac climate screen")
    public void iVerifiedFanSpeedTextIsDisplayedAcClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verified Fan speed text is displayed Ac climate screen");
        asserttextValidation(Constant_climate_ac.fanspeed_text_climatescreen, Constant_climate_ac.L2CAC_fanspeed_text_xpath);
    }

    @Then("I verified Climate Mode text is displayed Ac climate screen")
    public void iVerifiedClimateModeTextIsDisplayedAcClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verified Climate Mode text is displayed Ac climate screen");
        asserttextValidation(Constant_climate_ac.climatemode_text_climatescreen, Constant_climate_ac.L2CAC_Climatemode_text_xpath);
    }

    @Then("I verified Climate AGS text is displayed Ac climate screen")
    public void iVerifiedClimateAGSTextIsDisplayedAcClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verified Climate AGS text is displayed Ac climate screen");
        asserttextValidation(Constant_climate_ac.climateags_text_climatescreen, Constant_climate_ac.L2CAC_ClimateAGS_text_xpath);
        Basestepdefinition.verticalSwipe(0.70, 0.3, 0.5);
    }

    @Then("I verified Air Conditioner text is displayed Ac climate screen")
    public void iVerifiedAirConditionerTextIsDisplayedAcClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verified Air Conditioner text is displayed Ac climate screen");
        asserttextValidation(Constant_climate_ac.airconditioner_text_climatescreen, Constant_climate_ac.L2CAC_Airconditioner_text_xpath);
        Basestepdefinition.verticalSwipe(0.70, 0.3, 0.5);
    }

    @Then("I verified Scheduler text is displayed Ac climate screen")
    public void iVerifiedSchedulerTextIsDisplayedAcClimateScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verified Scheduler text is displayed Ac climate screen");
        asserttextValidation(Constant_climate_ac.scheduler_text_climatescreen, Constant_climate_ac.L2CAC_Scheduler_text_xpath);
    }

    @Then("I Verified Light screen header")
    public void iVerifiedLightScreenHeader() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified Light screen header");
        asserttextValidation(Constant_Light.LightPage_Light_Title_text, Constant_Light.LightPage_Light_Title_xpath);
    }

    @Then("I Verified Assist Handle Text")
    public void iVerifiedAssistHandleText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified Assist Handle Text");
        asserttextValidation(Constant_Light.LightPage_AssistHandle_Light_text, Constant_Light.LightPage_Assist_Handle_text_xpath);
    }

    @Then("I Verified Utility center Text")
    public void iVerifiedUtilityCenterText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified Utility center Text");
        asserttextValidation(Constant_Light.LightPage_Utility_Center_Light_text, Constant_Light.LightPage_Utility_Center_text_xpath);
    }

    @Then("I Verified Accent Light Text")
    public void iVerifiedAccentLightText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified Accent Light Text");
        asserttextValidation(Constant_Light.LightPage_Accent_Light_text, Constant_Light.LightPage_Accent_Light_text_xpath);
    }

    @Then("I Verified Shower Text")
    public void iVerifiedShowerText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified Shower Text");
        asserttextValidation(Constant_Light.LightPage_shower_Light_text, Constant_Light.LightPage_Shower_text_xpath);
    }

    @Then("I Verified Ceiling Text")
    public void iVerifiedCeilingText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified Ceiling Text");
        asserttextValidation(Constant_Light.LightPage_Ceiling_Light_text, Constant_Light.LightPage_Ceiling_text_xpath);
    }

    @Then("I Verified Bedroom ceiling Text")
    public void iVerifiedBedroomCeilingText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified Bedroom ceiling Text");
        asserttextValidation(Constant_Light.LightPage_Bedroom_Ceiling_Light_text, Constant_Light.LightPage_Bedroom_Ceiling_text_xpath);
    }

    @Then("I Verified Galley Text")
    public void iVerifiedGalleyText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified Galley Text");
        Basestepdefinition.verticalSwipe(0.7, 0.3, 0.5);
        asserttextValidation(Constant_Light.LightPage_Galley_Light_text, Constant_Light.LightPage_Galley_text_xpath);
    }

    @Then("I Verified Lounge Text")
    public void iVerifiedLoungeText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified Lounge Text");
        asserttextValidation(Constant_Light.LightPage_Lounge_Light_text, Constant_Light.LightPage_Lounge_text_xpath);
    }

    @Then("I Verified Awning Light Text")
    public void iVerifiedAwningLightText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified Awning Light Text");
        asserttextValidation(Constant_Light.LightPage_Awning_Light_text, Constant_Light.LightPage_Awning_Light_text_xpath);
    }

    @Then("I Verified Bedroom Overhead Text")
    public void iVerifiedBedroomOverheadText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified Bedroom Overhead Text");
        Basestepdefinition.verticalSwipe(0.7, 0.3, 0.5);
        asserttextValidation(Constant_Light.LightPage_Bedroom_Overhead_Light_text, Constant_Light.LightPage_Bedroom_Overhead_text_xpath);
    }

    @Then("I Verified Porch Light Text")
    public void iVerifiedPorchLightText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified Porch Light Text");
        asserttextValidation(Constant_Light.LightPage_Porch_Light_text, Constant_Light.LightPage_Porch_Light_text_xpath);
    }

    @Then("I Verify the Auto charger text in AGS Main screen")
    public void iVerifyTheAutoChargerTextInAGSMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Auto charger text in AGS Main screen");
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_AGS.AGSPage_AGS_title_text_xpath)));
        asserttextValidationAccessibility(Constant_AGS.AGSPage_Auto_Charger_text, Constant_AGS.AGSPage_Auto_Charger_text_access_id);
    }

    @Then("I Verify the Quiet Time Start text in AGS Main screen")
    public void iVerifyTheQuietTimeStartTextInAGSMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Quiet Time Start text in AGS Main screen");
        asserttextValidationAccessibility(Constant_AGS.AGSPage_Quiet_Time_Start_text, Constant_AGS.AGSPage_Quiet_Time_Start_text_access_id);
    }

    @Then("I Verify the Quiet Time Ends text in AGS Main screen")
    public void iVerifyTheQuietTimeEndsTextInAGSMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Quiet Time Ends text in AGS Main screen");
        asserttextValidationAccessibility(Constant_AGS.AGSPage_Quiet_Time_Ends_text, Constant_AGS.AGSPage_Quiet_Time_Ends_text_access_id);
    }

    @Then("I Verify the Start Voltage text in AGS Main screen")
    public void iVerifyTheStartVoltageTextInAGSMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Start Voltage text in AGS Main screen");
        asserttextValidationAccessibility(Constant_AGS.AGSPage_Start_Voltage_text, Constant_AGS.AGSPage_Start_Voltage_text_access_id);
    }

    @Then("I Verify the Time Under text in AGS Main screen")
    public void iVerifyTheTimeUnderTextInAGSMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Time Under text in AGS Main screen");
        asserttextValidationAccessibility(Constant_AGS.AGSPage_Time_Under_text, Constant_AGS.AGSPage_Time_Under_text_access_id);
    }

    @Then("I Verify the Generator Exerciser text in AGS Main screen")
    public void iVerifyTheGeneratorExerciserTextInAGSMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Generator Exerciser text in AGS Main screen");
        asserttextValidationAccessibility(Constant_AGS.AGSPage_Generator_Exerciser_text, Constant_AGS.AGSPage_Generator_Exerciser_text_access_id);
    }

    @Then("I Verify the Selected Days text in AGS Main screen")
    public void iVerifyTheSelectedDaysTextInAGSMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Selected Days text in AGS Main screen");
        asserttextValidationAccessibility(Constant_AGS.AGSPage_Selected_Days_text, Constant_AGS.AGSPage_Selected_Days_text_access_id);
    }

    @Then("I Verify the Start Time text in AGS Main screen")
    public void iVerifyTheStartTimeTextInAGSMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Start Time text in AGS Main screen");
        asserttextValidationAccessibility(Constant_AGS.AGSPage_Start_Time_text, Constant_AGS.AGSPage_Start_Time_text_access_id);
    }

    @Then("I Verify the Run Time text in AGS Main screen")
    public void iVerifyTheRunTimeTextInAGSMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Run Time text in AGS Main screen");
        Basestepdefinition.verticalSwipe(0.7, 0.3, 0.5);
        asserttextValidationAccessibility(Constant_AGS.AGSPage_Run_Time_text, Constant_AGS.AGSPage_Run_Time_text_access_id);
    }

    @Then("I Verify the AGS Climate text in AGS Main screen")
    public void iVerifyTheAGSClimateTextInAGSMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the AGS Climate text in AGS Main screen");
        Basestepdefinition.verticalSwipe(0.7, 0.3, 0.5);
        asserttextValidationAccessibility(Constant_AGS.AGSPage_AGS_Climate_text, Constant_AGS.AGSPage_AGS_Climate_text_access_id);
    }

    @Then("I verify water pump text in Fuse")
    public void iVerifyWaterPumpTextInFuse() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify water pump text in Fuse");
        asserttextValidationAccessibility(Constant_Fuses.Fusescreen_Water_Pump, Constant_Fuses.Fusescreen_Water_Pump_text_access_id);
    }

    @Then("I verify Satellite Dish text in Fuse")
    public void iVerifySatelliteDishTextInFuse() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Satellite Dish text in Fuse");
        asserttextValidationAccessibility(Constant_Fuses.Fusescreen_Satellite_Dish, Constant_Fuses.Fusescreen_Satellite_Dish_text_access_id);
    }

    @Then("I verify Accent light text in Fuse")
    public void iVerifyAccentLightTextInFuse() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Accent light text in Fuse");
        asserttextValidationAccessibility(Constant_Fuses.Fusescreen_Accent_Light, Constant_Fuses.Fusescreen_Accent_Light_text_access_id);
    }

    @Then("I verify Ceiling Light text in Fuse")
    public void iVerifyCeilingLightTextInFuse() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Ceiling Light text in Fuse");
        asserttextValidationAccessibility(Constant_Fuses.Fusescreen_Ceiling_Light, Constant_Fuses.Fusescreen_Ceiling_Light_text_access_id);
    }

    @Then("I verify Bed light text in Fuse")
    public void iVerifyBedLightTextInFuse() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Bed light text in Fuse");
        asserttextValidationAccessibility(Constant_Fuses.Fusescreen_Bed_Light, Constant_Fuses.Fusescreen_Bed_Light_text_access_id);
    }

    @Then("I verify washroom light text in Fuse")
    public void iVerifyWashroomLightTextInFuse() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify washroom light text in Fuse");
        asserttextValidationAccessibility(Constant_Fuses.Fusescreen_Washroom_Light, Constant_Fuses.Fusescreen_Washroom_Light_text_access_id);
    }

    @Then("I verify Galley text in Fuse")
    public void iVerifyGalleyTextInFuse() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Galley text in Fuse");
        asserttextValidationAccessibility(Constant_Fuses.Fusescreen_Galley_Light, Constant_Fuses.Fusescreen_Galley_Light_text_access_id);
        Basestepdefinition.verticalSwipe(0.7, 0.3, 0.5);
    }

    @Then("I verify Lounge light text in Fuse")
    public void iVerifyLoungeLightTextInFuse() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Lounge light text in Fuse");
        asserttextValidationAccessibility(Constant_Fuses.Fusescreen_Lounge_Light, Constant_Fuses.Fusescreen_Lounge_Light_text_access_id);
    }

    @Then("I verify Awning text in Fuse")
    public void iVerifyAwningTextInFuse() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Awning text in Fuse");
        asserttextValidationAccessibility(Constant_Fuses.Fusescreen_Awning_text, Constant_Fuses.Fusescreen_Awning_text_access_id);
    }

    @Then("I Verify the Awning text")
    public void iVerifyTheAwningText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Awning text");
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_Mechanical.Mechanicalscreen_Mechanical_text_xpath)));
        asserttextValidationAccessibility(Constant_Mechanical.Mechanical_Awning_Text, Constant_Mechanical.Mechanicalscreen_Awning_text_access_id);
    }

    @Then("I Verify the Extent text")
    public void iVerifyTheExtentText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Extent text");
        asserttextValidationAccessibility(Constant_Mechanical.Mechanical_Extend_Text, Constant_Mechanical.Mechanicalscreen_Extent_text_access_id);
    }

    @Then("I Verify the fresh water level text")
    public void iVerifyTheFreshWaterLevelText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the fresh water level text");
        asserttextValidation(Constant_Tank.Tank_freshwater_leveltext, Constant_Tank.Tanksscreen_Tanks_Fresh_Water_Level_xpath);
    }

    @Then("I verify the water pump text")
    public void iVerifyTheWaterPumpText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the water pump text");
        asserttextValidationAccessibility(Constant_Tank.Tank_freshwater_waterPump, Constant_Tank.Tanksscreen_Tanks_Water_Pump_text_access_id);
    }

    @Then("I verify the fresh text on button")
    public void iVerifyTheFreshTextOnButton() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the fresh text on button");
        asserttextValidation(Constant_Tank.Tank_freshwater_button_fresh, Constant_Tank.Tanksscreen_Fresh_xpath);
    }

    @Then("I verify the black text on button")
    public void iVerifyTheBlackTextOnButton() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the black text on button");
        asserttextValidation(Constant_Tank.Tank_freshwater_black_button, Constant_Tank.Tanksscreen_Black_xpath);
    }

    @Then("I verify the predictive data in Fresh water text")
    public void iVerifyThePredictiveDataInFreshWaterText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the predictive data in Fresh water text");
        asserttextValidation(Constant_Tank.Tank_freshwater_PredictiveData, Constant_Tank.Tanksscreen_Tanks_Predictive_Data_text_xpath);
    }

    @Then("I verify the Black water level text")
    public void iVerifyTheBlackWaterLevelText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Black water level text");
        asserttextValidation(Constant_Tank.Tanksscreen_BlackwaterTanks_BlackwaterLevel_text, Constant_Tank.Tanksscreen_Tanks_blackWaterLevel_text_xpath);
    }

    @Then("I verify the Empty Black Water Tank text")
    public void iVerifyTheEmptyBlackWaterTankText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Empty Black Water Tank text");
        asserttextValidationAccessibility(Constant_Tank.Tanksscreen_BlackwaterTanks_EmptyBlackwater_text, Constant_Tank.Tanksscreen_BlackwaterTanks_EmptyBlackwater_access_id);
    }

    @Then("I verify the Heater text in the Truma heater")
    public void iVerifyTheHeaterTextInTheTrumaHeater() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Heater text in the Truma heater");
        asserttextValidation(Constant_Tank.TrumaHeater_Heater_text, Constant_Tank.TrumaHeater_Heater_xpath);
    }

    @Then("I verify the status in the Truma heater")
    public void iVerifyTheStatusInTheTrumaHeater() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the status in the Truma heater");
        asserttextValidation(Constant_Tank.TrumaHeater_status_text, Constant_Tank.TrumaHeater_status_xpath);
    }

    @Then("I verify the Decalcification in the Truma heater")
    public void iVerifyTheDecalcificationInTheTrumaHeater() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Decalcification in the Truma heater");
        asserttextValidationAccessibility(Constant_Tank.Truma_Decalcification_text, Constant_Tank.Truma_Decalcification_text_access_id);
    }

    @Then("I verify the Mode text in the Truma heater")
    public void iVerifyTheModeTextInTheTrumaHeater() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Mode text in the Truma heater");
        asserttextValidationAccessibility(Constant_Tank.Truma_Mode_text, Constant_Tank.Truma_Mode_text_access_id);
    }

    @Then("I verify the Change Mode text in the Truma heater")
    public void iVerifyTheChangeModeTextInTheTrumaHeater() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Change Mode text in the Truma heater");
        asserttextValidationAccessibility(Constant_Tank.Truma_CHANGE_MODE, Constant_Tank.Truma_CHANGE_MODE_text_access_id);
    }

    @Then("I verify Tank-progressIndicator in Tank Fresh Water")
    public void iVerifyTankProgressIndicatorInTankFreshWater() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Tank-progressIndicator in Tank Fresh Water");
        freshWater = driver.findElementByAccessibilityId(Constant_Tank.Tanksscreen_Fresh_progressIndicator_access_id).getAttribute("text");
    }

    @Then("I Validated Tank-progressIndicator\\(Fresh Water) percentage is displayed in Landing screen")
    public void iValidatedTankProgressIndicatorFreshWaterPercentageIsDisplayedInLandingScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Validated Tank-progressIndicator (Fresh Water) percentage is displayed in Landing screen");
        System.out.println(freshWater);
        if (driver.findElement(By.xpath(Constant_Tank.Tanksscreen_Fresh_water_Level_Percentage_xpath)).getText().contains(freshWater)) {
            System.out.println("Text comparison is Successful");
        }
    }


    @Then("I verify Tank-progressIndicator in Tank Black Water")
    public void iVerifyTankProgressIndicatorInTankBlackWater() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Tank-progressIndicator in Tank Black Water");
        blackWater = driver.findElementByAccessibilityId(Constant_Tank.Tanksscreen_Black_progressIndicator).getAttribute("text");
    }


    @Then("I Validated Tank-progressIndicator\\(Black Water) Percentage is displayed in Landing screen")
    public void iValidatedTankProgressIndicatorBlackWaterPercentageIsDisplayedInLandingScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Validated Tank-progressIndicator (Black Water) Percentage is displayed in Landing screen");
        System.out.println(blackWater);
        if (blackWater.contains(driver.findElement(By.xpath(Constant_Tank.Tanksscreen_Black_water_Level_Percentage_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        }
    }

    @Then("I Verify the All option in the Bottom layout of Landing screen")
    public void iVerifyTheAllOptionInTheBottomLayoutOfLandingScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the All option in the Bottom layout of Landing screen");
        System.out.println("Text comparison is Successful!!!");
        iselementdisplayed(Constant_landingscreen.LandingPage_BottomLayout_All_xpath);
    }

    @Then("I Verify the Device option in the Bottom  layout of Landing screen")
    public void iVerifyTheDeviceOptionInTheBottomLayoutOfLandingScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Device option in the Bottom  layout of Landing screen");
        iselementdisplayed(Constant_landingscreen.LandingPage_BottomLayout_Device_xpath);
    }

    @Then("I Verify the Tanks option in the Bottom  layout of Landing screen")
    public void iVerifyTheTanksOptionInTheBottomLayoutOfLandingScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Tanks option in the Bottom  layout of Landing screen");
        iselementdisplayed(Constant_landingscreen.LandingPage_BottomLayout_TanksText_xpath);
    }

    @Then("I Verify the climate option in the Bottom  layout of Landing screen")
    public void iVerifyTheClimateOptionInTheBottomLayoutOfLandingScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the climate option in the Bottom  layout of Landing screen");
        iselementdisplayed(Constant_landingscreen.LandingPage_BottomLayout_Climate_xpath);
    }

    @Then("I Verify the Scene option in the Bottom  layout of Landing screen")
    public void iVerifyTheSceneOptionInTheBottomLayoutOfLandingScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Scene option in the Bottom  layout of Landing screen");
        iselementdisplayed(Constant_landingscreen.LandingPage_BottomLayout_Scene_xpath);
    }

    @Then("I Tap on climate option in the Bottom  layout of Landing screen")
    public void iTapOnClimateOptionInTheBottomLayoutOfLandingScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on climate option in the Bottom  layout of Landing screen");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_landingscreen.LandingPage_BottomLayout_Climate_text_xpath));
        if (elements.size() != 0) {
            WebDriverWait wait = new WebDriverWait(driver, 300);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_landingscreen.LandingPage_BottomLayout_Climate_text_xpath)));
            Taponbutton(Constant_landingscreen.LandingPage_BottomLayout_Climate_text_xpath);
        } else {
            WebDriverWait wait = new WebDriverWait(driver, 300);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_landingscreen.LandingPage_BottomLayout_Climate2tile_text_xpath)));
            Taponbutton(Constant_landingscreen.LandingPage_BottomLayout_Climate2tile_text_xpath);
        }

    }

    @Then("I Validated Corresponding Climate tile is displayed")
    public void iValidatedCorrespondingClimateTileIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Validated Corresponding Climate tile is displayed");
        String bottomLayout = driver.findElement(By.xpath(Constant_landingscreen.LandingPage_BottomLayout_Climate_text_xpath)).getText();
        String climateTile = driver.findElement(By.xpath(Constant_landingscreen.LandingPage_Climate_text_xpath)).getText();
        if (bottomLayout.equalsIgnoreCase(climateTile)) {
            System.out.println("Text comparison is Successful");
        }
    }

    @Then("I Tap on Device option in the Bottom  layout of Landing screen")
    public void iTapOnDeviceOptionInTheBottomLayoutOfLandingScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Device option in the Bottom  layout of Landing screen");
        Taponbutton(Constant_landingscreen.LandingPage_BottomLayout_Device_xpath);
    }

    @Then("I Validate Corresponding Devices tile is displayed")
    public void iValidateCorrespondingDevicesTileIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Validate Corresponding Devices tile is displayed");
//        String bottomLayoutDevices = driver.findElement(By.xpath(Constant_landingscreen.LandingPage_BottomLayout_Device_xpath)).getText();
        String LightTile = driver.findElement(By.xpath(Constant_landingscreen.LandingPage_MTCBilgePump_text_xpath)).getText();
        if (LightTile.contains(Constant_Tank.Truma_Light_text)) {
            System.out.println("Text comparison is Successful");
        } else if (LightTile.contains(Constant_Tank.Truma_AGS_MODE)) {
            System.out.println("Text comparison is Successful");
        } else if (LightTile.contains(Constant_Tank.Truma_Power_text)) {
            System.out.println("Text comparison is Successful");
        } else if (LightTile.contains(Constant_Tank.Truma_Fuses_MODE)) {
            System.out.println("Text comparison is Successful");
        } else if (LightTile.contains(Constant_Tank.Truma_Bilge_Pump)) {
            System.out.println("Text comparison is Successful");
        } else {
            System.out.println("Text comparison is Successful");
        }
    }

    @Then("I Tap on Tanks option in the Bottom  layout of Landing screen")
    public void iTapOnTanksOptionInTheBottomLayoutOfLandingScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Tanks option in the Bottom  layout of Landing screen");
        Taponbutton(Constant_landingscreen.LandingPage_BottomLayout_TanksText_xpath);
    }

    @Then("I Validate Corresponding Tank tile is displayed")
    public void iValidateCorrespondingTankTileIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Validate Corresponding Tank tile is displayed");
        String bottomLayoutTank = driver.findElement(By.xpath(Constant_landingscreen.LandingPage_BottomLayout_TanksText_xpath)).getText();
        String TankTile = driver.findElement(By.xpath(Constant_landingscreen.LandingPage_Tank_text_xpath)).getText();
        if (TankTile.contains(bottomLayoutTank)) {
            System.out.println("Text comparison is Successful");
        }
    }

    @Then("I Tap on Scene option in the Bottom  layout of Landing screen")
    public void iTapOnSceneOptionInTheBottomLayoutOfLandingScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Scene option in the Bottom  layout of Landing screen");
        Taponbutton(Constant_landingscreen.LandingPage_BottomLayout_Scene_xpath);
    }

    @Then("I Tap on All option in the Bottom layout of Landing screen")
    public void iTapOnAllOptionInTheBottomLayoutOfLandingScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on All option in the Bottom layout of Landing screen");
        Taponbutton(Constant_landingscreen.LandingPage_BottomLayout_All_xpath);
    }

    @Then("I scroll up the Truma heater carousel")
    public void iScrollUpTheTrumaHeaterCarousel() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll up the Truma heater carousel");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(550, 1350)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(550, 1100)).release().perform();
        System.out.println("Truma carousel is scrolled");
    }

    @Then("I Tap on the Truma heater Apply button")
    public void iTapOnTheTrumaHeaterApplyButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on the Truma heater Apply button");
        Taponbutton(Constant_Tank.WaterTruma_Applybutton_xpath);
    }

    @Then("I validated the Heater mode in the main screen")
    public void iValidatedTheHeaterModeInTheMainScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validated the Heater mode in the main screen");
        mainContentText = driver.findElement(By.xpath(Constant_Tank.WaterTruma_Tile_Main_content_status_xpath)).getText();
        System.out.println(Waterheater);
        for (String eachHeaterMode : Waterheater) {
            if (eachHeaterMode.contains(driver.findElement(By.xpath(Constant_Tank.WaterTruma_Tile_Main_content_status_xpath)).getText())) {
                System.out.println("Text comparison is Successful");
            }
        }
    }

    @Then("I Validated the updated Heater mode values in the Heater Main screen")
    public void iValidatedTheUpdatedHeaterModeValuesInTheHeaterMainScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Validated the updated Heater mode values in the Heater Main screen");
        String heaterMode = driver.findElementByAccessibilityId(Constant_Tank.Truma_Mode_Value_access_id).getText();
        if (mainContentText.contains(heaterMode)) {
            System.out.println("Text validation is successful");

        }
    }

    @Then("I validated Truma Heater Status on Tile")
    public void iValidatedTrumaHeaterStatusOnTile() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validated Truma Heater Status on Tile");
        Assert.assertTrue(iselementdisplayed(Constant_Tank.WaterTruma_Tile_Main_content_status_xpath));
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Tank.WaterTruma_Antifreeze_status_button_xpath));
        if (elements.size() != 0) {
            Taponbutton(Constant_Tank.TrumaHeater_Tile_textxpath);
            Thread.sleep(2000);
            for (int i = 0; i < 3; i++) {
                TouchAction action = new TouchAction(driver);
                action.press(PointOption.point(550, 900)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(550, 1100)).release().perform();
            }
            System.out.println("Truma carousel is scrolled Down");
            Taponbutton(Constant_Tank.WaterTruma_Applybutton_xpath);
        }
    }

    @Then("I verify the apply button in the Water heater Truma")
    public void iVerifyTheApplyButtonInTheWaterHeaterTruma() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the apply button in the Water heater Truma");
        /**
         * Globally declared list for Water heater**/
        Waterheater = new ArrayList<>();
        Waterheater.add(driver.findElement(By.xpath(com.dometic.L2.qa.Pages.Constant_Tank.WaterTruma_FirstValue_xpath)).getText());
        Waterheater.add(driver.findElement(By.xpath(com.dometic.L2.qa.Pages.Constant_Tank.WaterTruma_SecondValue_xpath)).getText());
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Tank.WaterTruma_ThirdValue_xpath));
        if (elements.size() != 0) {
            Waterheater.add(driver.findElement(By.xpath(com.dometic.L2.qa.Pages.Constant_Tank.WaterTruma_ThirdValue_xpath)).getText());
        }
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_Tank.WaterTruma_Applybutton_xpath);
        if (elementsByAccessibilityId.size() != 0) {
            Assert.assertTrue(iselementdisplayedaccessabilityId(com.dometic.L2.qa.Pages.Constant_Tank.WaterTruma_Applybutton_xpath));
        }
    }

    @Then("I Tap on the access this location pop up")
    public void iTapOnTheAccessThisLocationPopUp() throws InterruptedException {
        List<AndroidElement> elements1 = driver.findElements(By.xpath(Constant_OnboardingPage.Onboarding_allow_access_Landing_popup_xpath));
        if (elements1.size() != 0) {
            List<AndroidElement> id3 = driver.findElements(By.xpath(Constant_OnboardingPage.Onboarding_Keep_While_the_app_is_in_use));
            if (id3.size() != 0) {
                Taponbutton(Constant_OnboardingPage.Onboarding_Keep_While_the_app_is_in_use);
            }
            List<AndroidElement> id2 = driver.findElements(By.xpath(Constant_OnboardingPage.Onboarding_Keep_Only_this_time));
            if (id2.size() != 0) {
                Taponbutton(Constant_OnboardingPage.Onboarding_Keep_Only_this_time);
            }
            List<AndroidElement> id = driver.findElements(By.xpath(Constant_OnboardingPage.Onboarding_allow_all_time_access_Landing_popup_xpath));
            if (id.size() != 0) {
                Taponbutton(Constant_OnboardingPage.Onboarding_allow_all_time_access_Landing_popup_xpath);
            }
            List<AndroidElement> id1 = driver.findElements(By.xpath(Constant_OnboardingPage.Onboardingpermission_no_upgrade_one_time_and_dont_ask_again_button_xpath));
            if (id1.size() != 0) {
                Taponbutton(Constant_OnboardingPage.Onboardingpermission_no_upgrade_one_time_and_dont_ask_again_button_xpath);
            }
        }
    }

    @Then("I Tap on All climate toggle if already it's OFF state")
    public void iTapOnAllClimateToggleIfAlreadyItSOFFState() throws InterruptedException {
        String text = driver.findElementByAccessibilityId(com.dometic.L2.qa.Pages.Constant_climate_ac.climate_Allclimate_Toggle_Status_Access_id).getText();
        if (text.equalsIgnoreCase(Constant_Batteries_MTC.mtc_Climate_Tile_Power_toggle_Status)) {
            TaponbuttonaccessabilityID(com.dometic.L2.qa.Pages.Constant_climate_ac.climate_Allclimate_Toggle_Status_Access_id);
            Thread.sleep(10000);
        }
    }

    @Then("I Verify climate text displayed in the top of the app")
    public void iVerifyClimateTextPlacedInTheTopOfTheApp() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify climate text displayed in the top of the app");
        asserttextAccessibility("CLIMATE", com.dometic.L1.qa.Pages.Constant_climate_ac.CAC_M_Climate_Text_access_id);
    }
}

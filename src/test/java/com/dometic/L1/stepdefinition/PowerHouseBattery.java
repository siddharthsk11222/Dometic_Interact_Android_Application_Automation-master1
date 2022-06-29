package com.dometic.L1.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.L1.qa.Pages.Constant_climate_ac;
import com.dometic.L1.qa.Pages.Constant_landingscreen;
import com.dometic.L1.qa.Pages.Constant_power;
import com.dometic.L1.qa.util.Baseclass;
import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class PowerHouseBattery extends Baseclass {
    public static String text;
    @Then("I Tap on PowerHouseBattery CTA in Landing screen")
    public void iTapOnPowerHouseBatteryCTAInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on PowerHouseBattery CTA in Landing screen");
        List<AndroidElement> elementsByAccessibilityId = driver.findElements(By.xpath(Constant_landingscreen.LandingPage_power_tile_xpath));
        if(elementsByAccessibilityId.size()!=0){
            Taponbutton(Constant_landingscreen.LandingPage_power_tile_xpath);
        }
        else{
            Taponbutton(Constant_landingscreen.LandingPage_energie_tile_xpath);
        }
    }

    @Then("I verify POWER text displayed in the top of the app")
    public void iVerifyPOWERTextDisplayedInTheTopOfTheApp() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify POWER text displayed in the top of the app");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_power.Powerpage_power_text_access_id);
        if(elementsByAccessibilityId.size()!=0){
            WebDriverWait wait=new WebDriverWait(driver,5);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_power.Powerpage_power_text_xpath)));
            asserttextValidationAccessibility(Constant_power.Powerpage_power_text_expected,Constant_power.Powerpage_power_text_access_id);
        }
    }

    @Then("I verify power percentage is displayed in graphical format")
    public void iVerifyPowerPercentageIsDisplayedInGraphicalFormat() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify power percentage is displayed in graphical format");
//        text = driver.findElementByAccessibilityId(Constant_power.Powerpage_progressBar_xpath).getAttribute("text");
//        System.out.println(text);
        try{
            throw new MyException();
        }
        catch(MyException exp){
            System.out.println(exp.getMessage());
        }
//        Assert.assertTrue(false);
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_power.CAC_M_power_percentage_xpath));
        if(elements.size()!=0){
            WebDriverWait wait=new WebDriverWait(driver,5);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_power.CAC_M_power_percentage_xpath)));
            Assert.assertTrue(iselementdisplayed(Constant_power.CAC_M_power_percentage_xpath));
        }
    }

    @Then("I verify HOUSE BATTERY text is displayed")
    public void iVerifyHOUSEBATTERYTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify HOUSE BATTERY text is displayed");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_power.Powerpage_houseBattery_text_access_id);
        if(elementsByAccessibilityId.size()!=0){
            asserttextValidationAccessibility(Constant_power.Powerpage_houseBattery_expected,Constant_power.Powerpage_houseBattery_text_access_id);
        }
    }


    @Then("I verify Back Button displayed in left corner of the Power house battery screen")
    public void iVerifyBackButtonDisplayedInLeftCornerOfThePowerHouseBatteryScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Back Button displayed in left corner of the Power house battery screen");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_climate_ac.CAC_M_power_Back_Button_access_id);
        if(elementsByAccessibilityId.size()!=0){
           Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_M_power_Back_Button_access_id));
        }
    }

    @Then("I Tap on Back Button in Power house battery screen")
    public void iTapOnBackButtonInPowerHouseBatteryScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Back Button in Power house battery screen");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_climate_ac.CAC_M_power_Back_Button_access_id);
        if(elementsByAccessibilityId.size()!=0) {
            TaponbuttonaccessabilityID(Constant_climate_ac.CAC_M_power_Back_Button_access_id);
        }
     //  driver.navigate().back();
//        driver.pressKeyCode(AndroidKeyCode.BACK);
    }

    @Then("I verify BatteryVoltage text is displayed")
    public void iVerifyBatteryVoltageIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify BatteryVoltage text is displayed");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_power.Powerpage_batteryVoltageText_access_id);
        if(elementsByAccessibilityId.size()!=0){
            asserttextValidationAccessibility(Constant_power.Powerpage_batteryVoltageText_expected,Constant_power.Powerpage_batteryVoltageText_access_id);
        }

    }

    @Then("I verify Current text is displayed")
    public void iVerifyCurrentIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Current text is displayed");
      //  Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_powerScreen_currentContainer));
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_power.Powerpage_currentText_access_id);
        if(elementsByAccessibilityId.size()!=0){
           asserttextValidationAccessibility(Constant_power.Powerpage_currentText_expected,Constant_power.Powerpage_currentText_access_id);
        }
    }

    @Then("I verify Time text is displayed")
    public void iVerifyTimeIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Time text is displayed");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_power.Powerpage_timeText_access_id);
        if(elementsByAccessibilityId.size()!=0){
           asserttextValidationAccessibility(Constant_power.Powerpage_timeText_expected,Constant_power.Powerpage_timeText_access_id);
        }
      //  Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_powerScreen_timeContainer));
    }

    @Then("I verify powerSource text is displayed")
    public void iVerifyPowerSourceIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify powerSource text is displayed");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_power.Powerpage_powerSourceText_access_id);
        if(elementsByAccessibilityId.size()!=0){
            asserttextValidationAccessibility(Constant_power.Powerpage_powerSourceText_expected,Constant_power.Powerpage_powerSourceText_access_id);
        }
      //  Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_ac.CAC_powerScreen_powerSourceContainer));
    }

    @Then("I verify BatteryVoltage value is displayed")
    public void iVerifyBatteryVoltageValueIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify BatteryVoltage value is displayed");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_power.Powerpage_batteryVoltageValue_access_id);
        if(elementsByAccessibilityId.size()!=0){
            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_power.Powerpage_batteryVoltageValue_access_id));
            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_power.Powerpage_batteryVoltagevoltText_access_id));
        }
    }

    @Then("I verify Current value is displayed")
    public void iVerifyCurrentValueIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Current value is displayed");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_power.Powerpage_currentValue_access_id);
        if(elementsByAccessibilityId.size()!=0){
           Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_power.Powerpage_currentValue_access_id));
            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_power.Powerpage_ampereText_access_id));
        }
    }

    @Then("I verify Time value is displayed")
    public void iVerifyTimeValueIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Time value is displayed");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_power.Powerpage_timeValue_access_id);
        if(elementsByAccessibilityId.size()!=0){
           Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_power.Powerpage_timeValue_access_id));
            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_power.Powerpage_hourText_access_id));
        }
    }

    @Then("I verify powerSource value is displayed")
    public void iVerifyPowerSourceValueIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify powerSource value is displayed");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_power.Powerpage_timeValue_access_id);
        if(elementsByAccessibilityId.size()!=0){
            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_power.Powerpage_powerSourceValue_access_id));
            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_power.Powerpage_powerSourcevoltText_access_id));
        }
    }
}

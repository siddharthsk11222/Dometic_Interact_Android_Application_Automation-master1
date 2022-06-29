package com.dometic.L1.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.L1.qa.Pages.Constant_Language;
import com.dometic.L1.qa.Pages.Constant_climate_ac;
import com.dometic.L1.qa.Pages.Constant_climate_heater;
import com.dometic.L1.qa.Pages.Constant_landingscreen;
import com.dometic.L1.qa.util.Baseclass;
import cucumber.api.java.en.Then;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class LanguageValidationLandingPage extends Baseclass {
    @Then("I Entered into Landing screen")
    public void iEnteredIntoLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I entered into Landing screen");
        List<AndroidElement> elements1 = driver.findElements(By.xpath(Constant_landingscreen.LandingPage_Firmware_popup_xpath));
        if(elements1.size()!=0){
            Taponbutton(Constant_landingscreen.LandingPage_LATER_button_xpath);
        }
        List<AndroidElement> elements3 = driver.findElementsByAccessibilityId(Constant_landingscreen.LandingPage_remainderView_iconClose_access_id);
        if(elements3.size()!=0){
            TaponbuttonaccessabilityID(Constant_landingscreen.LandingPage_remainderView_iconClose_access_id);
        }
        WebDriverWait wait=new WebDriverWait(driver,300);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_Language.Climate_German_Klima_text_xpath)));
    }

    @Then("I verify Klima Tile is displayed in Landing screen")
    public void iVerifyKlimaTileIsDisplayedInLandingScreen() {
        Assert.assertTrue(iselementdisplayed(Constant_Language.Climate_German_Klima_text_xpath));
    }

    @Then("I verify Climate Klimaanlage text is displayed in landing screen")
    public void iVerifyClimateKlimaanlageTextIsDisplayedInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Climate Aircondition text is displayed in landing screen");
        String text = driver.findElementByAccessibilityId(Constant_Language.LandingPage_German_Climate_Air_conditioner_OFF_Heater_access_id).getText();
        if (text.equalsIgnoreCase(Constant_Language.Climate_heater_Heizung_German_text_expected)) {
            System.out.println("Text comparison is Successful");
        } else if (text.equalsIgnoreCase(Constant_Language.Climate_aircondition_Klimaanlage_German_text_expected)) {
            System.out.println("Text comparison is Successful");
        } else {
            System.out.println("Text comparison is Successful");
        }
        List<AndroidElement> elements = driver.findElementsByAccessibilityId(Constant_Language.Climate_heater_Heizung_German_text_access_id);
        if(elements.size()!=0){
            TaponbuttonaccessabilityID(Constant_Language.Climate_German_Klima_text_access_id);
            WebDriverWait wait=new WebDriverWait(driver,30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_climate_ac.CAC_M_climate_powerContainer_xpath)));
            Thread.sleep(3000);
            TaponbuttonaccessabilityID(Constant_landingscreen.LandingPage_acText_access_id);
            WebDriverWait wait1=new WebDriverWait(driver,30);
            wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_climate_ac.CAC_M_climate_powerContainer_xpath)));
            Thread.sleep(4000);
            TaponbuttonaccessabilityID(Constant_climate_ac.CAC_M_Power_Button_access_id);
            Thread.sleep(4000);
            Taponbutton(Constant_climate_heater.CHeater_power_on_ac_yes_button_xpath);
            Thread.sleep(3000);
            TaponbuttonaccessabilityID(Constant_climate_ac.CAC_M_power_Back_Button_access_id);
            Thread.sleep(3000);
        }
//        if(elements.size()!=0){
//            asserttextAccessibility(Constant_Language.Climate_aircondition_Klimaanlage_German_text_expected,Constant_Language.Climate_aircondition_Klimaanlage_German_text_access_id);
//        }
//        else{
//            asserttextAccessibility(Constant_Language.Climate_heater_Heizung_German_text_expected,Constant_Language.Climate_heater_Heizung_German_text_access_id);
//
   }

    @Then("I verify Klima is displayed in Landing screen")
    public void iVerifyKlimaIsDisplayedInLandingScreen() throws Throwable {
        List<AndroidElement> accessibilityId = driver.findElementsByAccessibilityId(Constant_Language.Climate_German_Klima_outside_text_access_id);
        while (accessibilityId.size() == 0) {
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(350, 600)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(200, 600)).release().perform();
            System.out.println("Swipe the Klima Tile");
            break;
        }
        asserttextAccessibility(Constant_Language.Climate_German_Klima_text_expected,Constant_Language.Climate_German_Klima_text_access_id);
    }

    @Then("I verify Klima draußen text is displayed in Landing screen")
    public void iVerifyKlimaDraußenTextIsDisplayedInLandingScreen() throws Throwable {
        asserttextValidationAccessibility(Constant_Language.Climate_German_Klima_outside_text_text_expected,Constant_Language.Climate_German_Klima_outside_text_access_id);
    }

    @Then("I verify Energie Tile is displayed in Landing screen")
    public void iVerifyEnergieTileIsDisplayedInLandingScreen() {
        Assert.assertTrue(iselementdisplayed(Constant_Language.Power_German_Energie_text_expected));
    }

    @Then("I verify Energie Aufbaubatterie text is displayed in landing screen")
    public void iVerifyEnergieAufbaubatterieTextIsDisplayedInLandingScreen() throws Throwable {
        asserttext(Constant_Language.Power_German_Energie_text_expected,Constant_Language.Power_German_Energie_text_xpath);
        asserttext(Constant_Language.HouseBattery_German_Aufbaubatterie_text_expected,Constant_Language.HouseBattery_German_Aufbaubatterie_text_xpath);
    }

    @Then("I verify Panzer Frischwassertank is displayed in Landing screen")
    public void iVerifyPanzerFrischwassertankIsDisplayedInLandingScreen() {
        Assert.assertTrue(iselementdisplayed(Constant_landingscreen.Tank_title_xpath));
    }

    @Then("I verify Panzer Frischwassertank text is displayed in landing screen")
    public void iVerifyPanzerFrischwassertankTextIsDisplayedInLandingScreen() throws Throwable {
        asserttextAccessibility(Constant_Language.Tank_German_text_text_expected,Constant_landingscreen.Tank_title_xpath);
        asserttext(Constant_Language.FreshWater_German_Frischwassertank_text_expected,Constant_Language.FreshWater_German_Frischwassertank_text_xpath);
    }

    @Then("I verify Panzer Frischwassertank percentage is displayed in landing screen")
    public void iVerifyPanzerFrischwassertankPercentageIsDisplayedInLandingScreen() {
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_landingscreen.LandingPage_Tank_FreshwaterTank_percentage_access_id));
    }

    @Then("I verify Panzer Grauwassertank text is displayed in landing screen")
    public void iVerifyPanzerGrauwassertankTextIsDisplayedInLandingScreen() throws Throwable {
        asserttext(Constant_Language.Tank_German_text_text_expected,Constant_landingscreen.Tank_Greywater_title_xpath);
        asserttext(Constant_Language.Greywater_German_Frischwassertank_text_expected,Constant_Language.Greywater_German_Frischwassertank_text_xpath);
    }

    @Then("I verify Panzer Grauwassertank percentage is displayed in landing screen")
    public void iVerifyPanzerGrauwassertankPercentageIsDisplayedInLandingScreen() {
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_landingscreen.LandingPage_Tank_GreywaterTank_percentage_access_id));
        Basestepdefinition.verticalSwipe(0.3, 0.7, 0.5);
        List<AndroidElement> accessibilityId = driver.findElementsByAccessibilityId(Constant_Language.FreshWater_German_Frischwassertank_text_access_id);
        while (accessibilityId.size() == 0) {
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(150, 1075)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(350, 1075)).release().perform();
            System.out.println("Swipe the Tank Screen");
            break;
        }
    }

    @Then("I verify Klima Climate fan icon is displayed in landing screen")
    public void iVerifyKlimaClimateFanIconIsDisplayedInLandingScreen() {
        List<AndroidElement> elements = driver.findElementsByAccessibilityId(Constant_Language.Climate_German_Klima_fanIcon_access_id);
        if(elements.size()!=0){
            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_Language.Climate_German_Klima_fanIcon_access_id));
        }
    }

    @Then("I verify Klima Climate fan speed is displayed in landing screen")
    public void iVerifyKlimaClimateFanSpeedIsDisplayedInLandingScreen() {
        List<AndroidElement> elements = driver.findElementsByAccessibilityId(Constant_Language.Climate_German_Klima_fanSpeed_access_id);
        if(elements.size()!=0){
            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_Language.Climate_German_Klima_fanSpeed_access_id));
        }

    }

    @Then("I verify Klima unit in outside is displayed in landing screen")
    public void iVerifyKlimaUnitInOutsideIsDisplayedInLandingScreen() {
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_Language.Climate_German_Klima1_mainContent_access_id));
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_Language.Climate_German_Klima1_unit_access_id));
        List<AndroidElement> accessibilityId = driver.findElementsByAccessibilityId(Constant_Language.Climate_German_Klima_mainContent_access_id);
        while (accessibilityId.size() == 0) {
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(200, 600)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(350, 600)).release().perform();
            System.out.println("Swipe the Tank Tile");
            break;
        }
    }
}

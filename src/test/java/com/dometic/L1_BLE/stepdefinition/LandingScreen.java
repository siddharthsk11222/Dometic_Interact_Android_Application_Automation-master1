package com.dometic.L1_BLE.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.L1_BLE.qa.Pages.*;
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

public class LandingScreen extends Baseclass {
    @Then("I entered into Landing screen")
    public void iEnteredIntoLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I entered into Landing screen");
        List<AndroidElement> elements1 = driver.findElements(By.xpath(Constant_landingscreen.LandingPage_Firmware_popup_xpath));
        if(elements1.size()!=0){
            Taponbutton(Constant_landingscreen.LandingPage_LATER_button_xpath);
        }
        List<AndroidElement> elements2 = driver.findElementsByAccessibilityId(Constant_settings.Settings_languageContainer_access_id);
        if(elements2.size()!=0){
           Thread.sleep(3000);
            TaponbuttonaccessabilityID(Constant_climate_ac.CAC_M_power_Back_Button_access_id);
        }
        List<AndroidElement> elements3 = driver.findElementsByAccessibilityId(Constant_landingscreen.LandingPage_remainderView_iconClose_access_id);
        if(elements3.size()!=0){
            TaponbuttonaccessabilityID(Constant_landingscreen.LandingPage_remainderView_iconClose_access_id);
        }
        WebDriverWait wait=new WebDriverWait(driver,300);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_landingscreen.LandingPage_Climate_Outside_xpath)));
//        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_landingscreen.LandingPage_Climate_Outside_xpath));
//        if (elements.size()!=0){
//            System.out.println(elements.get(0).getText());
//            elements.get(0).click();
//        }
    }

    @Then("I verify Climate Tile is displayed in Landing screen")
    public void iVerifyClimateOFFIsDisplayedInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Climate Tile is displayed in Landing screen");
       /* List<AndroidElement> elements = driver.findElements(By.xpath(Constant_landingscreen.LandingPage_Update_Firmware_CANCEL_xpath));
        if (elements.size()!=0){
            elements.get(0).click();
        }*/
       // Assert.assertTrue(iselementdisplayed(Constant_landingscreen.LandingPage_Climate_Aircondition_xpath));
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_landingscreen.LandingPage_climate_tile_access_id));
    }

    @Then("I verify Climate Outside is displayed in Landing screen")
    public void iVerifyClimateOutsideIsDisplayedInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Climate Outside is displayed in Landing screen");
        //Assert.assertTrue(iselementdisplayed(Constant_landingscreen.LandingPage_climate_outSide_tile_access_id));
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_landingscreen.LandingPage_climate_outSide_tile_access_id));
    }

    @Then("I verify PowerHouseBattery is displayed in Landing screen")
    public void iVerifyPowerHouseBatteryIsDisplayedInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify PowerHouseBattery is displayed in Landing screen");
      //  Assert.assertTrue(iselementdisplayed(Constant_landingscreen.LandingPage_power_tile_access_id));
        Assert.assertTrue(iselementdisplayed(Constant_landingscreen.LandingPage_power_tile_xpath));
    }

    @Then("I verify Tank Fresh Water is displayed in Landing screen")
    public void iVerifyTankFreshWaterIsDisplayedInLandingScreen() throws Throwable {
     //   Assert.assertTrue(iselementdisplayed(Constant_landingscreen.LandingPage_freshWater_tank_tile_access_id));
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Tank Fresh Water is displayed in Landing screen");
        Assert.assertTrue(iselementdisplayed(Constant_landingscreen.Tank_title_xpath));
    }

    @Then("I verify Grauwassertank is displayed in Landing screen")
    public void iVerifyWaterHeaterTrumaIsDisplayedInLandingScreen() throws Throwable {
     //   Assert.assertTrue(iselementdisplayed(Constant_landingscreen.LandingPage_grayWater_tank_tile_access_id));
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Grauwassertank is displayed in Landing screen");
        List<AndroidElement> accessibilityId = driver.findElementsByAccessibilityId(Constant_Language.FreshWater_German_Frischwassertank_text_access_id);
        while (accessibilityId.size() == 0) {
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(350, 1075)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(150, 1075)).release().perform();
            System.out.println("Swipe the Tank Tile");
            break;
        }
        Assert.assertTrue(iselementdisplayed(Constant_landingscreen.Tank_Greywater_title_xpath));
    }

    @Then("I verify Climate Aircondition text is displayed in landing screen")
    public void iVerifyClimateAirconditionTextIsDisplayedInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Climate Aircondition text is displayed in landing screen");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_landingscreen.LandingPage_Climate_off_xpath));
        if(elements.size()!=0){
            TaponbuttonaccessabilityID(Constant_landingscreen.LandingPage_climate_tile_access_id);
            WebDriverWait wait=new WebDriverWait(driver,30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_climate_ac.CAC_M_climate_powerContainer_xpath)));
            TaponbuttonaccessabilityID(Constant_climate_ac.CAC_M_Power_Button_access_id);
            Thread.sleep(4000);
            TaponbuttonaccessabilityID(Constant_climate_ac.CAC_M_power_Back_Button_access_id);
            Thread.sleep(3000);
        }
        List<AndroidElement> elementsByAccessibilityId1 = driver.findElementsByAccessibilityId(Constant_landingscreen.LandingPage_Heater_text_access_id);
        if(elementsByAccessibilityId1.size()!=0){
            TaponbuttonaccessabilityID(Constant_landingscreen.LandingPage_climate_tile_access_id);
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
        asserttextAccessibility(Constant_landingscreen.LandingPage_Climate_text_expected,Constant_landingscreen.LandingPage_Climate_Outside_access_id);
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_landingscreen.LandingPage_Climate_Aircondition_text_access_id);
        if(elementsByAccessibilityId.size()!=0){
            WebDriverWait wait=new WebDriverWait(driver,100);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_landingscreen.LandingPage_Climate_Aircondition_text_xpath)));
            asserttextAccessibility(Constant_landingscreen.LandingPage_Climate_inside_Aircondition_text_expected,Constant_landingscreen.LandingPage_Climate_Aircondition_text_access_id);

        }
    }

    @Then("I verify Climate unit is displayed in landing screen")
    public void iVerifyClimateUnitIsDisplayedInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Climate unit is displayed in landing screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_landingscreen.LandingPage_Climate_unit_maincontent_access_id));
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_landingscreen.LandingPage_Climate_unit_access_id));
    }

    @Then("I verify fan icon is displayed in landing screen")
    public void iVerifyFanIconIsDisplayedInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify fan icon is displayed in landing screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_landingscreen.LandingPage_Climate_Inside_FanIcon_access_id));

    }

    @Then("I verify fan speed is displayed in landing screen")
    public void iVerifyFanSpeedIsDisplayedInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify fan icon is displayed in landing screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_landingscreen.LandingPage_Climate_Inside_FanSpeedText_access_id));
    }

    @Then("I verify Climate Outside text is displayed in Landing screen")
    public void iVerifyClimateOutsideTextIsDisplayedInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Climate Outside text is displayed in Landing screen");
        asserttextAccessibility(Constant_landingscreen.LandingPage_Climate_text_expected,Constant_landingscreen.LandingPage_Climate_Outside_access_id);
        asserttextAccessibility(Constant_landingscreen.LandingPage_Climate_Outside_text_expected,Constant_landingscreen.LandingPage_Climate_Outside_text_access_id);
    }

    @Then("I verify Climate unit in outside is displayed in landing screen")
    public void iVerifyClimateUnitInOutsideIsDisplayedInLandingScreen() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Climate unit in outside is displayed in landing screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_landingscreen.LandingPage_Climate_outside_unit_maincontent_access_id));
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_landingscreen.LandingPage_Climate_outside_unit_access_id));
    }

    @Then("I verify Power HouseBattery text is displayed in landing screen")
    public void iVerifyPowerHouseBatteryTextIsDisplayedInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Power HouseBattery text is displayed in landing screen");
        asserttext(Constant_landingscreen.LandingPage_Power_text_expected,Constant_landingscreen.LandingPage_power_tile_xpath);
        asserttext(Constant_landingscreen.LandingPage_Power_HouseBattery_text_expected,Constant_landingscreen.LandingPage_Power_House_Battery_xpath);

    }

    @Then("I verify Power percentage is displayed in landing screen")
    public void iVerifyPowerPercentageIsDisplayedInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Power percentage is displayed in landing screen");
        Assert.assertTrue(iselementdisplayed(Constant_landingscreen.LandingPage_Power_percentage_xpath));
        Basestepdefinition.verticalSwipe(0.7,0.3,0.5);
    }

    @Then("I verify Tank FreshwaterTank text is displayed in landing screen")
    public void iVerifyTankFreshwaterTankTextIsDisplayedInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Tank FreshwaterTank text is displayed in landing screen");
        asserttext(Constant_landingscreen.LandingPage_Tank_text_expected,Constant_landingscreen.Tank_title_xpath);
        asserttext(Constant_landingscreen.LandingPage_Tank_Freshwater_Tank_text_expected,Constant_landingscreen.LandingPage_Tank_Fresh_Water_xpath);
    }

    @Then("I verify Tank FreshwaterTank percentage is displayed in landing screen")
    public void iVerifyTankFreshwaterTankPercentageIsDisplayedInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Tank FreshwaterTank percentage is displayed in landing screen");
        Assert.assertTrue(iselementdisplayed(Constant_landingscreen.LandingPage_Tank_Fresh_Water_percentage_xpath));
    }

    @Then("I verify Tank GreywaterTank text is displayed in landing screen")
    public void iVerifyTankGreywaterTankTextIsDisplayedInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Tank GreywaterTank text is displayed in landing screen");
        asserttext(Constant_landingscreen.LandingPage_Tank_text_expected,Constant_landingscreen.Tank_Greywater_title_xpath);
        asserttext(Constant_landingscreen.LandingPage_Tank_Greywater_Tank_text_expected,Constant_landingscreen.LandingPage_Tank_grey_water_tank_xpath);
    }

    @Then("I verify Tank GreywaterTank percentage is displayed in landing screen")
    public void iVerifyTankGreywaterTankPercentageIsDisplayedInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Tank GreywaterTank percentage is displayed in landing screen");
        Assert.assertTrue(iselementdisplayed(Constant_landingscreen.LandingPage_Tank_grey_water_tank_percentage_xpath));
        Basestepdefinition.verticalSwipe(0.3,0.7,0.5);
    }
    @Then("I verify Klima unit is displayed in landing screen")
    public void iVerifyKlimaUnitIsDisplayedInLandingScreen() {
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_Language.Climate_German_Klima_mainContent_access_id));
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_Language.Climate_German_Klima_unit_access_id));
    }


}

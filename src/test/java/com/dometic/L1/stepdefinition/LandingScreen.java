package com.dometic.L1.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.L1.qa.Pages.*;
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
import java.util.Map;

public class LandingScreen extends Baseclass {
    @Then("I entered into Landing screen")
    public void iEnteredIntoLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I entered into Landing screen");
        List<AndroidElement> elements1 = driver.findElements(By.xpath(Constant_landingscreen.LandingPage_Firmware_popup_xpath));
        if (elements1.size() != 0) {
            Taponbutton(Constant_landingscreen.LandingPage_LATER_button_xpath);
        }
        List<AndroidElement> elements2 = driver.findElementsByAccessibilityId(Constant_settings.Settings_languageContainer_access_id);
        if (elements2.size() != 0) {
            Thread.sleep(3000);
            TaponbuttonaccessabilityID(Constant_climate_ac.CAC_M_power_Back_Button_access_id);
        }
        List<AndroidElement> elements3 = driver.findElementsByAccessibilityId(Constant_landingscreen.LandingPage_remainderView_iconClose_access_id);
        if (elements3.size() != 0) {
            TaponbuttonaccessabilityID(Constant_landingscreen.LandingPage_remainderView_iconClose_access_id);
        }
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
        List<AndroidElement> accessibilityId = driver.findElementsByAccessibilityId(Constant_landingscreen.LandingPage_Climate_outside_unit_maincontent_access_id);
        while (accessibilityId.size() == 0) {
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(340, 600)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(80, 600)).release().perform();
            System.out.println("Swipe the Climate Tile");
            break;
        }
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

    @Then("I verify Greywater Tank is displayed in Landing screen")
    public void iVerifyWaterHeaterTrumaIsDisplayedInLandingScreen() throws Throwable {
        //   Assert.assertTrue(iselementdisplayed(Constant_landingscreen.LandingPage_grayWater_tank_tile_access_id));
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Greywater is displayed in Landing screen");
        List<AndroidElement> accessibilityId = driver.findElementsByAccessibilityId(Constant_landingscreen.LandingPage_Tank_Grey_text_access_id);
        while (accessibilityId.size() == 0) {
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(340, 1075)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(80, 1075)).release().perform();
            System.out.println("Swipe the Tank Tile");
            break;
        }
        Assert.assertTrue(iselementdisplayed(Constant_landingscreen.Tank_Greywater_title_xpath));
    }

    @Then("I verify Climate Aircondition text is displayed in landing screen")
    public void iVerifyClimateAirconditionTextIsDisplayedInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Climate Aircondition text is displayed in landing screen");
        String text = driver.findElementByAccessibilityId(Constant_landingscreen.LandingPage_Climate_Air_conditioner_OFF_Heater_access_id).getText();
        if (text.equalsIgnoreCase("Heater")) {
            System.out.println("Text comparison is Successful");
        } else if (text.equalsIgnoreCase("Aircondition")) {
            System.out.println("Text comparison is Successful");
        } else {
            System.out.println("Text comparison is Successful");
        }
        List<AndroidElement> elements = driver.findElementsByAccessibilityId(Constant_landingscreen.LandingPage_Climate_Air_conditioner_OFF_Heater_access_id);
        if (elements.get(0).getText().equalsIgnoreCase("Aircondition")) {
            TaponbuttonaccessabilityID(Constant_landingscreen.LandingPage_climate_tile_access_id);
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_climate_ac.CAC_M_climate_powerContainer_xpath)));
            String toggleStatus = driver.findElementByAccessibilityId(Constant_climate_ac.CAC_M_Power_Button_access_id).getAttribute("text");
            if (toggleStatus.equalsIgnoreCase("OFF")) {
                TaponbuttonaccessabilityID(Constant_climate_ac.CAC_M_Power_Button_access_id);
                Thread.sleep(10000);
            }
            TaponbuttonaccessabilityID(Constant_climate_ac.CAC_M_power_Back_Button_access_id);
            Thread.sleep(3000);
        }
        List<AndroidElement> elements1 = driver.findElementsByAccessibilityId(Constant_landingscreen.LandingPage_Climate_Air_conditioner_OFF_Heater_access_id);
        if (elements1.get(0).getText().equalsIgnoreCase("Heater")) {
            TaponbuttonaccessabilityID(Constant_landingscreen.LandingPage_climate_tile_access_id);
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_climate_ac.CAC_M_climate_powerContainer_xpath)));
            Thread.sleep(3000);
            TaponbuttonaccessabilityID(Constant_landingscreen.LandingPage_acText_access_id);
            WebDriverWait wait1 = new WebDriverWait(driver, 30);
            wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_climate_ac.CAC_M_climate_powerContainer_xpath)));
            Thread.sleep(2000);
            TaponbuttonaccessabilityID(Constant_climate_ac.CAC_M_Power_Button_access_id);
            Thread.sleep(10000);
            List<AndroidElement> elements2 = driver.findElements(By.xpath(Constant_climate_heater.CHeater_power_on_ac_yes_button_xpath));
            if (elements2.size() != 0) {
                Taponbutton(Constant_climate_heater.CHeater_power_on_ac_yes_button_xpath);
                Thread.sleep(3000);
            }
            TaponbuttonaccessabilityID(Constant_climate_ac.CAC_M_power_Back_Button_access_id);
            Thread.sleep(3000);
        }
        asserttextAccessibility(Constant_landingscreen.LandingPage_Climate_text_expected, Constant_landingscreen.LandingPage_Climate_Tile_text_access_id);
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_landingscreen.LandingPage_Climate_Aircondition_text_access_id);
        if (elementsByAccessibilityId.size() != 0) {
            WebDriverWait wait = new WebDriverWait(driver, 100);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_landingscreen.LandingPage_Climate_Aircondition_text_xpath)));
            asserttextAccessibility(Constant_landingscreen.LandingPage_Climate_inside_Aircondition_text_expected, Constant_landingscreen.LandingPage_Climate_Aircondition_text_access_id);

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
        asserttextAccessibility(Constant_landingscreen.LandingPage_Climate_text_expected, Constant_landingscreen.LandingPage_Climate_Text_access_id);
        asserttextAccessibility(Constant_landingscreen.LandingPage_Climate_Outside_text_expected, Constant_landingscreen.LandingPage_Climate_Outside_text_access_id);
    }

    @Then("I verify Climate unit in outside is displayed in landing screen")
    public void iVerifyClimateUnitInOutsideIsDisplayedInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Climate unit in outside is displayed in landing screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_landingscreen.LandingPage_Climate_outside_unit_maincontent_access_id));
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_landingscreen.LandingPage_Climate_outside_unit_access_id));
        List<AndroidElement> accessibilityId = driver.findElementsByAccessibilityId(Constant_landingscreen.LandingPage_Climate_Inside_text_access_id);
        while (accessibilityId.size() == 0) {
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(175, 600)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(450, 600)).release().perform();
            System.out.println("Swipe the Climate Tile");
            break;
        }
    }

    @Then("I verify Power HouseBattery text is displayed in landing screen")
    public void iVerifyPowerHouseBatteryTextIsDisplayedInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Power HouseBattery text is displayed in landing screen");
        asserttext(Constant_landingscreen.LandingPage_Power_text_expected, Constant_landingscreen.LandingPage_power_tile_xpath);
        asserttext(Constant_landingscreen.LandingPage_Power_HouseBattery_text_expected, Constant_landingscreen.LandingPage_Power_House_Battery_xpath);

    }

    @Then("I verify Power percentage is displayed in landing screen")
    public void iVerifyPowerPercentageIsDisplayedInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Power percentage is displayed in landing screen");
        Assert.assertTrue(iselementdisplayed(Constant_landingscreen.LandingPage_Power_percentage_xpath));
    }

    @Then("I verify Tank FreshwaterTank text is displayed in landing screen")
    public void iVerifyTankFreshwaterTankTextIsDisplayedInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Tank FreshwaterTank text is displayed in landing screen");
        asserttext(Constant_landingscreen.LandingPage_Tank_text_expected, Constant_landingscreen.Tank_title_xpath);
        asserttext(Constant_landingscreen.LandingPage_Tank_Freshwater_Tank_text_expected, Constant_landingscreen.LandingPage_Tank_Fresh_Water_xpath);
    }

    @Then("I verify Tank FreshwaterTank percentage is displayed in landing screen")
    public void iVerifyTankFreshwaterTankPercentageIsDisplayedInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Tank FreshwaterTank percentage is displayed in landing screen");
        Assert.assertTrue(iselementdisplayed(Constant_landingscreen.LandingPage_Tank_Fresh_Water_percentage_xpath));
    }

    @Then("I verify Tank Greywater Tank text is displayed in landing screen")
    public void iVerifyTankGreywaterTankTextIsDisplayedInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Tank GreywaterTank text is displayed in landing screen");
        asserttext(Constant_landingscreen.LandingPage_Tank_text_expected, Constant_landingscreen.Tank_Greywater_title_xpath);
        asserttext(Constant_landingscreen.LandingPage_Tank_Greywater_Tank_text_expected, Constant_landingscreen.LandingPage_Tank_grey_water_tank_xpath);
    }

    @Then("I verify Tank Greywater Tank percentage is displayed in landing screen")
    public void iVerifyTankGreywaterTankPercentageIsDisplayedInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Tank GreywaterTank percentage is displayed in landing screen");
        Assert.assertTrue(iselementdisplayed(Constant_landingscreen.LandingPage_Tank_grey_water_tank_percentage_xpath));
        List<AndroidElement> accessibilityId = driver.findElementsByAccessibilityId(Constant_landingscreen.LandingPage_Tank_FreshwaterTank_text_access_id);
        while (accessibilityId.size() == 0) {
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(175, 1075)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(450, 1075)).release().perform();
            System.out.println("Swipe the Tank Screen");
            break;
        }
    }

    @Then("I verify Klima unit is displayed in landing screen")
    public void iVerifyKlimaUnitIsDisplayedInLandingScreen() {
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_Language.Climate_German_Klima_mainContent_access_id));
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_Language.Climate_German_Klima_unit_access_id));
    }

    @Then("I Scroll the page till the last value in AC Mode page")
    public void scrollThePageTillLastValueInACModePage() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll the page till the last value in AC Mode page");
//        List<AndroidElement> list = driver.findElementsByAccessibilityId(Constant_climate_ac.climate_AC_Last_Value_Access_Id);
//        while(list.size()==0){
//            System.out.println(list.size());
//            TouchAction action = new TouchAction(driver);
//            action.press(PointOption.point(530, 1500)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
//                    .moveTo(PointOption.point(530, 1300)).release().perform();
//            Thread.sleep(2000);
//            if(list.get(0).getText().equalsIgnoreCase("Dry")){
//                break;
//            }
//        }
//        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_climate_ac.climate_ACMode_Contains_Value_Xpath));
//        while(elements.size()!=0){
//            System.out.println(elements.size());
//            TouchAction action = new TouchAction(driver);
//            action.press(PointOption.point(530, 1500)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
//                    .moveTo(PointOption.point(530, 1300)).release().perform();
//            Thread.sleep(2000);
//            if(driver.findElement(By.xpath(Constant_climate_ac.climate_ACMode_Contains_Value_Xpath)).getText().contains("Dry")){
//                break;
//            }
//        }
//        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_climate_ac.climate_ACMode_Contains_Value_Xpath));
//        for(AndroidElement eachElements:elements){
//            TouchAction action = new TouchAction(driver);
//            action.press(PointOption.point(530, 1500)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
//                    .moveTo(PointOption.point(530, 1300)).release().perform();
//            Thread.sleep(2000);
//            if(eachElements.getText().contains("Dry")){
//                break;
//            }
//        }
        System.out.println(ClimateScreen.getHighlightedText);
        Basestepdefinition base=new Basestepdefinition();
        Map<String, Integer> stringIntegerMap = base.ListStatus(ClimateScreen.getHighlightedText);
        System.out.println(stringIntegerMap.get("endIndex"));
        System.out.println(stringIntegerMap.get("Size"));
        int loopSize = stringIntegerMap.get("Size") - stringIntegerMap.get("endIndex");
        for(int i=0;i<loopSize;i++){
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(530, 1500)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(530, 1300)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("I Scroll the page till the First value in AC Mode page")
    public void scrollThePageTillTheFirstValueInACModePage() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll the page till the First value in AC Mode page");
        System.out.println(ClimateScreen.getHighlightedText);
        Basestepdefinition base=new Basestepdefinition();
        Map<String, Integer> stringIntegerMap = base.ListStatus(ClimateScreen.getHighlightedText);
        System.out.println(stringIntegerMap.get("startIndex"));
        System.out.println(stringIntegerMap.get("Size"));
        Integer loopSize = stringIntegerMap.get("startIndex");
        for(Integer i=0; i<loopSize; i++){
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(530, 1500)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(530, 1700)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("I Scroll the page till the last value in Fan Speed page")
    public void iScrollThePageTillTheLastValueInFanSpeedPage() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll the page till the last value in Fan Speed page");
        Basestepdefinition base=new Basestepdefinition();
        Map<String, Integer> stringIntegerMap = base.fanSpeedStatus(ClimateScreen.getHighlightedFanSpeed);
        System.out.println(stringIntegerMap.get("endIndex"));
        System.out.println(stringIntegerMap.get("Size"));
        int loopSize = stringIntegerMap.get("Size") - stringIntegerMap.get("endIndex");
        for(int i=0;i<loopSize;i++){
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(530, 1500)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(530, 1300)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("I Scroll the page till the First value in Fan Speed page")
    public void iScrollThePageTillTheFirstValueInFanSpeedPage() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll the page till the First value in Fan Speed page");
        Basestepdefinition base=new Basestepdefinition();
        Map<String, Integer> stringIntegerMap = base.fanSpeedStatus(ClimateScreen.getHighlightedFanSpeed);
        Integer loopSize = stringIntegerMap.get("startIndex");
        for(Integer i=0; i<loopSize; i++){
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(530, 1500)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(530, 1700)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("I verify Apply button is displayed in Heater Climate screen")
    public void iVerifyApplyButtonIsDisplayedInHeaterClimateScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Apply button is displayed in Heater Climate screen");
        List<AndroidElement> elements = driver.findElementsByAccessibilityId(Constant_climate_heater.cHeater_M_apply_button_access_id);
        if (elements.size() != 0) {
            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_climate_heater.cHeater_M_apply_button_access_id));
        }
    }

    @Then("I Scroll the page till the last value in Hot Water Level page")
    public void iScrollThePageTillTheLastValueInHotWaterLevelPage() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll the page till the last value in Hot Water Level page");
        Basestepdefinition base=new Basestepdefinition();
        Map<String, Integer> stringIntegerMap = base.hotWaterLevelStatus(ClimateScreen.getHighlightedhotWaterLevelValue);
        System.out.println(stringIntegerMap.get("endIndex"));
        System.out.println(stringIntegerMap.get("Size"));
        int loopSize = stringIntegerMap.get("Size") - stringIntegerMap.get("endIndex");
        for(int i=0;i<loopSize;i++){
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(530, 1500)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(530, 1300)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("I Scroll the page till the First value in Hot Water Level page")
    public void iScrollThePageTillTheFirstValueInHotWaterLevelPage() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll the page till the First value in Hot Water Level page");
        Basestepdefinition base=new Basestepdefinition();
        Map<String, Integer> stringIntegerMap = base.hotWaterLevelStatus(ClimateScreen.getHighlightedhotWaterLevelValue);
        Integer loopSize = stringIntegerMap.get("startIndex");
        for(Integer i=0; i<loopSize; i++){
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(530, 1500)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(530, 1700)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("I Scroll the page till the last value in Energy page")
    public void iScrollThePageTillTheLastValueInEnergyPage() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll the page till the last value in Energy page");
        Basestepdefinition base=new Basestepdefinition();
        Map<String, Integer> stringIntegerMap = base.energyStatus(ClimateScreen.getHighlightedEnergyValue);
        System.out.println(stringIntegerMap.get("endIndex"));
        System.out.println(stringIntegerMap.get("Size"));
        int loopSize = stringIntegerMap.get("Size") - stringIntegerMap.get("endIndex");
        for(int i=0;i<loopSize;i++){
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(530, 1500)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(530, 1300)).release().perform();
            Thread.sleep(1000);
        }
    }

    @Then("I Scroll the page till the First value in Energy page")
    public void iScrollThePageTillTheFirstValueInEnergyPage() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll the page till the First value in Energy page");
        Basestepdefinition base=new Basestepdefinition();
        Map<String, Integer> stringIntegerMap = base.energyStatus(ClimateScreen.getHighlightedEnergyValue);
        Integer loopSize = stringIntegerMap.get("startIndex");
        for(Integer i=0; i<loopSize; i++){
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(530, 1500)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(530, 1700)).release().perform();
            Thread.sleep(1000);
        }
    }
}

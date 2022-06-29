package com.dometic.L1.stepdefinition;

import com.dometic.L1.qa.Pages.Constant_Language;
import com.dometic.L1.qa.Pages.Constant_climate_heater;
import com.dometic.L1.qa.Pages.Constant_power;
import com.dometic.L1.qa.util.Baseclass;
import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LanguageValidationPowerPage extends Baseclass {
    @Then("I Tap energy tile in landing screen")
    public void iTapEnergyTileInLandingScreen() {
        driver.pressKeyCode(AndroidKeyCode.BACK);
        WebDriverWait wait=new WebDriverWait(driver,50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_climate_heater.CHeater_M_hot_water_level_text_xpath)));
        driver.pressKeyCode(AndroidKeyCode.BACK);
        WebDriverWait wait1=new WebDriverWait(driver,50);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_Language.Power_German_Energie_text_xpath)));
        Taponbutton(Constant_Language.Power_German_Energie_text_xpath);
    }
    @Then("I verify ENERGIE text displayed in the top of the app")
    public void iVerifyENERGIETextDisplayedInTheTopOfTheApp() throws Throwable {
        asserttextAccessibility(Constant_Language.Power_German_Text_expected, Constant_power.Powerpage_power_text_access_id);
    }

    @Then("I verify Energie percentage is displayed in graphical format")
    public void iVerifyEnergiePercentageIsDisplayedInGraphicalFormat() {
        Assert.assertTrue(iselementdisplayed(Constant_power.CAC_M_power_percentage_xpath));
    }

    @Then("I verify Aufbaubatterie text is displayed")
    public void iVerifyAufbaubatterieTextIsDisplayed() throws Throwable {
        asserttextAccessibility(Constant_Language.HouseBattery_German_Text_expected,Constant_power.Powerpage_houseBattery_text_access_id);
    }

    @Then("I verify Spannung text is displayed")
    public void iVerifySpannungTextIsDisplayed() throws Throwable {
        asserttextAccessibility(Constant_Language.BatteryVoltage_spannung_German_Text_expected,Constant_power.Powerpage_batteryVoltageText_access_id);
    }

    @Then("I verify Spannung value is displayed")
    public void iVerifySpannungValueIsDisplayed() {
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_power.Powerpage_batteryVoltageValue_access_id));
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_power.Powerpage_batteryVoltagevoltText_access_id));
    }

    @Then("I verify Strom text is displayed")
    public void iVerifyStromTextIsDisplayed() throws Throwable {
        asserttextAccessibility(Constant_Language.Current_Storm_German_Text_expected,Constant_power.Powerpage_currentText_access_id);
    }

    @Then("I verify Strom value is displayed")
    public void iVerifyStromValueIsDisplayed() {
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_power.Powerpage_currentValue_access_id));
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_power.Powerpage_ampereText_access_id));
    }

    @Then("I verify Zeit text is displayed")
    public void iVerifyZeitTextIsDisplayed() throws Throwable {
        asserttextAccessibility(Constant_Language.Time_German_Text_expected,Constant_power.Powerpage_timeText_access_id);
    }

    @Then("I verify Zeit value is displayed")
    public void iVerifyZeitValueIsDisplayed() {
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_power.Powerpage_timeValue_access_id));
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_power.Powerpage_hourText_access_id));
    }

    @Then("I verify Spannungsversorgung text is displayed")
    public void iVerifySpannungsversorgungTextIsDisplayed() throws Throwable {
        asserttextAccessibility(Constant_Language.PowerSource_German_Text_expected,Constant_power.Powerpage_powerSourceText_access_id);
    }

    @Then("I verify Spannungsversorgung value is displayed")
    public void iVerifySpannungsversorgungValueIsDisplayed() {
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_power.Powerpage_powerSourceValue_access_id));
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_power.Powerpage_powerSourcevoltText_access_id));
    }
    @Then("I verify Energie percentage is displayed in landing screen")
    public void iVerifyEnergiePercentageIsDisplayedInLandingScreen() {
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_Language.Power_German_Energie_mainContent_access_id));
//        Basestepdefinition.verticalSwipe(0.7,0.3,0.5);
    }
}

package com.dometic.L1_BLE.stepdefinition;

import com.dometic.L1.qa.Pages.ConstantViewOption;
import com.dometic.L1.qa.Pages.Constant_OnboardingPage;
import com.dometic.L1.qa.Pages.Constant_landingscreen;
import com.dometic.L1.qa.util.Baseclass;
import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ViewOption extends Baseclass {
    com.dometic.L1.qa.Pages.Constant_login login_obj;
    @Then("I validate View option button in landing screen")
    public void iValidateViewOptionButtonInLandingScreen() {
        WebDriverWait wait=new WebDriverWait(driver,50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ConstantViewOption.view_options_xpath)));
        iselementdisplayed(ConstantViewOption.view_options_xpath);
    }

    @Then("I Tap on View option button in landing screen")
    public void iTapOnViewOptionButtonInLandingScreen() {
        Taponbutton(ConstantViewOption.view_options_xpath);
        WebDriverWait wait=new WebDriverWait(driver,50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ConstantViewOption.viewOptionsCloseIcon_xpath)));
    }

    @Then("I Validate the cancel button")
    public void iValidateTheCancelButton() {
        iselementdisplayedaccessabilityId(ConstantViewOption.viewOptionsCloseIcon_access_id);
    }

    @Then("I Tap on Tile View Options")
    public void iTapOnTileViewOptions() {
        TaponbuttonaccessabilityID(ConstantViewOption.tileView_access_id);
        List<AndroidElement> elements = driver.findElementsByAccessibilityId(ConstantViewOption.tileView_tickIcon_access_id);
        if (elements.size()!=0){
            iselementdisplayedaccessabilityId(ConstantViewOption.tileView_tickIcon_access_id);
        }
        WebDriverWait wait=new WebDriverWait(driver,50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ConstantViewOption.tileView_xpath)));
    }

    @Then("I Tap on All Devices")
    public void iTapOnAllDevices() {
        TaponbuttonaccessabilityID(ConstantViewOption.AllDevices_access_id);
        List<AndroidElement> elements = driver.findElementsByAccessibilityId(ConstantViewOption.AllDevices_access_id);
        if (elements.size()!=0){
            iselementdisplayedaccessabilityId(ConstantViewOption.AllDevices_tickIcon_access_id);
        }
        WebDriverWait wait=new WebDriverWait(driver,50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ConstantViewOption.AllDevices_xpath)));
    }

    @Then("I Tap on Cancel Button")
    public void iTapOnCancelButton() {
        TaponbuttonaccessabilityID(ConstantViewOption.viewOptionsCloseIcon_access_id);
        WebDriverWait wait=new WebDriverWait(driver,50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ConstantViewOption.view_options_xpath)));
    }

    @Then("I Tap on Connected Devices")
    public void iTapOnConnectedDevices() {
        TaponbuttonaccessabilityID(ConstantViewOption.ConnectedDevices_access_id);
        List<AndroidElement> elements = driver.findElementsByAccessibilityId(ConstantViewOption.ConnectedDevices_access_id);
        if (elements.size()!=0){
            iselementdisplayedaccessabilityId(ConstantViewOption.ConnectedDevices_tickIcon_access_id);
        }
        WebDriverWait wait=new WebDriverWait(driver,50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ConstantViewOption.ConnectedDevices_xpath)));
    }

    @Then("I Tap on Non Connected Devices")
    public void iTapOnNonConnectedDevices() {
        TaponbuttonaccessabilityID(ConstantViewOption.NonConnectedDevices_access_id);
        List<AndroidElement> elements = driver.findElementsByAccessibilityId(ConstantViewOption.NonConnectedDevices_access_id);
        if (elements.size()!=0){
            iselementdisplayedaccessabilityId(ConstantViewOption.NonConnectedDevices_tickIcon_access_id);
        }
        WebDriverWait wait=new WebDriverWait(driver,50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ConstantViewOption.NonConnectedDevices_xpath)));
    }

    @Then("I Tap on List View Options")
    public void iTapOnListViewOptions() {
        TaponbuttonaccessabilityID(ConstantViewOption.listView_access_id);
        List<AndroidElement> elements = driver.findElementsByAccessibilityId(ConstantViewOption.listView_access_id);
        if (elements.size()!=0){
            iselementdisplayedaccessabilityId(ConstantViewOption.listView_tickIcon_access_id);
        }
        WebDriverWait wait=new WebDriverWait(driver,50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ConstantViewOption.listView_xpath)));
    }

    @Then("I Tap on Login Button in Login Page")
    public void iTapOnLoginButtonInLoginPage() {
        TaponbuttonaccessabilityID(login_obj.loginbutton);
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_OnboardingPage.Onboarding_allow_access_popup_xpath));
        if(elements.size()!=0){
            WebDriverWait wait=new WebDriverWait(driver,300);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_OnboardingPage.Onboarding_only_this_time_xpath)));
            Taponbutton(Constant_OnboardingPage.Onboarding_only_this_time_xpath);
        }
    }

    @Then("I Entered into Landing Page")
    public void iEnteredIntoLandingPage() {
        List<AndroidElement> elements1 = driver.findElements(By.xpath(Constant_landingscreen.LandingPage_Firmware_popup_xpath));
        if(elements1.size()!=0){
            Taponbutton(Constant_landingscreen.LandingPage_LATER_button_xpath);
        }
        List<AndroidElement> elements3 = driver.findElementsByAccessibilityId(Constant_landingscreen.LandingPage_remainderView_iconClose_access_id);
        if(elements3.size()!=0){
            TaponbuttonaccessabilityID(Constant_landingscreen.LandingPage_remainderView_iconClose_access_id);
        }
        WebDriverWait wait=new WebDriverWait(driver,300);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ConstantViewOption.view_options_xpath)));
    }
}

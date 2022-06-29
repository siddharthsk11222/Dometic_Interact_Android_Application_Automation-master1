package com.dometic.L1.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.L1.qa.Pages.Constant_OnboardingPage;
import com.dometic.L1.qa.Pages.Constant_landingscreen;
import com.dometic.L1.qa.util.Baseclass;
import com.dometic.L1.qa.Pages.Constant_HomePage;
import com.dometic.MTC.qa.Pages.Constant_settings;
import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class OnboardingScreen extends Baseclass {
    @Then("I entered into On boarding screen")
    public void iEnteredIntoOnBoardingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I entered into On boarding screen");
        WebDriverWait wait=new WebDriverWait(driver,300);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_OnboardingPage.Onboarding_popup_xpath)));
//        Assert.assertTrue(iselementdisplayed(Constant_OnboardingPage.Onboarding_popup_xpath));
    }

    @Then("I Tap on cancel button")
    public void iTapOnCancelButton() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on cancel button");
        Taponbutton(Constant_OnboardingPage.Onboarding_CANCEL_Button_xpath);
    }

    @Then("On boarding screen is displayed")
    public void onBoardingScreenIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "On boarding screen is displayed");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_landingscreen.LandingPage_brand_logo_xpath));
        if(elements.size()!=0){
            Assert.assertTrue(iselementdisplayed(Constant_landingscreen.LandingPage_brand_logo_xpath));
        }
    }

    @Then("I Tap on Yes button")
    public void iTapOnYesButton() throws Throwable  {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Yes button");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_OnboardingPage.Onboarding_YES_Button_xpath));
        if(elements.size()!=0){
            WebDriverWait wait=new WebDriverWait(driver,200);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_OnboardingPage.Onboarding_YES_Button_xpath)));
            Taponbutton(Constant_OnboardingPage.Onboarding_YES_Button_xpath);
        }
    }

    @Then("Landing screen is displayed")
    public void landingScreenIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "Landing screen is displayed");
        System.out.println("Navigated to Landing screen successfully");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_OnboardingPage.Onboarding_YES_Button_xpath));
        if(elements.size()!=0){
            Taponbutton(Constant_OnboardingPage.Onboarding_YES_Button_xpath);
        }
//        WebDriverWait wait=new WebDriverWait(driver,300);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_landingscreen.LandingPage_Firmware_popup_xpath)));
    }

    @Then("I Validate the application logo On boarding screen")
    public void iValidateTheApplicationLogoOnBoardingScreen() {
        List<AndroidElement> id = driver.findElementsByAccessibilityId(Constant_OnboardingPage.onboarding_logo_access_id);
        if(id.size()!=0){
            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_OnboardingPage.onboarding_logo_access_id));
//            String text = driver.findElementByAccessibilityId(Constant_OnboardingPage.onboarding_logo_access_id).getText();
//            if(text.equalsIgnoreCase(Constant_OnboardingPage.onboarding_logo_Eriba)){
//                System.out.println("Text comparison is Successful");
//            }
//            else if(text.contains(Constant_OnboardingPage.onboarding_logo_LMC)){
//                System.out.println("Text comparison is Successful");
//            }

        }
        WebDriverWait wait=new WebDriverWait(driver,300);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_landingscreen.LandingPage_Climate_xpath)));
    }
    @Then("I Validate the application logo Landing screen")
    public void iValidateTheApplicationLogoLandingScreen() {
        List<AndroidElement> id = driver.findElementsByAccessibilityId(Constant_landingscreen.LandingPage_mainScreen_BrandLogo_access_id);
        if(id.size()!=0){
            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_landingscreen.LandingPage_mainScreen_BrandLogo_access_id));
//            String text = driver.findElementByAccessibilityId(Constant_landingscreen.LandingPage_mainScreen_BrandLogo_access_id).getText();
//            System.out.println(text);
//            if(text.equalsIgnoreCase(Constant_OnboardingPage.onboarding_logo_Eriba)){
//                System.out.println("Text comparison is Successful");
//            }
//            else if(text.contains(Constant_OnboardingPage.onboarding_logo_LMC)){
//                System.out.println("Text comparison is Successful");
//            }
        }
    }

    @Then("I entered into Home Page.")
    public void iEnteredIntoHomePage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I entered into Home Page");
        WebDriverWait wait = new WebDriverWait(driver, 200);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_HomePage.homePage_Tile_Xpath)));

    }

    @Then("I Tap on Marine Tile.")
    public void iTapOnMarineTile() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Marine Tile");
        List<AndroidElement> elements = driver.findElementsByAccessibilityId(Constant_HomePage.homePage_Tile_Access_Id);
        if (elements.size() != 0) {
            TaponbuttonaccessabilityID(Constant_HomePage.homePage_Tile_Access_Id);
            WebDriverWait wait = new WebDriverWait(driver, 500);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_landingscreen.Landingpage_header_connectionType_xpath)));
        }
    }

    @Then("I Wait until Landing screen is displayed.")
    public void iWaitUntilLandingScreenIsDisplayed() throws ClassNotFoundException {
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_landingscreen.LandingPage_LATER_button_xpath));
        if(elements.size()!=0){
            WebDriverWait wait = new WebDriverWait(driver, 50);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_landingscreen.LandingPage_LATER_button_xpath)));
        }
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Wait until Landing screen is displayed");
        System.out.println("Navigated to Landing screen successfully");
    }

    @Then("I verify if user has navigated to the homescreen.")
    public void iVerifyIfUserHasNavigatedToTheHomescreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if user has navigated to the homescreen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_HomePage.logo_Access_Id));
    }

    @Then("I verify if an empty homescreen is displayed.")
    public void iVerifyIfAnEmptyHomescreenIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if an empty homescreen is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_HomePage.HomeScreen_background_Access_Id));
    }

    @Then("I Tap on hamburger menu in landing screen.")
    public void iTapOnHamburgerMenuInLandingScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on hamburger menu in landing screen");
        TaponbuttonaccessabilityID(Constant_landingscreen.LandingPage_hamburger_menu_access_id);
    }

    @Then("I Tap on Logout in Settings screen.")
    public void iTapOnLogoutInSettingsScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Logout in Settings screen");
        TaponbuttonaccessabilityID(Constant_settings.Settings_Logout_text_access_id);
    }
}

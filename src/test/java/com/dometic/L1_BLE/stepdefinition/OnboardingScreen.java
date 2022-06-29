package com.dometic.L1_BLE.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.L1.qa.Pages.Constant_OnboardingPage;
import com.dometic.L1.qa.Pages.Constant_landingscreen;
import com.dometic.L1.qa.util.Baseclass;
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
        WebDriverWait wait=new WebDriverWait(driver,200);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_OnboardingPage.Onboarding_YES_Button_xpath)));
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_OnboardingPage.Onboarding_YES_Button_xpath));
        if(elements.size()!=0){
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

    @Then("I Tap on FireWire Id")
    public void iTapOnFireWireId() {
        List<AndroidElement> elements = driver.findElements(By.xpath(""));
        for (AndroidElement eachElement: elements) {
            String eachElementText = eachElement.getText();
            if(eachElementText.equalsIgnoreCase("")){
                Taponbutton("");
            }
        }
    }

    @Then("I Tap on Pair Button")
    public void iTapOnPairButton() {
        List<AndroidElement> elements = driver.findElements(By.xpath(""));
        if(elements.size()!=0){
            WebDriverWait wait=new WebDriverWait(driver,300);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
            Taponbutton("");
        }
    }

    @Then("I Tap on LMC Brand")
    public void iTapOnLMCBrand() {
        WebDriverWait wait=new WebDriverWait(driver,300);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
        Taponbutton("");
    }

}

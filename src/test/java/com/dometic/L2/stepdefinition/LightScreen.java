package com.dometic.L2.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.L2.qa.Pages.Constant_Light;
import com.dometic.L2.qa.Pages.Constant_landingscreen;
import com.dometic.L2.qa.util.Baseclass;
import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class LightScreen extends Baseclass {
    public static List<AndroidElement> Lights;
    public static String allLightsOFF;
    public static int lightValue=0;
    @Then("I Verify all the lights in Light screen")
    public void iVerifyAllTheLightsInLightScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify all the lights in Light screen");
        Lights=new ArrayList<>();
        List<AndroidElement> assistHandle = driver.findElements(By.xpath(Constant_Light.LightPage_Assist_Handle_text_xpath));
        List<AndroidElement> utilityCenter = driver.findElements(By.xpath(Constant_Light.LightPage_Utility_Center_text_xpath));
        List<AndroidElement> accentLight = driver.findElements(By.xpath(Constant_Light.LightPage_Accent_Light_text_xpath));
        List<AndroidElement> shower = driver.findElements(By.xpath(Constant_Light.LightPage_Shower_text_xpath));
        List<AndroidElement> ceiling = driver.findElements(By.xpath(Constant_Light.LightPage_Ceiling_text_xpath));
        Basestepdefinition.verticalSwipe(0.9,0.1,0.5);
        List<AndroidElement> bedroomCeiling = driver.findElements(By.xpath(Constant_Light.LightPage_Bedroom_Ceiling_text_xpath));
        List<AndroidElement> galley = driver.findElements(By.xpath(Constant_Light.LightPage_Galley_text_xpath));
        List<AndroidElement> lounge = driver.findElements(By.xpath(Constant_Light.LightPage_Lounge_text_xpath));
        List<AndroidElement> awningLight = driver.findElements(By.xpath(Constant_Light.LightPage_Awning_Light_text_xpath));
        List<AndroidElement> bedroomOverhead = driver.findElements(By.xpath(Constant_Light.LightPage_Bedroom_Overhead_text_xpath));
        List<AndroidElement> porchLight = driver.findElements(By.xpath(Constant_Light.LightPage_Porch_Light_text_xpath));
        /**
         * Globally declared list for Lights**/
        Lights.addAll(assistHandle);Lights.addAll(utilityCenter);Lights.addAll(accentLight);Lights.addAll(shower);Lights.addAll(ceiling);Lights.addAll(bedroomCeiling);
        Lights.addAll(galley);Lights.addAll(lounge);Lights.addAll(awningLight);Lights.addAll(bedroomOverhead);Lights.addAll(porchLight);

        System.out.println(Lights.size());
    }

    @Then("I Tap on All lights ON Button")
    public void iTapOnAllLightsButton() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on All lights ON Button");
        TaponbuttonaccessabilityID(Constant_Light.LightPage_ALL_LIGHTS_ON_text_access_id);
        Thread.sleep(20000);
    }

    @Then("I validate applied lights value is displayed in Landing page")
    public void iValidateAppliedLightsValueIsDisplayedInLandingPage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validate applied lights value is displayed in Landing page");
        String mainContent = driver.findElement(By.xpath(Constant_landingscreen.LandingPage_L2light_mainCardText_xpath)).getText();
        String[] split = mainContent.split("/");
        if(split[0].contains(String.valueOf(Lights.size()))){
            System.out.println("Text comparison is Successful");
        }
        else{
            System.out.println("The values between Light tile and Landing screen is different");
        }
    }

    @Then("I Tap on All lights OFF Button")
    public void iTapOnAllLightsOFFButton() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on All lights OFF Button");
        TaponbuttonaccessabilityID(Constant_Light.LightPage_ALL_LIGHTS_OFF_text_access_id);
        Thread.sleep(20000);
    }

    @Then("I validated applied lights value is displayed in Landing page")
    public void iValidatedAppliedLightsValueIsDisplayedInLandingPage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validated applied lights value is displayed in Landing page");
        allLightsOFF="0";
        String mainContent = driver.findElement(By.xpath(Constant_landingscreen.LandingPage_L2light_mainCardText_xpath)).getText();
        String[] split = mainContent.split("/");
        if(split[0].contains(allLightsOFF)){
            System.out.println("Text comparison is Successful");
        }
        else{
            System.out.println("The values between Light tile and Landing screen is different");
        }
    }

    @Then("I Tap on any lights in light screen")
    public void iTapOnAnyLightsInLightScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on any lights in light screen");
        Taponbutton(Constant_Light.LightPage_Accent_Light_toggle_xpath);
        Thread.sleep(20000);
//        WebDriverWait wait=new WebDriverWait(driver,500);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_Light.LightPage_Accent_Light_Value_xpath)));
        lightValue++;
        System.out.println(lightValue);
        Taponbutton(Constant_Light.LightPage_Bedroom_Ceiling_toggle_xpath);
        Thread.sleep(20000);
        lightValue++;
        System.out.println(lightValue);
    }

    @Then("I validate applied lights value is displayed in Landing Screen")
    public void iValidateAppliedLightsValueIsDisplayedInLandingScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validate applied lights value is displayed in Landing Screen");
        String mainContent = driver.findElement(By.xpath(Constant_landingscreen.LandingPage_L2light_mainCardText_xpath)).getText();
        String[] split = mainContent.split("/");
        if(split[0].contains(String.valueOf(lightValue))){
            System.out.println("Text comparison is Successful");
        }
        else{
            System.out.println("The values between Light tile and Landing screen is different");
        }
    }
}

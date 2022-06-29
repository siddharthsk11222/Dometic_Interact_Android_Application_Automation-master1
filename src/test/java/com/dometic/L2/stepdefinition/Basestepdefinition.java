package com.dometic.L2.stepdefinition;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.L2.qa.Pages.Constant_climate_ac;
import com.dometic.L2.qa.Pages.Constant_login;
import com.dometic.L2.qa.util.Baseclass;
import com.dometic.L2.qa.util.ExtentReport;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

//import io.appium.java_client.android.AndroidDriver;

public class Basestepdefinition extends Baseclass {
    public static Dimension size;
    Constant_login login_obj;
    Hooks Android_driver = new Hooks();
    ExtentReport extentReport;

    ExtentTest test;

    //private static AndroidDriver driver;
//    @Parameters(value = {"PortNumber"})
    @Given("I Launch the application")
    public void iLaunchTheApplicationOn() throws ClassNotFoundException, IOException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Given"), "I Launch the application");
        System.out.println("Launch the application");
        driver = Android_driver.Android();
    }

    //Wait for Page to Load
    @Then("^I Wait for Page to Load$")
    public void I_Wait_for_Page_to_Load() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Wait for Page to Load");
        Thread.sleep(10000);
    }

    //Wait for Short period to load
    @Then("^I Wait short period for Page to Load$")
    public void I_Wait_short_for_Page_to_Load() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Wait short period for Page to Load");
        Thread.sleep(5000);
    }

    //Hide the Device Keypad
    @Then("^I Hide the Device Keypad$")
    public void I_Hide_the_Device_Keypad() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Hide the Device Keypad");
        driver.hideKeyboard();
    }

    @Then("I Tap on Allow button in Permission popup in Login Page")
    public void tap_on_Allow_button() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Allow button in Permission popup in Login Page");
        List<AndroidElement> elements = driver.findElements(By.xpath(login_obj.Login_Allow_popup));
        if(elements.size()!=0){
            Taponbutton(login_obj.Login_Allow_popup);
        }
    }

    // Swipe the screen right to left
    @Then("^I swipe the screen right to left$")
    public void i_swipe_the_right_left_screen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I swipe the screen right to left");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(1200, 700)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(700, 700));
        action.release().perform();
    }

    @Then("I scroll up the screen")
    public void iScrollUpTheScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll up the screen");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(730, 1950)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(730, 1400)).release().perform();
        System.out.println("Scrolling up the Page");
    }

    @Then("I scroll down the screen")
    public void iScrollDownTheScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll down the screen");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(730, 1400)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(730, 1950)).release().perform();
        System.out.println("Scrolling down the Page");
    }

    @Then("I swipe the screen left to right")
    public void iSwipeTheScreenLeftToRight() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I swipe the screen left to right");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(700, 700)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(1200, 700));
        action.release().perform();
    }

    public static void verticalSwipe(Double startPercentage, Double endPercentage, Double anchorPercentage) {
        size = driver.manage().window().getSize();
        Double start = size.getHeight() * startPercentage;
        Double end = size.getHeight() * endPercentage;
        Double anchor = size.getWidth() * anchorPercentage;

        int startPoint = start.intValue();
        int endPoint = end.intValue();
        int anchorPoint = anchor.intValue();

        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(anchorPoint, startPoint)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                .moveTo(PointOption.point(anchorPoint, endPoint));
        action.release().perform();
    }

    public static void herizontalSwipe(Double startPercentage, Double endPercentage, Double anchorPercentage) {
        size = driver.manage().window().getSize();
        Double start = size.getWidth() * startPercentage;
        Double end = size.getWidth() * endPercentage;
        Double anchor = size.getHeight() * anchorPercentage;

        int startPoint = start.intValue();
        int endPoint = end.intValue();
        int anchorPoint = anchor.intValue();

        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(startPoint, anchorPoint)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                .moveTo(PointOption.point(endPoint, anchorPoint));
        action.release().perform();
    }

    public void SwipeTillElement() throws Throwable {
        for (int i = 0; i < 20; i++) {
            iSwipeTheScreenLeftToRight();
            Thread.sleep(1000);
            if (Constant_climate_ac.CAC_M_Minimum_Temperature_access_id.contains("16")) {
                TaponbuttonaccessabilityID(Constant_climate_ac.CAC_M_Minimum_Temperature_access_id);
                Thread.sleep(2000);
                break;
            }
        }
    }

    public void SwipeTillElementRight() throws Throwable {
        for (int i = 0; i < 20; i++) {
            i_swipe_the_right_left_screen();
            if (Constant_climate_ac.CAC_M_Maximum_Temperature_access_id.contains("31")) {
                break;
            }
        }
    }
}




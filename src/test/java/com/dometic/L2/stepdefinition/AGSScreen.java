package com.dometic.L2.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.L2.qa.Pages.Constant_AGS;
import com.dometic.L2.qa.util.Baseclass;
import cucumber.api.java.en.Then;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class AGSScreen extends Baseclass {
    public static List<String> quiteTimeStart,quiteTimeEnds,startVoltage,timeUnder,startTime,runTime;
    @Then("I verify QUITE TIME START title")
    public void iVerifyQUITETIMESTARTTitle() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify QUITE TIME START title");
        asserttextAccessibility(Constant_AGS.AGSPage_Quiet_Time_Start_Title_text,Constant_AGS.AGSPage_quietTimeStart_headingText_access_id);
        /**
         * Globally declared list for QUITE TIME START**/
        quiteTimeStart=new ArrayList<>();
        quiteTimeStart.add(driver.findElement(By.xpath(Constant_AGS.AGSPage_QuietTimeStart_1sthoursCarousel_xpath)).getText());
        quiteTimeStart.add(driver.findElement(By.xpath(Constant_AGS.AGSPage_QuietTimeStart_2ndthoursCarousel_xpath)).getText());
        quiteTimeStart.add(driver.findElement(By.xpath(Constant_AGS.AGSPage_QuietTimeStart_3rdhoursCarousel_xpath)).getText());
        quiteTimeStart.add(driver.findElement(By.xpath(Constant_AGS.AGSPage_QuietTimeStart_1stminsCarousel_xpath)).getText());
        quiteTimeStart.add(driver.findElement(By.xpath(Constant_AGS.AGSPage_QuietTimeStart_2ndminsCarousel_xpath)).getText());
        quiteTimeStart.add(driver.findElement(By.xpath(Constant_AGS.AGSPage_QuietTimeStart_3rdminsCarousel_xpath)).getText());
    }

    @Then("I Tap on AM in Quiet Time Start screen")
    public void iTapOnAMInQuietTimeStartScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on AM in Quiet Time Start screen");
        TaponbuttonaccessabilityID(Constant_AGS.AGSPage_quietTimeStart_leftText_access_id);
    }

    @Then("I validate updated Quiet Time Start time is applied in AGS Screen")
    public void iValidateUpdatedQuietTimeStartTimeIsAppliedInAGSScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validate updated Quiet Time Start time is applied in AGS Screen");
        String quiteTimeStartValue = driver.findElementByAccessibilityId(Constant_AGS.AGSPage_Quiet_Time_Start_cardSubText_access_id).getText();
        for (String eachQuiteTimeStart: quiteTimeStart) {
            if(quiteTimeStartValue.contains(eachQuiteTimeStart)){
                System.out.println("Text comparison is Successful");
            }
        }
    }

    @Then("I Tap on PM in Quiet Time Start screen")
    public void iTapOnPMInQuietTimeStartScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on PM in Quiet Time Start screen");
        TaponbuttonaccessabilityID(Constant_AGS.AGSPage_quietTimeStart_rightButton_access_id);
    }

    @Then("I verify QUITE TIME ENDS title")
    public void iVerifyQUITETIMEENDSTitle() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify QUITE TIME ENDS title");
        asserttextAccessibility(Constant_AGS.AGSPage_quietTimeEnd_Title_text,Constant_AGS.AGSPage_quietTimeEnd_headingText_access_id);
        /**
         * Globally declared list for QUITE TIME ENDS**/
        quiteTimeEnds=new ArrayList<>();
        quiteTimeEnds.add(driver.findElement(By.xpath(Constant_AGS.AGSPage_QuietTimeEnds_1sthoursCarousel_xpath)).getText());
        quiteTimeEnds.add(driver.findElement(By.xpath(Constant_AGS.AGSPage_QuietTimeEnds_2ndthoursCarousel_xpath)).getText());
        quiteTimeEnds.add(driver.findElement(By.xpath(Constant_AGS.AGSPage_QuietTimeEnds_3rdhoursCarousel_xpath)).getText());
        quiteTimeEnds.add(driver.findElement(By.xpath(Constant_AGS.AGSPage_QuietTimeEnds_1stminsCarousel_xpath)).getText());
        quiteTimeEnds.add(driver.findElement(By.xpath(Constant_AGS.AGSPage_QuietTimeEnds_2ndminsCarousel_xpath)).getText());
        quiteTimeEnds.add(driver.findElement(By.xpath(Constant_AGS.AGSPage_QuietTimeEnds_3rdminsCarousel_xpath)).getText());
    }

    @Then("I Tap on AM in Quiet Time Ends screen")
    public void iTapOnAMInQuietTimeEndsScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on AM in Quiet Time Ends screen");
        TaponbuttonaccessabilityID(Constant_AGS.AGSPage_quietTimeEnds_leftText_access_id);
    }

    @Then("I Tap on Quiet Time Ends")
    public void iTapOnQuietTimeEnds() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Quiet Time Ends");
        TaponbuttonaccessabilityID(Constant_AGS.AGSPage_Quiet_Time_Ends_text_access_id);
    }

    @Then("I validate updated Quiet Time Ends time is applied in AGS Screen")
    public void iValidateUpdatedQuietTimeEndsTimeIsAppliedInAGSScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validate updated Quiet Time Ends time is applied in AGS Screen");
        String quiteTimeEndsValue = driver.findElementByAccessibilityId(Constant_AGS.AGSPage_Quiet_Time_Ends_cardSubText_access_id).getText();
        for (String eachQuiteTimeEnds: quiteTimeEnds) {
            if(quiteTimeEndsValue.contains(eachQuiteTimeEnds)){
//                System.out.println(eachQuiteTimeEnds);
                System.out.println("Text comparison is Successful");
            }
        }
    }

    @Then("I Tap on PM in Quiet Time Ends screen")
    public void iTapOnPMInQuietTimeEndsScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on PM in Quiet Time Ends screen");
        TaponbuttonaccessabilityID(Constant_AGS.AGSPage_quietTimeEnds_rightButton_access_id);
    }

    @Then("I Tap on apply button in Quiet Time Ends")
    public void iTapOnApplyButtonInQuietTimeEnds() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on apply button in Quiet Time Ends");
        TaponbuttonaccessabilityID(Constant_AGS.AGSPage_quietTimeEnd_applyButton_access_id);
    }

    @Then("I Scroll up the hours in Quiet Time Ends")
    public void iScrollUpTheHoursInQuietTimeEnds() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll up the hours in Quiet Time Ends");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(300, 1250)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(300, 1000));
        action.release().perform();
    }

    @Then("I Scroll up the minutes in Quiet Time Ends")
    public void iScrollUpTheMinutesInQuietTimeEnds() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll up the minutes in Quiet Time Ends");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(700, 1250)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(700, 1000));
        action.release().perform();
    }

    @Then("I Tap on Start Voltage")
    public void iTapOnStartVoltage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Start Voltage");
        TaponbuttonaccessabilityID(Constant_AGS.AGSPage_Start_Voltage_text_access_id);
    }

    @Then("I verify START VOLTAGE title")
    public void iVerifySTARTVOLTAGETitle() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify START VOLTAGE title");
        asserttextAccessibility(Constant_AGS.AGSPage_startVoltage_Title_text,Constant_AGS.AGSPage_startVoltage_headingText_access_id);
        /**
         * Globally declared list for START VOLTAGE**/
        startVoltage=new ArrayList<>();
        startVoltage.add(driver.findElement(By.xpath(Constant_AGS.AGSPage_startVoltage_1stCarousel_xpath)).getText());
        startVoltage.add(driver.findElement(By.xpath(Constant_AGS.AGSPage_startVoltage_2ndCarousel_xpath)).getText());
        startVoltage.add(driver.findElement(By.xpath(Constant_AGS.AGSPage_startVoltage_3rdCarousel_xpath)).getText());
        startVoltage.add(driver.findElement(By.xpath(Constant_AGS.AGSPage_startVoltage_voltage_xpath)).getText());
    }

    @Then("I Scroll up the Start Voltage")
    public void iScrollUpTheHoursInStartVoltage() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll up the Start Voltage");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(550, 1100)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(550, 900));
        action.release().perform();
    }

    @Then("I Tap on apply button in Start Voltage")
    public void iTapOnApplyButtonInStartVoltage() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on apply button in Start Voltage");
        TaponbuttonaccessabilityID(Constant_AGS.AGSPage_startVoltage_applyButton_access_id);
    }

    @Then("I validate updated Start Voltage is applied in AGS Screen")
    public void iValidateUpdatedStartVoltageIsAppliedInAGSScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validate updated Start Voltage is applied in AGS Screen");
        String startVoltageValue = driver.findElementByAccessibilityId(Constant_AGS.AGSPage_Start_Voltage_text_access_id).getText();
        loop:
        for (String eachStartVoltageValue: startVoltage) {
//            System.out.println(eachStartVoltageValue);
            if(startVoltageValue.contains(eachStartVoltageValue)){
                System.out.println("Text comparison is Successful");
            }
            else{
                System.out.println("The value is differ... ");
                break loop;
            }
        }
    }

    @Then("I Tap on Time Under")
    public void iTapOnTimeUnder() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Time Under");
        TaponbuttonaccessabilityID(Constant_AGS.AGSPage_Time_Under_text_access_id);
    }

    @Then("I verify TIME UNDER title")
    public void iVerifyTIMEUNDERTitle() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify TIME UNDER title");
        asserttextValidationAccessibility(Constant_AGS.AGSPage_timeUnder_Title_text,Constant_AGS.AGSPage_timeUnder_headingText_access_id);
        /**
         * Globally declared list for TIME UNDER**/
        timeUnder=new ArrayList<>();
        timeUnder.add(driver.findElement(By.xpath(Constant_AGS.AGSPage_timeUnder_1stCarousel_xpath)).getText());
        timeUnder.add(driver.findElement(By.xpath(Constant_AGS.AGSPage_timeUnder_2ndCarousel_xpath)).getText());
        timeUnder.add(driver.findElement(By.xpath(Constant_AGS.AGSPage_timeUnder_3rdCarousel_xpath)).getText());
        timeUnder.add(driver.findElement(By.xpath(Constant_AGS.AGSPage_timeUnder_voltage_xpath)).getText());
//        System.out.println(timeUnder);
    }

    @Then("I Scroll up the Time Under")
    public void iScrollUpTheTimeUnder() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll up the Time Under");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(550, 1100)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(550, 900));
        action.release().perform();
    }

    @Then("I validate updated Time Under value is applied in AGS Screen")
    public void iValidateUpdatedTimeUnderValueIsAppliedInAGSScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validate updated Time Under value is applied in AGS Screen");
        String timeUnderValue = driver.findElementByAccessibilityId(Constant_AGS.AGSPage_Time_Under_text_access_id).getText();
        loop:
        for (String eachTimeUnder: timeUnder) {
            if(eachTimeUnder.contains(timeUnderValue)){
                System.out.println("Text comparison is Successful");
            }
            else{
                System.out.println("The value is differ... ");
                break loop;
            }
        }
    }

    @Then("I Scroll up the screen in AGS")
    public void iScrollUpTheScreenInAGS() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll up the screen in AGS");
        Basestepdefinition.verticalSwipe(0.7,0.2,0.5);
    }

    @Then("I Tap on Start Time")
    public void iTapOnStartTime() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Start Time");
        TaponbuttonaccessabilityID(Constant_AGS.AGSPage_Start_Time_text_access_id);
    }

    @Then("I verify START TIME title")
    public void iVerifySTARTTIMETitle() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify START TIME title");
        asserttextAccessibility(Constant_AGS.AGSPage_startTime_Title_text,Constant_AGS.AGSPage_startTime_headingText_access_id);
        /**
         * Globally declared list for START TIME**/
        startTime=new ArrayList<>();
        startTime.add(driver.findElement(By.xpath(Constant_AGS.AGSPage_startTime_1sthoursCarousel_xpath)).getText());
        startTime.add(driver.findElement(By.xpath(Constant_AGS.AGSPage_startTime_2ndthoursCarousel_xpath)).getText());
        startTime.add(driver.findElement(By.xpath(Constant_AGS.AGSPage_startTime_3rdhoursCarousel_xpath)).getText());
        startTime.add(driver.findElement(By.xpath(Constant_AGS.AGSPage_startTime_1stminsCarousel_xpath)).getText());
        startTime.add(driver.findElement(By.xpath(Constant_AGS.AGSPage_startTime_2ndminsCarousel_xpath)).getText());
        startTime.add(driver.findElement(By.xpath(Constant_AGS.AGSPage_startTime_3rdminsCarousel_xpath)).getText());
//        System.out.println(startTime);
    }

    @Then("I Tap on AM in Start Time screen")
    public void iTapOnAMInStartTimeScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on AM in Start Time screen");
        TaponbuttonaccessabilityID(Constant_AGS.AGSPage_startTime_leftButton_access_id);
    }

    @Then("I Scroll up the hours in Start Time")
    public void iScrollUpTheHoursInStartTime() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll up the hours in Start Time");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(300, 1250)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(300, 1000));
        action.release().perform();
    }

    @Then("I Scroll up the minutes in Start Time")
    public void iScrollUpTheMinutesInStartTime() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll up the minutes in Start Time");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(700, 1250)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(700, 1000));
        action.release().perform();
    }

    @Then("I Tap on apply button in Start Time")
    public void iTapOnApplyButtonInStartTime() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on apply button in Start Time");
        TaponbuttonaccessabilityID(Constant_AGS.AGSPage_startTime_applyButton_access_id);
    }

    @Then("I validate updated Start Time value is applied in AGS Screen")
    public void iValidateUpdatedStartTimeValueIsAppliedInAGSScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validate updated Start Time value is applied in AGS Screen");
        String startTimeValue = driver.findElementByAccessibilityId(Constant_AGS.AGSPage_Start_Time_cardSubText_access_id).getText();
//        System.out.println(startTimeValue);
        for (String eachStartTime: startTime) {
            if(startTimeValue.contains(eachStartTime)){
                System.out.println(eachStartTime);
                System.out.println("Text comparison is Successful");
            }
        }
    }

    @Then("I Tap on PM in Start Time screen")
    public void iTapOnPMInStartTimeScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on PM in Start Time screen");
        TaponbuttonaccessabilityID(Constant_AGS.AGSPage_startTime_rightButton_access_id);
    }

    @Then("I Tap on apply button in Time Under")
    public void iTapOnApplyButtonInTimeUnder() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on apply button in Time Under");
        TaponbuttonaccessabilityID(Constant_AGS.AGSPage_timeUnder_applyButton_access_id);
    }

    @Then("I Tap on Run Time")
    public void iTapOnRunTime() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Run Time");
        TaponbuttonaccessabilityID(Constant_AGS.AGSPage_Run_Time_text_access_id);
    }

    @Then("I verify RUN TIME title")
    public void iVerifyRUNTIMETitle() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify RUN TIME title");
        asserttextAccessibility(Constant_AGS.AGSPage_runTime_Title_text,Constant_AGS.AGSPage_startVoltage_headingText_access_id);
        /**
         * Globally declared list for RUN TIME**/
        runTime=new ArrayList<>();
        runTime.add(driver.findElement(By.xpath(Constant_AGS.AGSPage_runTime_1stCarousel_xpath)).getText());
        runTime.add(driver.findElement(By.xpath(Constant_AGS.AGSPage_runTime_2ndCarousel_xpath)).getText());
        runTime.add(driver.findElement(By.xpath(Constant_AGS.AGSPage_runTime_3rdCarousel_xpath)).getText());
        runTime.add(driver.findElement(By.xpath(Constant_AGS.AGSPage_runTime_voltage_xpath)).getText());
//        System.out.println(runTime);
    }

    @Then("I Scroll up the Run Time")
    public void iScrollUpTheRunTime() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll up the Run Time");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(550, 1100)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(550, 900));
        action.release().perform();
    }

    @Then("I Tap on apply button in Run Time")
    public void iTapOnApplyButtonInRunTime() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on apply button in Run Time");
        TaponbuttonaccessabilityID(Constant_AGS.AGSPage_runTime_applyButton_access_id);
    }

    @Then("I validate updated Run Time value is applied in AGS Screen")
    public void iValidateUpdatedRunTimeValueIsAppliedInAGSScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validate updated Run Time value is applied in AGS Screen");
        String runTimeValue = driver.findElementByAccessibilityId(Constant_AGS.AGSPage_Start_Time_cardSubText_access_id).getText();
//        System.out.println(startTimeValue);
        loop:
        for (String eachRunTime: runTime) {
            if(runTimeValue.contains(eachRunTime)){
                System.out.println("Text comparison is Successful");
            }
            else{
                System.out.println("The value is differ... ");
                break loop;
            }
        }
    }

    @Then("I Tap on the Auto Charger toggle whether toggle in OFF state")
    public void iTapOnTheAutoChargerToggleWhetherToggleInOFFState() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on the Auto Charger toggle whether toggle in OFF state");
        if(driver.findElementByAccessibilityId(Constant_AGS.AGSPage_Auto_Charger_switchText_access_id).getText().equalsIgnoreCase("OFF")){
            Thread.sleep(2000);
            TaponbuttonaccessabilityID(Constant_AGS.AGSPage_Auto_Charger_switchText_access_id);
            Thread.sleep(2000);
        }
        if(driver.findElements(By.xpath(Constant_AGS.AGSPage_OK_Button_xpath)).size()!=0){
            Taponbutton(Constant_AGS.AGSPage_OK_Button_xpath);
            Thread.sleep(10000);
        }
    }

    @Then("I Tap on the Generator Exerciser toggle whether toggle in OFF state")
    public void iTapOnTheGeneratorExerciserToggleWhetherToggleInOFFState() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on the Generator Exerciser toggle whether toggle in OFF state");
        if(driver.findElementByAccessibilityId(Constant_AGS.AGSPage_Generator_Exerciser_switchText_access_id).getText().equalsIgnoreCase("OFF")){
            Thread.sleep(2000);
            TaponbuttonaccessabilityID(Constant_AGS.AGSPage_Generator_Exerciser_switchComponent_access_id);
            Thread.sleep(2000);
        }
        if(driver.findElements(By.xpath(Constant_AGS.AGSPage_OK_Button_xpath)).size()!=0){
            Taponbutton(Constant_AGS.AGSPage_OK_Button_xpath);
            Thread.sleep(10000);
        }
    }

    @Then("I verify the Auto charger ON or OFF")
    public void iVerifyTheAutoChargerONOrOFF() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Auto charger ON or OFF");
        List<AndroidElement> autoChargerState = driver.findElementsByAccessibilityId(Constant_AGS.AGSPage_Auto_Charger_switchText_access_id);
        for(AndroidElement eachAutoChargerState:autoChargerState){
            if(eachAutoChargerState.getText().contains(Constant_AGS.AGSPage_ON_State_text)){
                System.out.println("Text comparison is Successful");
            }
            else if(eachAutoChargerState.getText().contains(Constant_AGS.AGSPage_OFF_State_text)){
                System.out.println("Text comparison is Successful");
            }
        }
    }

    @Then("I verify the Generator Exerciser ON or OFF")
    public void iVerifyTheGeneratorExerciserONOrOFF() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Generator Exerciser ON or OFF");
        List<AndroidElement> generatorExerciserState = driver.findElementsByAccessibilityId(Constant_AGS.AGSPage_Generator_Exerciser_switchText_access_id);
        for(AndroidElement eachGeneratorExerciserState:generatorExerciserState){
            if(eachGeneratorExerciserState.getText().contains(Constant_AGS.AGSPage_ON_State_text)){
                System.out.println("Text comparison is Successful");
            }
            else if(eachGeneratorExerciserState.getText().contains(Constant_AGS.AGSPage_OFF_State_text)){
                System.out.println("Text comparison is Successful");
            }
        }
    }

}

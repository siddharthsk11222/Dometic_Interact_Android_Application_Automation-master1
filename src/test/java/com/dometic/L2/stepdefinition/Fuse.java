package com.dometic.L2.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.L2.qa.Pages.Constant_Fuses;
import com.dometic.L2.qa.Pages.Constant_landingscreen;
import com.dometic.L2.qa.util.Baseclass;
import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.List;

public class Fuse extends Baseclass {
    public static String text,AllisOK,splitValue;
    @Then("I validate Maximum Fuses is turn ON State")
    public void iValidateMaximumFusesIsTurnONState() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validate Maximum Fuses is turn ON State");
        List<AndroidElement> list = driver.findElements(By.xpath(Constant_Fuses.Fusescreen_BlownOut_xpath));
        if(list.size()!=0){
            asserttext(Constant_Fuses.Fusescreen_BlownOut,Constant_Fuses.Fusescreen_BlownOut_xpath);
            Taponbutton(Constant_landingscreen.LandingPage_L2Fuses_text_xpath);
            Thread.sleep(2000);
            text = driver.findElementByAccessibilityId(Constant_Fuses.Fusescreen_All_fuses_are_OK_access_id).getText();
            String[] split = text.split(" ");
            int i1 = Integer.parseInt(split[0]);
            System.out.println(i1);
            for (int i=0;i<i1;i++){
                System.out.println("i value"+i);
                Taponbutton(Constant_Fuses.Fusescreen_BlownOut_First_xpath);
                Thread.sleep(10000);
            }
            driver.pressKeyCode(AndroidKeyCode.BACK);
        }
    }

    @Then("I validate All Fuse is OK text is displayed in Landing page")
    public void iValidateAllFuseIsOKTextIsDisplayedInLandingPage() throws MalformedURLException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validate All Fuse is OK text is displayed in Landing page");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Fuses.Fusescreen_Fuse_All_OK_xpath));
        if(elements.size()!=0){
            String allIsOk = driver.findElement(By.xpath(Constant_Fuses.Fusescreen_Fuse_All_OK_xpath)).getText();
            if(allIsOk.contains(Constant_Fuses.Fusescreen_Fuse_All_OK)){
                System.out.println("Text comparison is Successful");
            }
        }
    }

    @Then("I validate Maximum Fuses is turn OFF State")
    public void iValidateMaximumFusesIsTurnOFFState() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validate Maximum Fuses is turn OFF State");
        String text = driver.findElement(By.xpath(Constant_Fuses.Fusescreen_Fuse_title_main_content_xpath)).getText();
        String[] split = text.split("/");
        for (String each: split) {
            System.out.println(each);
        }

        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Fuses.Fusescreen_Fuse_All_OK_xpath));
        if (elements.size()!=0) {
            asserttext(Constant_Fuses.Fusescreen_Fuse_All_OK,Constant_Fuses.Fusescreen_Fuse_All_OK_xpath);
            Taponbutton(Constant_landingscreen.LandingPage_L2Fuses_text_xpath);
            Thread.sleep(2000);
            Basestepdefinition.verticalSwipe(0.7,0.3,0.5);
            int i1 = Integer.parseInt(split[1]);
            for (int i=0;i<i1;i++){
                System.out.println("i value"+i);
                Taponbutton(Constant_Fuses.Fusescreen_last_toggle_xpath);
                Thread.sleep(10000);
            }
            driver.pressKeyCode(AndroidKeyCode.BACK);
        }
    }

    @Then("I validate BlownOut text is displayed in Landing page")
    public void iValidateBlownOutTextIsDisplayedInLandingPage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validate BlownOut text is displayed in Landing page");
        String allIsOk = driver.findElement(By.xpath(Constant_Fuses.Fusescreen_BlownOut_xpath)).getText();
        if(allIsOk.contains(Constant_Fuses.Fusescreen_BlownOut)){
            System.out.println("Text comparison is Successful");
        }
    }

    @Then("I Tap on any of the fuse in Fuse Screen")
    public void iTapOnAnyOfTheFuseInFuseScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on any of the fuse in Fuse Screen");
        List<AndroidElement> list = driver.findElements(By.xpath(Constant_Fuses.Fusescreen_BlownOut_xpath));
        if(list.size()!=0){
            Taponbutton(Constant_landingscreen.LandingPage_L2Fuses_text_xpath);
            Thread.sleep(2000);
            AllisOK = driver.findElementByAccessibilityId(Constant_Fuses.Fusescreen_All_fuses_are_OK_access_id).getText();
            System.out.println(AllisOK);
            Taponbutton(Constant_Fuses.Fusescreen_BlownOut_Third_xpath);
            Thread.sleep(10000);
            Taponbutton(Constant_Fuses.Fusescreen_BlownOut_Fifth_xpath);
            Thread.sleep(10000);

        }
    }

    @Then("I validate applied fuse value is displayed in Landing page")
    public void iValidateAppliedFuseValueIsDisplayedInLandingPage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validate applied fuse value is displayed in Landing page");
        List<AndroidElement> list = driver.findElements(By.xpath(Constant_Fuses.Fusescreen_BlownOut_xpath));
        if(list.size()!=0) {
//            System.out.println(AllisOK);
            String[] split = AllisOK.split(" ");
            String splitValue = split[0];
            String text = driver.findElement(By.xpath(Constant_Fuses.Fusescreen_Fuse_title_main_content_xpath)).getText();
            if (text.contains(splitValue)){
                System.out.println("Text comparison is Successful");
            }
        }
    }
}

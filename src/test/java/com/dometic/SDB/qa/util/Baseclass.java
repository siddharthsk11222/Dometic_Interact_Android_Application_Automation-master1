package com.dometic.SDB.qa.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Baseclass {
    public static ExtentReports extent;
    public static ExtentTest extentTest;
    public static ExtentTest test;
    public static ExtentTest ScenarioDef;
    public static ExtentTest features;
    public static String ReportLocation = System.getProperty("user.dir") + "/target/cucumber-reports/advanced-reports/Extentreport_SDB/";
    public static AndroidDriver<AndroidElement> driver;
    public void Taponbutton(String arg1) {
        try {
            driver.findElement(By.xpath(arg1)).click();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException thrown!");
        }
    }
    public void TaponbuttonaccessabilityID(String arg1) {
        try {
            System.out.println(arg1);
            driver.findElementByAccessibilityId(arg1).click();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException thrown!");
        }
    }
    public boolean iselementdisplayed(String arg1) {
        try {
            //System.out.println(arg1);
            driver.findElement(By.xpath(arg1)).isDisplayed();
            return true;
        } catch (NullPointerException e) {
            System.out.println("NullPointerException thrown!");
        }
        return false;
    }
    public boolean iselementdisplayedaccessabilityId(String arg1) {
        try {
            driver.findElementByAccessibilityId(arg1).isDisplayed();
            return true;
        } catch (NullPointerException e) {
            System.out.println("NullPointerException thrown!");
        }
        return false;
    }
    public void entertext(String arg1, String arg2)
    {
        try {
            WebDriverWait wait = new WebDriverWait(driver,30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(arg2)));
            driver.findElement(By.xpath(arg2)).sendKeys(arg1);
        }
        catch(NullPointerException e) {
            System.out.println("NullPointerException thrown!");
        }
    }
    public void entertextaccessabilityId(String arg1, String arg2)
    {
        try {
            driver.findElementByAccessibilityId(arg2).sendKeys(arg1);
        }
        catch(NullPointerException e) {
            System.out.println("NullPointerException thrown!");
        }
    }
    public void cleartext(String arg1)
    {
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(arg1)));
        //TouchAction action = new TouchAction(driver);
        driver.findElement(By.xpath(arg1)).clear();
    }
    public void cleartextaccessabilityId(String arg1) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElementByAccessibilityId(arg1).clear();
    }
    public void asserttextAccessibility(String arg1, String arg2) throws Throwable {
        String actualString = driver.findElementByAccessibilityId(arg2).getText();
        Assert.assertTrue(actualString.contains(arg1));
        System.out.println("Text comparison is Successful");
    }
    public void asserttext(String arg1, String arg2) throws Throwable {
        String actualString = driver.findElement(By.xpath(arg2)).getText();
        Assert.assertTrue(actualString.contains(arg1));
        System.out.println("Text comparison is Successful");
    }
    public void asserttextValidationAccessibility(String arg1, String arg2) throws Throwable {
        String actualString = driver.findElementByAccessibilityId(arg2).getText();
        if(actualString.equalsIgnoreCase(arg1)){
            Assert.assertTrue(actualString.contains(arg1));
            System.out.println("Text comparison is Successful");
        }
        else{
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }
    public void asserttextValidation(String arg1, String arg2) throws Throwable {
        String actualString = driver.findElement(By.xpath(arg2)).getText();
        if (actualString.equalsIgnoreCase(arg1)) {
            Assert.assertTrue(actualString.contains(arg1));
            System.out.println("Text comparison is Successful");
        } else {
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }
}

package com.dometic.L2.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.L2.qa.Pages.Constant_Mechanical;
import com.dometic.L2.qa.util.Baseclass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MechanicalAwning extends Baseclass {
    @Then("I verify Controller text in Mechanical screen")
    public void iVerifyControllerTextInMechanicalScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Controller text in Mechanical screen");
        WebDriverWait wait=new WebDriverWait(driver,300);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_Mechanical.Mechanicalscreen_Controller_text_xpath)));
        asserttext(Constant_Mechanical.Mechanicalscreen_Controller_text,Constant_Mechanical.Mechanicalscreen_Controller_text_xpath);
        System.out.println("Controller text in Mechanical screen is verified");
    }

    @Then("I verify Open button in Mechanical screen")
    public void iVerifyOpenButtonInMechanicalScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Open button in Mechanical screen");
        Assert.assertTrue(iselementdisplayed(Constant_Mechanical.Mechanicalscreen_Open_button_xpath));
        System.out.println("Open button in Mechanical screen is verified");
    }

    @And("I verify Open button text in Mechanical screen")
    public void iVerifyOpenButtonTextInMechanicalScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Open button text in Mechanical screen");
//        System.out.println(Constant_Mechanical.Mechanicalscreen_Open_button_text);
//        System.out.println(driver.findElement(By.xpath(Constant_Mechanical.Mechanicalscreen_Open_button_xpath)).getText());
        asserttext(Constant_Mechanical.Mechanicalscreen_Open_button_text,Constant_Mechanical.Mechanicalscreen_Open_button_xpath);
        System.out.println("Open button text is verified");
    }

    @Then("I verify Close button in Mechanical screen")
    public void iVerifyCloseButtonInMechanicalScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Close button in Mechanical screen");
        Assert.assertTrue(iselementdisplayed(Constant_Mechanical.Mechanicalscreen_Close_button_xpath));
        System.out.println("Close button in Mechanical screen is verified");
    }

    @And("I verify Close button text in Mechanical screen")
    public void iVerifyCloseButtonTextInMechanicalScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Close button text in Mechanical screen");
        asserttextValidation(Constant_Mechanical.Mechanicalscreen_Close_button_text,Constant_Mechanical.Mechanicalscreen_Close_button_xpath);
        System.out.println("Close button text is verified");
    }

    @Then("I verify Mechanical Header text")
    public void iVerifyMechanicalHeaderText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Mechanical Header text");
        asserttextValidation(Constant_Mechanical.Mechanical_Text,Constant_Mechanical.Mechanicalscreen_Mechanical_text_xpath);
        System.out.println("Mechanical Header text is verified");
    }

    @Then("I verify Awning text")
    public void iVerifyAwningText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Awning text");
        asserttextValidationAccessibility(Constant_Mechanical.Mechanical_Awning_Text,Constant_Mechanical.Mechanicalscreen_Awning_text_access_id);
        System.out.println("Awning text is verified");
    }
}

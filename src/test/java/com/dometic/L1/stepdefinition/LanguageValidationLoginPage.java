package com.dometic.L1.stepdefinition;

import com.dometic.L1.qa.Pages.Constant_Language;
import com.dometic.L1.qa.Pages.Constant_OnboardingPage;
import com.dometic.L1.qa.Pages.Constant_login;
import com.dometic.L1.qa.util.Baseclass;
import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class LanguageValidationLoginPage extends Baseclass {
    com.dometic.L1.qa.Pages.Constant_login login_obj;
    @Then("I verify Wilkommen zurück! text is displayed in login page")
    public void iVerifyWilkommenZurückTextIsDisplayedInLoginPage() throws Throwable {
        WebDriverWait wait=new WebDriverWait(driver,50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_login.Login_welcome_text_xpath)));
        asserttextAccessibility(Constant_Language.Login_welcome_German_text_expected, Constant_login.Login_welcome_text_access_id);
    }

    @Then("I verify EinLoggen text is displayed in login page")
    public void iVerifyEinLoggenTextIsDisplayedInLoginPage() throws Throwable {
        asserttextAccessibility(Constant_Language.Login_login_Germantext_expected, Constant_login.Login_login_text_access_id);
    }

    @Then("I verify Email text is displayed in login page")
    public void iVerifyEmailTextIsDisplayedInLoginPage() throws Throwable {
        asserttextAccessibility(Constant_Language.Login_email_German_text_expected, Constant_login.Login_email_text_access_id);
    }

    @Then("I verify Passwort text is displayed in login page")
    public void iVerifyPasswortTextIsDisplayedInLoginPage() throws Throwable {
        asserttextAccessibility(Constant_Language.Login_password_German_text_expected, Constant_login.Login_password_text_access_id);
    }

    @Then("I verify Haben Sie ihr Passwort vergessen? text is displayed in login page")
    public void iVerifyHabenSieIhrPasswortVergessenTextIsDisplayedInLoginPage() throws Throwable {
        asserttextAccessibility(Constant_Language.Login_forget_password_German_text_expected, Constant_login.Login_forgot_password_link_access_id);
    }

    @Then("I verify Haben Sie noch keinen Account? text is displayed in login page")
    public void iVerifyHabenSieNochKeinenAccountTextIsDisplayedInLoginPage() throws Throwable {
        asserttextAccessibility(Constant_Language.Login_Dont_have_an_account_German_text_expected, Constant_login.Login_Dont_have_an_account_access_id);
    }

    @Then("I verify Registrieren text is displayed in login page")
    public void iVerifyRegistrierenTextIsDisplayedInLoginPage() throws Throwable {
        asserttextAccessibility(Constant_Language.Login_Sign_Up_German_text_expected, Constant_login.Login_signup_link_access_id);
    }

    @Then("I verify EinLoggen button is displayed  in login page")
    public void iVerifyEinLoggenButtonIsDisplayedInLoginPage() throws Throwable {
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_login.Login_login_button_access_id));
    }
    @Then("The Email field is required german Error message is displayed in login page")
    public void theEmailFieldIsRequiredGermanErrorMessageIsDisplayedInLoginPage() throws Throwable {
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(login_obj.Login_invalidEmail_message_access_id);
        if(elementsByAccessibilityId.size()!=0){
            asserttextAccessibility(Constant_Language.Login_invalidEmail_German_message_expected,login_obj.Login_invalidEmail_message_access_id);
        }
    }

    @Then("The Password field is required german Error message is displayed in login page")
    public void thePasswordFieldIsRequiredGermanErrorMessageIsDisplayedInLoginPage() throws Throwable {
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(login_obj.Login_invalidsecurePwd_message_access_id);
        if(elementsByAccessibilityId.size()!=0){
            asserttextAccessibility(Constant_Language.Login_invalidsecurePwd_German_message_expected,login_obj.Login_invalidsecurePwd_message_access_id);
        }
    }

    @Then("German Error message is displayed")
    public void germanErrorMessageIsDisplayed() throws Throwable {
        List<AndroidElement> errorMessage = driver.findElements(By.xpath("//*[@text='Invalid Login']"));
        if(errorMessage.size()!=0){
           asserttext(Constant_Language.Login_error_german_text_xpath_expected,Constant_login.Login_error_text_xpath);
        }
    }

    @Then("The password must be at least {int} characters. German Error message is displayed in login page")
    public void thePasswordMustBeAtLeastCharactersGermanErrorMessageIsDisplayedInLoginPage(int arg0) throws Throwable {
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(login_obj.Login_invalidsecurePwd_message_access_id);
        if(elementsByAccessibilityId.size()!=0){
            asserttextAccessibility(Constant_Language.Login_invalidsecurePwd_German_message_The_password_must_be_at_least_5_characters,login_obj.Login_invalidsecurePwd_message_access_id);
        }
    }

    @Then("I Tap on an EinLoggen button in Login Page")
    public void iTapOnAnEinLoggenButtonInLoginPage() {
        TaponbuttonaccessabilityID(login_obj.loginbutton);
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_OnboardingPage.Onboarding_allow_access_popup_xpath));
        if(elements.size()!=0){
            WebDriverWait wait=new WebDriverWait(driver,300);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_OnboardingPage.Onboarding_only_this_time_xpath)));
            Taponbutton(Constant_OnboardingPage.Onboarding_only_this_time_xpath);
        }
    }
}

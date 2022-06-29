package com.dometic.L1.stepdefinition;

import com.dometic.L1.qa.Pages.Constant_Language;
import com.dometic.L1.qa.Pages.Constant_forgotpassword;
import com.dometic.L1.qa.util.Baseclass;
import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class LanguageValidationSignupPage extends Baseclass {
    com.dometic.L1.qa.Pages.Constant_signup signup_obj;
    @Then("I Tap on Registrieren link in login page")
    public void iTapOnRegistrierenLinkInLoginPage() {
        WebDriverWait wait=new WebDriverWait(driver,50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_forgotpassword.Forgot_password_backbutton_xpath)));
        TaponbuttonaccessabilityID(Constant_Language.Forgot_password_back_button_access_id);
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(signup_obj.Signup_login_link_access_id);
        if(elementsByAccessibilityId.size()!=0){
            TaponbuttonaccessabilityID(signup_obj.Signup_login_link_access_id);
        }
    }

    @Then("Email field is required german text Error message is displayed")
    public void emailFieldIsRequiredGermanTextErrorMessageIsDisplayed() throws Throwable {
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(signup_obj.Signup_invalidemail_message_access_id);
        if(elementsByAccessibilityId.size()!=0){
            asserttextAccessibility(Constant_Language.Signup_invalidemail_German_message_expected,signup_obj.Signup_invalidemail_message_access_id);
        }
    }

    @Then("The password field is required german text Error message is displayed")
    public void thePasswordFieldIsRequiredGermanTextErrorMessageIsDisplayed() throws Throwable {
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(signup_obj.Signup_invalidSecurePwd_message_access_id);
        if(elementsByAccessibilityId.size()!=0){
            asserttextAccessibility(Constant_Language.Signup_invalidSecurePwd_German_message_expected,signup_obj.Signup_invalidSecurePwd_message_access_id);
        }
    }

    @Then("Doesn't match german text Error message is displayed")
    public void doesnTMatchGermanTextErrorMessageIsDisplayed() throws Throwable {
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(signup_obj.Signup_showVerifyPasswordError_access_id);
        if(elementsByAccessibilityId.size()!=0){
            asserttextAccessibility(Constant_Language.Signup_showVerifyPasswordError_German_Doesnt_match,signup_obj.Signup_showVerifyPasswordError_access_id);
        }
    }

    @Then("The verify password field is required german text Error message is displayed")
    public void theVerifyPasswordFieldIsRequiredGermanTextErrorMessageIsDisplayed() throws Throwable {
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(signup_obj.Signup_showVerifyPasswordError_access_id);
        if(elementsByAccessibilityId.size()!=0){
            asserttextAccessibility(Constant_Language.Signup_showVerifyPasswordError_German_expected,signup_obj.Signup_showVerifyPasswordError_access_id);
        }
    }

    @Then("The email must be a valid email address german text Error message is displayed")
    public void theEmailMustBeAValidEmailAddressGermanTextErrorMessageIsDisplayed() throws Throwable {
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(signup_obj.Signup_invalidemail_message_access_id);
        if(elementsByAccessibilityId.size()!=0){
            asserttextAccessibility(Constant_Language.Signup_invalidemail_German_message_email_must_be_a_valid_email_address,signup_obj.Signup_invalidemail_message_access_id);
        }
    }

    @Then("The password doesn't satisfy the conditions german text Error message is displayed")
    public void thePasswordDoesnTSatisfyTheConditionsGermanTextErrorMessageIsDisplayed() throws Throwable {
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(signup_obj.Signup_invalidSecurePwd_message_access_id);
        if(elementsByAccessibilityId.size()!=0){
            asserttextAccessibility(Constant_Language.Signup_The_password_doesnt_satisify_the_conditions_German_expected,signup_obj.Signup_invalidSecurePwd_message_access_id);
        }
    }
}

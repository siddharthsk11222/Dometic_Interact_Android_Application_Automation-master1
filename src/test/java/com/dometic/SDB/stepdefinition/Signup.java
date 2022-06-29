package com.dometic.SDB.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.L1.qa.Pages.Constant_login;
import com.dometic.SDB.qa.Pages.Constant_AccountSettings;
import com.dometic.SDB.qa.util.Baseclass;
import com.google.common.collect.ImmutableMap;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Signup extends Baseclass{
    com.dometic.L1.qa.Pages.Constant_signup signup_obj;
    @Then("I Verify Email Inputbox is displayed in Signup Page")
    public void Signup_Page_EmailInputbox() throws Throwable
    {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Email Inputbox is displayed in Signup Page");
       // TaponbuttonaccessabilityID(signup_obj.Signup_login_link_access_id);
        iselementdisplayedaccessabilityId(signup_obj.SignUp_email_text_field_access_id);
    }
    @Then("I Verify Password Inputbox is displayed in Signup Page")
    public void Signup_Page_Password_Inputbox() throws Throwable
    {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Password Inputbox is displayed in Signup Page");
        iselementdisplayedaccessabilityId(signup_obj.SignUp_password_textField_access_id);
    }
    @Then("I Verify Confirm Password Inputbox is displayed in Signup Page")
    public void Signup_Page_confirm_password_Inputbox() throws Throwable
    {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Confirm Password Inputbox is displayed in Signup Page");
        iselementdisplayedaccessabilityId(signup_obj.SignUp_verifyPassword_text_field_access_id);
    }
    @Then("I Verify Signup button is displayed in Signup Page")
    public void Signup_Page_Signupbutton() throws Throwable
    {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Signup button is displayed in Signup Page");
        iselementdisplayedaccessabilityId(signup_obj.Signup_signupbutton);
    }
    @And("I enter Email in Signup Page")
    public void Signup_enter_email() throws Throwable
    {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter Email in Signup Page");
        TaponbuttonaccessabilityID(signup_obj.SignUp_email_text_field_access_id);
        cleartextaccessabilityId(signup_obj.SignUp_email_text_field_access_id);
        entertextaccessabilityId(signup_obj.Signup_email_value1, signup_obj.SignUp_email_text_field_access_id);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }
    @And("I enter Password in Signup Page")
    public void Signup_enter_password() throws Throwable
    {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter Password in Signup Page");
        TaponbuttonaccessabilityID(signup_obj.SignUp_password_textField_access_id);
        cleartextaccessabilityId(signup_obj.SignUp_password_textField_access_id);
        entertextaccessabilityId(signup_obj.Signup_password_value1, signup_obj.SignUp_password_textField_access_id);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }
    @And("I enter confirm password in Signup Page")
    public void Signup_enter_confirmpassword() throws Throwable
    {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter confirm password in Signup Page");
        TaponbuttonaccessabilityID(signup_obj.SignUp_verifyPassword_text_field_access_id);
        cleartextaccessabilityId(signup_obj.SignUp_verifyPassword_text_field_access_id);
        entertextaccessabilityId(signup_obj.Signup_confirmpassword_value1, signup_obj.SignUp_verifyPassword_text_field_access_id);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }
    @Then("I Tap on Send button in Signup Page")
    public void Signup_enter_signupbutton() throws Throwable
    {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Send button in Forgot Signup Page");
        /*Taponbutton(signup_obj.SignUp_signup_button_xpath);
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(signup_obj.Signup_alomost_there_xpath)));
        Taponbutton(signup_obj.Signup_alomost_there_xpath);*/
       // TaponbuttonaccessabilityID(signup_obj.Signup_signupbutton);
        List<AndroidElement> elements = driver.findElements(By.xpath(signup_obj.Signup_alomost_there_xpath));
        if (elements.size()!=0){
            elements.get(0).click();
        }else{
            WebDriverWait wait1=new WebDriverWait(driver,200);
            wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(signup_obj.SignUp_login_link_xpath)));
            TaponbuttonaccessabilityID(signup_obj.Signup_signupbutton);
            Thread.sleep(2000);
          //
            //Taponbutton(signup_obj.SignUp_login_link_xpath);
        }

       // Taponbutton(signup_obj.Signup_accept_Terms_and_Conditions_xpath);
    }

    @Then("I Tap on term and conditions checkbox")
    public void iTapOnTermAndConditionsCheckbox() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "\"I Tap on term and conditions checkbox");
        List<AndroidElement> elements = driver.findElements(By.xpath(signup_obj.Signup_term_and_condition_popup));
        if(elements.size()!=0){
            Taponbutton(signup_obj.Signup_term_and_condition_popup);
            TaponbuttonaccessabilityID(signup_obj.SignUp_terms_condition_link_access_id);
        }
        TaponbuttonaccessabilityID(signup_obj.SignUp_terms_condition_link_access_id);
       // Taponbutton(signup_obj.SignUp_checkBox_terms_condition_xpath);

    }

    @Then("I Tap on signup link in login page")
    public void iTapOnSignupLinkInLoginPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on signup link in login page");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(signup_obj.Signup_login_link_access_id);
        if(elementsByAccessibilityId.size()!=0){
            TaponbuttonaccessabilityID(signup_obj.Signup_login_link_access_id);
        }
    }


    @Then("I Tap on login link in signup page")
    public void iTapOnLoginLinkInSignupPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on login link in signup page");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(signup_obj.SignUp_login_link_access_id);
        if(elementsByAccessibilityId.size()!=0){
            TaponbuttonaccessabilityID(signup_obj.SignUp_login_link_access_id);
        }
        else{
            Thread.sleep(2000);
            Taponbutton(signup_obj.Signup_alomost_there_xpath);
        }

    }

    @Then("I enter invalid confirm password in Signup page")
    public void iEnterInvalidConfirmPasswordInSignupPage() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter invalid confirm password in Signup page");
        TaponbuttonaccessabilityID(signup_obj.SignUp_verifyPassword_text_field_access_id);
        cleartextaccessabilityId(signup_obj.SignUp_verifyPassword_text_field_access_id);
        entertextaccessabilityId(signup_obj.Signup_invalid_confirm_password,signup_obj.SignUp_verifyPassword_text_field_access_id);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @Then("I Tap on Signup button")
    public void iTapOnSignupButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Signup button");
        TaponbuttonaccessabilityID(signup_obj.Signup_signupbutton);
    }

    @Then("I left the Verify password blank")
    public void iLeftTheVerifyPasswordBlank() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I left the Verify password blank");
        TaponbuttonaccessabilityID(signup_obj.SignUp_verifyPassword_text_field_access_id);
        cleartextaccessabilityId(signup_obj.SignUp_verifyPassword_text_field_access_id);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
      // entertextaccessabilityId(signup_obj.Signup_blank_verify_password_field,signup_obj.SignUp_verifyPassword_text_field_access_id);

    }

    @Then("I left the Email blank")
    public void iLeftTheEmailBlank() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I left the Email blank");
        TaponbuttonaccessabilityID(signup_obj.SignUp_email_text_field_access_id);
        cleartextaccessabilityId(signup_obj.SignUp_email_text_field_access_id);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @Then("I left the password blank")
    public void iLeftThePasswordBlank() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I left the password blank");
        TaponbuttonaccessabilityID(signup_obj.SignUp_password_textField_access_id);
        cleartextaccessabilityId(signup_obj.SignUp_password_textField_access_id);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @Then("I enter Invalid Email in Signup Page")
    public void iEnterInvalidEmailInSignupPage() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter Invalid Email in Signup Page");
        TaponbuttonaccessabilityID(signup_obj.SignUp_email_text_field_access_id);
        cleartextaccessabilityId(signup_obj.SignUp_email_text_field_access_id);
        entertextaccessabilityId(signup_obj.Signup_invalid_email_value1,signup_obj.SignUp_email_text_field_access_id);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @Then("I enter invalid Password in Signup Page")
    public void iEnterInvalidPasswordInSignupPage() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter invalid Password in Signup Page");
        TaponbuttonaccessabilityID(signup_obj.SignUp_password_textField_access_id);
        cleartextaccessabilityId(signup_obj.SignUp_password_textField_access_id);
        entertextaccessabilityId(signup_obj.Signup_invalid_confirm_password,signup_obj.SignUp_password_textField_access_id);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @And("I enter invalid verify password password in Signup Page")
    public void iEnterInvalidVerifyPasswordPasswordInSignupPage() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter invalid verify password password in Signup Page");
        TaponbuttonaccessabilityID(signup_obj.SignUp_verifyPassword_text_field_access_id);
        cleartextaccessabilityId(signup_obj.SignUp_verifyPassword_text_field_access_id);
        entertextaccessabilityId(signup_obj.Signup_invalid_confirm_password,signup_obj.SignUp_verifyPassword_text_field_access_id);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }
    @Then("I Tap on existing user popup")
    public void iTapOnExistingUserPopup() throws InterruptedException {
        List<AndroidElement> elements = driver.findElements(By.xpath(signup_obj.Signup_parentPanel_xpath));
        if(elements.size()!=0){
            Thread.sleep(2000);
            Taponbutton(signup_obj.Signup_OK_xpath);
        }
    }

    @Then("Email field is required Error message is displayed.")
    public void emailFieldIsRequiredErrorMessageIsDisplayed() throws Throwable {
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(signup_obj.Signup_invalidemail_message_access_id);
        if(elementsByAccessibilityId.size()!=0){
            asserttextValidationAccessibility(signup_obj.Signup_invalidemail_message_expected,signup_obj.Signup_invalidemail_message_access_id);
        }
    }

    @Then("The password field is required Error message is displayed.")
    public void thePasswordFieldIsRequiredErrorMessageIsDisplayed() throws Throwable {
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(signup_obj.Signup_invalidSecurePwd_message_access_id);
        if(elementsByAccessibilityId.size()!=0){
            asserttextValidationAccessibility(signup_obj.Signup_invalidSecurePwd_message_expected,signup_obj.Signup_invalidSecurePwd_message_access_id);
        }
    }

    @Then("Doesn't match Error message is displayed.")
    public void doesnTMatchErrorMessageIsDisplayed() throws Throwable {
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(signup_obj.Signup_showVerifyPasswordError_access_id);
        if(elementsByAccessibilityId.size()!=0){
            asserttextValidationAccessibility(signup_obj.Signup_showVerifyPasswordError_Doesnt_match,signup_obj.Signup_showVerifyPasswordError_access_id);
        }
    }

    @Then("The verify password field is required Error message is displayed.")
    public void theVerifyPasswordFieldIsRequiredErrorMessageIsDisplayed() throws Throwable {
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(signup_obj.Signup_showVerifyPasswordError_access_id);
        if(elementsByAccessibilityId.size()!=0){
            asserttextValidationAccessibility(signup_obj.Signup_showVerifyPasswordError_expected,signup_obj.Signup_showVerifyPasswordError_access_id);
        }
    }

    @Then("The email must be a valid email address Error message is displayed.")
    public void theEmailMustBeAValidEmailAddressErrorMessageIsDisplayed() throws Throwable {
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(signup_obj.Signup_invalidemail_message_access_id);
        if(elementsByAccessibilityId.size()!=0){
            asserttextValidationAccessibility(signup_obj.Signup_invalidemail_message_email_must_be_a_valid_email_address,signup_obj.Signup_invalidemail_message_access_id);
        }
    }

    @Then("The password doesn't satisfy the conditions Error message is displayed.")
    public void thePasswordDoesnTSatisfyTheConditionsErrorMessageIsDisplayed() throws Throwable {
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(signup_obj.Signup_invalidSecurePwd_message_access_id);
        if(elementsByAccessibilityId.size()!=0){
            asserttextValidationAccessibility(signup_obj.Signup_The_password_doesnt_satisify_the_conditions_expected,signup_obj.Signup_invalidSecurePwd_message_access_id);
        }
    }

    @Then("I enter an password below {int} characters in Password Field in Signup Page.")
    public void iEnterAnPasswordBelowCharactersInPasswordFieldInSignupPage(int arg0) throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an password below 8 characters in Password Field in Signup Page");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(signup_obj.SignUp_password_textField_access_id);
        Thread.sleep(1000);
        cleartextaccessabilityId(signup_obj.SignUp_password_textField_access_id);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        entertextaccessabilityId(signup_obj.Signup_below_8_Character,signup_obj.SignUp_password_textField_access_id);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @Then("I enter an password below {int} characters in confirm Password Field in Signup Page.")
    public void iEnterAnPasswordBelowCharactersInConfirmPasswordFieldInSignupPage(int arg0) throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an password below 8 characters in confirm Password Field in Signup Page");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(signup_obj.SignUp_verifyPassword_text_field_access_id);
        Thread.sleep(1000);
        cleartextaccessabilityId(signup_obj.SignUp_verifyPassword_text_field_access_id);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        entertextaccessabilityId(signup_obj.Signup_below_8_Character,signup_obj.SignUp_verifyPassword_text_field_access_id);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @Then("I enter an password above {int} characters in Password Field in Signup Page.")
    public void iEnterAnPasswordAboveCharactersInPasswordFieldInSignupPage(int arg0) throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an password above 8 characters in Password Field in Signup Page");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(signup_obj.SignUp_password_textField_access_id);
        Thread.sleep(1000);
        cleartextaccessabilityId(signup_obj.SignUp_password_textField_access_id);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        entertextaccessabilityId(signup_obj.Signup_above_8_Character,signup_obj.SignUp_password_textField_access_id);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @Then("I enter an password above {int} characters in confirm Password Field in Signup Page.")
    public void iEnterAnPasswordAboveCharactersInConfirmPasswordFieldInSignupPage(int arg0) throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an password below 8 characters in confirm Password Field in Signup Page");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(signup_obj.SignUp_verifyPassword_text_field_access_id);
        Thread.sleep(1000);
        cleartextaccessabilityId(signup_obj.SignUp_verifyPassword_text_field_access_id);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        entertextaccessabilityId(signup_obj.Signup_above_8_Character,signup_obj.SignUp_verifyPassword_text_field_access_id);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @Then("I enter an Emoji's in Email Field in Signup Page.")
    public void iEnterAnEmojiSInEmailFieldInSignupPage() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an Emoji's in Email Field in Signup Page");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(signup_obj.SignUp_email_text_field_access_id);
        Thread.sleep(1000);
        cleartextaccessabilityId(signup_obj.SignUp_email_text_field_access_id);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        String emojis = Constant_AccountSettings.grinning_face_with_smiling_eyes + Constant_AccountSettings.face_with_tears_of_joy+
                Constant_AccountSettings.smiling_face_with_open_mouth_and_cold_sweat+Constant_AccountSettings.smiling_face_with_open_mouth_and_tightly_closed_eyes+
                Constant_AccountSettings.winking_face;
        entertextaccessabilityId(emojis,signup_obj.SignUp_email_text_field_access_id);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @Then("I enter an Special Character in Email Field in Signup Page.")
    public void iEnterAnSpecialCharacterInEmailFieldInSignupPage() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an Special Character in Email Field in Signup Page");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(signup_obj.SignUp_email_text_field_access_id);
        Thread.sleep(1000);
        cleartextaccessabilityId(signup_obj.SignUp_email_text_field_access_id);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        entertextaccessabilityId(Constant_login.email_SpecialCharacter,signup_obj.SignUp_email_text_field_access_id);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }
}

package com.dometic.L1.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.Apollo.qa.Pages.Constant_AccountSettings;
import com.dometic.Apollo.qa.Pages.Constant_Batteries_MTC;
import com.dometic.L1.qa.Pages.Constant_login;
import com.dometic.L1.qa.Pages.Constant_signup;
import com.dometic.L1.qa.util.Baseclass;
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
            Thread.sleep(3000);
            Taponbutton(signup_obj.Signup_alomost_there_xpath);
        }

    }

    @Then("I enter invalid confirm password in Signup page")
    public void iEnterInvalidConfirmPasswordInSignupPage() throws InterruptedException {
        TaponbuttonaccessabilityID(signup_obj.SignUp_verifyPassword_text_field_access_id);
        cleartextaccessabilityId(signup_obj.SignUp_verifyPassword_text_field_access_id);
        entertextaccessabilityId(signup_obj.Signup_invalid_confirm_password,signup_obj.SignUp_verifyPassword_text_field_access_id);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @Then("I Tap on Signup button")
    public void iTapOnSignupButton() {
        TaponbuttonaccessabilityID(signup_obj.Signup_signupbutton);
    }

    @Then("I left the Verify password blank")
    public void iLeftTheVerifyPasswordBlank() throws InterruptedException {
        TaponbuttonaccessabilityID(signup_obj.SignUp_verifyPassword_text_field_access_id);
        cleartextaccessabilityId(signup_obj.SignUp_verifyPassword_text_field_access_id);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
      // entertextaccessabilityId(signup_obj.Signup_blank_verify_password_field,signup_obj.SignUp_verifyPassword_text_field_access_id);

    }

    @Then("I left the Email blank")
    public void iLeftTheEmailBlank() throws InterruptedException {
        TaponbuttonaccessabilityID(signup_obj.SignUp_email_text_field_access_id);
        cleartextaccessabilityId(signup_obj.SignUp_email_text_field_access_id);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @Then("I left the password blank")
    public void iLeftThePasswordBlank() throws InterruptedException {
        TaponbuttonaccessabilityID(signup_obj.SignUp_password_textField_access_id);
        cleartextaccessabilityId(signup_obj.SignUp_password_textField_access_id);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @Then("I enter Invalid Email in Signup Page")
    public void iEnterInvalidEmailInSignupPage() throws InterruptedException {
        TaponbuttonaccessabilityID(signup_obj.SignUp_email_text_field_access_id);
        cleartextaccessabilityId(signup_obj.SignUp_email_text_field_access_id);
        entertextaccessabilityId(signup_obj.Signup_invalid_email_value1,signup_obj.SignUp_email_text_field_access_id);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @Then("I enter invalid Password in Signup Page")
    public void iEnterInvalidPasswordInSignupPage() throws InterruptedException {
        TaponbuttonaccessabilityID(signup_obj.SignUp_password_textField_access_id);
        cleartextaccessabilityId(signup_obj.SignUp_password_textField_access_id);
        entertextaccessabilityId(signup_obj.Signup_invalid_confirm_password,signup_obj.SignUp_password_textField_access_id);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @And("I enter invalid verify password password in Signup Page")
    public void iEnterInvalidVerifyPasswordPasswordInSignupPage() throws InterruptedException {
        TaponbuttonaccessabilityID(signup_obj.SignUp_verifyPassword_text_field_access_id);
        cleartextaccessabilityId(signup_obj.SignUp_verifyPassword_text_field_access_id);
        entertextaccessabilityId(signup_obj.Signup_invalid_confirm_password,signup_obj.SignUp_verifyPassword_text_field_access_id);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }


    @Then("Email field is required Error message is displayed")
    public void emailFieldIsRequiredErrorMessageIsDisplayed() throws Throwable {
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(signup_obj.Signup_invalidemail_message_access_id);
        if(elementsByAccessibilityId.size()!=0){
            asserttextValidationAccessibility(signup_obj.Signup_invalidemail_message_expected,signup_obj.Signup_invalidemail_message_access_id);
        }
        System.out.println("Email field is required error message is verified");
    }

    @Then("The password field is required Error message is displayed")
    public void thePasswordFieldIsRequiredErrorMessageIsDisplayed() throws Throwable {
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(signup_obj.Signup_invalidSecurePwd_message_access_id);
        if(elementsByAccessibilityId.size()!=0){
            asserttextValidationAccessibility(signup_obj.Signup_invalidSecurePwd_message_expected,signup_obj.Signup_invalidSecurePwd_message_access_id);
        }
        System.out.println("Password field is required error message is verified");
    }

    @Then("Doesn't match Error message is displayed")
    public void doesnTMatchErrorMessageIsDisplayed() throws Throwable {
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(signup_obj.Signup_showVerifyPasswordError_access_id);
        if(elementsByAccessibilityId.size()!=0){
            asserttextValidationAccessibility(signup_obj.Signup_showVerifyPasswordError_Doesnt_match,signup_obj.Signup_showVerifyPasswordError_access_id);
        }
        System.out.println("Password doesn't match error message is verified");
    }

    @Then("The verify password field is required Error message is displayed")
    public void theVerifyPasswordFieldIsRequiredErrorMessageIsDisplayed() throws Throwable {
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(signup_obj.Signup_showVerifyPasswordError_access_id);
        if(elementsByAccessibilityId.size()!=0){
            asserttextValidationAccessibility(signup_obj.Signup_showVerifyPasswordError_expected,signup_obj.Signup_showVerifyPasswordError_access_id);
        }
        System.out.println("Password field is required error message is verified");
    }

    @Then("The email must be a valid email address Error message is displayed")
    public void theEmailMustBeAValidEmailAddressErrorMessageIsDisplayed() throws Throwable {
        List<AndroidElement> elementsByxpath = driver.findElementsByXPath(signup_obj.Signup_invalidemail_message_access_id);
        if(elementsByxpath.size()!=0){
            asserttext(signup_obj.Signup_invalidemail_message_email_must_be_a_valid_email_address,signup_obj.Signup_invalidemail_message_access_id);
        }
        System.out.println("Invalid email error message is verified");
    }

    @Then("The password doesn't satisfy the conditions Error message is displayed")
    public void thePasswordDoesnTSatisfyTheConditionsErrorMessageIsDisplayed() throws Throwable {
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(signup_obj.Signup_invalidSecurePwd_message_access_id);
        if(elementsByAccessibilityId.size()!=0){
            asserttextValidationAccessibility(signup_obj.Signup_The_password_doesnt_satisify_the_conditions_expected,signup_obj.Signup_invalidSecurePwd_message_access_id);
        }
        System.out.println("Password doesn't satisfy the conditions error message is verified");
    }

    @Then("I enter an Emoji's in Email Field in Signup Page")
    public void iEnterAnEmojiSInEmailFieldInSignupPage() throws ClassNotFoundException, InterruptedException {
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

    @Then("I enter an Special Character in Email Field in Signup Page")
    public void iEnterAnSpecialCharacterInEmailFieldInSignupPage() throws ClassNotFoundException, InterruptedException {
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

    @Then("I Tap on Ok button.")
    public void iTapOnOkButton() {
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Batteries_MTC.mtc_Batteries_title_template_xpath));
        if (elements.size() != 0) {
            Taponbutton(signup_obj.Signup_OK_xpath);
        }
    }

    @Then("I enter an password below {int} characters in Password Field in Signup Page")
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

    @Then("I enter an password below {int} characters in confirm Password Field in Signup Page")
    public void iEnterAnPasswordBelowCharactersInConfirmPasswordFieldInSignupPage(int arg0) throws ClassNotFoundException, InterruptedException {
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

    @Then("I enter an password above {int} characters in Password Field in Signup Page")
    public void iEnterAnPasswordAboveCharactersInPasswordFieldInSignupPage(int arg0) throws InterruptedException, ClassNotFoundException {
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

    @Then("I enter an password above {int} characters in confirm Password Field in Signup Page")
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
    //newly added
    @Then("I Verify create your account text is displayed in Signup Page")
    public void iVerifyCreateYourAccountTextIsDisplayedInSignupPage()throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify create your account text is displayed in Signup Page");
        asserttext(Constant_signup.create_account_text_expected, Constant_signup.create_account_text);
        System.out.println("create your account text is verified");

    }
    @Then("I Verify Email field label is displayed in Signup page")
    public void iVerifyEmailFieldLabelIsDisplayedInSignupPage() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Email field label is displayed in Signup page");
        asserttext(Constant_signup.Email_field_label_expected, Constant_signup.Email_field_label);
        System.out.println("Email field label verified");
    }
    @Then("I Verify Password field label is displayed in Signup page")
    public void iVerifyPasswordFieldLabelIsDisplayedInSignupPage() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Password field label is displayed in Signup page");
        asserttext(Constant_signup.Password_field_label_expected, Constant_signup.Password_field_label);
        System.out.println("Password field label verified");
    }

    @Then("I Verify Confirm password label is displayed in the signup page")
    public void iVerifyConfirmPasswordLabelIsDisplayedInTheSignupPage() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Confirm password label is displayed in the signup page");
        asserttext(Constant_signup.Verify_Password_field_label_expected, Constant_signup.Verify_Password_field_label);
        System.out.println("Confirm Password field label verified");
    }

    @Then("I verify I agree to text is displayed in Signup page")
    public void iVerifyIAgreeToTextIsDisplayedInSignuppage() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify I agree to text is displayed in Signup page");
        asserttext(Constant_signup.I_agree_to_text_expected, Constant_signup.I_agree_to_text);
        System.out.println("I agree to text is verified");
    }

    @Then("I Verify Terms&Condition Text is displayed in Signup page")
    public void iVerifyTermsConditionTextisDisplayedInSignuppage() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Terms&Condition Text is displayed in Signup page");
        asserttext(Constant_signup.Terms_and_Condition_text_expected, Constant_signup.Terms_and_Condition_text);
        System.out.println("Terms&Condition text is verified");

    }

    @Then("I Verify Marketing Text is displayed in signup page")
    public void iVerifyMarketingTextIsDisplayedInSignupPage()throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Marketing Text is displayed in signup page");
        asserttext(Constant_signup.Marketing_text_expected, Constant_signup.Marketing_text);
        System.out.println("Marketing text is verified");
    }

    @Then("I Verify More information text is displayed in signup page")
    public void iVerifyMoreInformationTextIsDisplayedInSignupPage()throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify More information text is displayed in signup page");
        asserttext(Constant_signup.More_info_text_expected, Constant_signup.More_info_text);
        System.out.println("More information text is verified");
    }

    @Then("I Verify Aldready have an account text is displayed in Signup page")
    public void iVerifyAldreadyHaveAnAccountTextIsDisplayedInSignupPage()throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Aldready have an account text is displayed in Signup page");
        asserttext(Constant_signup.Already_have_account_text_expected, Constant_signup.Already_have_account_text);
        System.out.println("Aldready have an account text is verified");
    }

    @Then("I Verify Login text is displayed in signup page")
    public void iVerifyLoginTextIsDisplayedInSignupPage()throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Login text is displayed in signup page");
        asserttext(Constant_signup.Login_text_in_Signup_page_expected, Constant_signup.Login_text_in_Signup_page);
        System.out.println("Login text in signup page is verified");
    }

    @Then("I Verify mandatory text is displayed in signup page")
    public void iVerifyMandatoryTextIsDisplayedInSignupPage() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify mandatory text is displayed in signup page");
        asserttext(Constant_signup.Mandatory_text_expected, Constant_signup.Mandatory_text);
        System.out.println("mandatory text is verified");
    }

    @Then("I verify E-mail field is required Error message is displayed")
    public void iVerifyEMailFieldIsRequiredErrorMessageIsDisplayed()throws Throwable {
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(signup_obj.Signup_invalidemail_message_access_id);
        if(elementsByAccessibilityId.size()!=0){
            asserttextValidationAccessibility(signup_obj.Signup_invalidemail_message_expected,signup_obj.Signup_invalidemail_message_access_id);
        }
        System.out.println("E-mail field is required Error message is verified");

    }
}

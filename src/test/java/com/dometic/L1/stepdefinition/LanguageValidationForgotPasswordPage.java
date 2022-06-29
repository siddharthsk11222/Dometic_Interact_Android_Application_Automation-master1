package com.dometic.L1.stepdefinition;

import com.dometic.L1.qa.Pages.Constant_Language;
import com.dometic.L1.qa.Pages.Constant_forgotpassword;
import com.dometic.L1.qa.Pages.Constant_login;
import com.dometic.L1.qa.util.Baseclass;
import cucumber.api.java.en.Then;

public class LanguageValidationForgotPasswordPage extends Baseclass {
    @Then("I verify Forgot your password german text is displayed in Forgot password Page")
    public void iVerifyForgotYourPasswordGermanTextIsDisplayedInForgotPasswordPage() throws Throwable {
        TaponbuttonaccessabilityID(Constant_login.Login_forgot_password_link_access_id);
        asserttextAccessibility(Constant_Language.ForgetPassword_forgot_header_German_text_expected,Constant_forgotpassword.ForgetPassword_page_title_access_id);
    }

    @Then("I verify Forgot your password content german text is displayed in Forgot password Page")
    public void iVerifyForgotYourPasswordContentGermanTextIsDisplayedInForgotPasswordPage() throws Throwable {
        asserttextAccessibility(Constant_Language.ForgetPassword_forgot_enterEmail_German_text_expected,Constant_forgotpassword.ForgetPassword_forgot_enterEmail_access_id);
        asserttextAccessibility(Constant_Language.ForgetPassword_forgot_createPass_German_text_expected,Constant_forgotpassword.ForgetPassword_forgot_createPass_access_id);
        asserttextAccessibility(Constant_Language.ForgetPassword_forgot_emailReceive_German_expected,Constant_forgotpassword.ForgetPassword_forgot_emailReceive_access_id);
        asserttextAccessibility(Constant_Language.ForgetPassword_forgot_checkSpam_German_expected,Constant_forgotpassword.ForgetPassword_forgot_checkSpam_access_id);
        asserttextAccessibility(Constant_Language.ForgetPassword_forgot_checkInbox_German_expected,Constant_forgotpassword.ForgetPassword_forgot_checkInbox_access_id);
        asserttextAccessibility(Constant_Language.ForgetPassword_forgot_checkinMin_German_expected,Constant_forgotpassword.ForgetPassword_forgot_checkinMin_access_id);
    }

    @Then("I verify E-mail german label is displayed")
    public void iVerifyEMailGermanLabelIsDisplayed() throws Throwable {
        asserttextAccessibility(Constant_Language.ForgetPassword_forgot_email_label_German_expected,Constant_forgotpassword.ForgetPassword_forgot_email_label_access_id);
    }
}

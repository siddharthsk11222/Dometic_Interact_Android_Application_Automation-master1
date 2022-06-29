package com.dometic.L1_BLE.qa.Pages;

import com.dometic.L1.qa.util.Baseclass;

public class Constant_forgotpassword extends Baseclass{
    public static final String Forgot_password_email = "com.dometicapp:id/forgot-emailTextfield";
    public static final String Forgot_password_send = "com.dometicapp:id/forgot-sendButton";
    public static final String Forgot_password_backbutton = "com.dometicapp:id/forgot-backToLoginImage";
    public static final String Forgot_password_email1 = "test@gamil.com";
    //----------------Accessibilityid-----------------//

    public static final String ForgetPassword_back_button_access_id="com.dometicapp:id/forgot-backToLoginImage";
    public static final String ForgetPassword_page_title_access_id="com.dometicapp:id/forgot-forgotPwdText";
    public static final String ForgetPassword_page_title_text_expected="Forgot your password?";
    public static final String ForgetPassword_content_access_id="com.dometicapp:id/forgot-enterEmail";
    public static final String ForgetPassword_email_text_access_id="com.dometicapp:id/forgot-email";
    public static final String ForgetPassword_email_text_field_access_id="com.dometicapp:id/forgot-emailTextfield";
    public static final String ForgetPassword_forgot_enterEmail_access_id="com.dometicapp:id/forgot-enterEmail";
    public static final String ForgetPassword_forgot_enterEmail_text_expected="Don´t worry. Resetting your password is very easy.";
    public static final String ForgetPassword_forgot_createPass_access_id="com.dometicapp:id/forgot-createPass";
    public static final String ForgetPassword_forgot_createPass_text_expected="Please insert below the email address you registered your";
    public static final String ForgetPassword_forgot_emailReceive_access_id="com.dometicapp:id/forgot-emailReceive";
    public static final String ForgetPassword_forgot_emailReceive_expected="account with. Soon you will receive an email to reset your";
    public static final String ForgetPassword_forgot_checkSpam_access_id="com.dometicapp:id/forgot-checkSpam";
    public static final String ForgetPassword_forgot_checkSpam_expected="password. Please remember to check your spam or junk";
    public static final String ForgetPassword_forgot_checkInbox_access_id="com.dometicapp:id/forgot-checkInbox";
    public static final String ForgetPassword_forgot_checkInbox_expected="folder if you can’t see the email in your inbox within the";
    public static final String ForgetPassword_forgot_checkinMin_access_id="com.dometicapp:id/forgot-checkinMin";
    public static final String ForgetPassword_forgot_checkinMin_expected="next 15 minutes.";
    public static final String ForgetPassword_forgot_email_label_access_id="com.dometicapp:id/forgot-email";
    public static final String ForgetPassword_forgot_email_label_expected="E-mail (case sensitive)";
    public static final String ForgetPassword_forgot_email_label_German__expected="Email";
    //-------------------Needed Accessibility Id-----------------//
    public static final String ForgetPassword_send_button_access_id="";


    // ----------------------Xpath--------------------------//
    public static final String ForgetPassword_send_button_xpath="//android.view.ViewGroup[@content-desc=\"com.dometicapp:id/forgot-sendButton\"]/android.widget.TextView";
    public static final String Forgot_password_backbutton_xpath="//*[@content-desc='com.dometicapp:id/forgot-backToLoginImage']";
}

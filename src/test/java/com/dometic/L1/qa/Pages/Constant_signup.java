package com.dometic.L1.qa.Pages;

import com.dometic.L1.qa.util.Baseclass;

public class Constant_signup extends Baseclass {

    //---------------------------Accessibility id-----------------------//
    public static final String SignUp_titlePage_access_id = "com.dometicapp:id/signUp-createAccount";
    public static final String SignUp_email_text_access_id = "com.dometicapp:id/signUp-email";
    public static final String SignUp_email_text_field_access_id = "com.dometicapp:id/signUp-emailField";
    public static final String SignUp_password_text_access_id = "com.dometicapp:id/signUp-password";
    public static final String SignUp_password_textField_access_id = "com.dometicapp:id/signUp-securePwdField";
    public static final String SignUp_showPassword_button_access_id = "com.dometicapp:id/signUp-viewPassword";
    public static final String SignUp_verifyPassword_text_access_id = "com.dometicapp:id/signUp-verify";
    public static final String SignUp_verifyPassword_text_field_access_id = "com.dometicapp:id/signUp-verifySecurePwd";
    public static final String Signup_email_value1 = "testtttt@gmail.com";
    public static final String Signup_invalid_email_value1 = "123";
    public static final String Signup_password_value1 = "DoM@12345";
    public static final String Signup_confirmpassword_value1 = "DoM@12345";
    public static final String Signup_invalid_confirm_password = "Dom@123";
    public static final String Signup_below_8_Character = "12";
    public static final String Signup_above_8_Character = "Dom@123456789987654321";
    public static final String Signup_above_8_Character_gmail = "Dom@123456789987654321@gmail.com";
    public static final String Signup_signupbutton = "com.dometicapp:id/signUp-signUpButton";
    public static final String Signup_term_and_condition_popup = "//*[@resource-id='android:id/button1']";
    public static final String Signup_login_link_access_id = "com.dometicapp:id/login-signUpText";
    public static final String Signup_blank_verify_password_field = "";
    public static final String Signup_invalidemail_message_access_id = "//android.widget.TextView[contains(@text,'The email must be a valid email address.') or @content-desc='com.dometicapp:id/forgot-invalidEmail-message']";
    public static final String Signup_invalidemail_message_expected = "The email field is required.";
    public static final String Signup_invalidSecurePwd_message_access_id = "com.dometicapp:id/signUp-invalidSecurePwd-message";
    public static final String Signup_invalidSecurePwd_message_expected = "The password field is required.";
    public static final String Signup_showVerifyPasswordError_access_id = "com.dometicapp:id/signUp-showVerifyPasswordError";
    public static final String Signup_showVerifyPasswordError_expected = "The verify password field is required.";
    public static final String Signup_invalidemail_message_email_must_be_a_valid_email_address = "The email must be a valid email address.";
    public static final String Signup_showVerifyPasswordError_Doesnt_match = "Doesnt match";
    public static final String Signup_The_password_doesnt_satisify_the_conditions_expected = "The password doesnt satisify the conditions";

    //-------------------Needed Accessibility Id-----------------//
    public static final String SignUp_info_button_access_id = "";
    public static final String SignUp_checkBox_terms_condition_access_id = "";
    public static final String SignUp_terms_condition_link_access_id = "com.dometicapp:id/signUp-isCheckedMarketing-iconContainer";
    public static final String SignUp_checkBox_offers_service_access_id = "";
    public static final String SignUp_offers_service_text_access_id = "";
    public static final String SignUp_offers_services_more_link_access_id = "";
    public static final String SignUp_signup_button_access_id = "";
    public static final String SignUp_login_link_access_id = "com.dometicapp:id/signUp-loginText";

    // -------------------------------xPath--------------------------------------//
    public static final String SignUp_info_button_xpath = "//android.view.ViewGroup[@content-desc=\"com.dometicapp:id/signUp-container\"]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView";
    public static final String SignUp_checkBox_terms_condition_xpath = "//android.view.ViewGroup[@content-desc='com.dometicapp:id/signUp-checkBoxMarketingContainer']/android.view.ViewGroup";
    public static final String SignUp_terms_condition_link_xpath = "//android.view.ViewGroup[@content-desc=\"com.dometicapp:id/signUp-container\"]/android.view.ViewGroup/android.widget.TextView[6]";
    public static final String SignUp_checkBox_offers_service_xpath = "//android.view.ViewGroup[@content-desc=\"com.dometicapp:id/signUp-showOffers\"]/android.view.ViewGroup";
    public static final String SignUp_offers_service_text_xpath = "//android.view.ViewGroup[@content-desc=\"com.dometicapp:id/signUp-container\"]/android.view.ViewGroup/android.widget.TextView[8]";
    public static final String SignUp_offers_services_more_link_xpath = "//android.view.ViewGroup[@content-desc=\"com.dometicapp:id/signUp-container\"]/android.view.ViewGroup/android.widget.TextView[9]";
    public static final String SignUp_signup_button_xpath = "//android.view.ViewGroup[@content-desc='com.dometicapp:id/signUp-signUpButton']";
    public static final String SignUp_login_link_xpath = "//android.widget.TextView[@content-desc='com.dometicapp:id/signUp-loginText']";
    public static final String Signup_accept_Terms_and_Conditions_xpath = "//*[@resource-id='android:id/button1']";
    public static final String Signup_alomost_there_xpath = "//*[@content-desc='com.dometicapp:id/signUp-closeButton']";
    public static final String Signup_parentPanel_xpath = "//*[@resource-id='android:id/parentPanel']";
    public static final String Signup_OK_xpath = "//*[@resource-id='android:id/button1']";
    //newly added
    //XPATH
    public static final String create_account_text = "//android.widget.TextView[contains(@text,'Create your account') or @content-desc='com.dometicapp:id/signUp-createAccount']";
    public static final String Email_field_label = "//android.widget.TextView[contains(@text,'E-mail') or @content-desc='com.dometicapp:id/signUp-email']";
    public static final String Password_field_label = "//android.widget.TextView[contains(@text,'Password') or @content-desc='com.dometicapp:id/signUp-securePwdLabel']";
    public static final String Verify_Password_field_label = "//android.widget.TextView[contains(@text,'Verify Password') or @content-desc='com.dometicapp:id/signUp-verify']";
    public static final String I_agree_to_text = "//android.widget.TextView[contains(@text,'I agree to') or @content-desc='com.dometicapp:id/signUp-dometicMarketingContainer']";
    public static final String Mandatory_text="//android.view.ViewGroup[contains(@text,'*mandatory') or @content-desc='com.dometicapp:id/signUp-container']/android.view.ViewGroup/android.widget.TextView[7]";
    public static final String Terms_and_Condition_text = "//android.widget.TextView[contains(@text,'Dometic´s Terms & Conditions.') or @content-desc='com.dometicapp:id/signUp-goToEula']";
    public static final String Marketing_text="//android.widget.TextView[contains(@text,'Yes, I´d like to hear about offers and services...') or @content-desc='com.dometicapp:id/signUp-showOffers']";
    public static final String More_info_text="//android.widget.TextView[contains(@text,'more') or @content-desc='com.dometicapp:id/signUp-showText']";
    public static final String Already_have_account_text="//android.widget.TextView[contains(@text,'Already have an account?') or @content-desc='com.dometicapp:id/signUp-haveAccount']";
    public static final String Login_text_in_Signup_page="//android.widget.TextView[contains(@text,'Log In') or @content-desc='com.dometicapp:id/signUp-loginText']";
    //Expected text
    public static final String create_account_text_expected = "Create your account";
    public static final String Email_field_label_expected = "E-mail";
    public static final String Password_field_label_expected = "Password";
    public static final String Verify_Password_field_label_expected = "Verify Password";
    public static final String I_agree_to_text_expected = "I agree to";
    public static final String Mandatory_text_expected="*mandatory";
    public static final String Terms_and_Condition_text_expected = "Dometic´s Terms & Conditions.";
    public static final String Marketing_text_expected="Yes, I´d like to hear about offers and services...";
    public static final String More_info_text_expected="more";
    public static final String Already_have_account_text_expected="Already have an account?";
    public static final String Login_text_in_Signup_page_expected="Log In";
}

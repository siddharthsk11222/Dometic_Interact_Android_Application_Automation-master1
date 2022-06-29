package com.dometic.L2.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.L1.qa.Pages.Constant_login;
import com.dometic.L2.qa.Pages.*;
import com.dometic.L2.qa.util.Baseclass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class SpanishLanguage extends Baseclass {
    com.dometic.L1.qa.Pages.Constant_signup signup_obj;
    com.dometic.L1.qa.Pages.Constant_login login_obj;
    @Then("I verify Forgot your password Spanish text is displayed in Forgot password Page")
    public void iVerifyForgotYourPasswordSpanishTextIsDisplayedInForgotPasswordPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Forgot your password text is displayedd in Forgot password Page");
        TaponbuttonaccessabilityID(Constant_login.Login_forgot_password_link_access_id);
        asserttextValidationAccessibility(Constant_Spanish_Language.ForgetPassword_forgot_header_Spanish_text_expected,Constant_forgotpassword.ForgetPassword_page_title_access_id);
    }

    @Then("I verify Forgot your password content Spanish text is displayed in Forgot password Page")
    public void iVerifyForgotYourPasswordContentSpanishTextIsDisplayedInForgotPasswordPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Forgot your password content Spanish text is displayed in Forgot password Page");
        asserttextValidationAccessibility(Constant_Spanish_Language.ForgetPassword_forgot_enterEmail_Spanish_text_expected, com.dometic.L1.qa.Pages.Constant_forgotpassword.ForgetPassword_forgot_enterEmail_access_id);
        asserttextValidationAccessibility(Constant_Spanish_Language.ForgetPassword_forgot_createPass_Spanish_text_expected, Constant_forgotpassword.ForgetPassword_forgot_createPass_access_id);
        asserttextValidationAccessibility(Constant_Spanish_Language.ForgetPassword_forgot_emailReceive_Spanish_expected, Constant_forgotpassword.ForgetPassword_forgot_emailReceive_access_id);
        asserttextValidationAccessibility(Constant_Spanish_Language.ForgetPassword_forgot_checkSpam_Spanish_expected, Constant_forgotpassword.ForgetPassword_forgot_checkSpam_access_id);
        asserttextValidationAccessibility(Constant_Spanish_Language.ForgetPassword_forgot_checkInbox_Spanish_expected, Constant_forgotpassword.ForgetPassword_forgot_checkInbox_access_id);
        asserttextValidationAccessibility(Constant_Spanish_Language.ForgetPassword_forgot_checkinMin_Spanish_expected, Constant_forgotpassword.ForgetPassword_forgot_checkinMin_access_id);
    }

    @Then("I verify E-mail Spanish label is displayed")
    public void iVerifyEMailSpanishLabelIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify E-mail Spanish label is displayed");
        asserttextValidationAccessibility(Constant_Spanish_Language.ForgetPassword_forgot_email_label_Spanish_expected, Constant_forgotpassword.ForgetPassword_forgot_email_label_access_id);
    }

    @Then("Email field is required Spanish text Error message is displayed")
    public void emailFieldIsRequiredSpanishTextErrorMessageIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "Email field is required Spanish text Error message is displayed");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(signup_obj.Signup_invalidemail_message_access_id);
        if(elementsByAccessibilityId.size()!=0){
            asserttextValidationAccessibility(Constant_Spanish_Language.Signup_invalidemail_Spanish_message_expected,signup_obj.Signup_invalidemail_message_access_id);
        }
    }

    @Then("Doesn't match Spanish text Error message is displayed")
    public void doesnTMatchSpanishTextErrorMessageIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "Doesn't match Spanish text Error message is displayed");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(signup_obj.Signup_showVerifyPasswordError_access_id);
        if(elementsByAccessibilityId.size()!=0){
            asserttextValidationAccessibility(Constant_Spanish_Language.Signup_showVerifyPasswordError_Spanish_Doesnt_match,signup_obj.Signup_showVerifyPasswordError_access_id);
        }
    }

    @Then("The verify password field is required Spanish text Error message is displayed")
    public void theVerifyPasswordFieldIsRequiredSpanishTextErrorMessageIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "The verify password field is required Spanish text Error message is displayed");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(signup_obj.Signup_showVerifyPasswordError_access_id);
        if(elementsByAccessibilityId.size()!=0){
            asserttextValidationAccessibility(Constant_Spanish_Language.Signup_showVerifyPasswordError_Spanish_expected,signup_obj.Signup_showVerifyPasswordError_access_id);
        }
    }

    @Then("The email must be a valid email address Spanish text Error message is displayed")
    public void theEmailMustBeAValidEmailAddressSpanishTextErrorMessageIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "The email must be a valid email address Spanish text Error message is displayed");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(signup_obj.Signup_invalidemail_message_access_id);
        if(elementsByAccessibilityId.size()!=0){
            asserttextValidationAccessibility(Constant_Spanish_Language.Signup_invalidemail_German_message_email_must_be_a_valid_email_address,signup_obj.Signup_invalidemail_message_access_id);
        }
    }

    @Then("The password doesn't satisfy the conditions Spanish text Error message is displayed")
    public void thePasswordDoesnTSatisfyTheConditionsSpanishTextErrorMessageIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "The password doesn't satisfy the conditions Spanish text Error message is displayed");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(signup_obj.Signup_invalidSecurePwd_message_access_id);
        if(elementsByAccessibilityId.size()!=0){
            asserttextValidationAccessibility(Constant_Spanish_Language.Signup_The_password_doesnt_satisify_the_conditions_Spanish_expected,signup_obj.Signup_invalidSecurePwd_message_access_id);
        }
    }

    @Then("The password field is required Spanish text Error message is displayed")
    public void thePasswordFieldIsRequiredSpanishTextErrorMessageIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "The password field is required Spanish text Error message is displayed");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(signup_obj.Signup_invalidSecurePwd_message_access_id);
        if(elementsByAccessibilityId.size()!=0){
            asserttextValidationAccessibility(Constant_Spanish_Language.Signup_invalidSecurePwd_Spanish_message_expected,signup_obj.Signup_invalidSecurePwd_message_access_id);
        }
    }

    @Then("The Email field is required Spanish Error message is displayed in login page")
    public void theEmailFieldIsRequiredSpanishErrorMessageIsDisplayedInLoginPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "The Email field is required Spanish Error message is displayed in login page");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(login_obj.Login_invalidEmail_message_access_id);
        if(elementsByAccessibilityId.size()!=0){
            asserttextValidationAccessibility(Constant_Spanish_Language.Login_invalidEmail_Spanish_message_expected,login_obj.Login_invalidEmail_message_access_id);
        }
    }

    @Then("The Password field is required Spanish Error message is displayed in login page")
    public void thePasswordFieldIsRequiredSpanishErrorMessageIsDisplayedInLoginPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "The Password field is required Spanish Error message is displayed in login page");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(login_obj.Login_invalidsecurePwd_message_access_id);
        if(elementsByAccessibilityId.size()!=0){
            asserttextValidationAccessibility(Constant_Spanish_Language.Login_invalidsecurePwd_Spanish_message_expected,login_obj.Login_invalidsecurePwd_message_access_id);
        }
    }

    @Then("Spanish Error message is displayed")
    public void spanishErrorMessageIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "Spanish Error message is displayed");
        List<AndroidElement> errorMessage = driver.findElements(By.xpath("//*[@text='Invalid Login']"));
        if(errorMessage.size()!=0){
            Assert.assertTrue(iselementdisplayed(Constant_login.Login_error_text_xpath));
        }
    }

    @Then("The password must be at least {int} characters. Spanish Error message is displayed in login page")
    public void thePasswordMustBeAtLeastCharactersSpanishErrorMessageIsDisplayedInLoginPage(int arg0) throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "The password must be at least 5 characters. Spanish Error message is displayed in login page");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(login_obj.Login_invalidsecurePwd_message_access_id);
        if(elementsByAccessibilityId.size()!=0){
            asserttextValidationAccessibility(Constant_Spanish_Language.Login_invalidsecurePwd_Spanish_message_The_password_must_be_at_least_5_characters,login_obj.Login_invalidsecurePwd_message_access_id);
        }
    }

    @Then("I verify Welcome! Text\\(Spanish) is displayed in login screen")
    public void iVerifyWelcomeTextSpanishIsDisplayedInLoginScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Welcome! Text is displayed in login screen");
        asserttextValidationAccessibility(Constant_Spanish_Language.Login_welcome_Spanish_text_expected, Constant_login.Login_welcome_text_access_id);
    }

    @Then("I verify Log In Text\\(Spanish) is displayed in login screen")
    public void iVerifyLogInTextSpanishIsDisplayedInLoginScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Log In Text is displayed in login screen");
        asserttextValidationAccessibility(Constant_Spanish_Language.Login_login_Spanishtext_expected,Constant_login.Login_login_text_access_id);
    }

    @Then("I verify Don't have an account? text\\(Spanish) is displayed in login page")
    public void iVerifyDonTHaveAnAccountTextSpanishIsDisplayedInLoginPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Don't have an account? text is displayed in login page");
        asserttextValidationAccessibility(Constant_Spanish_Language.Login_Dont_have_an_account_Spanish_text_expected,Constant_login.Login_Dont_have_an_account_access_id);
    }

    @Then("I verify the Climatización in Landing page")
    public void iVerifyTheClimatizaciónInLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Climatización in Landing page");
        asserttextValidation(Constant_Spanish_Language.LandingPage_ClimateTile_Climate_Spanish_Text, Constant_Spanish_Language.LandingPage_ClimateTile_Climate_Spanish_Text_xpath);
    }

    @Then("I Verify the ¡Temperatura fuera de rango! on climate tile in Landing page")
    public void iVerifyTheTemperaturaFueraDeRangoOnClimateTileInLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the ¡Temperatura fuera de rango! on climate tile in Landing page");
        asserttextValidation(Constant_Spanish_Language.LandingPage_Climate_Alert_Spanish_Text, Constant_Spanish_Language.LandingPage_Climate_Alert_Spanish_Text_xpath);
    }

    @Then("I verify the Alimentación text in Landing page")
    public void iVerifyTheAlimentaciónTextInLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Alimentación text in Landing page");
        asserttextValidation(Constant_Spanish_Language.LandingPage_PowerTile_Spanish_Text,Constant_Spanish_Language.LandingPage_PowerTile_Spanish_Text_xpath);
    }

    @Then("I Verify the Batería de la casa text in Landing page")
    public void iVerifyTheBateríaDeLaCasaTextInLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Batería de la casa text in Landing page");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Spanish_Language.LandingPage_PowerTile_HouseBattery_Spanish_Text_xpath));
        if(elements.size()!=0){
            asserttextValidation(Constant_Spanish_Language.LandingPage_PowerTile_HouseBattery_Spanish_Text,Constant_Spanish_Language.LandingPage_PowerTile_HouseBattery_Spanish_Text_xpath);
        }
    }

    @Then("I verify the Luz text in Landing page")
    public void iVerifyTheLuzTextInLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Luz text in Landing page");
        asserttextValidation(Constant_Spanish_Language.LandingPage_LightTile_Spanish_Text,Constant_Spanish_Language.LandingPage_LightTile_Spanish_Text_xpath);
    }

    @Then("I verify the Actualmente encendido text in Landing page")
    public void iVerifyTheActualmenteEncendidoTextInLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Actualmente encendido text in Landing page");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Spanish_Language.LandingPage_LightTile_CurrentlyON_Spanish_Text_xpath));
        if(elements.size()!=0){
            asserttextValidation(Constant_Spanish_Language.LandingPage_LightTile_CurrentlyON_Spanish_Text,Constant_Spanish_Language.LandingPage_LightTile_CurrentlyON_Spanish_Text_xpath);
        }
    }

    @Then("I Verify the AGS text in Landing page")
    public void iVerifyTheAGSTextInLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the AGS text in Landing page");
        asserttextValidation(Constant_landingscreen.Landingpage_Bottomlayout_AGS_Text,Constant_landingscreen.LandingPage_L2AGS_text_xpath);
    }

    @Then("I Verify the Cargador automático text in Landing page")
    public void iVerifyTheCargadorAutomáticoTextInLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Cargador automático text in Landing page");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Spanish_Language.LandingPage_AGSTile_Autocharger_Spanish_Text_xpath));
        if(elements.size()!=0){
            asserttextValidation(Constant_Spanish_Language.LandingPage_AGSTile_Autocharger_Spanish_Text,Constant_Spanish_Language.LandingPage_AGSTile_Autocharger_Spanish_Text_xpath);
        }
    }

    @Then("I verify the ENCENDER text in Landing page")
    public void iVerifyTheENCENDERTextInLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the ENCENDER text in Landing page");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Spanish_Language.LandingPage_AGSTile_ON_Spanish_Text_xpath));
        if(elements.size()!=0){
            asserttextValidation(Constant_Spanish_Language.LandingPage_AGSTile_ON_Spanish_Text,Constant_Spanish_Language.LandingPage_AGSTile_ON_Spanish_Text_xpath);
        }
    }

    @Then("I verify the Fusibles text in Landing page")
    public void iVerifyTheFusiblesTextInLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Fusibles text in Landing page");
        asserttextValidation(Constant_Spanish_Language.LandingPage_FUSeTile_Spanish_Text,Constant_Spanish_Language.LandingPage_FuseTile_Spanish_Text_xpath);
    }

    @Then("I Verify the Todo bien text in Landing page")
    public void iVerifyTheTodoBienTextInLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Todo bien text in Landing page");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Spanish_Language.LandingPage_FuseTile_AllOK_Spanish_Text_xpath));
        if(elements.size()!=0){
            asserttextValidation(Constant_Spanish_Language.LandingPage_FUSeTile_AllOK_Spanish_Text,Constant_Spanish_Language.LandingPage_FuseTile_AllOK_Spanish_Text_xpath);
        }
    }

    @Then("I verify the Mecánica text in Landing page")
    public void iVerifyTheMecánicaTextInLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Mecánica text in Landing page");
        asserttextValidation(Constant_Spanish_Language.LandingPage_MechanicalTile_Spanish_Text,Constant_Spanish_Language.LandingPage_mechanicalTile_Spanish_Text_xpath);
    }

    @Then("I verify the Toldo Text in the Landing Page")
    public void iVerifyTheToldoTextInTheLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Toldo Text in the Landing Page");
        asserttextValidation(Constant_Spanish_Language.LandingPage_mechanicalTile_Toldo_Spanish_Text,Constant_Spanish_Language.LandingPage_mechanicalTile_Toldo_Spanish_Text_xpath);
    }

    @Then("I verify the Depósito text in Landing page")
    public void iVerifyTheDepósitoTextInLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Depósito text in Landing page");
        asserttextValidation(Constant_Spanish_Language.LandingPage_TankTile_Spanish_Text,Constant_Spanish_Language.LandingPage_TankTile_Spanish_Text_xpath);
    }

    @Then("I verify the Fresh Water\\(Spanish) text in Landing page")
    public void iVerifyTheFreshWaterSpanishTextInLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Fresh Water(Spanish) text in Landing page");
        asserttextValidation(Constant_Spanish_Language.LandingPage_TankTile_FreshWater_Spanish_Text,Constant_Spanish_Language.LandingPage_TankTile_FreshWater_Spanish_Text_xpath);
    }

    @Then("I verify the Agua negra text in Landing page")
    public void iVerifyTheAguaNegraTextInLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Agua negra text in Landing page");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Spanish_Language.LandingPage_TankTile_BlackWater_Spanish_Text_xpath));
        if(elements.size()!=0){
            asserttextValidation(Constant_Spanish_Language.LandingPage_TankTile_BlackWater_Spanish_Text,Constant_Spanish_Language.LandingPage_TankTile_BlackWater_Spanish_Text_xpath);
        }
    }

    @Then("I verify the Calentador de agua text in Landing page")
    public void iVerifyTheCalentadorDeAguaTextInLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Calentador de agua text in Landing page");
        asserttextValidation(Constant_Spanish_Language.LandingPage_WaterHeater_Spanish_Text,Constant_Spanish_Language.LandingPage_WaterHeater_Spanish_Text_xpath);
    }

    @Then("I verify the Todas text in Landing page")
    public void iVerifyTheTodasTextInLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Todas text in Landing page");
        asserttextValidation(Constant_Spanish_Language.Landing_BottomLayout_ALL_spanish_text,Constant_Spanish_Language.Landing_BottomLayout_ALL_spanish_text_xpath);
    }

    @Then("I verify the Dispositivos text in Landing page")
    public void iVerifyTheDispositivosTextInLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Dispositivos text in Landing page");
        asserttextValidation(Constant_Spanish_Language.Landing_BottomLayout_Device_spanish_text,Constant_Spanish_Language.Landing_BottomLayout_Device_spanish_text_xpath);
    }

    @Then("I verify the Tanques text in Landing page")
    public void iVerifyTheTanquesTextInLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Tanques text in Landing page");
        asserttextValidation(Constant_Spanish_Language.Landing_BottomLayout_Tank_spanish_text,Constant_Spanish_Language.Landing_BottomLayout_Tank_spanish_text_xpath);
    }

    @Then("I Verify the ¡Cargar batería! text in Landing page")
    public void iVerifyTheCargarBateríaTextInLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the ¡Cargar batería! text in Landing page");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Spanish_Language.LandingPage_PowerTile_chargeBattery_Spanish_Text_xpath));
        if(elements.size()!=0){
            asserttextValidation(Constant_Spanish_Language.LandingPage_PowerTile_chargeBattery_Spanish_Text,Constant_Spanish_Language.LandingPage_PowerTile_chargeBattery_Spanish_Text_xpath);
        }
    }

    @Then("I scroll up the screen in Landing page")
    public void iScrollUpTheScreenInLandingPage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll up the screen in Landing page");
        Basestepdefinition.verticalSwipe(0.8,0.3,0.5);
    }

    @Then("I scroll down the screen in Landing page")
    public void iScrollDownTheScreenInLandingPage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll down the screen in Landing page");
        Basestepdefinition.verticalSwipe(0.3,0.8,0.5);
    }

    @Then("I verify the Climate header Spanish text displayed in Climate page")
    public void iVerifyTheClimateHeaderSpanishTextDisplayedInClimatePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Climate header Spanish text displayed in Climate page");
        asserttextValidationAccessibility(Constant_Spanish_Language.Climate_header_spanish_text,Constant_Spanish_Language.Climate_header_spanish_text_access_id);
    }

    @Then("I Verify inside Spanish text displayed")
    public void iVerifyInsideSpanishTextDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify inside Spanish text displayed");
        asserttextValidationAccessibility(Constant_Spanish_Language.Climate_inside_spanish_text,Constant_Spanish_Language.Climate_inside_spanish_text_access_id);
    }

    @Then("I Verify outside Spanish text displayed")
    public void iVerifyOutsideSpanishTextDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify outside Spanish text displayed");
        asserttextValidationAccessibility(Constant_Spanish_Language.Climate_outside_spanish_text,Constant_Spanish_Language.Climate_outside_spanish_text_access_id);
    }

    @Then("I verify All Climate Spanish text displayed")
    public void iVerifyAllClimateSpanishTextDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify All Climate Spanish text displayed");
        asserttextValidationAccessibility(Constant_Spanish_Language.Climate_AllClimate_spanish_text,Constant_Spanish_Language.Climate_AllClimate_spanish_text_access_id);
    }

    @Then("I Verify Climate toggle is displayed in Climate page")
    public void iVerifyClimateToggleIsDisplayedInClimatePage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Climate toggle is displayed in Climate page");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_Spanish_Language.Climate_AllClimate_toggle_spanish_text_access_id));
    }

    @Then("I Tap on the Alimentación in Landing screen")
    public void iTapOnTheAlimentaciónInLandingScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on the Alimentación in Landing screen");
        Taponbutton(Constant_Spanish_Language.LandingPage_PowerTile_Spanish_Text_xpath);
    }

    @Then("I Verify the power main screen header Spanish text")
    public void iVerifyThePowerMainScreenHeaderSpanishText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the power main screen header Spanish text");
        asserttextValidationAccessibility(Constant_Spanish_Language.Powerpage_power_text_expected_Spanish,Constant_Spanish_Language.Powerpage_power_text_access_id);
    }

    @Then("I Verify the House Battery Text Spanish text")
    public void iVerifyTheHouseBatteryTextSpanishText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the House Battery Text Spanish text");
        asserttextValidationAccessibility(Constant_Spanish_Language.Powerpage_houseBattery_expected,Constant_Spanish_Language.Powerpage_houseBattery_text_access_id);
    }

    @Then("I Verify the Inverter Text Spanish text")
    public void iVerifyTheInverterTextSpanishText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Inverter Text Spanish text");
        asserttextValidationAccessibility(Constant_Spanish_Language.L2_Inverter,Constant_Spanish_Language.L2_Inverter_access_id);
    }

    @Then("I Verify the Operating Mode Text Spanish text")
    public void iVerifyTheOperatingModeTextSpanishText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Operating Mode Text Spanish text");
        asserttextValidationAccessibility(Constant_Spanish_Language.L2_OperatingMode,Constant_Spanish_Language.L2_OperatingMode_access_id);
    }

    @Then("I Verify the House Battery Voltage Text Spanish text")
    public void iVerifyTheHouseBatteryVoltageTextSpanishText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the House Battery Voltage Text Spanish text");
        asserttextValidationAccessibility(Constant_Spanish_Language.L2_HouseBatteryVoltage,Constant_Spanish_Language.L2_HouseBatteryVoltage_access_id);
    }

    @Then("I Verify the Load Wattage Text Spanish text")
    public void iVerifyTheLoadWattageTextSpanishText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Load Wattage Text Spanish text");
        asserttextValidationAccessibility(Constant_Spanish_Language.L2_LoadWattage,Constant_Spanish_Language.L2_LoadWattage_access_id);
    }

    @Then("I Verify the Chassis Battery Voltage Text Spanish text")
    public void iVerifyTheChassisBatteryVoltageTextSpanishText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Chassis Battery Voltage Text Spanish text");
        asserttextValidationAccessibility(Constant_Spanish_Language.L2_ChassisBatteryVoltage,Constant_Spanish_Language.L2_ChassisBatteryVoltage_access_id);
    }

    @Then("I Verify the Generator Text Spanish text")
    public void iVerifyTheGeneratorTextSpanishText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Generator Text Spanish text");
        asserttextValidationAccessibility(Constant_Spanish_Language.L2_Generator,Constant_Spanish_Language.L2_Generator_access_id);
    }

    @Then("I Verify the Charger Text Spanish text")
    public void iVerifyTheChargerTextSpanishText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Charger Text Spanish text");
        asserttextValidationAccessibility(Constant_Spanish_Language.L2_Charger,Constant_Spanish_Language.L2_Charger_access_id);
    }

    @Then("I Verify the AGS Spanish text Text in power main screen")
    public void iVerifyTheAGSSpanishTextTextInPowerMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the AGS Spanish text Text in power main screen");
        asserttextValidationAccessibility(Constant_Spanish_Language.L2_AGS,Constant_Spanish_Language.L2_AGS_access_id);
    }

    @Then("I Verify the Predictive data Spanish text in power main screen")
    public void iVerifyThePredictiveDataSpanishTextInPowerMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Predictive data Spanish text in power main screen");
        asserttextValidationAccessibility(Constant_Spanish_Language.L2_PredictiveData,Constant_Spanish_Language.L2_PredictiveData_access_id);
    }

    @Then("I Verify control Spanish text in Generator main screen")
    public void iVerifyControlSpanishTextInGeneratorMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify control Spanish text in Generator main screen");
        asserttextValidationAccessibility(Constant_Spanish_Language.L2_Control_Generator,Constant_Spanish_Language.L2_Control_Generator_access_id);
    }

    @Then("I Verify the  status Spanish text in Generator main screen")
    public void iVerifyTheStatusSpanishTextInGeneratorMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the  status Spanish text in Generator main screen");
        asserttextValidationAccessibility(Constant_Spanish_Language.L2_Status_Generator,Constant_Spanish_Language.L2_Status_Generator_access_id);
    }

    @Then("I verify the Run time Spanish text in Generator main screen")
    public void iVerifyTheRunTimeSpanishTextInGeneratorMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Run time Spanish text in Generator main screen");
        asserttextValidationAccessibility(Constant_Spanish_Language.L2_RunTime_Generator,Constant_Spanish_Language.L2_RunTime_Generator_access_id);
    }

    @Then("I verify the charger state Spanish text in  charger main screen")
    public void iVerifyTheChargerStateSpanishTextInChargerMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the charger state Spanish text in  charger main screen");
        asserttextValidationAccessibility(Constant_Spanish_Language.L2_Charger_state,Constant_Spanish_Language.L2_Charger_state_access_id);
    }

    @Then("I verify the AC Input Current Spanish text in charger main screen")
    public void iVerifyTheACInputCurrentSpanishTextInChargerMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the AC Input Current Spanish text in charger main screen");
        asserttextValidationAccessibility(Constant_Spanish_Language.L2_AC_Input_current,Constant_Spanish_Language.L2_AC_Input_current_access_id);
    }

    @Then("I verify the AC Load Current Spanish text in charger main screen")
    public void iVerifyTheACLoadCurrentSpanishTextInChargerMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the AC Load Current Spanish text in charger main screen");
        asserttextValidationAccessibility(Constant_Spanish_Language.L2_AC_Load_current,Constant_Spanish_Language.L2_AC_Load_current_access_id);
    }

    @Then("I verify the charger current Spanish text in charger main screen")
    public void iVerifyTheChargerCurrentSpanishTextInChargerMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the charger current Spanish text in charger main screen");
        asserttextValidationAccessibility(Constant_Spanish_Language.L2_Charger_current,Constant_Spanish_Language.L2_Charger_current_access_id);
    }

    @Then("I verify clear AGS Spanish text in power AGS main screen")
    public void iVerifyClearAGSSpanishTextInPowerAGSMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify clear AGS Spanish text in power AGS main screen");
        asserttextValidationAccessibility(Constant_Spanish_Language.L2_clear_AGS,Constant_Spanish_Language.L2_clear_AGS_access_id);
    }

    @Then("I verify status Spanish text in power AGs main screen")
    public void iVerifyStatusSpanishTextInPowerAGsMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify status Spanish text in power AGs main screen");
        asserttextValidationAccessibility(Constant_Spanish_Language.L2_status_AGS,Constant_Spanish_Language.L2_status_AGS_access_id);
    }

    @Then("I verify the Cargador automático in the AGS main screen")
    public void iVerifyTheCargadorAutomáticoInTheAGSMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Cargador automático in the AGS main screen");
        asserttextValidationAccessibility(Constant_Spanish_Language.AutoChargerText_Spanish_Text,Constant_Spanish_Language.AutoChargerText_Spanish_Text_accessid);
    }

    @Then("I verify the Inicio del tiempo de silencio in the AGS main screen")
    public void iVerifyTheInicioDelTiempoDeSilencioInTheAGSMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Inicio del tiempo de silencio in the AGS main screen");
        asserttextValidationAccessibility(Constant_Spanish_Language.AutoChargerText_QuiteTimeStart_Spanish_Text,Constant_Spanish_Language.AutoChargerText_QuiteTimeStart_Spanish_Text_accessid);
    }

    @Then("I verify the Fin del tiempo de silencio in the AGS main screen")
    public void iVerifyTheFinDelTiempoDeSilencioInTheAGSMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Fin del tiempo de silencio in the AGS main screen");
        asserttextValidationAccessibility(Constant_Spanish_Language.AutoChargerText_QuiteTimeEnds_Spanish_Text,Constant_Spanish_Language.AutoChargerText_QuiteTimeEnds_Spanish_Text_accessid);
    }

    @Then("I verify the Tensión de inicio in the AGS main screen")
    public void iVerifyTheTensiónDeInicioInTheAGSMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Tensión de inicio in the AGS main screen");
        asserttextValidationAccessibility(Constant_Spanish_Language.AutoChargerText_StartVoltage_Spanish_Text,Constant_Spanish_Language.AutoChargerText_StartVoltage_Spanish_Text_accessid);
    }

    @Then("I verify the Tiempo de espera in the AGS main screen")
    public void iVerifyTheTiempoDeEsperaInTheAGSMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Tiempo de espera in the AGS main screen");
        asserttextValidationAccessibility(Constant_Spanish_Language.AutoChargerText_Time_Under_Spanish_Text,Constant_Spanish_Language.AutoChargerText_Time_Under_Spanish_Text_accessid);
    }

    @Then("I verify the Funcionamiento preventivo del generador in the AGS main screen")
    public void iVerifyTheFuncionamientoPreventivoDelGeneradorInTheAGSMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Funcionamiento preventivo del generador in the AGS main screen");
        asserttextValidationAccessibility(Constant_Spanish_Language.AutoChargerText_GeneratorExerciser_Spanish_Text,Constant_Spanish_Language.AutoChargerText_GeneratorExerciser_Spanish_Text_accessid);
    }

    @Then("I verify the Días seleccionados in the AGS main screen")
    public void iVerifyTheDíasSeleccionadosInTheAGSMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Días seleccionados in the AGS main screen");
        asserttextValidationAccessibility(Constant_Spanish_Language.AutoChargerText_SelectedDays_Spanish_Text,Constant_Spanish_Language.AutoChargerText_SelectedDays_Spanish_Text_accessid);
    }

    @Then("I verify the Hora de inicio in the AGS main screen")
    public void iVerifyTheHoraDeInicioInTheAGSMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Hora de inicio in the AGS main screen");
        asserttextValidationAccessibility(Constant_Spanish_Language.AutoChargerText_StartTime_Spanish_Text,Constant_Spanish_Language.AutoChargerText_StartTime_Spanish_Text_accessid);
    }

    @Then("I verify the Tiempo de funcionamiento in the AGS main screen")
    public void iVerifyTheTiempoDeFuncionamientoInTheAGSMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Tiempo de funcionamiento in the AGS main screen");
        asserttextValidationAccessibility(Constant_Spanish_Language.AutoChargerText_Runtime_Spanish_Text,Constant_Spanish_Language.AutoChargerText_Runtime_Spanish_Text_accessid);
    }

    @Then("I verify the Climatización con AGS in the AGS main screen")
    public void iVerifyTheClimatizaciónConAGSInTheAGSMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Climatización con AGS in the AGS main screen");
        asserttextValidationAccessibility(Constant_Spanish_Language.AutoChargerText_AGSClimate_Spanish_Text,Constant_Spanish_Language.AutoChargerText_AGSClimate_Spanish_Text_accessid);
    }

    @Then("I verify the Inicio del tiempo de silencio Header text in main screen")
    public void iVerifyTheInicioDelTiempoDeSilencioHeaderTextInMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Inicio del tiempo de silencio Header text in main screen");
        asserttextValidationAccessibility(Constant_Spanish_Language.AutoChargerText_QuiteTimeStart_Mainscreen_Spanish_Text,Constant_Spanish_Language.AutoChargerText_QuiteTimeStart_Mainscreen_Spanish_Text_accessid);
    }

    @Then("I Verify the Apply button in the Inicio del tiempo de silencio main screen")
    public void iVerifyTheApplyButtonInTheInicioDelTiempoDeSilencioMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Apply button in the Inicio del tiempo de silencio main screen");
        asserttextValidationAccessibility(Constant_Spanish_Language.AutoChargerText_QuiteTimeStart_Mainscreen_ApplyButton_Spanish_Text,Constant_Spanish_Language.AutoChargerText_QuiteTimeStart_Mainscreen_ApplyButton_Spanish_Text_accessid);
    }

    @Then("I verify the Fin del tiempo de silencio Header text in main screen")
    public void iVerifyTheFinDelTiempoDeSilencioHeaderTextInMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Fin del tiempo de silencio Header text in main screen");
        asserttextValidationAccessibility(Constant_Spanish_Language.AutoChargerText_QuiteTimeEnds_Mainscreen_Spanish_Text,Constant_Spanish_Language.AutoChargerText_QuiteTimeEnds_Mainscreen_Spanish_Text_accessid);
    }

    @Then("I Verify the Apply button in the Fin del tiempo de silencio main screen")
    public void iVerifyTheApplyButtonInTheFinDelTiempoDeSilencioMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Apply button in the Fin del tiempo de silencio main screen");
        asserttextValidationAccessibility(Constant_Spanish_Language.AutoChargerText_QuiteTimeEnds_Mainscreen_ApplyButton_Spanish_Text,Constant_Spanish_Language.AutoChargerText_QuiteTimeEnds_Mainscreen_ApplyButton_Spanish_Text_accessid);
    }

    @Then("I verify the Tensión de inicio Header text in main screen")
    public void iVerifyTheTensiónDeInicioHeaderTextInMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Tensión de inicio Header text in main screen");
        asserttextValidationAccessibility(Constant_Spanish_Language.AutoChargerText_StartVoltage_Mainscreen_Spanish_Text,Constant_Spanish_Language.AutoChargerText_StartVoltage_Mainscreen_Spanish_Text_accessid);
    }

    @Then("I Verify the Apply button in the Tensión de inicio main screen")
    public void iVerifyTheApplyButtonInTheTensiónDeInicioMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Apply button in the Tensión de inicio main screen");
        asserttextValidationAccessibility(Constant_Spanish_Language.AutoChargerText_startVoltage_Mainscreen_ApplyButton_Spanish_Text,Constant_Spanish_Language.AutoChargerText_startVoltage_Mainscreen_ApplyButton_Spanish_Text_accessid);
    }

    @Then("I verify the Tiempo de espera Header text in main screen")
    public void iVerifyTheTiempoDeEsperaHeaderTextInMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Tiempo de espera Header text in main screen");
        asserttextValidationAccessibility(Constant_Spanish_Language.AutoChargerText_TimeUnder_Mainscreen_Spanish_Text,Constant_Spanish_Language.AutoChargerText_TimeUnder_Mainscreen_Spanish_Text_accessid);
    }

    @Then("I Verify the Apply button in the Tiempo de espera main screen")
    public void iVerifyTheApplyButtonInTheTiempoDeEsperaMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Apply button in the Tiempo de espera main screen");
        asserttextValidationAccessibility(Constant_Spanish_Language.AutoChargerText_TimeUnder_Mainscreen_ApplyButton_Spanish_Text,Constant_Spanish_Language.AutoChargerText_TimeUnder_Mainscreen_ApplyButton_Spanish_Text_accessid);
    }

    @Then("I verify the Hora de inicio Header text in main screen")
    public void iVerifyTheHoraDeInicioHeaderTextInMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Hora de inicio Header text in main screen");
        asserttextValidationAccessibility(Constant_Spanish_Language.AutoChargerText_StartTime_Mainscreen_Spanish_Text,Constant_Spanish_Language.AutoChargerText_StartTime_Mainscreen_Spanish_Text_accessid);
    }

    @Then("I Verify the Apply button in the Hora de inicio main screen")
    public void iVerifyTheApplyButtonInTheHoraDeInicioMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Apply button in the Hora de inicio main screen");
        asserttextValidationAccessibility(Constant_Spanish_Language.AutoChargerText_StartTime_Mainscreen_ApplyButton_Spanish_Text,Constant_Spanish_Language.AutoChargerText_StartTime_Mainscreen_ApplyButton_Spanish_Text_accessid);
    }

    @Then("I verify the Tiempo de funcionamiento Header text in main screen")
    public void iVerifyTheTiempoDeFuncionamientoHeaderTextInMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Tiempo de funcionamiento Header text in main screen");
        asserttextValidationAccessibility(Constant_Spanish_Language.AutoChargerText_Runtime_Mainscreen_Spanish_Text,Constant_Spanish_Language. AutoChargerText_Runtime_Mainscreen_Spanish_Text_accessid);
    }

    @Then("I Verify the Apply button in the Tiempo de funcionamiento main screen")
    public void iVerifyTheApplyButtonInTheTiempoDeFuncionamientoMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Apply button in the Tiempo de funcionamiento main screen");
        asserttextValidationAccessibility(Constant_Spanish_Language.AutoChargerText_Runtimee_Mainscreen_ApplyButton_Spanish_Text,Constant_Spanish_Language.AutoChargerText_Runtimee_Mainscreen_ApplyButton_Spanish_Text_accessid);
    }

    @Then("I Scroll up the page")
    public void iScrollUpThePage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll up the page");
        Basestepdefinition.verticalSwipe(0.8,0.2,0.5);
    }

    @Then("I Scroll down the page")
    public void iScrollDownThePage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Scroll down the page");
        Basestepdefinition.verticalSwipe(0.2,0.8,0.5);
    }

    @Then("I Tap on Inicio del tiempo de silencio")
    public void iTapOnInicioDelTiempoDeSilencio() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Inicio del tiempo de silencio");
        WebDriverWait wait = new WebDriverWait(driver, 200);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_AGS.AGSPage_QuietTimeStart_xpath)));
        TaponbuttonaccessabilityID(Constant_AGS.AGSPage_Quiet_Time_Start_text_access_id);
    }

    @Then("I Tap on Fin del tiempo de silencio")
    public void iTapOnFinDelTiempoDeSilencio() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Fin del tiempo de silencio");
        TaponbuttonaccessabilityID(Constant_AGS.AGSPage_Quiet_Time_Ends_text_access_id);
    }

    @Then("I Tap on Tensión de inicio")
    public void iTapOnTensiónDeInicio() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Tensión de inicio");
        TaponbuttonaccessabilityID(Constant_AGS.AGSPage_Start_Voltage_text_access_id);

    }

    @Then("I Tap on Tiempo de espera")
    public void iTapOnTiempoDeEspera() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Tiempo de espera");
        TaponbuttonaccessabilityID(Constant_AGS.AGSPage_Time_Under_text_access_id);
    }

    @Then("I Tap on Hora de inicio")
    public void iTapOnHoraDeInicio() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Hora de inicio");
        TaponbuttonaccessabilityID(Constant_AGS.AGSPage_Start_Time_text_access_id);
    }

    @Then("I Tap on Tiempo de funcionamiento")
    public void iTapOnTiempoDeFuncionamiento() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Tiempo de funcionamiento");
        TaponbuttonaccessabilityID(Constant_AGS.AGSPage_Run_Time_text_access_id);
    }

    @Then("I Tap on Fusibles in Landing Screen")
    public void iTapOnFusiblesInLandingScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Fusibles in Landing Screen");
        Taponbutton(Constant_Spanish_Language.Fuse_tile_spanish_text_xpath);
    }

    @Then("I verify water pump Spanish text in Fuse")
    public void iVerifyWaterPumpSpanishTextInFuse() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify water pump Spanish text in Fuse");
        asserttextValidationAccessibility(Constant_Spanish_Language.Fusescreen_Water_Pump, Constant_Fuses.Fusescreen_Water_Pump_text_access_id);
    }

    @Then("I verify Satellite Dish Spanish text in Fuse")
    public void iVerifySatelliteDishSpanishTextInFuse() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Satellite Dish Spanish text in Fuse");
        asserttextValidationAccessibility(Constant_Spanish_Language.Fusescreen_Satellite_Dish, Constant_Fuses.Fusescreen_Satellite_Dish_text_access_id);
    }

    @Then("I verify Accent light Spanish text in Fuse")
    public void iVerifyAccentLightSpanishTextInFuse() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Accent light Spanish text in Fuse");
        asserttextValidationAccessibility(Constant_Spanish_Language.Fusescreen_Accent_Light, Constant_Fuses.Fusescreen_Accent_Light_text_access_id);
    }

    @Then("I verify Ceiling Light Spanish text in Fuse")
    public void iVerifyCeilingLightSpanishTextInFuse() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Ceiling Light Spanish text in Fuse");
        asserttextValidationAccessibility(Constant_Spanish_Language.Fusescreen_Ceiling_Light, Constant_Fuses.Fusescreen_Ceiling_Light_text_access_id);
    }

    @Then("I verify Bed light Spanish text in Fuse")
    public void iVerifyBedLightSpanishTextInFuse() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Bed light Spanish text in Fuse");
        asserttextValidationAccessibility(Constant_Spanish_Language.Fusescreen_Bed_Light, Constant_Fuses.Fusescreen_Bed_Light_text_access_id);
    }

    @Then("I verify washroom light Spanish text in Fuse")
    public void iVerifyWashroomLightSpanishTextInFuse() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify washroom light Spanish text in Fuse");
        asserttextValidationAccessibility(Constant_Spanish_Language.Fusescreen_Washroom_Light, Constant_Fuses.Fusescreen_Washroom_Light_text_access_id);
    }

    @Then("I verify Galley Spanish text in Fuse")
    public void iVerifyGalleySpanishTextInFuse() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Galley Spanish text in Fuse");
        asserttextValidationAccessibility(Constant_Spanish_Language.Fusescreen_Galley_Light, Constant_Fuses.Fusescreen_Galley_Light_text_access_id);
    }

    @Then("I verify Lounge light Spanish text in Fuse")
    public void iVerifyLoungeLightSpanishTextInFuse() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Lounge light Spanish text in Fuse");
        asserttextValidationAccessibility(Constant_Spanish_Language.Fusescreen_Lounge_Light, Constant_Fuses.Fusescreen_Lounge_Light_text_access_id);
    }

    @Then("I verify Awning Spanish text in Fuse")
    public void iVerifyAwningSpanishTextInFuse() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Awning Spanish text in Fuse");
        asserttextValidationAccessibility(Constant_Spanish_Language.Fusescreen_Awning_text, Constant_Fuses.Fusescreen_Awning_text_access_id);
    }

    @Then("I Tap on Mecánica in Landing screen")
    public void iTapOnMecánicaInLandingScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Mecánica in Landing screen");
//        Basestepdefinition.verticalSwipe(0.7,0.3,0.5);
        Taponbutton(Constant_Spanish_Language.LandingPage_L2Mechanical_text_xpath);
    }

    @Then("I verify Controller Spanish text in Mechanical screen")
    public void iVerifyControllerSpanishTextInMechanicalScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Controller Spanish text in Mechanical screen");
        WebDriverWait wait=new WebDriverWait(driver,300);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_Mechanical.Mechanicalscreen_Controller_text_xpath)));
        asserttextValidation(Constant_Spanish_Language.Mechaical_Controller_Spanish_Text,Constant_Mechanical.Mechanicalscreen_Controller_text_xpath);
    }

    @And("I verify Open button Spanish text in Mechanical screen")
    public void iVerifyOpenButtonSpanishTextInMechanicalScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Open button Spanish text in Mechanical screen");
//        System.out.println(Constant_Mechanical.Mechanicalscreen_Open_button_text);
//        System.out.println(driver.findElement(By.xpath(Constant_Mechanical.Mechanicalscreen_Open_button_xpath)).getText());
        asserttextValidation(Constant_Spanish_Language.Mechaical_Open_Spanish_Text,Constant_Mechanical.Mechanicalscreen_Open_button_xpath);

    }

    @And("I verify Close button Spanish text in Mechanical screen")
    public void iVerifyCloseButtonSpanishTextInMechanicalScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Close button Spanish text in Mechanical screen");
        asserttextValidation(Constant_Spanish_Language.Mechaical_Close_Spanish_Text,Constant_Mechanical.Mechanicalscreen_Close_button_xpath);
    }

    @Then("I Tap on Depósito Fresh Water in Landing screen")
    public void iTapOnDepósitoFreshWaterInLandingScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Depósito Fresh Water in Landing screen");
        Basestepdefinition.verticalSwipe(0.7, 0.3, 0.5);
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Spanish_Language.LandingPage_L2Tank_Fresh_Water_Spanish_text_xpath));
        if(elements.size()==0){
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(500, 1800)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(1000, 1800));
            action.release().perform();
        }
        Taponbutton(Constant_Spanish_Language.LandingPage_L2Tank_Fresh_Water_Spanish_text_xpath);
    }

    @Then("I verify the NIVEL DE AGUA DULCE in the Fresh tank main screen")
    public void iVerifyTheNIVELDEAGUADULCEInTheFreshTankMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the NIVEL DE AGUA DULCE in the Fresh tank main screen");
        asserttextValidation(Constant_Spanish_Language.FreshWater_Tank_FreshWaterLevel_text,Constant_Spanish_Language.FreshWater_Tank_FreshWaterLevel_text_xpath);
    }

    @Then("I verify the Bomba de agua in the Fresh tank main screen")
    public void iVerifyTheBombaDeAguaInTheFreshTankMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Bomba de agua in the Fresh tank main screen");
        asserttextValidation(Constant_Spanish_Language.FreshWater_Tank_WaterPump_text,Constant_Spanish_Language.FreshWater_Tank_WaterPump_text_xpath);
    }

    @Then("I verify the Agua dulce in the Fresh tank main screen")
    public void iVerifyTheAguaDulceInTheFreshTankMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Agua dulce in the Fresh tank main screen");
        asserttextValidation(Constant_Spanish_Language.FreshWater_Tank_Fresh_text,Constant_Spanish_Language.FreshWater_Tank_Fresh_text_xpath);
    }

    @Then("I verify the Negra in the Fresh tank main screen")
    public void iVerifyTheNegraInTheFreshTankMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Negra in the Fresh tank main screen");
        asserttextValidation(Constant_Spanish_Language.FreshWater_Tank_Black_text,Constant_Spanish_Language.FreshWater_Tank_Black_text_xpath);
    }

    @Then("I verify the Análisis predictivo in the Fresh tank main screen")
    public void iVerifyTheAnálisisPredictivoInTheFreshTankMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Análisis predictivo in the Fresh tank main screen");
        asserttextValidation(Constant_Spanish_Language.FreshWater_Tank_Predictive_Analysis_text,Constant_Spanish_Language.FreshWater_Tank_Predictive_Analysis_text_xpath);
    }

    @Then("I Tap on Depósito Agua negra in Landing screen")
    public void iTapOnDepósitoAguaNegraInLandingScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Depósito Agua negra in Landing screen");
        Taponbutton(Constant_Spanish_Language.LandingPage_L2Tank_Black_Spanish_text_xpath);
    }

    @Then("I verify the NIVEL DE AGUA NEGRA in the Black tank main screen")
    public void iVerifyTheNIVELDEAGUANEGRAInTheBlackTankMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the NIVEL DE AGUA NEGRA in the Black tank main screen");
        asserttextValidation(Constant_Spanish_Language.BlackWater_Tank_BlackWaterLevel_text,Constant_Spanish_Language.BlackWater_Tank_BlackWaterLevel_text_xpath);
    }

    @Then("I verify the Bomba de agua in the Black tank main screen")
    public void iVerifyTheBombaDeAguaInTheBlackTankMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Bomba de agua in the Black tank main screen");
        asserttextValidation(Constant_Spanish_Language.BlackWater_Tank_WaterPump_text,Constant_Spanish_Language.BlackWater_Tank_WaterPump_text_xpath);
    }

    @Then("I verify the Agua dulce in the Black tank main screen")
    public void iVerifyTheAguaDulceInTheBlackTankMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Agua dulce in the Black tank main screen");
        asserttextValidation(Constant_Spanish_Language.BlackWater_Tank_Fresh_text,Constant_Spanish_Language.BlackWater_Tank_Fresh_text_xpath);
    }

    @Then("I verify the Negra in the Black tank main screen")
    public void iVerifyTheNegraInTheBlackTankMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Negra in the Black tank main screen");
        asserttextValidation(Constant_Spanish_Language.BlackWater_Tank_Black_text,Constant_Spanish_Language.BlackWater_Tank_Black_text_xpath);
    }

    @Then("I verify the Análisis predictivo in the Black tank main screen")
    public void iVerifyTheAnálisisPredictivoInTheBlackTankMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Análisis predictivo in the Black tank main screen");
        asserttextValidation(Constant_Spanish_Language.BlackWater_Tank_Predictive_Analysis_text,Constant_Spanish_Language.BlackWater_Tank_Predictive_Analysis_text_xpath);
    }

    @Then("I Tap on Calentador de agua")
    public void iTapOnCalentadorDeAgua() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Calentador de agua");
        Taponbutton(Constant_Spanish_Language.WaterHeater_Tank_Calentador_de_agua_text);
    }

    @Then("I Verify the Modo text in the Water Truma main screen")
    public void iVerifyTheModoTextInTheWaterTrumaMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Modo text in the Water Truma main screen");
        asserttextValidationAccessibility(Constant_Spanish_Language.WaterHeater_Tank_Mode_Spanish_text,Constant_Spanish_Language.WaterHeater_Tank_Mode_Spanish_text_accessid);
    }

    @Then("I Verify the MODO DE CAMBIO text in the Water Truma main screen")
    public void iVerifyTheMODODECAMBIOTextInTheWaterTrumaMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the MODO DE CAMBIO text in the Water Truma main screen");
        asserttextValidationAccessibility(Constant_Spanish_Language.WaterHeater_Tank_ChangeMode_Spanish_text,Constant_Spanish_Language.WaterHeater_Tank_ChangeMode_Spanish_text_access_id);
    }

    @Then("I verify the Aplicar in apply button")
    public void iVerifyTheAplicarInApplyButton() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Aplicar in apply button");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Spanish_Language.WaterHeater_Tank_ApplyButton_Spanish_text_xpath));
        if(elements.size()!=0){
            asserttextValidation(Constant_Spanish_Language.WaterHeater_Tank_ApplyButton_Spanish_text,Constant_Spanish_Language.WaterHeater_Tank_ApplyButton_Spanish_text_xpath);
        }
    }

    @Then("I verify Ver Opciones spanish text is displayed")
    public void iVerifyVerOpcionesSpanishTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Ver Opciones spanish text is displayed");
        asserttextValidationAccessibility(Constant_Spanish_Language.viewOption_Spanish_text,Constant_Spanish_Language.viewOption_text_access_id);
    }

    @Then("I verify Vista de cuadrícula spanish text is displayed")
    public void iVerifyVistaDeCuadrículaSpanishTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Vista de cuadrícula spanish text is displayed");
        asserttextValidationAccessibility(Constant_Spanish_Language.tileView_text,Constant_Spanish_Language.tileView_access_id);
    }

    @Then("I verify Vista de lista spanish text is displayed")
    public void iVerifyVistaDeListaSpanishTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Vista de lista spanish text is displayed");
        asserttextValidationAccessibility(Constant_Spanish_Language.listView_text,Constant_Spanish_Language.listView_access_id);
    }

    @Then("I verify Display spanish text is displayed")
    public void iVerifyDisplaySpanishTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Display spanish text is displayed");
        asserttextValidationAccessibility(Constant_Spanish_Language.Display_text,Constant_Spanish_Language.Display_access_id);
    }

    @Then("I verify All Devices spanish text is displayed")
    public void iVerifyAllDevicesSpanishTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify All Devices spanish text is displayed");
        asserttextValidationAccessibility(Constant_Spanish_Language.AllDevices_text,Constant_Spanish_Language.AllDevices_access_id);
    }

    @Then("I verify Connected Devices spanish text is displayed")
    public void iVerifyConnectedDevicesSpanishTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Connected Devices spanish text is displayed");
        asserttextValidationAccessibility(Constant_Spanish_Language.ConnectedDevices_text,Constant_Spanish_Language.ConnectedDevices_access_id);
    }

    @Then("I verify Non Connected Devices spanish text is displayed")
    public void iVerifyNonConnectedDevicesSpanishTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Non Connected Devices spanish text is displayed");
        asserttextValidationAccessibility(Constant_Spanish_Language.NonConnectedDevices_text,Constant_Spanish_Language.NonConnectedDevices_access_id);
    }

    @Then("I Tap on Vista de cuadrícula")
    public void iTapOnVistaDeCuadrícula() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Vista de cuadrícula");
        TaponbuttonaccessabilityID(Constant_Spanish_Language.tileView_access_id);
    }

    @Then("I Tap on Vista de lista")
    public void iTapOnVistaDeLista() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Vista de lista");
        TaponbuttonaccessabilityID(Constant_Spanish_Language.listView_access_id);
    }

    @Then("I Tap on an Login button\\(Spanish) in Login Page")
    public void iTapOnAnLoginButtonSpanishInLoginPage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on an Login button(Spanish) in Login Page");
        TaponbuttonaccessabilityID(login_obj.loginbutton);
        List<AndroidElement> elements = driver.findElements(By.xpath(com.dometic.L1.qa.Pages.Constant_OnboardingPage.Onboarding_allow_access_popup_xpath));
        if(elements.size()!=0){
            WebDriverWait wait=new WebDriverWait(driver,300);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(com.dometic.L1.qa.Pages.Constant_OnboardingPage.Onboarding_only_this_time_xpath)));
            Taponbutton(com.dometic.L1.qa.Pages.Constant_OnboardingPage.Onboarding_only_this_time_xpath);
        }
    }

    @Then("I Verify BATTERIES header Spanish text")
    public void iVerifyBATTERIESHeaderSpanishText() throws Throwable {
        asserttextValidationAccessibility(Constant_Spanish_Language.BATTERIES_header_text,Constant_Spanish_Language.BATTERIES_header_text_access_id);
    }

    @Then("I verify the Engine{int} Spanish text")
    public void iVerifyTheEngineSpanishText(int arg0) throws Throwable {
        asserttextValidation(Constant_Spanish_Language.powerScreen_batteryCarousel_circle_Engine1_text,Constant_Spanish_Language.powerScreen_batteryCarousel_circle_Engine1_text_xpath);
    }

    @Then("I verify the STBD Spanish text")
    public void iVerifyTheSTBDSpanishText() throws Throwable {
        asserttextValidation(Constant_Spanish_Language.powerScreen_batteryCarousel_circle_STBD_text,Constant_Spanish_Language.powerScreen_batteryCarousel_circle_STBD_text_xpath);
    }

    @Then("I verify the House Spanish text")
    public void iVerifyTheHouseSpanishText() throws Throwable {
        asserttextValidation(Constant_Spanish_Language.powerScreen_batteryCarousel_circle_House_text,Constant_Spanish_Language.powerScreen_batteryCarousel_circle_House_text_xpath);
    }

    @Then("I verify the Measured voltage Spanish text")
    public void iVerifyTheMeasuredVoltageSpanishText() throws Throwable {
        asserttextValidationAccessibility(Constant_Spanish_Language.powerScreen_Measured_Voltage_text,Constant_Spanish_Language.powerScreen_Measured_Voltage_access_id);
    }

    @Then("I verify the Status Spanish text")
    public void iVerifyTheStatusSpanishText() throws Throwable {
        asserttextValidationAccessibility(Constant_Spanish_Language.powerScreen_status_text,Constant_Spanish_Language.powerScreen_status_access_id);
    }

    @Then("I verify the UsageAnalysis Spanish text")
    public void iVerifyTheUsageAnalysisSpanishText() throws Throwable {
        asserttextValidationAccessibility(Constant_Spanish_Language.powerScreen_usage_text,Constant_Spanish_Language.powerScreen_usage_access_id);
    }

    @Then("I verify the Alert Spanish text")
    public void iVerifyTheAlertSpanishText() throws Throwable {
        asserttextValidationAccessibility(Constant_Spanish_Language.powerScreen_alert_text,Constant_Spanish_Language.powerScreen_alert_access_id);
    }

    @Then("I verify the Notify Me Spanish text")
    public void iVerifyTheNotifyMeSpanishText() throws Throwable {
        asserttextValidationAccessibility(Constant_Spanish_Language.powerScreen_notify_text,Constant_Spanish_Language.powerScreen_notify_access_id);
    }

    @Then("I verify the Battery voltage Spanish text")
    public void iVerifyTheBatteryVoltageSpanishText() throws Throwable {
        asserttextValidationAccessibility(Constant_Spanish_Language.powerScreen_batteryVoltage_text,Constant_Spanish_Language.powerScreen_batteryVoltage_textButton_access_id);
    }
}

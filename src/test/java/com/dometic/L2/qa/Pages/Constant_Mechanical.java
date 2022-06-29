package com.dometic.L2.qa.Pages;

public class Constant_Mechanical {
    // -------------------------Accesibility_Id---------------//

    public static final String Mechanicalscreen_Awning_text_access_id="com.dometicapp:id/awning-awningText";
    public static final String Mechanicalscreen_Extent_text_access_id="com.dometicapp:id/awning-extendText";
    public static final String Mechanicalscreen_minusButton_access_id="com.dometicapp:id/awning-minusButton";
    public static final String Mechanicalscreen_pluseButton_access_id="com.dometicapp:id/awning-pluseButton";


    //-------------------Needed Accessibility Id-----------------//
    public static final String Mechanicalscreen_Mechanical_text_access_id="";

    //   --------------------xPath--------------//
    public static final String Mechanicalscreen_Mechanical_text_xpath="//*[@text='MECHANICAL']";
    public static final String Mechanicalscreen_Controller_text_xpath="//*[@text='Controller']";
    public static final String Mechanicalscreen_Open_button_xpath="(//*[@content-desc='com.dometicapp:id/awning-extendText']//following::android.widget.TextView)[1]";
    public static final String Mechanicalscreen_Close_button_xpath="(//*[@content-desc='com.dometicapp:id/awning-extendText']//following::android.widget.TextView)[2]";
    public static final String Mechanicalscreen_Awning_text_xpath="//android.widget.TextView[@content-desc=\"com.dometicapp:id/awning-awningText\"]";
    public static final String Mechanicalscreen_Extent_text_xpath="//android.widget.TextView[@content-desc=\"com.dometicapp:id/awning-extendText\"]";
    public static final String Mechanicalscreen_minusButton_xpath="//android.view.ViewGroup[@content-desc=\"com.dometicapp:id/awning-minusButton\"]";
    public static final String Mechanicalscreen_pluseButton_xpath="//android.view.ViewGroup[@content-desc=\"com.dometicapp:id/awning-pluseButton\"]";
    public static final String Mechanicalscreen_confirmation_popup_xpath="//*[@resource-id='android:id/topPanel']";
    public static final String Mechanicalscreen_confirmation_popup_Cancel_button_xpath="//*[@resource-id='android:id/button2']";
    public static final String Mechanicalscreen_confirmation_popup_Ok_button_xpath="//*[@resource-id='android:id/button1']";


    //   --------------------Data--------------//
    public static final String Mechanical_Text="MECHANICAL";
    public static final String Mechanical_Awning_Text="Awning";
    public static final String Mechanical_Extend_Text="Extent";
    public static final String Mechanicalscreen_Controller_text="Controller";
    public static final String Mechanicalscreen_Open_button_text="OPEN";
    public static final String Mechanicalscreen_Close_button_text="CLOSE";
}

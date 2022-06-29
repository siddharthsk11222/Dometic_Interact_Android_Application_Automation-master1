package com.dometic.SDB.qa.Pages;

public class Constant_Tank {
    // -------------------------Accesibility_Id---------------//
    public static final String Tanksscreen_Tanks_text_access_id="com.dometicapp:id/setting-selectedLanguage";
    public static final String Tanksscreen_Tanks_Water_Pump_text_access_id="com.dometicapp:id/Tank-waterPump-cardTitle";
    public static final String Tanksscreen_Tanks_waterPump_switchText_access_id="com.dometicapp:id/Tank-waterPump-switchText";
    public static final String Tanksscreen_Tanks_waterPump_switchComponent_access_id="com.dometicapp:id/Tank-waterPump-switchComponent";
    public static final String Tanksscreen_Tanks_freshWater_access_id="com.dometicapp:id/Buttons-buttonsList-freshWater";
    public static final String Tanksscreen_Tanks_blackWater_access_id="com.dometicapp:id/Buttons-buttonsList-blackWater";
    public static final String Tanksscreen_BlackwaterTanks_EmptyBlackwater_access_id="com.dometicapp:id/Tank-blackWaterEmpty";
    public static final String Truma_Decalcification_text_access_id="com.dometicapp:id/trumaWaterHeater-waterHeaterStatusValue";
    public static final String Truma_Mode_text_access_id="com.dometicapp:id/trumaWaterHeater-modeText";
    public static final String Truma_CHANGE_MODE_text_access_id="com.dometicapp:id/trumaWaterHeater-carouselHeader";
    public static final String Tanksscreen_Fresh_progressIndicator_access_id="com.dometicapp:id/Tank-progressIndicator";
    public static final String Tanksscreen_Black_progressIndicator="com.dometicapp:id/Tank-progressIndicator";
    public static final String Truma_Mode_Value_access_id="com.dometicapp:id/trumaWaterHeater-modeValue";

    //-------------------Needed Accessibility Id-----------------//
    public static final String Tanksscreen_Tanks_GUI__access_id="";
    public static final String Tanksscreen_Tanks_Fresh_Water_Level_access_id="";
    public static final String Tanksscreen_Tanks_Predictive_Data_text_access_id="";
    public static final String Tanksscreen_Tanks_predictiveAnalytics_access_id="";

    //   --------------------xPath--------------//
    public static final String Tanksscreen_Tanks_text_xpath="//android.widget.TextView[@content-desc=\"com.dometicapp:id/setting-selectedLanguage\"]";
    public static final String Tanksscreen_Tanks_GUI_xpath="//*[@content-desc='com.dometicapp:id/setting-selectedLanguage']//following::android.view.ViewGroup[1]";
    public static final String Tanksscreen_Tanks_Fresh_Water_Level_xpath="//*[@text='FRESH WATER LEVEL']";
    public static final String Tanksscreen_Tanks_Water_Pump_text_xpath="//android.widget.TextView[@content-desc=\"com.dometicapp:id/Tank-waterPump-cardTitle\"]";
    public static final String Tanksscreen_Tanks_waterPump_switchText_xpath="//android.widget.TextView[@content-desc=\"com.dometicapp:id/Tank-waterPump-switchText\"]";
    public static final String Tanksscreen_Tanks_waterPump_switchComponent_xpath="//android.view.ViewGroup[@content-desc=\"com.dometicapp:id/Tank-waterPump-switchComponent\"]";
    public static final String Tanksscreen_Tanks_freshWater_xpath="//android.view.ViewGroup[@content-desc=\"com.dometicapp:id/Buttons-buttonsList-freshWater\"]";
    public static final String Tanksscreen_Tanks_blackWater_xpath="//android.view.ViewGroup[@content-desc=\"com.dometicapp:id/Buttons-buttonsList-blackWater\"]";
    public static final String Tanksscreen_Tanks_Predictive_Data_text_xpath="//*[@text='Predictive Data']";
    public static final String Tanksscreen_Tanks_predictiveAnalytics_xpath="//android.view.ViewGroup[@content-desc=\"com.dometicapp:id/Tank-predictiveAnalytics\"]/android.view.ViewGroup";
    public static final String Tanksscreen_Tanks_blackWaterLevel_text_xpath="//*[@text='BLACK WATER LEVEL']";
    public static final String Tanksscreen_Tanks_emptyBlackWaterLevel_text_xpath="//*[@text='Empty Black Water Tank']";
    public static final String TrumaHeater_status_xpath="(//*[@content-desc='com.dometicapp:id/trumaWaterHeater-waterHeaterStatusText'])[1]";
    public static final String TrumaHeater_Heater_xpath="//*[@text='WATER HEATER']";
    public static final String Tanksscreen_Fresh_xpath="//*[@text='Fresh']";
    public static final String Tanksscreen_Fresh_water_Level_Percentage_xpath="((//*[@class='android.widget.HorizontalScrollView'])[7]//following::android.widget.TextView)[1]";
    public static final String Tanksscreen_Black_water_Level_Percentage_xpath="(//*[@content-desc='mainContentView'])[7]";
    public static final String Tanksscreen_Black_xpath="//*[@text='Black']";
    public static final String WaterTruma_Antifreeze_status_button_xpath ="//*[@text='Anti-Freeze']";
    public static final String WaterTruma_Tile_Main_content_status_xpath="(//*[@content-desc='com.dometicapp:id/tile-mainCardText'])[5]";
    public static final String TrumaHeater_Tile_textxpath="//*[@text='Water Heater']";
    public static final String WaterTruma_Applybutton_xpath="//*[@text='Apply']";
    public static final String WaterTruma_FirstValue_xpath="(//*[@content-desc='com.dometicapp:id/trumaWaterHeater-VerticalCarouselItem'])[1]";
    public static final String WaterTruma_SecondValue_xpath="(//*[@content-desc='com.dometicapp:id/trumaWaterHeater-VerticalCarouselItem'])[2]";
    public static final String WaterTruma_ThirdValue_xpath="(//*[@content-desc='com.dometicapp:id/trumaWaterHeater-VerticalCarouselItem'])[3]";

    public static final String TrumaHeater_Heater_text="WATER HEATER";
    public static final String TrumaHeater_status_text="Status";
    public static final String Truma_Decalcification_text="Decalcification";
    public static final String Tank_freshwater_leveltext="FRESH WATER LEVEL";
    public static final String Tank_freshwater_waterPump="Water Pump";
    public static final String Tank_freshwater_button_fresh="Fresh";
    public static final String Tank_freshwater_black_button="Black";
    public static final String Tank_freshwater_PredictiveData="Predictive Data";
    public static final String Tanksscreen_BlackwaterTanks_BlackwaterLevel_text="BLACK WATER LEVEL";
    public static final String Tanksscreen_BlackwaterTanks_EmptyBlackwater_text="Empty Black Water Tank";
    public static final String Truma_Mode_text="Mode";
    public static final String Truma_CHANGE_MODE="CHANGE MODE";
    public static final String Truma_Light_text="Light";
    public static final String Truma_AGS_MODE="AGS";
    public static final String Truma_Power_text="Power";
    public static final String Truma_Fuses_MODE="Fuses";
    public static final String Truma_Bilge_Pump="Bilge Pump";

    //   --------------------Version 103 xPath--------------//
    public static final String MTC_Tank_Fuel_xpath="//*[@text='Fuel']";
    public static final String MTC_Tank_Oil_xpath="//*[@text='Oil']";
    public static final String MTC_Tank_Fresh_xpath="//*[@text='Fresh']";
    public static final String MTC_Tank_Grey_xpath="//*[@text='Grey']";
    public static final String MTC_Tank_Black_xpath="//*[@text='Fuel']";
    public static final String MTC_Tank_Live_xpath="//*[@text='Live']";
    public static final String MTC_Tank_Bait_xpath="//*[@text='Bait']";
    public static final String FUEL_LEVEL_text_xpath="//*[@text='FUEL LEVEL']";
    public static final String FUEL_LEVEL="FUEL LEVEL";
    public static final String OIL_LEVEL_text_xpath="//*[@text='OIL LEVEL']";
    public static final String oil_LEVEL_text="OIL LEVEL";
    public static final String Live_LEVEL_text_xpath="//*[@text='LIVE WELL LEVEL']";
    public static final String Live_LEVEL_text="LIVE WELL LEVEL";
    public static final String Bait_LEVEL_text_xpath="//*[@text='BAIT WELL LEVEL']";
    public static final String Bait_LEVEL_text="BAIT WELL LEVEL";
}

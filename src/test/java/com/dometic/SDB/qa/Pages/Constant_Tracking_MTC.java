package com.dometic.SDB.qa.Pages;

public class Constant_Tracking_MTC {
    // ---------------------Accesibility_Id-----------------------//
    public static final String mtc_Tracking_Title_Access_ID="com.dometicapp:id/header-TitleText";
    public static final String mtc_Tracking_Boat_Location_Access_ID="com.dometicapp:id/tracking-location-cardTitle";
    public static final String mtc_Tracking_latitude_Access_ID="com.dometicapp:id/tracking-latitude-cardTitle";
    public static final String mtc_Tracking_longitude_Access_ID="com.dometicapp:id/tracking-longitude-cardTitle";
    public static final String mtc_Tracking_geofencing_cardTitle_Access_ID="com.dometicapp:id/tracking-geofencing-cardTitle";
    public static final String mtc_Tracking_Toggle_Status_Access_ID="com.dometicapp:id/tracking-geofencing-switchStateText";
    public static final String mtc_Tracking_Toggle_Access_ID="com.dometicapp:id/tracking-geofencing-switchComponent";
    public static final String mtc_Tracking_Radius_cardTitle_Access_ID="com.dometicapp:id/tracking-geofencingRadius-cardTitle";
    public static final String mtc_Tracking_Radius_cardSubText_Access_ID="com.dometicapp:id/tracking-geofencingRadius-cardSubText";
    public static final String mtc_Tracking_Radius_expandIcon_Access_ID="com.dometicapp:id/tracking-geofencingRadius-expandIcon";
    public static final String mtc_Tracking_Alert_Latency_cardTitle_Access_ID="com.dometicapp:id/tracking-geofencingLatency-cardTitle";
    public static final String mtc_Tracking_Alert_Latency_expandIcon_Access_ID="com.dometicapp:id/tracking-geofencingLatency-expandIcon";
    public static final String mtc_Tracking_Alert_Latency_cardSubText_Access_ID="com.dometicapp:id/tracking-geofencingLatency-cardSubText";
    public static final String mtc_Tracking_Radius_Apply_Button_Access_ID="com.dometicapp:id/tracking-geofencingRadius-flatbutton";
    public static final String mtc_Tracking_Alert_Latency_Apply_Button_Access_ID="com.dometicapp:id/tracking-geofencingLatency-flatbutton";

    //---------------------------xPath----------------------------//
    public static final String mtc_Tracking_Tile_Xpath="//*[@text='Tracking']";
    public static final String mtc_Tracking_Radius_First_Value_Xpath="(//*[@content-desc='com.dometicapp:id/tracking-geofencingRadius-carousalValue']//following::android.widget.TextView)[1]";
    public static final String mtc_Tracking_Radius_Second_Value_Xpath="(//*[@content-desc='com.dometicapp:id/tracking-geofencingRadius-carousalValue']//following::android.widget.TextView)[3]";
    public static final String mtc_Tracking_Radius_Third_Value_Xpath="(//*[@content-desc='com.dometicapp:id/tracking-geofencingRadius-carousalValue']//following::android.widget.TextView)[5]";
    public static final String mtc_Tracking_Alert_Latency_First_Value_Xpath="(//*[@content-desc='com.dometicapp:id/tracking-geofencingLatency-carousalValue']//following::android.widget.TextView)[1]";
    public static final String mtc_Tracking_Alert_Latency_Second_Value_Xpath="(//*[@content-desc='com.dometicapp:id/tracking-geofencingLatency-carousalValue']//following::android.widget.TextView)[3]";
    public static final String mtc_Tracking_Alert_Latency_Third_Value_Xpath="(//*[@content-desc='com.dometicapp:id/tracking-geofencingLatency-carousalValue']//following::android.widget.TextView)[5]";

    //---------------------------Data----------------------------//
    public static final String mtc_Tracking="TRACKING";
    public static final String mtc_Tracking_Boat_Location="Boat Location";
    public static final String mtc_Tracking_latitude="Latitude";
    public static final String mtc_Tracking_longitude="Longitude";
    public static final String mtc_Tracking_geofencing_cardTitle="Geo Fencing";
    public static final String mtc_Tracking_Radius_cardTitle="Radius from center";
    public static final String mtc_Tracking_Alert_Latency_cardTitle="Alert Latency";
}

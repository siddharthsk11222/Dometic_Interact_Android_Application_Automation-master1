package com.dometic.Apollo.stepdefinition;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.dometic.SDB.qa.util.Baseclass;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//import org.testobject.appium.junit.TestObjectAppiumSuiteWatcher;


public class Hooks extends Baseclass {
    //    public Baseclass base=new Baseclass();
    private Baseclass base;
    public static String featureName_report = "";
    public static String scenarioName;
    AndroidDriver<AndroidElement> Android_driver;
    AppiumDriver appium;
    String destDir;
    DateFormat dateFormat;
    //public TestObjectAppiumSuiteWatcher resultWatcher = new TestObjectAppiumSuiteWatcher();
    Properties prop;

    public Properties loadProperties() throws IOException {
        prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources_Apollo/globalData.properties");
        prop.load(fis);
        return prop;
    }

    public AndroidDriver<AndroidElement> Android() throws IOException, InterruptedException {
//        System.out.print(PortNumber);
        loadProperties();
        DesiredCapabilities cap = new DesiredCapabilities();
        String platformName = prop.getProperty("platformName");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
        String deviceName = prop.getProperty("deviceName_MTC");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
        String deviceVersion = prop.getProperty("deviceVersion_MTC");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, deviceVersion);
        String appPackage = prop.getProperty("appPackage_MTC");
        cap.setCapability("appPackage", appPackage);
        String appActivity = prop.getProperty("appActivity_MTC");
        cap.setCapability("appActivity", appActivity);
        cap.setCapability("app", System.getProperty("user.dir") + "/src/test/java/com/dometic/Apollo/application/InteractAppBuild-177(1.6).apk");
        String fullReset = prop.getProperty("fullReset_MTC");
        cap.setCapability("fullReset", fullReset);
        try {
            Android_driver = new AndroidDriver(new URL("http://127.0.0.1:4725/wd/hub"), cap);
            Android_driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Android_driver;
    }

    public AndroidDriver<AndroidElement> AndroidPortNumber4723() throws IOException, InterruptedException {
        loadProperties();
        DesiredCapabilities cap = new DesiredCapabilities();
//        String automationName = prop.getProperty("automationName");
//        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, automationName);
        String platformName = prop.getProperty("platformName1");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
        String deviceName = prop.getProperty("deviceName1");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
        String deviceVersion = prop.getProperty("deviceVersion1");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, deviceVersion);
        String appPackage = prop.getProperty("appPackage1");
        cap.setCapability("appPackage", appPackage);
        String appActivity = prop.getProperty("appActivity1");
        cap.setCapability("appActivity", appActivity);
        cap.setCapability("app", System.getProperty("user.dir") + "/src/test/java/com/dometic/Apollo/application/Interact-1.4-v85.apk");
        String fullReset = prop.getProperty("fullReset1");
        cap.setCapability("fullReset", fullReset);
        try {
            Android_driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
            Android_driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Android_driver;
    }

//    @Before("@Device1")
//    public void beforeStepDevice1() throws IOException {
//        loadProperties();
//        DesiredCapabilities cap = new DesiredCapabilities();
//        //String automationName = prop.getProperty("automationName");
//        //cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, automationName);
//        String platformName = prop.getProperty("platformName");
//        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
//        String deviceName = prop.getProperty("deviceName");
//        cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
//        String deviceVersion = prop.getProperty("deviceVersion");
//        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, deviceVersion);
//        String appPackage = prop.getProperty("appPackage");
//        cap.setCapability("appPackage", appPackage);
//        String appActivity = prop.getProperty("appActivity");
//        cap.setCapability("appActivity", appActivity);
////        String app = prop.getProperty("app");
//        cap.setCapability("app", System.getProperty("user.dir") + "/src/test/java/com/dometic/L2/application/Interact-1.4-v85.apk");
//        String fullReset = prop.getProperty("fullReset");
//        cap.setCapability("fullReset", fullReset);
//        try {
//            Android_driver=new AndroidDriver(new URL("http://0.0.0.0:5723/wd/hub"),cap);
//            Android_driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//    @Before("@Device2")
//    public void beforeStepDevice2() throws IOException {
//        loadProperties();
//        DesiredCapabilities cap = new DesiredCapabilities();
//        //String automationName = prop.getProperty("automationName");
//        //cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, automationName);
//        String platformName = prop.getProperty("platformName1");
//        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
//        String deviceName = prop.getProperty("deviceName1");
//        cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
//        String deviceVersion = prop.getProperty("deviceVersion1");
//        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, deviceVersion);
//        String appPackage = prop.getProperty("appPackage1");
//        cap.setCapability("appPackage", appPackage);
//        String appActivity = prop.getProperty("appActivity1");
//        cap.setCapability("appActivity", appActivity);
////        String app = prop.getProperty("app");
//        cap.setCapability("app", System.getProperty("user.dir") + "/src/test/java/com/dometic/L2/application/Interact-1.4-v85.apk");
//        String fullReset = prop.getProperty("fullReset1");
//        cap.setCapability("fullReset", fullReset);
//        try {
//            Android_driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
//            Android_driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    @Before
    public void InitializeStep(Scenario scenario) {
        System.out.println("before step");
        ScenarioDef = base.features.createNode(scenario.getName());
    }

//    @Before("@First")
//    public void Init(Scenario scenario) {
//        System.out.println("Scenario Starts");
//
//        System.out.println(scenario.getId());
//        String[] featureName = scenario.getId().split("/");
//        featureName_report = featureName[featureName.length - 1].split(".feature")[0];
//        scenarioName = scenario.getName();
//
//
//        extentTest = extent.createTest(featureName_report);
//        features = extent.createTest(featureName_report);
//
//        //ScenarioDef = base.features.createNode(scenarioName);
//    }
    @Before("@First")
    public void Init(Scenario scenario) {
//        System.out.println("Scenario Starts");
//
//        System.out.println(scenario.getId());
//        String[] featureName = scenario.getId().split("/");
//        featureName_report = featureName[featureName.length - 1].split(".feature")[0];
//        scenarioName = scenario.getName();
//
//
//        extentTest = extent.createTest(featureName_report);
//        features = extent.createTest(featureName_report);

        System.out.println("Scenario Starts");
        System.out.println(scenario.getId());
        String[] featureName = scenario.getId().split("/");
        featureName_report = featureName[featureName.length - 1].split(".feature")[0].split("_")[1];
        scenarioName = scenario.getName();
       extentTest = extent.createTest(featureName_report);
        features = extent.createTest(featureName_report);
//        ScenarioDef = base.features.createNode(scenarioName);
    }


    @After
    public void StatusLogScenario(Scenario scenario) {
        System.out.println(scenario.getStatus().name());
        System.out.println(scenario.getStatus().name());
        if (scenario.getStatus().name() == "PASSED") {
            extentTest.log(Status.PASS, scenario.getName());
        }
        if (scenario.getStatus().name() == "FAILED") {

            extentTest.log(Status.FAIL, scenario.getName());

        }
        if (scenario.getStatus().name() == "SKIPPED") {
            extentTest.log(Status.SKIP, scenario.getName());
        }

    }

//    @Before
//    public void before(){
//        System.out.println("Scenario Starts");
//
//    }

    //    @After
//    public void after(Scenario scenario){
//        extentReport=new ExtentReport();
//        extentReport.generateTestReport(scenario);
//        extentReport.tearDown();
//    }
    public AndroidDriver<AndroidElement> AndroidgetDriver() {
        return Android_driver;
    }

//    public static void extentReport(){
//        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/testReport.html");
//        extent = new ExtentReports();
//        extent.attachReporter(htmlReporter);
//
//    }

}

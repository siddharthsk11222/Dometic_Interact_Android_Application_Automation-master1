package com.dometic.L1_BLE.qa.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.util.Calendar;

public class ExtentReportUtil extends Baseclass{

    String fileName = ReportLocation ;

    public void ExtentReport()

    {
        extent = new ExtentReports();
        System.out.println(Calendar.getInstance().getTimeInMillis());
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName +"ExtentReport_" + Calendar.getInstance().getTimeInMillis()+".html");
        htmlReporter.loadXMLConfig(System.getProperty("user.dir") + "/src/test/resources_L1_BLE/extent-config.xml");
        extent.attachReporter(htmlReporter);
    }

    public void ExtentReportScreenshot() throws Throwable
    {
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File screenFile = new File(System.getProperty("user.dir") + "/target/cucumber-reports/advanced-reports/extentreports/" + screenshot.getName());
        FileUtils.copyFile(screenshot,screenFile);
        System.out.println(screenFile.getName());
        System.out.println(screenshot.getName());
        // ScenarioDef.fail("details").addScreenCaptureFromPath(System.getProperty("user.dir") + "/target/cucumber-reports/advanced-reports/extentreports/" + screenshot.getName());
        ScenarioDef.fail("Failure Screenshot").log(Status.INFO,"Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(screenFile.getAbsolutePath()).build());
    }

    public void FlushReport()
    {
        extent.flush();
    }
}

package com.dometic.Apollo.qa.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Calendar;

public class ExtentReportUtil extends Baseclass {

    String fileName = ReportLocation ;

    public void ExtentReport() throws UnknownHostException {
        extent = new ExtentReports();
        System.out.println(Calendar.getInstance().getTimeInMillis());
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName +"ExtentReport_" + Calendar.getInstance().getTimeInMillis()+".html");
        htmlReporter.loadXMLConfig(System.getProperty("user.dir") + "/src/test/resources_SDB/extent-config.xml");
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("Device Name", "Pixel-3a");
        extent.setSystemInfo("Platform Name", "Android");
        extent.setSystemInfo("Platform Version", "11");
        extent.setSystemInfo("OS Name", System.getProperty("os.name"));
        extent.setSystemInfo("Host Name", InetAddress.getLocalHost().getHostName());
    }

    public void ExtentReportScreenshot() throws Throwable
    {
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File screenFile = new File(System.getProperty("user.dir") + "/target/cucumber-reports/advanced-reports/Extentreport_MTC/" + screenshot.getName());
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

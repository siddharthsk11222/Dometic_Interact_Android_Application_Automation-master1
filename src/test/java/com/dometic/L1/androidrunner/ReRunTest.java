package com.dometic.L1.androidrunner;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.PickleEventWrapper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(
        features="@target/rerun.txt",
        glue={"com.dometic.L1.stepdefinition"},
        tags = {"@sanity"},
        plugin = {"html:target/cucumber-html-report","json:target/cucumber-reports/cucumber.json","junit:target/cucumber-reports/cucumber.xml","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        )

public class ReRunTest extends AbstractTestNGCucumberTests{


}




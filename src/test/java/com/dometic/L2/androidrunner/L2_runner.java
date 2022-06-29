package com.dometic.L2.androidrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.PickleEventWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.*;

@CucumberOptions(
        features = "src/test/java/com/dometic/L2/features/",
        glue = {"com.dometic.L2.stepdefinition"},
        tags = {"@First,@sanity"},
        plugin = {"html:target/cucumber-html-report", "json:target/cucumber-reports/cucumber.json", "junit:target/cucumber-reports/cucumber.xml", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "rerun:target/rerun.txt"}
)

@Listeners({com.dometic.L2.androidrunner.NGTestListener.class})
public class L2_runner  {
//    Hooks Android_driver = new Hooks();
//    @Parameters(value = {"PortNumber"})
//    @BeforeMethod
//    public void beforeClass(String portNumber) throws IOException, InterruptedException {
//        System.out.println(Thread.currentThread().getId());
//        if(portNumber.equalsIgnoreCase("5723")){
//            System.out.println(Thread.currentThread().getId());
//            System.out.println(portNumber);
//            Baseclass.driver = Android_driver.Android();
//        }
//        else if(portNumber.equalsIgnoreCase("4723")){
//            System.out.println(Thread.currentThread().getId());
//            System.out.println(portNumber);
//            Baseclass.driver = Android_driver.AndroidPortNumber4723();
//        }
//    }
    private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception
    {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @Test(dataProvider = "features" )
    public void feature(PickleEventWrapper eventWrapper, CucumberFeatureWrapper cucumberFeature) throws Throwable
    {
        testNGCucumberRunner.runScenario(eventWrapper.getPickleEvent());
    }

    @DataProvider
    public Object[][] features()
    {
        return testNGCucumberRunner.provideScenarios();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception
    {
        testNGCucumberRunner.finish();
    }

}

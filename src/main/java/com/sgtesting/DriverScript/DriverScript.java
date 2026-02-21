package com.sgtesting.DriverScript;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@CucumberOptions(
//        features = "src/test/resources/FeatureFiles",
//        glue = "com.sgtesting.stepdefinations"
//)
//public class DriverScript extends AbstractTestNGCucumberTests {
//}

@CucumberOptions(
        features = "src/test/resources/FeatureFiles",
        glue = "com.sgtesting.stepdefinations",
        plugin = {
                "pretty",                               // console output
                "html:target/cucumber-reports/html",    // HTML report
                "json:target/cucumber-reports/Cucumber.json" // JSON report
        }
)
public class DriverScript extends AbstractTestNGCucumberTests {}

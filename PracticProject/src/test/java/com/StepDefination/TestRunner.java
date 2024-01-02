package com.StepDefination;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFile",glue = "com.StepDefination",monochrome = true,
plugin = { "pretty",
"html:target/OrangeHRMApplicationReports",
"json:target/OrangeHRMApplicationJsonReport.json",
"com.cucumber.listener.ExtentCucumberFormatter:target/OrangeHRMApplicationExtentReports.htm"
})



public class TestRunner {

}

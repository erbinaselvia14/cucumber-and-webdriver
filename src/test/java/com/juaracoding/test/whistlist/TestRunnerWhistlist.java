package com.juaracoding.test.whistlist;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", 
				features = {"src/test/resources/features/03.Whistlist.feature" }, 
				glue = "com.juaracoding.test.whistlist", 
				plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json" })
public class TestRunnerWhistlist extends AbstractTestNGCucumberTests {

}

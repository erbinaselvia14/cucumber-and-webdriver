package com.juaracoding.test.seacrh_test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", 
					features = {"src/test/resources/features/02.SearchProduct.feature" }, 
					glue = "com.juaracoding.test.seacrh_test", 
					plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json" })
public class TestRunnerSearch extends AbstractTestNGCucumberTests {

}
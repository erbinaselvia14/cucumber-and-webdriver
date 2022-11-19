package com.juaracoding.test.polindrome_test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", 
					features = {"src/test/resources/features/01.Palindrome.feature" }, 
					glue = "com.juaracoding.test.polindrome_test", 
					plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json" })
public class TestRunnerPalindrome extends AbstractTestNGCucumberTests {

}

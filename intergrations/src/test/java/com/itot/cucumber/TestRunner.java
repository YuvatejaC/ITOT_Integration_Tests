package com.itot.cucumber;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = {"src/test/resources/features"},
		glue = {"com/itot/cucumber/stepDefinitions"},
		tags = "@SmokeTest or @SmokeUI",
		plugin = {"pretty", "junit:target/automationreport.xml",
							"json:target/automationreport.json",
							"html:target/automationreport.html"}
		)

public class TestRunner {
	
}

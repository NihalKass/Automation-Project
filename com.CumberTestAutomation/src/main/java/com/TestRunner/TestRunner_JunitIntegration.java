package com.TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/Features",//folder name
		  glue = {"src/main/java/com.ApplicationPageStepDef"}, //package name for step def
		  plugin = {"pretty", 												//report generator
				  "html:target/cucumber-Report.html","json:target/report.json"}, //two different format report
		  tags = "@Test"
  )

public class TestRunner_JunitIntegration {

}

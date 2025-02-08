package com.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		  features = "src/main/resources/Features",//folder name
		  glue = {"com.ApplicationPageStepDef"}, //package name for step def
		  plugin = {"pretty", 												//report generator
				  "html:target/cucumber-Report.html","json:target/report.json"}, //two different format report
		  tags = "@Test"									//tags used in feature file
		)

public class TestRunner_testNGIntegreation extends AbstractTestNGCucumberTests{

}

//public class hooks extends AbstractTestNGCucumberTests{
	
//}

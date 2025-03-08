package com.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		  features = "src/main/resources/Features/PracticeApplicationFeatures",//folder name
		  glue = {"com.PracticeApplicationPageStepDef"}, //package name for step def
		  monochrome = true,
		  dryRun = false,
		  plugin = {"pretty", 												//report generator
				  "html:target/cucumber-Report.html","json:target/report.json"}, //two different format report
				  //plugin = {"pretty", 												//report generator
					//	  "html:target/cucumber-Report.html","json:target/report.json"}
		  tags = "@HomePage"									//tags used in feature file
		)

public class TestRunner_testNGIntegreation extends AbstractTestNGCucumberTests{

public void test() {
    }
}





//public class hooks extends AbstractTestNGCucumberTests{
	
//}

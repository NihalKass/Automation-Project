package com.ApplicationPageStepDef;


import com.componets.Utilities;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LaunchURLStepDef{

	Utilities util = new Utilities();
	
	
		@Given("Launch the Browser")
		public void LaunchBrowser() {
			//util.setupLaunch();
		    //throw new io.cucumber.java.PendingException();
		}

		@Then("Validate the launched Url")
		public void validate_url_is_launched() {
		    util.validateUrl();
		   // throw new io.cucumber.java.PendingException();
		}
		
		@And("Close the Browser")
		public void closeBrowser() {
			//launchpage.closeBrowser();
		    //throw new io.cucumber.java.PendingException();
		}
		

}

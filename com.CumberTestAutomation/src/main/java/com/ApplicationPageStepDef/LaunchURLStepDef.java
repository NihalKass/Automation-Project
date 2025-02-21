package com.ApplicationPageStepDef;


import org.openqa.selenium.WebDriver;

import com.components.Utilities;
import com.components.Hooks;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LaunchURLStepDef {
	
	Utilities utils = new Utilities();
	
	Hooks hook = new Hooks();
	
		@Given("Launch the Browser")
		public void LaunchBrowser() {
			utils.Launchsetup();
		}

		@Then("Validate the launched Url")
		public void validate_url_is_launched() {
		    utils.validateUrl();
		   // throw new io.cucumber.java.PendingException();
		}
		
		@And("Close the Browser")
		public void closeBrowser() throws InterruptedException {
			utils.closeBrowser();
		    //throw new io.cucumber.java.PendingException();
		}
		

}

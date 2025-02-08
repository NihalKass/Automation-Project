package com.ApplicationPageStepDef;


import org.openqa.selenium.WebDriver;

import com.components.Utilities;
import com.components.hooks;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LaunchURLStepDef {
	
	 WebDriver driver;

	hooks hook = new hooks();
	Utilities util = new Utilities(driver);
	
	
		@Given("Launch the Browser")
		public void LaunchBrowser() {
			hook.Launchsetup();
		}

		@Then("Validate the launched Url")
		public void validate_url_is_launched() {
		    util.validateUrl();
		   // throw new io.cucumber.java.PendingException();
		}
		
		@And("Close the Browser")
		public void closeBrowser() {
			hook.closeBrowser();
		    //throw new io.cucumber.java.PendingException();
		}
		

}

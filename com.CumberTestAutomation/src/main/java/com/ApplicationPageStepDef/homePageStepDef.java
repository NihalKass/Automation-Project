package com.ApplicationPageStepDef;

import java.io.IOException;

import com.ApplicationPages.homePage;

import io.cucumber.java.en.And;

public class homePageStepDef {

	homePage homepage = new homePage();
	
	@And("verify elements under homepage")
	//(Description = Clicking on Login Button )
	public void verifyElementsUsingMethod() throws IOException, InterruptedException {
		homepage.verifyElemets();
	    //throw new io.cucumber.java.PendingException();
	}
	
	@And("Click on button {string}")
	//(Description = Clicking on Login Button )
	public void verifyElemts(String radioButton1) throws IOException {
		homepage.click(radioButton1);
	    //throw new io.cucumber.java.PendingException();
	}
	
}

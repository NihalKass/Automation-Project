package com.ApplicationPageStepDef;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.ApplicationPages.HomePage;
import com.components.Hooks;
import com.components.Utilities;

import io.cucumber.java.en.And;

public class HomePageStepDef {
	Utilities utils = new Utilities();
	//WebDriver driver = utils.driver;

	HomePage homepage = new HomePage();
	
	@And("verify elements under homepage")
	//(Description = Clicking on Login Button )
	public void verifyElementsUsingMethod() throws IOException, InterruptedException {
		homepage.verifyElements();
	    //throw new io.cucumber.java.PendingException();
	}
	
	@And("Click on button {string}")
	//(Description = Clicking on Login Button )
	public void verifyElemts(String radioButton1) throws IOException, InterruptedException {
		homepage.Elementsclick(radioButton1);
		Thread.sleep(2000);
	    //throw new io.cucumber.java.PendingException();
	}
	
}

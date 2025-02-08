package com.ApplicationPageStepDef;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.ApplicationPages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LoginPageStepDef {
	WebDriver driver;

	LoginPage loginPage = new LoginPage();
	
	@And("Click on Login button")
	//(Description = Clicking on Login Button )
	public void clickOnLoginButton() throws IOException {
		loginPage.Login();
	    //throw new io.cucumber.java.PendingException();
	}
	
	@Then("Enter the {string} and {string}")
	public void enter_the_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

}

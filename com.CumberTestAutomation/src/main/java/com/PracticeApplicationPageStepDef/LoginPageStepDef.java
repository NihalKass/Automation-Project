package com.PracticeApplicationPageStepDef;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.PracticeApplicationPages.LoginPage;
import com.components.Utilities;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginPageStepDef {
	
	Utilities utils = new Utilities();
	WebDriver driver = utils.driver;

	LoginPage loginPage = new LoginPage();
	
	@And("Click on Home button")
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
	
	@Given("Click on {string}")
	public void click_on(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Validate Login page redirected")
	public void validate_login_page_redirected() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Click on {string} button")
	public void click_on_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Click on link {string}")
	public void click_on_link(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Login with {string} and password")
	public void login_with_and_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}

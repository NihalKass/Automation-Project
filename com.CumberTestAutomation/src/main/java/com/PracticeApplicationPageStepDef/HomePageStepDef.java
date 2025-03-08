package com.PracticeApplicationPageStepDef;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.PracticeApplicationPages.HomePage;
import com.components.Hooks;
import com.components.Utilities;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class HomePageStepDef {
	Utilities utils = new Utilities();
	//WebDriver driver = utils.driver;

	HomePage homepage = new HomePage();
	
	@And("Click on button {string}")
	//(Description = Clicking on Login Button )
	public void verifyElemts(String radioButton1) throws IOException, InterruptedException {
		homepage.RadioButtonclick(radioButton1);
		Thread.sleep(2000);
	    //throw new io.cucumber.java.PendingException();
	}
	
	@Then("Validate textbox field {string} and Enter {string}")
	public void validate_textbox_field_and_enter(String textFieldName, String Value) {
		homepage.textBoxNameValWithInputData(textFieldName, Value);
	}
	@Then("Validate dropdown field {string} and select {string}")
	public void validate_dropdown_field_and_select(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Validate checkbox field {string} and select {string}")
	public void validate_checkbox_field_and_select(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Click on {string} to switch window")
	public void click_on_to_switch_window(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Switch Window to original")
	public void switch_window_to_original() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Click on {string} to move to other tab")
	public void click_on_to_move_to_other_tab(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Switch the tab to original")
	public void switch_the_tab_to_original() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Click on {string} button to validate {string}")
	public void click_on_button_to_validate(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Validate All elements in the table1")
	public void validate_all_elements_in_the_table1() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Store all data of the table in the excel sheet")
	public void store_all_data_of_the_table_in_the_excel_sheet() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Validate table2 and verify sum amount matched with total")
	public void validate_table2_and_verify_sum_amount_matched_with_total() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Validate {string} when mouse hover on {string}")
	public void validate_when_mouse_hover_on(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Validate {string} on iFrame")
	public void validate_on_i_frame(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
}

package com.itot.cucumber.stepDefinitions;

import com.itot.cucumber.serenitySteps.ConfigurationUISteps;

import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Steps;

public class ConfigurationUI {
	@Steps
	ConfigurationUISteps configurationSteps;
	
	@Given("Logs into the ITOT Application")
	public void logs_into_the_itot_application() {
	    // Write code here that turns the phrase above into concrete actions
	     
	}
	@Given("Navigates to Configuration page")
	public void navigates_to_configuration_page() {
		configurationSteps.navigateToConfiurationPage();
	     
	}
	@When("Clicks of frequency dropdown")
	public void clicks_of_frequency_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
	     
	}
	@When("Selects the Frequency as {int} minutes")
	public void selects_the_frequency_as_minutes(int freq) {
	    // Write code here that turns the phrase above into concrete actions
	    configurationSteps.selectFrequency(freq);
	}
	@When("Clicks on save button")
	public void clicks_on_save_button() {
	    // Write code here that turns the phrase above into concrete actions
	
	}
	@Then("The Syncronization frequency is validated")
	public void the_syncronization_frequency_is_validated() {
	    // Write code here that turns the phrase above into concrete actions
	}
}

package com.itot.cucumber.serenitySteps;

import static org.junit.Assert.assertEquals;

import com.itot.pages.ConfigurationPage;

import net.serenitybdd.annotations.Step;

public class ConfigurationUISteps {
	
	ConfigurationPage configurationPage;
	
	@Step("Navigate to configuration Page")
	public void navigateToConfiurationPage() {
		configurationPage.clickConfigurationPage();
		assertEquals(configurationPage.getTitle(), "Configuration Settings");
	}
	
	@Step("Select Frequency")
	public void selectFrequency(int freq) {
		configurationPage.selectFrequency(freq);
	}
	
}

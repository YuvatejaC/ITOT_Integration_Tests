package com.itot.pages;

import java.util.List;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class ConfigurationPage extends PageObject {
//This will be a page object model and all the locators will be maintained here.
	@FindBy(xpath = "")
	private WebElementFacade configurationPage;
	
	@FindBy(xpath = "")
	private WebElementFacade configurationPageTitle;
	
	@FindBy(id = "")
	private List<WebElementFacade> frequencyDropdown;
	
	@FindBy(id = "")
	private WebElementFacade saveButton;
	
	public void clickConfigurationPage() {
		configurationPage.click();
	}
	
	public void selectFrequency(int frequency) {
		waitFor(configurationPageTitle);
		//Select the frequency based on the input from feature file
		for (WebElementFacade freqOption : frequencyDropdown){
			if(Integer.parseInt(freqOption.getText()) == frequency) {
				freqOption.click();
			}
		}
	}
}

package com.itot.cucumber.stepDefinitions;

import io.cucumber.java.Before;

public class Hooks {

	@Before("SmokeUI")
	public void initiateBrowsers() {
		System.setProperty("webdriver.chrome.driver","src/testresources/drivers/chromedriver.exe");
	}
}

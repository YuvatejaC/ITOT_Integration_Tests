package com.itot.cucumber.stepDefinitions;

import com.itot.cucumber.serenitySteps.CreateProductSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Steps;


public class ProductAPI {
	@Steps
	CreateProductSteps createProduct;
	
	ValidatableResponse productResponse;
	
	@Given("User Prepares paylaod for adding a product")
	public void user_prepares_paylaod_for_adding_a_product() {
			   
	}
	@When("User makes a POST request on the Products API")
	public void user_makes_a_post_request_on_the_products_api() {
		try {
			productResponse = createProduct.createProduct("AuthTokenString");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	@Then("Status Code should be {int}")
	public void status_code_should_be(Integer statusCode) {
	    
	}
	@Then("Response Message should be {string}")
	public void status_message_should_be(String responseMessage) {
	    // Write code here that turns the phrase above into concrete actions
	}
	
	@Given("Product API is available to create a product")
	public void product_api_is_available_to_create_a_product() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@When("User provides {string}, {string} and {string}")
	public void user_provides_and(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@Then("Status Code should be <StautsCode>")
	public void status_code_should_be_stauts_code() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
}

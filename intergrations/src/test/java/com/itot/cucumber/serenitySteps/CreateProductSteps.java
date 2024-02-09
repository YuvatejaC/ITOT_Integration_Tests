package com.itot.cucumber.serenitySteps;

import static org.junit.Assert.assertEquals;

import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;

public class CreateProductSteps {
	
	private static ValidatableResponse productResponse;
	
	@Step("Create Product")
	public ValidatableResponse createProduct(String authtoken) {
		productResponse = SerenityRest.rest().given()
				.header("ContentType","application/json")
				.header("authToken", authtoken)
				.when()
				.post("/products/create")
				.then();
		return productResponse;
	}
	
	public static void getStatusCode(ValidatableResponse response, int expectedStatusCode) {
		assertEquals(response.extract().statusCode(), expectedStatusCode);
	}
	
	public static void getResponseMessage(ValidatableResponse response, String exprectedResponse) {
		assertEquals(response.extract().path("response_message"), exprectedResponse);
	}
}

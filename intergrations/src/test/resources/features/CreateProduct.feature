Feature: CreateProduct

Background:
	User is authenticated with "Authorization.json"

@SmokeTest @API	
Scenario: User should be able to add a product
	Given User Prepares paylaod for adding a product
	When User makes a POST request on the Products API
	Then Status Code should be 200 
	And Response Message should be "Product Created Successfully"
	
@SmokeTest @API
Scenario Outline: User tries to add a product with invalid product details
	Given Product API is available to create a product
	When User provides "<productName>", "<productId>" and "<productDesc>"
	Then Status Code should be <StautsCode>
	And Response Message should be "<ResponseMessage>"
	#All the test case combinations can be passed in the cucumber data table below
	Examples:
	|Test Description   |productName|productId															|productDesc  			   |StatusCode|ResponseMessage   |
	|Invalid ProductId  |TestProduct|2342h34   							 								|Sample Product Description|400		  |Invalid Product ID|
	|Invalid ProductName|FSD-4      |0f0a4390-b6ac-40a8-8a34-e992e08a8f5c   |Sample Product Description|400		  |Invalid Product Name|
	
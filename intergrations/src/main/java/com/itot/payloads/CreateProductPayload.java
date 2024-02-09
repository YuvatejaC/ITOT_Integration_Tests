package com.itot.payloads;

public class CreateProductPayload {
	private String productName;
	private String productId;
	private String productDesc;
	
	public CreateProductPayload(String productName, String productId, String productDesc) {
		this.productName = productName;
		this.productId = productId;
		this.productDesc = productDesc;
	}
	
	public CreateProductPayload() {
		
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getProductName() {
		return this.productName;
	}
	
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	public String getProductId() {
		return this.productId;
	}
	
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	
	public String getProductDesc() {
		return this.productDesc;
	}
}

package com.mocking;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Record {
	 
	@Test
	public void recordThroughWiremock() {
		
		RestAssured.baseURI="http://localhost/api/now/table";
		//RestAssured.authentication=RestAssured.basic("admin", "d-J+lC2Hk7Aj");
		RequestSpecification inputRequest=RestAssured.given()
				.queryParam("sysparam_fields", "sys_id","urgency","short_description","number");
		Response response=inputRequest.get("/incident");
		response.prettyPrint();
	}

}

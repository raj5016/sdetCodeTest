package com.mocking;

import org.testng.annotations.Test;

import com.github.tomakehurst.wiremock.client.WireMock;

public class CreateStup {
	
	@Test
	public void StubForCreateInident() {
		WireMock.stubFor(WireMock.post("")
				.willReturn(WireMock.aResponse()
				.withStatus(201)
				.withBody("{\r\n" + 
						"    \"short_description\" :\"My short_description\",\r\n" + 
						"    \"description\"       :\"My description\"\r\n" + 
						"\r\n" + 
						"}")
				)
			);
	}
}

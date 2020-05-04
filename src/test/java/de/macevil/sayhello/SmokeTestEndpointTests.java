package de.macevil.sayhello;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SmokeTestEndpointTests {
    
    private SmokeTestEndpoint smokeTestEndpoint;

	@Test
	public void getIdTest() {
		smokeTestEndpoint = new SmokeTestEndpoint();
		assertTrue(smokeTestEndpoint.smokeTest().equals("{\"status\": \"UP\"}"));
	}
}
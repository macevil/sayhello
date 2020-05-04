package de.macevil.sayhello;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SayhelloEntityTests {
    
    private SayhelloEntity sayhelloEntity;

	@Test
	public void getIdTest() {
		sayhelloEntity = new SayhelloEntity("java", "content");
		assertTrue(sayhelloEntity.getLanguage().equals("java"));
	}
	
	@Test
	public void getContentTest() {
		sayhelloEntity = new SayhelloEntity("java", "content");
		assertTrue(sayhelloEntity.getContent().equals("content"));
	}
}
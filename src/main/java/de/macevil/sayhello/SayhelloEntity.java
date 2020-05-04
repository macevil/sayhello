package de.macevil.sayhello;

public class SayhelloEntity {

	private final String language;
	private final String content;

	public SayhelloEntity(String language, String content) {
		this.language = language;
		this.content = content;
	}

	public String getLanguage() {
		return language;
	}

	public String getContent() {
		return content;
	}
}

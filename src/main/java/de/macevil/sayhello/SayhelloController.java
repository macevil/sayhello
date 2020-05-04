package de.macevil.sayhello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayhelloController {

	private static final String template = "Hello, %s!";

	@GetMapping(path = "/sayhello", produces = { "application/json"})
	public SayhelloEntity sayHello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new SayhelloEntity("java", String.format(template, name));
	}

}
package com.service.microservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@GetMapping("/getContact/{id}")
	public String getContact(@PathVariable String id) {
		return "Returning Contact by Id" + id;
	}

	@GetMapping("/helloworld")
	public String getAllContacts() {
		return "Hello World";
	}

}

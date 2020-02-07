package com.test.sb.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping(path = "/getName")
	public String getName() {
		return "Hello Subrat";
	}

}

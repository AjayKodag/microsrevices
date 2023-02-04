package com.javabykiran.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@RequestMapping("firstservice")
	public String welcomeMessage() {
		return
"We started spring boot at our Local Machine";
	}

}

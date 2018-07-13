package com.bruip.app02.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestController {
	@GetMapping("hellol")
	public String hellol(){
		return "hellol";
	}
}

package com.genbr.spring.task1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task1") 
public class taskController {
	@GetMapping ("/test")
	public String test() {
		return "Persistencia + Mentalidade de crescimento ";
	}
	
	@GetMapping("/tes2t")
	public String tes2t() {
		return " Trabalho em equipe +  orientacao/Atencao a detelhes ";
	}
	
	
}

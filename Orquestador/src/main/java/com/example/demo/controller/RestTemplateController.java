package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.services.RestTemplateService;


@Controller
public class RestTemplateController {
	@Autowired
	private RestTemplateService restTemplateService;

	@GetMapping("/getCompleteEnigma")
	public ResponseEntity<?> getCompleteEnigma(){
		return new ResponseEntity<>(restTemplateService.unirServicios(), HttpStatus.OK);
	}
}

package com.example.demo.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestTemplateService {
	
	public String unirServicios() {
		RestTemplate restTemplate=new RestTemplate();
		String stepOne="http://localhost:8080/v1/getOneEnigma/getStepString";
		String stepTwo="http://localhost:8081/v1/getOneEnigma/getStepString";
		String stepThree="http://localhost:8082/v1/getOneEnigma/getStepString";
		
		ResponseEntity<String> responseStepOne = restTemplate
				.getForEntity(stepOne, String.class);
		
		ResponseEntity<String> responseStepTwo = restTemplate
				.getForEntity(stepTwo, String.class);
		
		ResponseEntity<String> responseStepThree = restTemplate
				.getForEntity(stepThree, String.class);
		
		String uno = responseStepOne.getBody();
		return "Step 1: " + uno.concat(", Step 2: " + responseStepTwo.getBody()).concat(", Step 3: " + responseStepThree.getBody());
	}

}

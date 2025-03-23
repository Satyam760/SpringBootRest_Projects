package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Customer;

@RestController
public class CustomerOperationController {

	@PostMapping("/register")
	public ResponseEntity<String> saveCustomer(@RequestBody Customer customer){
		return new ResponseEntity<String>(customer.toString(),HttpStatus.OK);
	}
	
}

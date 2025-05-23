package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerOperationController {
	
	@GetMapping("/report")
	public ResponseEntity<String>showCustomerRepo(){
		return new ResponseEntity<String>("From GET-ShowReport Method",HttpStatus.OK);
	}
	
	@PostMapping("/register")
	public ResponseEntity<String>registerCustomer(){
		return new ResponseEntity<String>("From POST-RegisterCustomer Method",HttpStatus.OK);
	}
	
	@PutMapping("/modify")
	public ResponseEntity<String>updateCustomer(){
		return new ResponseEntity<String>("From Put-updateCustomer Method",HttpStatus.OK);
	}
	
	@PatchMapping("/pmodify")
	public ResponseEntity<String>updateCustomerByNo(){
		return new ResponseEntity<String>("From Patch-updateCustomerByNo Method",HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String>deleteCustomer(){
		return new ResponseEntity<String>("From Delete-deleteCustomer Method",HttpStatus.OK);
	}
	

}

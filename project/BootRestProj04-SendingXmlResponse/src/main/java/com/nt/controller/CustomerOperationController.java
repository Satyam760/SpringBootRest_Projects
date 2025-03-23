package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Customer;

@RestController
public class CustomerOperationController {

	@GetMapping("/report")
	public ResponseEntity<Customer>showData(){
		Customer cust=new Customer(101, "raja","hyd", 5555.55f);
		return new ResponseEntity<Customer>(cust, HttpStatus.OK);
	}
	
	@GetMapping("/report1")
	public Customer showData1(){
		Customer cust=new Customer(101, "raja","hyd", 5555.55f);
		return cust;
	}
	
}

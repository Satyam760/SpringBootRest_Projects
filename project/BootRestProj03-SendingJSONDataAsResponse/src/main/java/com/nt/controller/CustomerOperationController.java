package com.nt.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Company;
import com.nt.model.Customer;

@RestController
public class CustomerOperationController {
	
	@GetMapping("/report")
	public ResponseEntity<Customer>showData(){
		Customer cust = new Customer(1001,"raja",3434.34f);
		return new ResponseEntity<Customer>(cust, HttpStatus.OK);
	}
	
	@GetMapping("/report1")
	public ResponseEntity<Customer>showData1(){
		Customer cust = new Customer(1001,"rani",5454.45f,
				                     new String[] {"red","blue","yellow"},
				                     List.of("10th","10+2","commers","B.tech"),
				                     Set.of(26753533l,63543663l,876547l),
				                     Map.of("aadhar",565656565l,"panNo",6544664l),
				                     new Company("samsung","hyd","Electronics",4000));
		return new ResponseEntity<Customer>(cust, HttpStatus.OK);
	}

}

package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Tourist;
import com.nt.service.ITouristMgmtService;

@RestController
@RequestMapping("/tourist")
public class TouristOperationController {

	@Autowired
	private ITouristMgmtService service;
	
	@PostMapping("/register")
	public ResponseEntity<String>enrollTourist(@RequestBody Tourist tourist)throws Exception{
		
			String resultMsg=service.registerTourist(tourist);
			return new ResponseEntity<String>(resultMsg, HttpStatus.CREATED);//201 content created successfully
			
	}//method
	
	@GetMapping("/findAll")
	public ResponseEntity<?> displayTourist()throws Exception{
		
			List<Tourist>list=service.fetchAllTourist();
			return new ResponseEntity<List<Tourist>>(list, HttpStatus.OK);
		
	}//method
	
	
	@GetMapping("/find/{id}")
	public ResponseEntity<?>displayTouristById(@PathVariable ("id")Integer id)throws Exception{
		
			Tourist tourist = service.fetchTouristById(id);
			return new ResponseEntity<Tourist>(tourist,HttpStatus.OK);
		
	}//method
	
	
	
	
	
	
}//class

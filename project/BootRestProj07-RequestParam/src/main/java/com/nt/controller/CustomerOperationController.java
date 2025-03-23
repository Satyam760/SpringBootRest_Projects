package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerOperationController {

	
	@GetMapping("/report")
	public String reportData(@RequestParam("cno")Integer no,@RequestParam("cname") String name) {
		return no+" --- "+name;
	}
	
	@PostMapping("/report1")
	public ResponseEntity<String>reportData1(@RequestParam Integer cno,
			         @RequestParam(required =false,defaultValue = "king")String cname){
		return new ResponseEntity<String>(cno+"----"+cname, HttpStatus.OK);
	}
	
}

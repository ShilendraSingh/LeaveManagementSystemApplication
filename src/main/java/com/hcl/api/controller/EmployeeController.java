package com.hcl.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.api.dto.LoginRequestDto;
import com.hcl.api.dto.LoginResponceDto;
import com.hcl.api.java.com.hcl.api.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	@PostMapping("/login")
	public ResponseEntity<LoginResponceDto> login(@RequestBody LoginRequestDto loginRequestDto ) {
		return new ResponseEntity<>(employeeService.login(loginRequestDto), HttpStatus.ACCEPTED);
	}
	
	
	
}

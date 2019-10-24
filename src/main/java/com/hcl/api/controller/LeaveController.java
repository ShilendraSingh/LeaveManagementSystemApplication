package com.hcl.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.api.dto.LeaveResponceDto;
import com.hcl.api.dto.LoginResponceDto;
import com.hcl.api.java.com.hcl.api.service.EmployeeService;
import com.hcl.api.java.com.hcl.api.service.LeaveService;

@RestController
@RequestMapping("/api")
public class LeaveController {
	
	@Autowired
	private LeaveService leaveService;
	
	@Autowired
	private EmployeeService employeeService;
	
	
	
	@GetMapping("/leaves/{employeeId}")
	public ResponseEntity<LeaveResponceDto> viewAvailableLeaves(@PathVariable Integer employeeId  ) {
		return new ResponseEntity<>(leaveService.viewAvailableLeaves(employeeId), HttpStatus.ACCEPTED);
	}
	

}

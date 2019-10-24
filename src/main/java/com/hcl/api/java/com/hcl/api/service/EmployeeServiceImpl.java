package com.hcl.api.java.com.hcl.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.api.dto.LoginRequestDto;
import com.hcl.api.dto.LoginResponceDto;
import com.hcl.api.java.com.hcl.api.entity.Employee;
import com.hcl.api.java.com.hcl.api.exception.EmployeeNotFoundException;
import com.hcl.api.java.com.hcl.api.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	
	@Autowired
	private EmployeeRepo employeeRepo;

	
	
	@Override
	public LoginResponceDto login(LoginRequestDto loginRequestDto) {
		
		LoginResponceDto loginResponceDto = new LoginResponceDto();
	
		Employee employee = employeeRepo.findByEmailIdAndPassword(loginRequestDto.getEmailId(), loginRequestDto.getPassword());
		
		if(employee==null) {
			
			throw new EmployeeNotFoundException("employee is not registered");
			
			}
		
		loginResponceDto.setMessage("Sucesfull");
		loginResponceDto.setName(employee.getName());
		loginResponceDto.setEmployeeId(employee.getEmployeeId());
		loginResponceDto.setStatus("sucess");
		
		return loginResponceDto;
	}

}

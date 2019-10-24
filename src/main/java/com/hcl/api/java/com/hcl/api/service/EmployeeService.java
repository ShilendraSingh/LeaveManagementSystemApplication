package com.hcl.api.java.com.hcl.api.service;

import com.hcl.api.dto.LoginRequestDto;
import com.hcl.api.dto.LoginResponceDto;

public interface EmployeeService {

	public LoginResponceDto  login (LoginRequestDto loginRequestDto);
	

}

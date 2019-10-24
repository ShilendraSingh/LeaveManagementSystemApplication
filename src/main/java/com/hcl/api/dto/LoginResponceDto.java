package com.hcl.api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class LoginResponceDto {

	
	public String message;
	public String status;
	private Integer employeeId;
	private String name;
	private Integer statusCode;
	
}

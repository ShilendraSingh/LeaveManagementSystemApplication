package com.hcl.api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class LeaveResponceDto {
	
	public String message;
	public String status;
	private Integer employeeId;
	private String name;
	private Integer restrictedHoliday;
	private Integer companyHoliday;
	private Integer availedRestrictedHoliday;
	private Integer availedAnnualHoliday;
	
	
}

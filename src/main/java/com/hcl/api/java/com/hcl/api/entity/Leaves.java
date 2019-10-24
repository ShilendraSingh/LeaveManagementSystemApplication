package com.hcl.api.java.com.hcl.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table
@Entity
@Setter
@Getter
@NoArgsConstructor

public class Leaves {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer leavesId;
	private Integer employeeId;
	private Integer restrictedHoliday;
	private Integer companyHoliday;
	private Integer availedRestrictedHoliday;
	private Integer availedAnnualHoliday;
//	private Integer annualleave;


}

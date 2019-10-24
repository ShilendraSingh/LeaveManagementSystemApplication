package com.hcl.api.java.com.hcl.api.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.api.dto.LeaveResponceDto;
import com.hcl.api.dto.LoginResponceDto;
import com.hcl.api.java.com.hcl.api.entity.Employee;
import com.hcl.api.java.com.hcl.api.entity.Leaves;
import com.hcl.api.java.com.hcl.api.exception.LeaveException;
import com.hcl.api.java.com.hcl.api.repository.EmployeeRepo;
import com.hcl.api.java.com.hcl.api.repository.LeaveRepo;

@Service
public class LeaveServiceImpl implements LeaveService {

	@Autowired
	private LeaveRepo leaveRepo;

	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public LeaveResponceDto viewAvailableLeaves(Integer employeeId) {

		LeaveResponceDto leaveResponceDto = new LeaveResponceDto();
		LoginResponceDto loginResponceDto = new LoginResponceDto();

		Optional<Employee> employeeDetails = employeeRepo.findById(employeeId);
		Optional<Leaves> leaveDetails = leaveRepo.findByemployeeId(employeeId);

		if (employeeDetails.isPresent() && leaveDetails.isPresent())

		{
			leaveResponceDto.setName(employeeDetails.get().getName());
			leaveResponceDto.setEmployeeId(leaveDetails.get().getEmployeeId());
			leaveResponceDto.setMessage(loginResponceDto.getMessage());
			leaveResponceDto.setStatus(loginResponceDto.getStatus());
			BeanUtils.copyProperties(leaveDetails.get(), leaveResponceDto);
			return leaveResponceDto;
		}

		else {
			throw new LeaveException("Leaves is not found");
		}

	}

}

package com.hcl.api.java.com.hcl.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.api.java.com.hcl.api.entity.Leaves;

@Repository
public interface LeaveRepo extends JpaRepository<Leaves, Integer> {
	
	public Optional<Leaves> findByemployeeId(Integer employeeId);


}

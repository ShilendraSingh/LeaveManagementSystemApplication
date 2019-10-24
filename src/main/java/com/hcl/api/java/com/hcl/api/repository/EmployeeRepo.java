package com.hcl.api.java.com.hcl.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.api.java.com.hcl.api.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	public  Employee findByEmailIdAndPassword(String email, String password);
}

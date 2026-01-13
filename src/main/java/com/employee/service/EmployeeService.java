package com.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepo;

@Service
public class EmployeeService {
	
	//field Level Injection
	@Autowired
	private EmployeeRepo employeeRepo;
	
	public Employee saveEmployee(Employee emp) {
		Employee employee = employeeRepo.save(emp);
		return employee;
	}

}

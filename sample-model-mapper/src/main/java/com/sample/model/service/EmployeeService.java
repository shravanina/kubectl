package com.sample.model.service;

import com.sample.model.model.EmployeeModel;

public interface EmployeeService 
{
	public void createEmployee(EmployeeModel employeeModel);
	
	public EmployeeModel getEmployeeById(int id);
}

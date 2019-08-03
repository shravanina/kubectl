package com.sample.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.model.entity.Employee;
import com.sample.model.model.EmployeeModel;
import com.sample.model.repository.EmployeeRepository;
import com.sample.model.util.ModelMapperConvertor;

@Service
public class EmployeeServiceImpl implements EmployeeService 
{
	@Autowired
	private EmployeeRepository employeeRepository; 
	
	@Override
	public void createEmployee(EmployeeModel employeeModel) {		
		Employee employee =ModelMapperConvertor.ModelEntityMapper(employeeModel);		
		employeeRepository.save(employee);
	}

	@Override
	public EmployeeModel getEmployeeById(int id) 
	{
		Employee employee = employeeRepository.getOne(id);
		EmployeeModel employeeModel = ModelMapperConvertor.EntityModelMapper(employee);
		return employeeModel;
	}
}
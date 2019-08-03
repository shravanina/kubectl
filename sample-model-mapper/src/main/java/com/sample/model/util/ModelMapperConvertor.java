package com.sample.model.util;

import org.modelmapper.ModelMapper;

import com.sample.model.entity.Employee;
import com.sample.model.model.EmployeeModel;

public class ModelMapperConvertor 
{
	public static Employee ModelEntityMapper(EmployeeModel employeeModel) 
	{
		ModelMapper modelMapper = new ModelMapper();
		Employee employee = modelMapper.map(employeeModel, Employee.class);
		return employee;
	}
	
	public static EmployeeModel EntityModelMapper(Employee employee) 
	{
		ModelMapper modelMapper = new ModelMapper();
		EmployeeModel employeeModel = modelMapper.map(employee, EmployeeModel.class);
		return employeeModel;
	}
}
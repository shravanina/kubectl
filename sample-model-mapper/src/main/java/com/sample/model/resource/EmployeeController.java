package com.sample.model.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.model.model.EmployeeModel;
import com.sample.model.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController 
{
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/save")
	public void saveEmployee(@RequestBody EmployeeModel employeeModel) 
	{
		employeeService.createEmployee(employeeModel);
	}

	@GetMapping("/get/{id}")
	public EmployeeModel getEmployee(@PathVariable int id)
	{
	EmployeeModel employeeModel =	employeeService.getEmployeeById(id);
	return employeeModel;
	}
}
package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Employee;
import com.demo.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo empRepo;
	
	public Employee addEmp(Employee emp)
	{
		return empRepo.save(emp);
	}
	
	public Employee getEmpById(int id)
	{
	return 	empRepo.findById(id).get();
	}
	
	public List<Employee> getAllEmp()
	{
		return empRepo.findAll();
	}
	

}

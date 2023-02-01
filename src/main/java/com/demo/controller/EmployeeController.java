package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Employee;
import com.demo.service.EmployeeService;

@RestController

public class EmployeeController
{
@Autowired
private EmployeeService empService;

@PostMapping(path="/addEmp", consumes= {"application/xml"},produces = {"application/xml"})
public Employee addEmp(@RequestBody Employee emp)
{
	return empService.addEmp(emp);
}

@GetMapping(path="/getById/{id}", produces = {"application/xml"})
public Employee getById(@PathVariable int id)
{
	return empService.getEmpById(id);
}

@GetMapping(path="/getAll", produces = {"application/xml"})
public List<Employee>  getAll()
{
	return empService.getAllEmp();
}
}

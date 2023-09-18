package com.tyove.proj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.tyove.proj.dao.EmployeeDA0;
import com.tyove.proj.model.Employee;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeDA0 eDA0;
	@GetMapping("/employees")
	public List<Employee> getEmp(){
		return eDA0.getAll();
		
	}
	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		
		return eDA0.getById(id);
	}
	@PostMapping("/employees")
	public String saveEmployee(@PathVariable Employee emp) {
		
		return eDA0.save(emp) + " rows currently in the database";
	}
	
	@PutMapping("/employees/{id}")
	public String updateEmployeeById(@PathVariable Employee emp, @PathVariable int id) {
		return eDA0.update(emp, id) + " rows updated";
	}

	
	@DeleteMapping("/employees/{id}")
	public String deleteEmployeeById(@PathVariable int id) {
		return eDA0.delete(id) + " rows deleted";
	}
}


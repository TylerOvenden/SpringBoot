package com.tyove.proj.dao;

import java.util.List;

import com.tyove.proj.model.Employee;

public interface EmployeeDA0 {
	int save(Employee employee);
	
	int update(Employee employee, int id);
	
	int delete(int id);
	
	List<Employee> getAll();
	
	Employee getById(int id);
	
	
}

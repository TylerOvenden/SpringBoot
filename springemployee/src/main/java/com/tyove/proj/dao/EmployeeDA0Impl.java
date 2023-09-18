package com.tyove.proj.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tyove.proj.model.Employee;

@Repository
public class EmployeeDA0Impl implements EmployeeDA0 {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	
	@Override
	public int save(Employee employee) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("INSERT INTO tbl_empl (nam, email, department) VALUES (?, ?, ?)", new Object[] {employee.getNam(), employee.getEmail(), employee.getDepartment()});
	}

	@Override
	public int update(Employee employee, int id) {
		// TODO Auto-generated method stub
		return  jdbcTemplate.update("UPDATE tbl_empl SET nam=?, email?, department=? WHERE id =?", new Object[] {employee.getNam(), employee.getEmail(), employee.getDepartment()}, id);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("DELETE from tbl_empl WHERE  id=? ", id);
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * FROM tbl_empl",new BeanPropertyRowMapper<Employee>(Employee.class));
		//return null;
	}

	@Override
	public Employee getById(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject("SELECT * FROM tbl_empl WHERE id=?",new BeanPropertyRowMapper<Employee>(Employee.class), id);
	}

}

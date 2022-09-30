package com.rbt.pmt.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rbt.pmt.entities.Employee;
import com.rbt.pmt.entities.Project;

public interface EmployeeRepository extends CrudRepository<Employee,Long>{
	@Override
	List<Employee> findAll();
}

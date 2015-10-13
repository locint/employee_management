package com.management.dao;

import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.JpaRepository;

import com.management.bean.Employee;

@PropertySource("application.properties")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> { 
	


}
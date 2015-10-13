package com.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.management.bean.Employee;
import com.management.dao.EmployeeRepository;
@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	  @Autowired
	  private EmployeeRepository EmRepo;
	  
	  @RequestMapping(method = RequestMethod.POST)
	  public Employee addEmployee(@RequestBody Employee e, @PathVariable Integer id) {
		  //Lisätään
		  System.out.println("Lisätään record");
		  e.setId(id);
		  Employee employee = null;
		  EmRepo.saveAndFlush(e);
		  System.out.println(id);
		  return e;
	  }
}

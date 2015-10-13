package com.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.management.bean.Employee;
import com.management.bean.Person;
import com.management.dao.ButlerRepository;
import com.management.dao.ChefRepository;
import com.management.dao.EmployeeRepository;
import com.management.dao.PersonCrudRepository;
import com.management.dao.PersonRepository;
import com.management.dao.WaitressRepository;

@RestController
@RequestMapping("/persons")
public class PersonController {
	  @Autowired
	  private PersonRepository PeRepo;
	  @Autowired
	  private PersonCrudRepository PeCRepo;
	  @Autowired
	  private ChefRepository ChRepo;
	  @Autowired
	  private WaitressRepository WaRepo;
	  @Autowired
	  private ButlerRepository BuRepo;
	  
	  @RequestMapping(method = RequestMethod.GET)
	  public List<Person> listPerson() {
		  //Listataan
		  System.out.println("Haetaan kaikki");
		  List<Person> list = PeRepo.findAll();
		  System.out.println(list);
		  return list;
	  }
	  @RequestMapping(method = RequestMethod.POST)
	  public Integer addPerson(@RequestBody Person p) {
		  //Lisätään
		  System.out.println("Lisätään record");
		  p.setId(null);
		  Person person = null;
		  PeRepo.saveAndFlush(p);
		  Integer id = person.getId();
		  System.out.println(id);
		  return id;
	  }
	  @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
	  public Person findPerson(@PathVariable Integer id) {
		//Etsitään
		  Person p = PeRepo.getOne(id);
		  System.out.println(p);
	    return p;
	  }
	  @RequestMapping(value = "/find2/{name}", method = RequestMethod.GET)
	  public List<Person> findPerson2(@PathVariable String name) {
		//Etsitään
		  List<Person> p = PeCRepo.findByPersonName(name);
		  System.out.println(p);
	    return p;
	  }
	  @RequestMapping(value = "/{id}", method = {RequestMethod.PUT,RequestMethod.POST})
	  public Person updatePerson(@RequestBody Person updatedPerson, @PathVariable Integer id) {
		//Muokataan
	    updatedPerson.setId(id);
	    return PeRepo.saveAndFlush(updatedPerson);
	  }
	  
	  @RequestMapping(value = "/{id}", method = {RequestMethod.DELETE,RequestMethod.GET})
	  public void deletePerson(@PathVariable Integer id) {
		  //Poistetaan
		  System.out.println("Poistetaan: "+id);
		  PeRepo.delete(id);
	  }
	  
}

package com.management.dao;

import java.util.List;

import org.springframework.context.annotation.PropertySource;
import org.springframework.data.repository.CrudRepository;

import com.management.bean.Person;

@PropertySource("application.properties")
public interface PersonCrudRepository extends CrudRepository<Person, String> {

    List<Person> findByPersonName(String firstname);

}
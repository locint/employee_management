package com.management.dao;

import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.JpaRepository;

import com.management.bean.Person;

@PropertySource("application.properties")
public interface PersonRepository extends JpaRepository<Person, Integer> { 



}
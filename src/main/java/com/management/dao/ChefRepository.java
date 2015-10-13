package com.management.dao;

import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.JpaRepository;

import com.management.bean.Chef;

@PropertySource("application.properties")
public interface ChefRepository extends JpaRepository<Chef, Integer> { 
	


}
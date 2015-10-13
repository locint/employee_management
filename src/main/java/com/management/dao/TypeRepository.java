package com.management.dao;

import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.JpaRepository;

import com.management.bean.Type;

@PropertySource("application.properties")
public interface TypeRepository extends JpaRepository<Type, Integer> { 
	


}
package com.management.dao;

import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.JpaRepository;

import com.management.bean.Butler;

@PropertySource("application.properties")
public interface ButlerRepository extends JpaRepository<Butler, Integer> { 
	


}
package com.management.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="butler")
public class Butler {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="employeeid")
	public Integer EmployeeId;

	public Integer getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(Integer EmployeeId) {
		this.EmployeeId = EmployeeId;
	}
	
}

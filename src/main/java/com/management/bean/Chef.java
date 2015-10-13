package com.management.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity(name="chef")
public class Chef {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="employeeid")
	public Integer EmployeeId;
	@NotNull
	@Column(name="typeId")
	private Integer TypeId;

	public Integer getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		EmployeeId = employeeId;
	}

	public Integer getTypeId() {
		return TypeId;
	}

	public void setTypeId(Integer typeId) {
		TypeId = typeId;
	}
	
	
}

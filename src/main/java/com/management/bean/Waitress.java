package com.management.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Waitress")
public class Waitress {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="employeeid")
	private Integer EmployeeId;
	@Column(name="percent")
	private double Percent;
	
	public Integer getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		EmployeeId = employeeId;
	}
	public double getPercent() {
		return Percent;
	}
	public void setPercent(double percent) {
		Percent = percent;
	}
	
	
	
	
}

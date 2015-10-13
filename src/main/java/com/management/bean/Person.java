package com.management.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Id;
import org.hibernate.validator.constraints.NotBlank;

@Entity(name="person")
public class Person {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer Id;
	@NotBlank
	@Column(name="firstname")
	private String FirstName;
	@NotBlank
	@Column(name="lastname")
	private String LastName;
	@NotBlank
	@Column(name="socialid")
	private String SocialID;
	@Column(name="employeeid")
	private Integer EmployeeId;	
	private Integer personName;
	
	public String personName() {
		return FirstName+""+LastName;
	}
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getSocialID() {
		return SocialID;
	}
	public void setSocialID(String socialID) {
		SocialID = socialID;
	}
	
	public Integer getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		EmployeeId = employeeId;
	}

	public Person(Integer id, String firstName, String lastName, String socialID, Integer employeeId) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		SocialID = socialID;
		EmployeeId = employeeId;
	}
	public Person(){
		
	}
	@Override
	public String toString() {
		return "Person [Id=" + Id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", SocialID=" + SocialID
				+ ", EmployeeId=" + EmployeeId + "]";
	}


	


}

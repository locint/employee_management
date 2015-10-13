package com.management.bean;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity(name="employee")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer Id;
	@NotNull
	@Column(name="personid")
	private Integer PersonId;
	@NotNull
	@Column(name="task")
	private String Task;
	@NotNull
	@Column(name="start")
	private Date Start;
	@Column(name="quit")
	private Date Quit;
	@NotNull
	@Column(name="status")
	private String Status;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public Integer getPersonId() {
		return PersonId;
	}
	public void setPersonId(Integer personId) {
		PersonId = personId;
	}
	public String getTask() {
		return Task;
	}
	public void setTask(String task) {
		Task = task;
	}
	public Date getStart() {
		return Start;
	}
	public void setStart(Date start) {
		Start = start;
	}
	public Date getQuit() {
		return Quit;
	}
	public void setQuit(Date quit) {
		Quit = quit;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}

	
	
}

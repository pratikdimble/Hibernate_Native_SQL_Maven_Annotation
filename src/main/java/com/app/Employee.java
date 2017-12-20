package com.app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name="Emp_Native")
public class Employee {
	
	private int id;
	private String name;
	private float sal;
	
	@Id
	@Column(length=10)
	@Type(type="int")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(length=15)
	@Type(type="string")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(length=15,precision=2)
	@Type(type="float")
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	
}

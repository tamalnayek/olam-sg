package com.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {

	@Id
	private int id;
	private String name;
	
	@OneToMany(fetch=FetchType.EAGER,mappedBy="department")
	private List<OlamEmployee> employees;
	
	

	public List<OlamEmployee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<OlamEmployee> employees) {
		this.employees = employees;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}

}

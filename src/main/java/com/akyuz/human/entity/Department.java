package com.akyuz.human.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity 
public class Department {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long departmentId;
	private String departmentName;
	@OneToMany(mappedBy = "departmentname",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Emploee> emploeeList;
	
	public Department(long departmentId, String departmentName) {
		
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}
	public Department() {
		
	}
	public long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public List<Emploee> getEmploeeList() {
		return emploeeList;
	}
	public void setEmploeeList(List<Emploee> emploeeList) {
		this.emploeeList = emploeeList;
	}
	
	
}

package com.akyuz.human.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity 
public class Emploee {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long EmploeeId;
	private String emploeeName;
	private Double monthlySalary;
	@ManyToOne @JoinColumn(name="departmentId")
	private Department departmentname;
	
	
	public Emploee(long emploeeId, String emploeeName, Double monthlySalary) {
	
		EmploeeId = emploeeId;
		this.emploeeName = emploeeName;
		this.monthlySalary = monthlySalary;
	}

	public Emploee() {
		
	}

	public long getEmploeeId() {
		return EmploeeId;
	}

	public void setEmploeeId(long emploeeId) {
		EmploeeId = emploeeId;
	}

	public String getEmploeeName() {
		return emploeeName;
	}

	public void setEmploeeName(String emploeeName) {
		this.emploeeName = emploeeName;
	}

	public Double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(Double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public Department getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(Department departmentname) {
		this.departmentname = departmentname;
	}
	
	

}

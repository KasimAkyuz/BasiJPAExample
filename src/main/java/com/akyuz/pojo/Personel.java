package com.akyuz.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="Personel")
public class Personel {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int personelId;
	@Column(name="name")
	private String firstName;
	@Column(name="lastname")
	private String lastName;
	@Column(name="birthday")
	@Temporal(TemporalType.DATE)
	private Date birthDate;
	private String personelNumber;
	
	
	
	public int getPersonelId() {
		return personelId;
	}
	public void setPersonelId(int personelId) {
		this.personelId = personelId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getPersonelNumber() {
		return personelNumber;
	}
	public void setPersonelNumber(String personelNumber) {
		this.personelNumber = personelNumber;
	}
	public Personel() {
		
	}
	public Personel( String firstName, String lastName, Date birthDate, String personelNumber) {
		
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.personelNumber = personelNumber;
	}
	
	
	
	
}

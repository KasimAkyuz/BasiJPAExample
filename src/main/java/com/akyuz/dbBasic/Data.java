package com.akyuz.dbBasic;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Data {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long dataId;
	private String datename;
	private double dataValue;
	public long getDataId() {
		return dataId;
	}
	public void setDataId(long dataId) {
		this.dataId = dataId;
	}
	public String getDatename() {
		return datename;
	}
	public void setDatename(String datename) {
		this.datename = datename;
	}
	public double getDataValue() {
		return dataValue;
	}
	public void setDataValue(double dataValue) {
		this.dataValue = dataValue;
	}
	public Data(long dataId, String datename, double dataValue) {
		
		this.dataId = dataId;
		this.datename = datename;
		this.dataValue = dataValue;
	}
	public Data() {
		
	}
	
	

}

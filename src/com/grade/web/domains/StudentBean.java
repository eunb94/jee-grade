package com.grade.web.domains;

import java.io.Serializable;

public class StudentBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name, ssn, schNumber;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSchNumber() {
		return schNumber;
	}
	public void setSchNumber(String schNumber) {
		this.schNumber = schNumber;
	}
	
	@Override
	public String toString() {
		return "StudentBean [name=" + name + ", ssn=" + ssn + ", schNumber=" + schNumber + "]";

	}
	
	
	
}

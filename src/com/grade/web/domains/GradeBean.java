package com.grade.web.domains;

import java.io.Serializable;

public class GradeBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String name, ssn, schNumber;
	private int kor, eng, math, soc;

	

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



	public int getKor() {
		return kor;
	}



	public void setKor(int kor) {
		this.kor = kor;
	}



	public int getEng() {
		return eng;
	}



	public void setEng(int eng) {
		this.eng = eng;
	}



	public int getMath() {
		return math;
	}



	public void setMath(int math) {
		this.math = math;
	}



	public int getSoc() {
		return soc;
	}



	public void setSoc(int soc) {
		this.soc = soc;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getSchNumber() {
		return schNumber;
	}



	public void setSchNumber(String schNumber) {
		this.schNumber = schNumber;
	}

	@Override
	public String toString() {
		return "성적관리시스템 [이름=" + name + 
				", 주민번호=" + ssn + 
				", 국어=" + kor + 
				", 영어=" + eng + 
				", 수학=" + math +
				", 사회=" + soc + "]";
	}




	
	
	
}

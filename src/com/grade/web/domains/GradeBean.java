package com.grade.web.domains;

import java.io.Serializable;

public class GradeBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private int kor, eng, math, soc;
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
	@Override
	public String toString() {
		return "GradeBean [kor=" + kor + ", eng=" + eng + ", math=" + math + ", soc=" + soc + "]";
	}

		
	
}

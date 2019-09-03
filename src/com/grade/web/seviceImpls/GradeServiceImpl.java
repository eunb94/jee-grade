package com.grade.web.seviceImpls;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import com.grade.web.daoImpls.GradeDaoImpl;
import com.grade.web.daos.GradeDao;
import com.grade.web.domains.GradeBean;
import com.grade.web.services.GradeService;


public class GradeServiceImpl implements GradeService{
	private GradeDaoImpl dao;
	public GradeServiceImpl() {
		dao =  new GradeDaoImpl();
		
		
	}
	@Override
	public void grade(GradeBean param) {
		param.setSchNumber(schNumber( param) );

		dao.insertGrade(param);
		
		
	}


	
	@Override
	public String schNumber(GradeBean param) {
		String num = "";
		String a= "";
		Random ran = new Random();
		String year = new SimpleDateFormat("yyyy").format(new Date());
		String g = param.getSsn().substring(7,8);

		for(int i=0; i<3; i++) {
			 a += ran.nextInt(10);
			 
		} 
		
	
		return num = year + "-" + g + a;
		
	}
	}
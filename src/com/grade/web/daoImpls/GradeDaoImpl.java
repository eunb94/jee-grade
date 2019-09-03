package com.grade.web.daoImpls;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import com.grade.web.daos.GradeDao;
import com.grade.web.domains.GradeBean;
import com.grade.web.services.GradeService;


public class GradeDaoImpl implements GradeDao{
	public static final String FILE_PATH = String.format("C:%sUsers%suser%seclipse-jee%sjee-grade%sWebContent%sresources%stxt%s", 
			File.separator,			
			File.separator,			
			File.separator,			
			File.separator,			
			File.separator,			
			File.separator,	
			File.separator,			
			File.separator);

	@Override
	public void insertGrade(GradeBean param) {
		try {
			System.out.println("디오");
			File file = new File(FILE_PATH+"grade.txt");
			System.out.println("1");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
			writer.write(String.format("%s (%s): %s, %s, %s, %s", param.getName(),param.getSchNumber(), param.getKor(), param.getEng(),
					param.getMath(), param.getSoc()));
			System.out.println("2");
			writer.newLine();
			System.out.println("3");
			writer.flush();
			System.out.println("4");
			
		}catch(Exception e) {
			e.getStackTrace();
		}
		
	}


}

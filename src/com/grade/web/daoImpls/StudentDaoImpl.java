package com.grade.web.daoImpls;
import java.io.File;
import com.grade.web.daos.StudentDao;
import com.grade.web.domains.StudentBean;
import com.grade.web.pool.Constants;

public class StudentDaoImpl implements StudentDao{


	@Override
	public void insertStudent(StudentBean param) {
		try {
			File file = new File(Constants.FILE_PATH+"student.txt");
			
		}catch(Exception e) {
			e.getStackTrace();
		
	}

}
}
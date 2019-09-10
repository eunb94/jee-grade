package com.grade.web.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.grade.web.domains.GradeBean;
import com.grade.web.pool.Constants;
import com.grade.web.services.GradeService;
import com.grade.web.seviceImpls.GradeServiceImpl;

@WebServlet("/student.do")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		System.out.println("액션 : "+ action); 
		String dest = request.getParameter("dest");
		System.out.println("목적지 : " + dest);
		
		switch(request.getParameter("action")) {
		case "move" :
			request.getRequestDispatcher
			(String.format(Constants.VIEW_PATH, "student", request.getParameterValues("dest")))
			.forward(request, response);
			
		case "register" :
			
			String name = request.getParameter("name");
			String ssn = request.getParameter("ssn");
			int kor =Integer.parseInt( request.getParameter("kor"));
	        int eng =Integer.parseInt( request.getParameter("eng"));
	        int math =Integer.parseInt( request.getParameter("math"));
	        int soc =Integer.parseInt( request.getParameter("soc"));
	        GradeBean grade = new GradeBean();
	        grade.setEng(eng);
	        grade.setKor(kor);
	        grade.setMath(math);
	        grade.setSoc(soc);
	        GradeService service =new GradeServiceImpl();
	        //service.grade(grade);
		
			request.getRequestDispatcher
			(String.format(Constants.VIEW_PATH, "student", request.getParameterValues("dest")))
			.forward(request, response);
			break;
			
		case "login" :
			
			break;
		}
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}

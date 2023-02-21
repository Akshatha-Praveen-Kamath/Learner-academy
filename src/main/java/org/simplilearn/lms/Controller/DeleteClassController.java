package org.simplilearn.lms.Controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.simplilearn.lms.entities.AcademicClass;
import org.simplilearn.lms.service.AcademicService;
import org.simplilearn.lms.service.AcademicServiceImpl;

@WebServlet("/deleteClass")
public class DeleteClassController extends HttpServlet{
	private AcademicService ac = new AcademicServiceImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		int cid= Integer.parseInt(req.getParameter("cid"));
		AcademicClass academicClass= new AcademicClass();
		academicClass.setCid(cid);
		
		ac.deleteClass(academicClass);
		RequestDispatcher rd= req.getRequestDispatcher("/home.jsp");
		rd.forward(req, resp);
	}	

}

package org.simplilearn.lms.Controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.simplilearn.lms.entities.Student;
import org.simplilearn.lms.service.StudentServiceImpl;
import org.simplilearn.lms.service.StudentServices;

@WebServlet("/deleteStudent")
public class DeleteStudentController extends HttpServlet{
	private StudentServices std = new StudentServiceImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		int  sid= Integer.parseInt(req.getParameter("sid"));
		Student student= new Student();
		student.setSid(sid);
		
		std.deleteStudent(student);
		RequestDispatcher rd= req.getRequestDispatcher("/home.jsp");
		rd.forward(req, resp);
	}	
}

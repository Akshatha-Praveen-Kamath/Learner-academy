package org.simplilearn.lms.Controller;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.simplilearn.lms.entities.Teacher;
import org.simplilearn.lms.service.TeacherService;
import org.simplilearn.lms.service.TeacherServiceImpl;

@WebServlet("/deleteTeacher")
public class DeleteTeacherController extends HttpServlet{
	private TeacherService td = new TeacherServiceImpl();
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		int  tid= Integer.parseInt(req.getParameter("tid"));
		Teacher teacher= new Teacher();
		teacher.setTid(tid);
		
		td.deleteTeacher(teacher);
		RequestDispatcher rd= req.getRequestDispatcher("/home.jsp");
		rd.forward(req, resp);
	}	
	
}

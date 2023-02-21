package org.simplilearn.lms.Controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.simplilearn.lms.entities.Subject;
import org.simplilearn.lms.service.SubjectServices;
import org.simplilearn.lms.service.SubjectServicesImpl;


@WebServlet("/deleteSubject")
public class DeleteSubjectController extends HttpServlet{
	private SubjectServices sub = new SubjectServicesImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		int  sid= Integer.parseInt(req.getParameter("sid"));
		Subject subject= new Subject();
		subject.setSid(sid);
		
		sub.deleteSubject(subject);
		RequestDispatcher rd= req.getRequestDispatcher("/home.jsp");
		rd.forward(req, resp);
		
		
	}

}

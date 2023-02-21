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

@WebServlet("/addSub") 
public class SubjectController extends HttpServlet {
	private SubjectServices service=new SubjectServicesImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		int sid=Integer.parseInt(req.getParameter("sid"));
		String subject=req.getParameter("subject");
		Subject subject2=new Subject();
		subject2.setSid(sid);
		subject2.setName(subject);
		service.addSubject(subject2);	
		req.setAttribute("msg", "Subject added Successfully");
		RequestDispatcher rd=req.getRequestDispatcher("home.jsp");
		rd.forward(req, resp);
	}

}

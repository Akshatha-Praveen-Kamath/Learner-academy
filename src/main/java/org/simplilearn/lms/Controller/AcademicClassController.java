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

@WebServlet("/AcademicClass")
public class AcademicClassController extends HttpServlet{
private AcademicService classservice=new AcademicServiceImpl();
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int cid=Integer.parseInt(req.getParameter("cid"));
		String name=req.getParameter("name");
		String duration=req.getParameter("duration");
		
		AcademicClass academicclass=new AcademicClass();
		academicclass.setCid(cid);
		academicclass.setName(name);
		academicclass.setDuration(duration);
		classservice.addClass(academicclass);
		req.setAttribute("msg", "Class added Successfully");
		RequestDispatcher rd=req.getRequestDispatcher("home.jsp");
		rd.forward(req, resp);
	}
}

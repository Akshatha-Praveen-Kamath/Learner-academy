package org.simplilearn.lms.Controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.simplilearn.lms.entities.Teacher;
import org.simplilearn.lms.service.TeacherService;
import org.simplilearn.lms.service.TeacherServiceImpl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

@WebServlet("/addTeacher")
public class TeacherController extends HttpServlet{
	private TeacherService teacherservice=new TeacherServiceImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String designation=req.getParameter("designation");
		String skill=req.getParameter("skill");
		Teacher teacher=new Teacher();
		teacher.setName(name);
		teacher.setDesignation(designation);
		teacher.setSkill(skill);
		teacherservice.addTeacher(teacher);
		req.setAttribute("msg", "Teacher added Successfully");
		RequestDispatcher rd=req.getRequestDispatcher("home.jsp");
		rd.forward(req, resp);
	}
}

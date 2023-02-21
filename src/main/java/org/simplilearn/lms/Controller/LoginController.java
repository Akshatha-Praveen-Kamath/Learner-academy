package org.simplilearn.lms.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.simplilearn.lms.entities.User;
import org.simplilearn.lms.service.UserService;
import org.simplilearn.lms.service.UserServiceImpl;

@WebServlet("/SavedUserlogin")
public class LoginController extends HttpServlet {
	private UserService userservice=new UserServiceImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		User user=userservice.get(username, password);
		if(user!=null && user.getUserType().equals("admin"))
		{
			HttpSession session=req.getSession();
			session.setAttribute("User", user);
			RequestDispatcher rd=req.getRequestDispatcher("home.jsp");
			rd.forward(req,resp);
		}
		else 
		{
			req.setAttribute("msg", "Username or Password is Invalid");
			RequestDispatcher rd=req.getRequestDispatcher("index.jsp");
			rd.forward(req, resp);
		}
	}
}

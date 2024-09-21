package com.user;

import java.io.IOException;

import javax.naming.ldap.Rdn;
import javax.servlet.RequestDispatcher;

import com.dao.UserDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UserData extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String phone=req.getParameter("phone");
		String message=req.getParameter("message");
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(phone);
		System.out.println(message);
		boolean flag=UserDao.userRegistration(name, email, phone, message);
		if (flag) {
			jakarta.servlet.RequestDispatcher rd=req.getRequestDispatcher("index.jsp");
			rd.forward(req, resp);
		}
		else {
		jakarta.servlet.RequestDispatcher rd=req.getRequestDispatcher("index.jsp");
		rd.forward(req, resp);
		}
	}

}

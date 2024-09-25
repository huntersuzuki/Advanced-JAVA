package com.registerform;

import java.io.IOException;
import java.io.PrintWriter;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyRegisterForm extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pW = resp.getWriter();
		String name = req.getParameter("uname");
		String email = req.getParameter("uemail");
		String pass = req.getParameter("upass");
		String gender = req.getParameter("ugender");
		String check = req.getParameter("check");
		
		if (check!=null) {
			
			pW.println("Your name is "+name);
			pW.println("Your email is "+email);
			pW.println("your gender is "+gender);
			
			RequestDispatcher rd = req.getRequestDispatcher("success");
			rd.forward(req, resp);
		}
		else {
			pW.println("Please accept the terms & condition");
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			resp.setContentType("text/html");
			rd.include(req, resp);
		}
		
	}
}

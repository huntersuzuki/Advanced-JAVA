package com.signupform;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyFormClass extends HttpServlet {

	protected void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException {
		PrintWriter pW = res.getWriter();
		
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		String add1 = req.getParameter("add1");
		String add2 = req.getParameter("add2");
		String city = req.getParameter("city");
		String state = req.getParameter("state");
		String zip = req.getParameter("zip");
		
		pW.println("Your Email is "+email);
		pW.println("Your Password is "+pass);
		pW.println("Your Address 1 is "+add1);
		pW.println("Your Address 2 is "+add2);
		pW.println("Your City is "+city);
		pW.println("Your State is "+state);
		pW.println("Your Zip code is "+zip);
	}
}

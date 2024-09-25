package com.myfirstwebapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyAdditionClass extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int x = Integer.parseInt(req.getParameter("number1"));
		int y = Integer.parseInt(req.getParameter("number2"));
		
		int z = x+y;
		PrintWriter pw = res.getWriter();
		pw.println("Addition "+z);
	}
}

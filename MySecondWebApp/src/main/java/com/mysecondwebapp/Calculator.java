package com.mysecondwebapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletRequest;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Calculator extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
		int x = Integer.parseInt(req.getParameter("number1"));
		int y = Integer.parseInt(req.getParameter("number2"));
		
		String b = req.getParameter("cal");
		
		PrintWriter pw = res.getWriter();
		
		if ("Addition".equalsIgnoreCase(b)) {
			int z = x+y;
			pw.println("Sum is "+z);
		}
		else if ("Subtraction".equalsIgnoreCase(b)) {
			int z = x-y;
			pw.println("Sub is "+z);
		}
		else if ("Multiplication".equalsIgnoreCase(b)) {
			int z = x*y;
			pw.println("Mul is "+z);
		}
		else if ("Division".equalsIgnoreCase(b)) {
			int z = x/y;
			pw.println("Div is "+z);
		}
	}
}

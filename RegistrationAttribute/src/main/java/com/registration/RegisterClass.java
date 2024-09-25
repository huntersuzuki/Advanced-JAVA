package com.registration;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterClass extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String name = req.getParameter("name");
		String userName = req.getParameter("uname");
		String email = req.getParameter("email");
		
		req.setAttribute("name", name);
		RequestDispatcher rd = req.getRequestDispatcher("success");
		rd.forward(req, resp);
	}
}

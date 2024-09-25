package com.sessionproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.jar.Attributes.Name;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/products")
public class ProductServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		HttpSession htp = req.getSession();
	String name = (String)htp.getAttribute("savedName");
		PrintWriter pw = resp.getWriter();
		pw.println("You are in product page.. "+name+"<br>");
		pw.println("<a href='contactus'>Contact us...</a>");
	}
}

package com.sessiontrackingcookies;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/products")
public class ProductPageServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		Cookie co[] = req.getCookies();
		boolean b = false;
		
		String name = "";
		
		if (co==null) {
			pw.println("You are a new user");
			return;
		}
		else {
			
			for (Cookie ck : co) {
				String tname = ck.getName();
				if (tname.equals("SavedName")) {
					b=true;
					name = ck.getValue();
				}
			}
		}
		if (b) {
			pw.println(name+" Welcome to our products section");
		}
		else {
			pw.println("You are a new user!!!");
		}
		
	}
}

package com.prowings;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WebAppDemo extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String nm = req.getParameter("name");
		String rollNum = req.getParameter("roll");

		resp.setContentType("text/html");

		Student s = new Student(nm,rollNum);
		SessionClass.add(s);
		
		PrintWriter out = resp.getWriter();
		out.println("<html><body>");

		out.print("<h3>Details submited</h3></br>");

		out.print("Full Name : " + nm + "<br/>");
		out.print("Roll No : " + rollNum + "<br/>");
		
		
		
		out.print("</body></html>");
		
		
	}
	
	
}

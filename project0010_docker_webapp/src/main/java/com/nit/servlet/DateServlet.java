package com.nit.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.annotation.WebServlet;


@WebServlet("/dateurl")
public class DateServlet extends jakarta.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;

    public DateServlet() {

    }

	public void doGet(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws jakarta.servlet.ServletException, IOException {
		
		PrintWriter printWriter=response.getWriter();
		response.setContentType("text/html");
		Date date=new Date();
		printWriter.println("<h1>Date and Time::"+ date +"</h1>");
		printWriter.close();
	}

	public void doPost(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws jakarta.servlet.ServletException, IOException {

		doGet(request, response);
	}

}

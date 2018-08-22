package com.study.jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Calculation")
public class Calculation extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("doPost");

		request.setCharacterEncoding("UTF-8");

		int result = 0;
		
		String first = request.getParameter("first");
		String second = request.getParameter("second");
		String calc = request.getParameter("calc");

		
		int A = Integer.parseInt(first);
		int B = Integer.parseInt(second);

		if (calc.equals("plu")) {
			result = A + B;
		}

		if (calc.equals("min")) {
			result = A - B;
		}

		if (calc.equals("mul")) {
			result = A * B;
		}

		if (calc.equals("div")) {
			result = A / B;
		}

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter writer = response.getWriter();

		writer.println("<html><head></head><body>");
		writer.println("첫번째 수 : " + A + "<br>");
		writer.println("두번째 수 : " + B + "<br>");
		writer.println(A + " " + calc + " " + B + "=" + result + "입니다.");
		writer.println("</body></html>");
	}

}
package com.study.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//���� ������ ������ְ� ����(������̼�)
//�ڵ��� ��� ������̼� �̸��� ����ؾ��ؼ� �򰥸� ����

//@WebServlet("/helloworld")
@WebServlet("/hw3")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{

		PrintWriter out = response.getWriter();
		out.println("�ȳ��ϼ���2");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}

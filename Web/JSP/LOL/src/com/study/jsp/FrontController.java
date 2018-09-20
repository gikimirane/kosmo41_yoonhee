package com.study.jsp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Service;

import com.study.jsp.command.BCommand;
import com.study.jsp.command.BContentCommand;
import com.study.jsp.command.BDeleteCommand;
import com.study.jsp.command.BDownloadCommand;
import com.study.jsp.command.BListCommand;
import com.study.jsp.command.BModifyCommand;
import com.study.jsp.command.BReplyCommand;
import com.study.jsp.command.BReplyVIewCommand;
import com.study.jsp.command.BSearchCommand;
import com.study.jsp.command.BWriteCommand;
import com.study.jsp.command.loginOk;

@WebServlet("*.do")
public class FrontController<logoutOk> extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FrontController() {
		super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		System.out.println("doGet");
		actionDo(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		System.out.println("doPost");
		actionDo(request, response);
	}

	private void actionDo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		request.setCharacterEncoding("UTF-8");
		
		System.out.println("action");
		
		String viewPage = null;
		BCommand command = null;
		
		String uri = request.getRequestURI();
//		System.out.println("uri : " + uri);		
		String conPath = request.getContextPath();
//		System.out.println("conPath : " + conPath);		
		String com = uri.substring(conPath.length());
//		System.out.println("command : " + command);
		
		HttpSession session = null;
		session = request.getSession();
		int curPage = 1;
		if (session.getAttribute("cpage") != null) {
			curPage = (int)session.getAttribute("cpage");
		}
		
		
		if (com.equals("/write_view.do")) {
			viewPage = "write_view.jsp";
			DispatcherviewPage(request, response, viewPage);
			
		} else if (com.equals("/write.do")) {
			command = new BWriteCommand();
			command.execute(request, response);
			viewPage = "list.do";
			DispatcherviewPage(request, response, viewPage);
			
		} else if (com.equals("/list.do")) {
			command = new BListCommand();
			command.execute(request, response);
			viewPage = "list.jsp";
			DispatcherviewPage(request, response, viewPage);
			
		} else if (com.equals("/content_view.do")) {
			command = new BContentCommand();
			command.execute(request, response);
			viewPage = "content_view.jsp";
			DispatcherviewPage(request, response, viewPage);
			
		} else if (com.equals("/modify_view.do")) {
			command = new BContentCommand();
			command.execute(request, response);
			viewPage = "modify_view.jsp";
			DispatcherviewPage(request, response, viewPage);
			
		} else if (com.equals("/modify.do")) {
			command = new BModifyCommand();
			command.execute(request, response);
			command = new BContentCommand();
			command.execute(request, response);
			viewPage = "content_view.jsp";
			DispatcherviewPage(request, response, viewPage);
			
		} else if (com.equals("/delete.do")) {
			command = new BDeleteCommand();
			command.execute(request, response);
			viewPage = "list.do?page="+curPage;
			DispatcherviewPage(request, response, viewPage);
			
		} else if (com.equals("/reply_view.do")) {
			command = new BReplyVIewCommand();
			command.execute(request, response);
			viewPage = "reply_view.jsp";
			DispatcherviewPage(request, response, viewPage);
			
		} else if (com.equals("/reply.do")) {
			command = new BReplyCommand();
			command.execute(request, response);
			viewPage = "list.do?page="+curPage;
			DispatcherviewPage(request, response, viewPage);
			
		} else if(com.equals("/home.do")) {
			viewPage = "home.jsp";
			DispatcherviewPage(request, response, viewPage);
			
		} else if(com.equals("/main.do")) {
			viewPage = "main.jsp";
			DispatcherviewPage(request, response, viewPage);
			
		} else if(com.equals("/search.do")) {
			command = new BSearchCommand();
			command.execute(request, response);
			viewPage = "list.jsp";
			DispatcherviewPage(request, response, viewPage);
			
		} else if(com.equals("/download.do")) {
			command = new BDownloadCommand();
			command.execute(request, response);
			
		} else if (com.equals("/joinOk.do")) {
			joinOk service = new joinOk();
			service.execute(request, response);
			
		} else if (com.equals("/loginOk.do")) {
			loginOk service = new loginOk();
			service.execute(request, response);
			
		} else if (com.equals("/infomodifyOk.do")) {
			infomodifyOk service = new infomodifyOk();
			service.execute(request, response);
			
		} else if (com.equals("/logoutOk.do")) {
			logout(request, response);
		}
	}

	private void logout(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		System.out.println("logoutOK");
		response.setContentType("text/html; charset=UTF-8");
		HttpSession session = request.getSession();
		System.out.println(session);
		session.invalidate();
		response.sendRedirect("home.jsp");
	}
	
	private void DispatcherviewPage(HttpServletRequest request, HttpServletResponse response, String viewPage)
			throws ServletException, IOException
	{
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}
	
}
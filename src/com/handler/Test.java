package com.handler;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=utf-8");
		response.setDateHeader("Expires", -1);
		response.setHeader("Cache-Control", "no-cache");
		response.setHeader("Pragma", "no-cache");
		PrintWriter out = response.getWriter();
		out.println(new Date().toString());
		
		
		//		response.setHeader("Refresh", "5;url=http://www.baidu.com");
//		String referer = request.getHeader("Referer");
//		if(referer == null || !referer.startsWith("http://localhost:90/assignment2")){
//			response.getWriter().println("µ¡¡¥’ﬂ");
//			return;
//			
//		}
//		response.getWriter().println("referer = " + referer);
//		String host = request.getHeader("Host");
//		response.getWriter().println("host = "+host);
//		response.getWriter().println("Your name is... " + referer);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package com.handler;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.query.QueryConstant;
import com.util.JdbcUtility;

/**
 * Servlet implementation class HomepageServlet
 */
@WebServlet("/HomepageServlet")
public class HomepageServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
    Connection con = null;
    PreparedStatement ps = null;
    /**
     * @see GenericServlet#GenericServlet()
     */
    public HomepageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		try {
			con = JdbcUtility.getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		int empno = Integer.parseInt(request.getParameter("EmpNo"));
		String empname = request.getParameter("EmpName");
		String empaddress = request.getParameter("EmpAddress");
		
		if(request.getParameter("btn").equals("insert")){
			try {
				ps = con.prepareStatement(QueryConstant.insert_query);
				ps.setInt(1, empno);
				ps.setString(2, empname);
				ps.setString(3, empaddress);
				int count = ps.executeUpdate();
				if(count != 0){
					pw.println("entry is inserted");
				}
				else{
					pw.println("db is not affected");
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		else if(request.getParameter("btn").equals("modify")){
			try {
				ps = con.prepareStatement(QueryConstant.update_query);
				ps.setInt(3, empno);
				ps.setString(1, empname);
				ps.setString(2, empaddress);
				int count = ps.executeUpdate();
				if(count != 0){
					pw.println("entry is modified");
				}
				else{
					pw.println("db is not affected");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		pw.println("<a href=home.html>back</a>");
	}

}

package com.handler;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
 * Servlet implementation class RetriveServlet
 */
@WebServlet("/RetriveServlet")
public class RetriveServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
    Connection con = null;
    PreparedStatement ps = null;  
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public RetriveServlet() {
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
		
		try {
			ps = con.prepareStatement(QueryConstant.retrive_query);
			ps.setInt(1, empno);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				pw.println("entry is retrived");
				pw.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
			}
			else{
				pw.println("db is not affected");
			}
			pw.println("<a href=home.html>back</a>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}

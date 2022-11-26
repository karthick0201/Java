package controller;

import java.io.IOException; 
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.CustomerDAO;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname=request.getParameter("u_name");
		String psw=request.getParameter("psw");
		HttpSession session = request.getSession();
		/*
		if(uname.equals("admin") && psw.equals("admin")) {
			response.sendRedirect("front_admin_login.jsp");
		}else if(uname.equals("cus") && psw.equals("cus")) {
			response.sendRedirect("front_customer_login.jsp");
		}else {
			PrintWriter pw=response.getWriter();
			pw.println("Not Vaild!!!");
			//RequestDispatcher rd= request.getRequestDispatcher("index.jsp");
		}*/
		if(uname.equals("admin") && psw.equals("admin")) {
			session.setAttribute("s_u_name",uname);
			response.sendRedirect("front_admin_login.jsp");
		}else if(CustomerDAO.isVaildLogin(uname,psw)){
			session.setAttribute("s_u_name",uname);
			response.sendRedirect("front_customer_login.jsp");
		}else {
			request.setAttribute("message","Invalid passord");
			//response.sendRedirect("index.jsp");
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.include(request, response);
		}
	}

}

package controller;

import java.io.IOException; 
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.CustomerDAO;

import model.CustomerPojo;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int cus_id; //Primary Key
		String cusName=request.getParameter("c_name");
		String contactNo=request.getParameter("c_phno");
		String cusType=request.getParameter("type");
		String emailId=request.getParameter("c_email");
		String userName=request.getParameter("c_uname"); //Unique key
		String password=request.getParameter("c_psw");;
//		System.out.println(cusName +" : "+ contactNo +" : "+ cusType +" : "+ emailId +" : "+ userName +" : "+ password);
		CustomerPojo c=new CustomerPojo(cusName,contactNo,cusType,emailId,userName,password);
//		PrintWriter pw=response.getWriter();
//		pw.println(c);
		CustomerDAO.addCustomer(c);
//		pw.println("Register Successfulll!!!");
		response.sendRedirect("index.jsp");
		

	}

}

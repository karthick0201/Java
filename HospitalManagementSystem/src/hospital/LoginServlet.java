package hospital;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<Patient> aL=new ArrayList<Patient>();
		String name=request.getParameter("pname");
		String phoneNo=request.getParameter("pnumber");
		String inTime=request.getParameter("intime");
		int doctorTime=Integer.parseInt(request.getParameter("docTime"));
		Patient p=new Patient(name,phoneNo,inTime,doctorTime);
		aL.add(p);
		UserDAO uDAO = new UserDAO();
		try {
			try {
				uDAO.insertUser(p);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		request.setAttribute("pname", name );
		request.setAttribute("pnumber", phoneNo);
		request.setAttribute("intime", inTime );
		request.setAttribute("docTime", doctorTime );
		
		
		
		
		RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
		rd.forward(request, response);
		doGet(request, response);
	}

}

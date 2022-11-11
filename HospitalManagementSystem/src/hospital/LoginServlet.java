package hospital;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	@SuppressWarnings("deprecation")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("p_id"));
		String phoneNo=request.getParameter("p_phoneno");
		System.out.println("-----------------------");
		System.out.println("Id : " + id);
		System.out.println("pno : " + phoneNo);
		PrintWriter pw=response.getWriter();
		if(UserDAO.isVaildate(id,phoneNo)) {
			HttpSession session = request.getSession(true);
			session.putValue("id", id);
			
//			response.sendRedirect(request.getContextPath() + "/SummaryServlet");
			
			RequestDispatcher rd = request.getRequestDispatcher("UserProfile.jsp");
			rd.forward(request, response);
		}else {
			//pw.println("<<<<<<<ID & PASSWORD MISMATCH>>>>>>>");
			//RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
//			pw.println("<a href = \"login.jsp\">Retry</a>");
			//rd.include(request, response);
			//rd.forward(request, response);
			pw.println("<a href = \"login.jsp\">Retry</a>");
//			response.sendRedirect("login.jsp");

			pw.println();
		}
		System.out.println("-----------------------");
		
		
		doGet(request, response);
	}

}

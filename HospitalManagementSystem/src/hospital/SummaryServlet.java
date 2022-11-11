package hospital;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SummaryServlet")
public class SummaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SummaryServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		String inTime=request.getParameter("in_time");
//		String doctorTime=request.getParameter("doc_time");
//		hospitalTimeCalculate(inTime,doctorTime);
//		
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	private Patient hospitalTimeCalculate(int p_id,String inTime,int doctorTime) {

		int minutes=0;
		//MEDICAL PROFESSIONALS: -- 5MINS EACH
		final int medicalProfessionals=10; //2.
		/*-----------------------------------------------------------*/
		//MEET DOCTOR TOOK TIME BETWEEN 2 TO 20 MINS   
		//(int)(Math.random()*(max-min+1)+min);   ---> format
		int min=2;
        int max=20;
//        int doctorTime=(int)(Math.random()*(max-min+1)+min);  //----> below code randomly generate we given numbers
        //System.out.println("Doctor Time : " + doctorTime);
        /*-----------------------------------------------------------*/
        int pharmacy = 5;
        
        minutes=medicalProfessionals+doctorTime+pharmacy;

        int aboveTime=10;
        int waitingTime=0;
  
        if(doctorTime>aboveTime) {
        	waitingTime=doctorTime-max+aboveTime;
        	System.out.println("Waiting Time          : " +waitingTime);
        	System.out.println("<*****SorrY FoR LatE*****>");
        }else {
        	System.out.println("Waiting Time          : " +waitingTime);
        }      	
        DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm");
	    LocalTime lt = LocalTime.parse(inTime);
	    String outtime=df.format(lt.plusMinutes(minutes));
	      Patient p = new Patient(p_id,inTime,doctorTime,waitingTime,outtime);
	      if(UserDAO.update(p)) {
	    	  return p;
	      }
	      return null;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*RETRIVE SESSION*/
		
		HttpSession session = request.getSession(true);
		int p_id=(int) session.getValue("id");
		System.out.println("Id : " + p_id);
		//		if() {
//			
//		}
		
		
		/*********************************************/
		String inTime=request.getParameter("in_time");
		int doctorTime=Integer.parseInt(request.getParameter("doc_time"));
		Patient  p = hospitalTimeCalculate(p_id,inTime,doctorTime);
		
	    	request.setAttribute("pid", p.patient_id);
			request.setAttribute("pname", p.name );
			request.setAttribute("pnumber", p.phoneNo);
			request.setAttribute("intime", p.inTime );
			request.setAttribute("docTime", p.doctorTime );
			request.setAttribute("waitTime", p.waitingTime);
			request.setAttribute("outTime", p.outTime);
			
			RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
			rd.forward(request, response);
//			response.sendRedirect("welcome.jsp");
//		doGet(request, response);
	}
}

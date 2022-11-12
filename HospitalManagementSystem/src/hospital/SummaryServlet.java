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

	private void hospitalTimeCalculate(Patient p) {

		int minutes=0;
		//MEDICAL PROFESSIONALS: -- 5MINS EACH
		final int medicalProfessionals=10; //2.
		/*-----------------------------------------------------------*/
		//MEET DOCTOR TOOK TIME BETWEEN 2 TO 20 MINS   
		//(int)(Math.random()*(max-min+1)+min);   ---> format
		/*-----------------------------------------------------------*/
		int min=2;
        int max=20;
        int pharmacy = 5;
        
        minutes=medicalProfessionals+p.doctorTime+pharmacy;

        int aboveTime=10; //IF MORE THAN , WAITING TIME WILL BE CALCULATED
        int waitingTime=0;
        
        /*-------------------------
           CALCULATE WAITING-TIME:
        -------------------------*/
        if(p.doctorTime>aboveTime) {
        	waitingTime=p.doctorTime-max+aboveTime;
        	p.setWaitingTime(waitingTime);
        	System.out.println("Waiting Time          : " +waitingTime);
        	System.out.println("<*****SorrY FoR LatE*****>");
        }else {
        	p.setWaitingTime(waitingTime);
        	System.out.println("Waiting Time          : " +waitingTime);
        }      	
        
        /*-------------------------
          CALCULATE OUT-TIME:
     	-------------------------*/
        
        DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm");
	    LocalTime lt = LocalTime.parse(p.inTime);
	    String outtime=df.format(lt.plusMinutes(minutes));
	    
	    p.setOutTime(outtime);
	     
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*RETRIVE SESSION*/
		
		HttpSession session = request.getSession(true); //--> FUTURE We set value in not integer direct object 
		int p_id=(int) session.getValue("id");
		System.out.println("Id : " + p_id);

		
		/*************GET VALUE FROM PARAMETER************/
		String inTime=request.getParameter("in_time");
		int doctorTime=Integer.parseInt(request.getParameter("doc_time"));
		//TEMPORVARY OBJECT CREATION:
		Patient p=new Patient();
		//SET USER GIVEN VALUES TO THIS OBJECT
		p.setPatient_id(p_id);
		p.setInTime(inTime);
		p.setDoctorTime(doctorTime);
		//CALCUALE WAITING TIME & OUT-TIME 
		hospitalTimeCalculate(p);
		/*****GET TABLE-1 NAME AND PHONE NUMBER VIA PATIENT_ID:******/
		UserDAO.getPatientDetails(p);
		/*------------------------------------------------*/
	    	request.setAttribute("pid", p.patient_id);
			request.setAttribute("pname", p.name );
			request.setAttribute("pnumber", p.phoneNo);
			request.setAttribute("intime", p.inTime );
			request.setAttribute("docTime", p.doctorTime );
			request.setAttribute("waitTime", p.waitingTime);
			request.setAttribute("outTime", p.outTime);
			/*****UPLOAD TO SECOND TABLE(DB)******/
			UserDAO.insertCheckUpDetailsDB2(p);
			/*------------------------------------------------*/
			
			RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
			rd.forward(request, response);
//			response.sendRedirect("welcome.jsp");
//			doGet(request, response);
	}
}

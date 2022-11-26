package controller.admin;

import java.io.IOException; 

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.VehiclePojo;


@WebServlet("/AddVehicleServlet")
public class AddVehicleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int carSeatCount,carPricePerDay;
		String carName,carNum,carModelNo,carType,carDescription,carStatus,carPhoto = null;
		System.out.println("Dopost method");
		carName=request.getParameter("car_name");
		carNum=request.getParameter("car_no");
		carModelNo=request.getParameter("car_model_no");
		carType=request.getParameter("car_type");
		carSeatCount=Integer.parseInt(request.getParameter("car_seat_count"));
		carPricePerDay=Integer.parseInt(request.getParameter("car_price_per_day"));
		carDescription=request.getParameter("car_desc");
		carStatus=request.getParameter("car_status");
		
		
		VehiclePojo vp=new VehiclePojo(carName,carNum,carModelNo,carType,carSeatCount,carPricePerDay,carDescription,carStatus,carPhoto);
		System.out.println(vp);
		HttpSession s2=request.getSession();
		s2.setAttribute("vehicleNew", vp);
		//request.setAttribute("vehicleNew", vp);
		RequestDispatcher rd=request.getRequestDispatcher("addPhoto.jsp");
		rd.forward(request, response);
	}

		/*--------------
		 * PHOTO PROCESS:
		 * --------------
		 * 1. CREATE PART OBJECT
		 * 2. GET IMAGE NAME --> a1.jpg
		 * 3. GET SOURCE PATH --> string path="desktop/photo/ + (imagename)";
		 * 4. UPLOAD FOLDER
		 * 5. 
		 * */

}

package controller.admin;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import DAO.VehicleDAO;
import model.VehiclePojo;

@MultipartConfig
@WebServlet("/AddPhoto")
public class AddPhotoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*--------------
		 * PHOTO PROCESS:
		 * --------------
		 * 1. CREATE PART OBJECT
		 * 2. GET IMAGE NAME --> a1.jpg
		 * 3. GET SOURCE PATH --> string path="desktop/photo/ + (imagename)";
		 * 4. UPLOAD FOLDER
		 * 5. Upload vehicle in database
		 * 6. AFTER UPDATING DATA IN DB --> REDIRECT TO ADDVEHICLE PAGE
		 * -----------------------------*/
		String imgFileName = "PhotoNameNotGetcheckError";
		try {
			Part file=request.getPart("car_img");
			//2. GET IMGFILENAME
			imgFileName = file.getSubmittedFileName();
			System.out.println("imgFileName " + imgFileName);
			//3. GET SOURCE PATH -->SET UPLOADED SOURCE PATH
			//String uploadPath="C:/Users/Administrator/eclipse-workspace/VehicleRental/WebContent/images/"+imgFileName;
			String uploadPath="C:/Users/Administrator/git/Java/VehicleRental/WebContent/images/" + imgFileName;
			
			System.out.println("Upload path : " + uploadPath);
			
			//4. UPLOAD TO FOLDER
			photoUploadToFolder(uploadPath,file);
			
			//5. Upload vehicle in database
			  //GET VEHICLE DATA FROM SESSION 
			VehiclePojo vp=(VehiclePojo) request.getSession().getAttribute("vehicleNew");
			  // CLEAR VEHILCE DATA FROM SESSION
			request.getSession().removeAttribute("vehicleNew");
			
			System.out.println("upload path print : " + uploadPath);
			System.out.println("ViclePojo print : " + "\n" + vp);
			vp.setCarPhoto(imgFileName);
			//request.setAttribute("vehicleNew", vp);
			VehicleDAO.addVehicle(vp);
			//6. AFTER UPDATING DATA IN DB --> REDIRECT TO ADDVEHICLE PAGE
			response.sendRedirect("addVehicle.jsp");
		} catch (IOException | ServletException e) {
			System.out.println("Exception!!! in catch block");
			e.printStackTrace();
		}
	
	}

	private void photoUploadToFolder(String uploadPath, Part file) {
		
		//4. UPLOAD TO FOLDER
		
		try {
			FileOutputStream fos=new FileOutputStream(uploadPath); // to upload to photo
			InputStream fis = file.getInputStream(); // Part Object we gave in this place
			byte[] data=new byte[fis.available()];
			fis.read(data);
			fos.write(data);
			//fos.flush();
			fos.close();
			System.out.println("Successfully Photo uploaded to Eclipse workSpace!!! ");
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}

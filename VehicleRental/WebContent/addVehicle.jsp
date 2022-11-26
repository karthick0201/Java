<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ADD VEHICLE</title>
</head>
<body>
<h2>Add Vehicle</h2>
<form method="post" action="AddVehicleServlet" ><!--  enctype='multipart/form-data' -->
<label>CAR NAME : </label> <input type="text" name="car_name"> <br><br>
<label>NUMBER : </label> <input type="text" name="car_no"> <br><br>
<label>MODEL-NO : </label> <input type="text" name="car_model_no"><br><br>
<label>TYPE : </label> <input type="text" name="car_type"><br><br>
<label>SEAT COUNT : </label> <input type="number" name="car_seat_count"><br><br>
<label>Price-per Day : </label> <input type="number" name="car_price_per_day"><br><br>
<label>Description : </label> <textarea id="w3review" name="car_desc" rows="4" cols="50"></textarea> <br><br>


<label for="car_status">Choose a car:</label>

<select name="car_status" id="cars">
  <option value="avaiable">Available</option>
  <option value="not avaiable">Not Available</option>
</select>
<br>
<!-- <label>Photo Upload  : </label> <input type="file" name="car_img"> -->

<input type="submit" value="Submit" name="">
<input type="submit" value="Reset" name=""><br><br>


</form>
</body>
</html>
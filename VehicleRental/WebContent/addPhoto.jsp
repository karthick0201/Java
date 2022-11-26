<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Upload Photo</title>
</head>
<body>
<h2>Vehicle PHoto</h2>
<form method="post"  action="AddPhoto" enctype='multipart/form-data'>
<label>Photo Upload  : </label> <input type="file" name="car_img">
<%-- <input type="hidden" value="${request.getAttribute("vehicleNew");}" name="vehiclepojo_object"> --%>
<%-- <input type="hidden" name="vehiclepojo_object" value="${vehicleNew}" /> --%>
<input type="submit" value="upload">
</form>
</body>
</html>
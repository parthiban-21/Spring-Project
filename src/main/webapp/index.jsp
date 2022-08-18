<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Account</title>
</head>
<body>
<form action="login">
<label>Name: </label>
<input type="text" name="name" placeholder="Enter Name" >
<label>Mail-ID:</label>
<input type="email" name="mailid" placeholder="Enter Email-ID">
<label>Password: </label>
<input type="password" name= "password" placeholder="Enter Password">
<input type="submit" value = "Submit">
</form><br>
<form action="update">
<label>Mail-ID:</label>
<input type="email" name="email" placeholder="Enter Existing Mail-ID">
<label>Password:</label>
<input type="password" name="newpassword" placeholder="Enter New Password">
<input type="submit" value = "Update">
</form><br>
<form action="delete">
<label>Mail-ID:</label>
<input type="email" name="emailid" placeholder="Enter Existing Mail-ID">
<label>Password:</label>
<input type="password" name="psw" placeholder="Confirm Password">
<input type="submit" value = "Delete">
</form><br>
</body>
</html>
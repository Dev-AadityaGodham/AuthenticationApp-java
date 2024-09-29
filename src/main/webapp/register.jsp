<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
<link rel="stylesheet" type="text/css" href="registerStyle.css" ></link>
</head>
<body>
 <img alt="" src="images\register.gif"><br>
	<div class=container>
	<h1>Registration</h1>
	<form action="registerServlet" method="post">
	<label for= "username" >Username</label>
	<input type="text" id ="username" name = "username" required></input>
	<label for ="email">Email</label>
	<input type="email" id ="email" name = "email" required></input>
	<label for ="password">Password</label>
	<input type="password" id ="password" name = "password" required></input><br>
	<button type="submit">Register</button>
	</form>
	<p><a href="index.html">Back To The Home</a></p>
	</div>
</body>
</html>
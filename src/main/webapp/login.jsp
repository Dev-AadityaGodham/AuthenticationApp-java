<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
<link rel="stylesheet" type="text/css" href="loginStyle.css" ></link>
</head>
<body>
	<img alt="" src="images\login.gif"><br>
	<div class=container>
	<h1>Login</h1>
	<form action="loginServlet" method="post">
	<label for= "username">Username</label>
	<input type="text" id ="username" name="username" required></input><br>
	<label for ="password">Password</label>
	<input type="password" id ="password" name="password" required ></input><br>
	<button type="submit">Login</button>
	</form>
	<p><a href="index.html">Back To The Home</a></p>
	 <% String error = request.getParameter("error");
            if (error != null && error.equals("1")) { %>
                <p style="color: white;">Invalid username or password. Please try again.</p>
        <% } %>
	</div>
</body>
</html>
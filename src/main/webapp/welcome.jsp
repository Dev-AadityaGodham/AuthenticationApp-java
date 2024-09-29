<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>welcome.jsp</title>
<link rel="stylesheet" type="text/css" href="indexStyle.css" ></link>
</head>
<body>
<div class= container>
<%
HttpSession session1 = request.getSession(false);
if (session != null && session1.getAttribute("username") != null) {
    // Get the username from the session
    String username = (String) session1.getAttribute("username");
%>
<img alt="" src="images\welcome.gif"><br>
 <h2>Welcome, <%= username %></h2>
 <h3>User able to Sign in if the data is stored in database</h3>
 <h3>else user can create the user id and able ro register it self</h3>
  
 <a href="logout.jsp">LogOut</a>
 </div>
  <%
        } else {
            // Redirect to the login page if the session is not valid
            response.sendRedirect("login.jsp");
        }
    %>
</body>
</html>
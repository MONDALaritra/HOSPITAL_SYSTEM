<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import = "javax.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>

<body>
	<%
	HttpSession currentSession = request.getSession(false);
		if(currentSession != null){
			currentSession.invalidate();
		}
	
		response.sendRedirect("index.jsp");
	%>
</body>
</html>
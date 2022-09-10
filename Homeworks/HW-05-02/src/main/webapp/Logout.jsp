<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    session.removeAttribute("username");
    response.sendRedirect("Login.jsp");
%>
<html>
<head>
    <title>Logout</title>
</head>
<body>

</body>
</html>

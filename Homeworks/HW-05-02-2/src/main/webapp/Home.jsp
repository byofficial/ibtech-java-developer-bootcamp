<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if (session.getAttribute("username") == null) {
        response.sendRedirect("Login.jsp");
    }
%>
<html>
<head>
    <title>Home</title>
</head>
<body>
Hoşgeldin, <%=session.getAttribute("username")%><br/>
<a href="Logout.jsp">Çık</a>
</body>
</html>

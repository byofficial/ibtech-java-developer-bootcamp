<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String username = "godoro";
    session.setAttribute("username", username);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
Oturma koyuldu : <%=username%>
</body>
</html>

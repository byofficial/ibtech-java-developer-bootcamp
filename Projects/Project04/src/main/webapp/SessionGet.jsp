<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String username = (String) session.getAttribute("username");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
Oturumdan alındı : <%=username%>
</body>
</html>

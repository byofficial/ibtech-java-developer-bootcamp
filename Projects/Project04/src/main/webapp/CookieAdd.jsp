<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Cookie cookie = new Cookie("company", "godoro");
    response.addCookie(cookie);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
Çerez eklendi: <%=cookie.getValue()%>
</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String company = "";
    if (request.getCookies() != null) {
        for (Cookie cookie : request.getCookies()) {
            if (cookie.getName().equals("company")) {
                company = cookie.getValue();
            }
        }
    }
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
Çerez alındı: <%=company%>
</body>
</html>

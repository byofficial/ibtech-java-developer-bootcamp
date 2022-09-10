<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    int left = Integer.parseInt(request.getParameter("left"));
    int right = Integer.parseInt(request.getParameter("right"));
    int sum = left + right;
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
Toplam: <%=sum%>
</body>
</html>

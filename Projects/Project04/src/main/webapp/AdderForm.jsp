<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    int sum = 0;
    int left = 0;
    int right = 0;
    if (request.getParameter("add") != null) {
        left = Integer.parseInt(request.getParameter("left"));
        right = Integer.parseInt(request.getParameter("right"));
        sum = left + right;
    }
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
Toplam: <%=sum%><br/>
<form action="AdderForm.jsp" method="POST">
    Sol: <input type="text" name="left" value="<%=left%>"/><br/><br/>
    Sağ: <input type="text" name="right" value="<%=right%>"/> <br/><br/>
    <input type="submit" value="Topla" name="add">
</form>
</body>
</html>

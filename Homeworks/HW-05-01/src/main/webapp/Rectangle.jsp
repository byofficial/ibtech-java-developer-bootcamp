<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.ibtech.geometry.Rectangle " %>
<%
    int height = 0;
    int width = 0;
    int area = 0;
    int perimeter = 0;
    if (request.getParameter("result") != null) {
        height = Integer.parseInt(request.getParameter("height"));
        width = Integer.parseInt(request.getParameter("width"));
        Rectangle rectangle = new Rectangle(width, height);
        area = rectangle.getArea();
        perimeter = rectangle.getPerimeter();
    }
%>
<html>
<head>
    <title>Homework | Rectangle</title>
</head>
<body>
Alan = <%=area%><br/>
Çevre = <%=perimeter%><br/>
<form action="Rectangle.jsp" method="POST">
    Genişlik: <input type="text" name="width" value="<%=width %>"/><br/><br/>
    Yükseklik: <input type="text" name="height" value="<%=height%>"/> <br/><br/>
    <input type="submit" value="Sonuç" name="result">
</form>
</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String username = "";
    String password = "";
    String message = "";
    if (request.getParameter("login") != null) {
        username = request.getParameter("username");
        password = request.getParameter("password");
        if (username.equals("godoro") && password.equals("java")) {
            session.setAttribute("username", username);
            response.sendRedirect("Home.jsp");
        } else {
            message = "K.adı veya Parola Hatalı!";
        }
    }

%>
<html>
<head>
    <title>Login</title>
</head>
<body>
<%=message%> <br/>
<form action="Login.jsp" method="POST">
    K.Adı: <input type="text" name="username" value="<%=username%>"><br/><br/>
    Parola: <input type="text" name="password" value="<%=password%>"><br/><br/>
    <input type="submit" value="Giriş Yap" name="login"><br/><br/>
</form>
</body>
</html>

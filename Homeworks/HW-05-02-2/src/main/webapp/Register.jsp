<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.ibtech.entity.User " %>
<%@ page import="com.ibtech.manager.UserManager " %>
<%
    String username = "";
    String password = "";
    String message = "";
    if (request.getParameter("register") != null) {
        username = request.getParameter("username");
        password = request.getParameter("password");

        UserManager userManager = new UserManager();
        User user = userManager.findByUserName(username);

        if (user == null) {
            userManager.create(new User(0, username, password));
            session.setAttribute("username", username);
            response.sendRedirect("Home.jsp");
        } else {
            message = "Kullancı adı zaten kayıtlı!";
        }
    }

%>
<html>
<head>
    <title>Register</title>
</head>
<body>
<%=message%> <br/>
<form action="Register.jsp" method="POST">
    K.Adı: <input type="text" name="username" value="<%=username%>"><br/><br/>
    Parola: <input type="text" name="password" value="<%=password%>"><br/><br/>
    <input type="submit" value="Kayıt Ol" name="register"><br/><br/>
</form>
<br/>
<a href="Login.jsp">Üyeliğim var, Giriş Yap!</a>
</body>
</html>

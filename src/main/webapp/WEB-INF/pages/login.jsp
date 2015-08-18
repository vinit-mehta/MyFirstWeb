<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Home
  Date: 08-Aug-15
  Time: 11:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Form</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>
<section class="container">
    <div class="login">
        <h1>Login to RawMart</h1>
    <div class="error">${error}</div>
    <div class="msg">${msg}</div>
    <form name='loginForm' action="<c:url value='j_spring_security_check' />" method='POST'>
        <p><input type="text" name="username" value="" placeholder="Username"></p>
        <p><input type="password" name="password" value="" placeholder="Password"></p>
        <p class="remember_me">
            <label>
                <input type="checkbox" name="remember_me" id="remember_me">
                Remember me on this computer
            </label>
        </p>
        <p class="submit"><input type="submit" name="commit" value="Login"></p>
    <input type="hidden" name="${_csrf.parameterName}"
           value="${_csrf.token}" />



</form>
</div>
    </section>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: lll
  Date: 2022/3/6
  Time: 23:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="register">
    <input name="user" type="text" value="user"/> <br/>
    <input name="password" type="password"minlength="8" value="password"> <br/>
    <input name="Email" type="email" value="Email"/> <br/>

    Gender<input name="sex" type="radio" value="Man"/>Man
    <input name="sex" type="radio" value="Female"/>Female <br/>
    <input name="Date" type="date" value="(yyyy-mm-dd)"/> <br/>

    <input name="register" type="submit" value="register" />
</form>
</body>
</html>

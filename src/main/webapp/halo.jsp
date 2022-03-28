<%--
  Created by IntelliJ IDEA.
  User: lll
  Date: 2022/3/28
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>标题</title>
</head>
<body>
Hello:<br>
<font color="green" size="22">
    <%
        System.out.print(request.getParameter("userName")+"<br>");
    %>
</font>
<a href="<%=request.getContextPath()%>login.jsp">重新登录</a>
</body>
</html>

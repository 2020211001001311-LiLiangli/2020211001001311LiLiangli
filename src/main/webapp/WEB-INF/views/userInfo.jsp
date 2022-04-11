<%@ page import="com.LiLiangli.model.User"%><%--
  Created by IntelliJ IDEA.
  User: lll
  Date: 2022/4/11
  Time: 22:17
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    //    User user=(User) request.getAttribute("user");
    User u=(User) session.getAttribute("user");
%>
<%@ include file="header.jsp" %>
<html>
<head>
    <title>userInfo</title>
</head>
<body>
<table border="1" width="600">
    <tr>
        <td>id</td>
        <td><%=u.getId()%></td>
    </tr>
    <tr>
        <td>username</td>
        <td><%=u.getUsername()%></td>
    </tr>
    <tr>
        <td>password</td>
        <td><%=u.getPassword()%></td>
    </tr>
    <tr>
        <td>email</td>
        <td><%=u.getEmail()%></td>
    </tr>
    <tr>
        <td>gender</td>
        <td><%=u.getGender()%></td>
    </tr>
    <tr>
        <td>birthday</td>
        <td><%=u.getBirthDate()%></td>
    </tr>

</table>
<a href="updateuser">userupdate</a>
</body>
</html>

<%@ include file="footer.jsp"%>
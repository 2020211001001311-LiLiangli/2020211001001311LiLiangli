<%--
  Created by IntelliJ IDEA.
  User: lll
  Date: 2022/4/11
  Time: 22:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<h1> userinfo</h1>

<table>
    <tr>
        <td>id:</td>
        <td><%=request.getAttribute("id")%></td>
    </tr>
    <tr>
        <td>username:</td>
        <td><%=request.getAttribute("username")%></td>
    </tr>
    <tr>
        <td>password:</td>
        <td><%=request.getAttribute("password")%></td>
    </tr>
    <tr>
        <td>email:</td>
        <td><%=request.getAttribute("email")%></td>
    </tr>
    <tr>
        <td>gender:</td>
        <td><%=request.getAttribute("gender")%></td>
    </tr>
    <tr>
        <td>birthday:</td>
        <td><%=request.getAttribute("birthday")%></td>
    </tr>

</table>
<%@include file="footer.jsp"%>
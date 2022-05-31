<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: lll
  Date: 2022/5/18
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    String id=request.getParameter("id");
    String name=request.getParameter("name");
    String Class=request.getParameter("Class");

    out.println("name: "+name);
    out.println("class: "+Class);
    out.println("id: "+id);
%>
     id:${param.id}

</body>
</html>

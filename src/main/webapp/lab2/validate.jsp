<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 5/15/2021
  Time: 11:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>validate</title>
</head>
<body>
<jsp:useBean id="l" class="com.LiLiangli.lab2.login" scope="request" />
<%-- Login l=new Login() --%>
<jsp:setProperty name="l" property="username" />
<jsp:setProperty name="l" property="password" />


<%
   if(l.getUsername().equals("admin")&&l.getPassword().equals("admin")){

%>
    <jsp:forward page="welcome.jsp"></jsp:forward>

<%}else{
       out.println("username or password error message");
%>



<jsp:include page="login.jsp"></jsp:include>



<%}%>

</body>
</html>
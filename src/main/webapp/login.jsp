<%--
  Created by IntelliJ IDEA.
  User: lll
  Date: 2022/3/28
  Time: 20:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>标题</title>
    <style type="text/css">
        *{margin: 0;padding: 0;}
        form{margin: 0 auto;padding:15px; width: 300px;height:300px;text-align: center;}
        #submit{padding: 10px}
        #submit input{width: 50px;height: 24px;}
    </style>
</head>
<body>
<div class="wrapper">
    <form action="<%=request.getContextPath()%>/loginDemo" method="post">
        <label>用户名:</label>
        <input type="text" name="userName" value="${param.userName}"/><br><br>
        <label>密码：</label>
        <input type="password" name="password"/><br>

        <font color="red">
            <%
                if(request.getAttribute("message")!= null){
                    System.out.print(request.getAttribute("message"));
                }
            %>
        </font>

        <div id="submit">
            <input type="submit" value="登录"/>
        </div>
    </form>

</div>
</body>
</html>
<%@include file="footer.jsp"%>
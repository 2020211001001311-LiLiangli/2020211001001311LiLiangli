<%--
  Created by IntelliJ IDEA.
  User: lll
  Date: 2022/5/18
  Time: 9:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type"
          content="text/html; charset=ISO-utf-8">
    <title>登录</title>
    <style>
        #a {

            width:50%;
            height:200px;
            border: 1px dashed ;
            text-align:center;
        }

    </style>
</head>
<body>
<div id="a">
    <h1>i am MyJsp.jsp</h1>
    <form action="myDear" method="post">
        name:<input type="text" name="name" value="name"/> <br>

        class:<input type="text"name="Class" value="Class"/>  <br>

        ID:<input type="text"name="id" value="id"/>  <br>


        <input type="submit" value="send data"/>
    </form>
</div>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: lll
  Date: 2022/3/6
  Time: 23:00
  To change this template use File | Settings | File Templates.
--%>
<%@include file="header.jsp"%>
<form method="post" action="register">
    <input name="Id" type="text" value="Id" /><br/>

    <input name="user" type="text" value="user"/> <br/>
    <input name="password" type="password"minlength="8" value="password"> <br/>
    <input name="Email" type="email" value="Email"/> <br/>

    Gender<input name="sex" type="radio" value="Male"/>Male
    <input name="sex" type="radio" value="Female"/>Female <br/>
    <input name="Date" type="date" value="(yyyy-mm-dd)"/> <br/>

    <input name="register" type="submit" value="register" />
</form>
<%@include file="footer.jsp"%>

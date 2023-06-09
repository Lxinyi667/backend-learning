<%--
  Created by IntelliJ IDEA.
  User: 17161
  Date: 2023/3/7
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<style>
    h3{
        margin-left: 30px;
        margin-top: 15px;
    }
    form{
        width: 200px;
        height: 200px;
        border: 1px solid lightpink;
        padding:10px 0 0 15px;
    }
</style>
<body>
<h3>用户注册登录页面</h3>
<h4>${message}</h4>
<form action="${pageContext.request.contextPath}/LoginUser" method="post" >
  用户名: <input type="text" name="username" /><br /><br />

  密&nbsp;&nbsp;&nbsp;码: <input type="password" name="password" /><br />
    <br />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="submit" value="注册" />

</form>
</body>
</html>

<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 17161
  Date: 2023/3/7
  Time: 21:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>调查问卷success</title>
</head>
<style>
  h3{
    margin-left: 30px;
    margin-top: 15px;
  }
  .box{
    width: 300px;
    height: 200px;
    border: 1px solid lightpink;
    padding:10px 0 0 15px;
  }
</style>
<body>
<%
    List<String> list = (List<String>) request.getAttribute("purpose");
%>
<h3>Hello❤</h3>
<div class="box">
  <h4>姓名：${name}</h4>
  <h4>方向：${course}</h4>
  <h4>学习目的：${purpose}</h4>
<%--    <%--%>
<%--        for (String s : list) {--%>


<%--    %>--%>
<%--        <%=s%>>&nbsp;--%>
<%--    <%--%>
<%--        }--%>
<%--    %>--%>
</div>
</body>
</html>

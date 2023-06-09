<%--
  Created by IntelliJ IDEA.
  User: 17161
  Date: 2023/3/7
  Time: 19:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生调查问卷</title>
</head>
<style>
  .container{
    height: 450px;
    width:400px;
    border: 1px solid lightpink;
    margin: 0 auto;
    padding-left: 20px;
  }
  button{
    margin-left: 50px;
  }
</style>
<body>
<div class="container">
  <h2>学生调查问卷</h2>
  <form action="${pageContext.request.contextPath}/FormList" method="post">
  <h3>您的姓名:</h3>
    <label>
        <input class="text" name="name" style="width: 150px;">
    </label>
  <h3>您正在学习的技术方向:</h3>
<%--  <form action="${pageContext.request.contextPath}/LoginUser" method="post">--%>
    <select name="course">
      <option selected="selected" value="java">Java</option>
      <option value="python">Python</option>
      <option value="html5">HTML5</option>
      <option value="php">PHP</option>
    </select>


<div>
  <h3>您的学习目的:</h3>
  <label>
    <input type="checkbox" name="purpose" value="就业找工作">
    就业找工作
  </label>
  <label>
    <input type="checkbox" name="purpose" value="工作要求">
    工作要求
  </label>
  <label>
    <input type="checkbox" name="purpose" value="兴趣爱好">
    兴趣爱好
  </label>
  <label>
    <input type="checkbox" name="purpose" value="其他">
    其他
  </label>
  <br /><br />
 <button style="width: 50px;">提交</button>
</div>
</form>
</div>
</body>
</html>

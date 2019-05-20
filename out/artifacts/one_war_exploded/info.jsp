<%@ page import="Eltest.Course" %><%--
  Created by IntelliJ IDEA.
  User: 匡志儒
  Date: 2019/5/14
  Time: 22:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

  <h1>姓名：${requestScope.Course.name}</h1>
  <h2>编号：${requestScope.Course.id}</h2>
  <h3>所属方向：${requestScope.Course.category}</h3>

</body>
</html>

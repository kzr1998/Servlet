<%--
  Created by IntelliJ IDEA.
  User: 匡志儒
  Date: 2019/5/12
  Time: 23:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String value = (String)session.getAttribute("message");

    response.setContentType("text/html;charset=UTF-8");
    response.getWriter().println("<h1>"+value+"</h1>");
%>
</body>
</html>

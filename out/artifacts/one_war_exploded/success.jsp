<%--
  Created by IntelliJ IDEA.
  User: 匡志儒
  Date: 2019/5/12
  Time: 22:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String value = request.getParameter("fruits");
    out.println("<h1>"+value+"</h1>");
%>

</body>
</html>

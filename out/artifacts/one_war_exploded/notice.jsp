<%--
  Created by IntelliJ IDEA.
  User: 匡志儒
  Date: 2019/5/21
  Time: 1:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <c:forEach items="${requestScope.notice}" var="n">
      <h1>${n.id}————${n.name}</h1>
  </c:forEach>
</body>
</html>

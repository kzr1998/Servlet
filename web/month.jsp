<%--
  Created by IntelliJ IDEA.
  User: 匡志儒
  Date: 2019/5/21
  Time: 1:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <c:forEach items="${requestScope.month}" var="m" varStatus="idx">
      <h1>${idx.index+1}——${m.month}</h1>
   </c:forEach>
</body>
</html>

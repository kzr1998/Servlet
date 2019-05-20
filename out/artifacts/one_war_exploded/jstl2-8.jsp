<%--
  Created by IntelliJ IDEA.
  User: 匡志儒
  Date: 2019/5/21
  Time: 0:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <%request.setAttribute( "x",17 );  %>
  <c:if test="${x>0&&x<=10}">
      <h1>1-10之间的整数</h1>
  </c:if>
   <c:if test="${x>10&&x<=20}">
       <h1>10-20之间的整数</h1>
   </c:if>
</body>
</html>

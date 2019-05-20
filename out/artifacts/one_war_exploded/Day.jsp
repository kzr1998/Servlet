<%--
  Created by IntelliJ IDEA.
  User: 匡志儒
  Date: 2019/5/21
  Time: 0:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:choose>
    <c:when test="${day=='Monday'}">
        <h1 style="color:blue">星期一</h1>
    </c:when><c:when test="${day=='Tuesday'}">
    <h1 style="color:blue">星期二</h1>
</c:when>
    <c:when test="${day=='Wednesday'}">
        <h1 style="color:blue">星期三</h1>
    </c:when>
    <c:when test="${day=='Thursday'}">
        <h1 style="color:blue">星期四</h1>
    </c:when>
    <c:when test="${day=='Friday'}">
        <h1 style="color:blue">星期五</h1>
    </c:when>
    <c:when test="${day=='Saturday'}">
        <h1 style="color:blue">星期六</h1>
    </c:when>
    <c:when test="${day=='Sunday'}">
        <h1 style="color:blue">星期天</h1>
    </c:when>
    <c:otherwise>
        <h2 style="color: red">内容不对呦！</h2>
    </c:otherwise>
</c:choose>
</body>
</html>

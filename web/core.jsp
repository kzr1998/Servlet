
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>${requestScope.score}</h1>
<c:if test="${score>=60}">
    <h1 style="color: green">恭喜，你已通过测试</h1>
</c:if>
<c:if test="${score<60}">
    <h1 style="color: red">对不起，再接再厉</h1>
</c:if>
</body>
</html>

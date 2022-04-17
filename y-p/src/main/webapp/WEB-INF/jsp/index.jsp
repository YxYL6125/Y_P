<%--
  Created by IntelliJ IDEA.
  User: 雷神战机
  Date: 2022/4/17
  Time: 13:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:formatDate pattern="yyyy-MM-dd" value="${user.birthday}"/>
<html>
<head>
    <title>首页</title>
</head>
<body>
<c:forEach items="${porns}" var="porn">
    pornId:${porn.pornId}
    <br>
    pornTime:${porn.pornTime}
    <br>
    <a href="${porn.pornHref}">pornHref:</a>
    <br>
    pornTitle:${porn.pornTitle}
    <br>
    pornTypes:${porn.pornTypes}
    <br>
    pornWatch:${porn.pornWatch}
    <hr>
</c:forEach>


</body>
</html>

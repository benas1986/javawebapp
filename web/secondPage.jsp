<%--
  Created by IntelliJ IDEA.
  User: Lina
  Date: 2017.06.16
  Time: 20:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
This is second page ;)
<div>
    <c:choose>
        <c:when test="${not empty name}">
            ${name}
        </c:when>
        <c:otherwise>
            Vardo nera
        </c:otherwise>
    </c:choose>
    ${name}
</div>
<div>
    ${surname}
</div>
</body>
</html>

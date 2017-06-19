<%--
  Created by IntelliJ IDEA.
  User: Lina
  Date: 2017.06.19
  Time: 18:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Students</title>
</head>
<body>
    <table>
        <thead>
            <tr>
                <th>Students name</th>
                <th>Students surnname</th>
                <th>Students phone</th>
                <th>Students email</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="student" items="${students}">
                <tr>
                    <td><a href="/getStudentDetailInfo?id=${student.id}">${student.name}</a></td>
                    <td><a href="/getStudentDetailInfo?id=${student.id}">${student.surname}</a></td>
                    <td>${student.phone}</td>
                    <td>${student.email}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>

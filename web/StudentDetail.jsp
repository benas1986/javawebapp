<%--
  Created by IntelliJ IDEA.
  User: Lina
  Date: 2017.06.19
  Time: 20:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Student Detail</title>
</head>
<body>
<h1>STUDENTO DUOMENYS</h1>
  <div>Studento vardas: ${studentDetailInfo.student.name}</div>
  <div>Studento pavarde: ${studentDetailInfo.student.surname}</div>
  <div>Studento telefonas: ${studentDetailInfo.student.phone}</div>
  <div>Studento e-mail: ${studentDetailInfo.student.email}</div>
<h3>STUDENTO ADRESAI</h3>
<table>
    <thead>
        <tr>
            <th>Country</th>
            <th>City</th>
            <th>Street</th>
            <th>Post Code</th>
        </tr>
    </thead>
    <tbody>
      <c:forEach var="address" items="${studentDetailInfo.studentAddresses}">
          <tr>
              <td>${address.country}</td>
              <td>${address.city}</td>
              <td>${address.street}</td>
              <td>${address.post_code}</td>
          </tr>

      </c:forEach>
    </tbody>
</table>

<h3>STUDENTO PAZYMIAI</h3>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Studento ID </th>
        <th>Title</th>
        <th>Pazymys</th>
        <th>Data</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="marks" items="${studentDetailInfo.studentMarks}">
        <tr>
            <td>${marks.id}</td>
            <td>${marks.student_id}</td>
            <td>${marks.title}</td>
            <td>${marks.mark}</td>
            <td>${marks.date}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
 </body>
</html>

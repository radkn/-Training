<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Kostia
  Date: 24/02/2019
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<html>
  <head>
    <title>MAIN PAGE</title>
  </head>
  <body>
  <h1>Registration form</h1>
  <c:if test="${requestScope.isSubscriberAdded}">
      <h3>Error</h3>
  </c:if>
  </h3>
  <form action = "" method="POST">
      <table border="0">
          <tr>
              <td>First name: </td>
              <td><input type="text" name="firstName" value="${requestScope.firstName}"/></td>
          </tr>
          <tr>
              <td>Last name: </td>
              <td><input type="text" name="lastName" value="${requestScope.lastName}"/></td>
          </tr>
          <tr>
              <td>Nik name: </td>
              <td><input type="text" name="nikName" value="${requestScope.nikName}"/></td>
          </tr>
          <tr>
              <td>Group: </td>
              <td><select name="group" required>
                  <option>GA</option>
                  <option>GB</option>
                  <option>GC</option>
              </select></td>
          </tr>
          <tr>
              <td>Mobile phone: </td>
              <td><input type="text" name="mobPhone" value="${requestScope.mobPhone}"/></td>
          </tr>
          <tr>
              <td>Email: </td>
              <td><input type="email" name="email" value="${requestScope.email}"/></td>
          </tr>
          <tr>
              <td><input type="submit" value = "Sign up"/></td>
          </tr>
      </table>
  </form>
  </body>
</html>

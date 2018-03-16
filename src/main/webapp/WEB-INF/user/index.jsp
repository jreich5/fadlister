<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>View Users</title>
    <link rel="stylesheet" type="text/css" href="../../css/main.css">
    <script src="../../js/main.js"></script>
</head>
<body>

    <%@ include file="../../partials/navbar.jsp" %>

    <h1>View Users JSP</h1>

    <c:forEach items="${users}" var="user">

        <h3><a href="${pageContext.request.contextPath}/users/show?id=<c:out value="${user.id}"/>"><c:out value="${user.name}" /></a></h3>
        <ul>
            <li><c:out value="${user.email}" /></li>
            <li><c:out value="${user.created_at}" /></li>
            <li><c:out value="${user.updated_at}" /></li>
        </ul>
        <hr>

    </c:forEach>

</body>
</html>

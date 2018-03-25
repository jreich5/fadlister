<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Profile</title>
    <link rel="stylesheet" type="text/css" href="../../css/main.css">
    <script src="../../js/main.js"></script>
</head>
<body>

<%@ include file="../../partials/navbar.jsp" %>

<h1><c:out value="${user.name}" /> Profile</h1>
<p><c:out value="${user.email}" /></p>
<p><c:out value="${user.created_at}" /></p>
<p><c:out value="${user.updated_at}" /></p>


<a href="${pageContext.request.contextPath}/users/update?id=<c:out value="${user.id}" />">Edit Profile</a>
<form action="${pageContext.request.contextPath}/users/delete" method="POST">
    <input type="hidden" name="id" value="${user.id}">
    <button>Delete</button>
</form>

<c:forEach var="fad" items="${fads}">

    <h3><a href="${pageContext.request.contextPath}/fads/show?id=<c:out value="${fad.id}"/>"><c:out value="${fad.title}"/></a></h3>
    <ul>
        <li><c:out value="${fad.description}"/></li>
        <li><c:out value="${fad.passe}"/></li>
        <li><img src="<c:out value="${fad.img_url}" />"></li>
        <li><c:out value="${fad.created_at}" /></li>
        <li><c:out value="${fad.updated_at}" /></li>
    </ul>

</c:forEach>

</body>
</html>

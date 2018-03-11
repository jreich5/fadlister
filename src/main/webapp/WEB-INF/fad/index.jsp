<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Fads Index</title>
</head>
<body>

    <%@ include file="../../partials/navbar.jsp" %>

    <h1>Index of Fads ${username}</h1>

    <c:forEach var="fad" items="${fads}">

        <h3><a href="/fads/show?id=${fad.id}">${fad.title}</a></h3>
        <ul>
            <li>${fad.description}</li>
            <li>${fad.isPasse}</li>
            <li><img src="${fad.img_url}"></li>
            <li>${fad.created_at}</li>
            <li>${fad.updated_at}</li>
        </ul>

    </c:forEach>


</body>
</html>
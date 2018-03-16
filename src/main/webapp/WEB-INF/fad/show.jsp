<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>View Fad</title>
</head>
<body>

    <%--<%@ include file="partials/navbar.jsp" %>--%>

    <h1>Show Fad</h1>

    <h3><c:out value="${fad.title}"/></h3>
    <ul>
        <li><c:out value="${fad.description}"/></li>
        <li><c:out value="${fad.isPasse}"/></li>
        <li><img src="<c:out value="${fad.img_url}" />"></li>
        <li><c:out value="${fad.created_at}" /></li>
        <li><c:out value="${fad.updated_at}" /></li>
    </ul>

    <a href="${pageContext.request.contextPath}/fads/update?id=<c:out value="${fad.id}" />">Edit Ad</a>
    <form action="${pageContext.request.contextPath}/fads/delete" method="POST">
        <input type="hidden" name="id" value="${fad.id}">
        <button>Delete</button>
    </form>


</body>
</html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>View User</title>
    <link rel="stylesheet" type="text/css" href="../../css/main.css">
    <script src="../../js/main.js"></script>
</head>
<body>

    <%@ include file="../../partials/navbar.jsp" %>

    <h1><c:out value="${user.name}" /></h1>
    <p><c:out value="${user.email}" /></p>
    <p><c:out value="${user.created_at}" /></p>
    <p><c:out value="${user.updated_at}" /></p>

</body>
</html>

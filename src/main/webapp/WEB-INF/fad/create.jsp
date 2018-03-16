<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Create Fad</title>
</head>
<body>

    <%@ include file="../../partials/navbar.jsp" %>

    <h1>Create Fad</h1>

    <form action="${pageContext.request.contextPath}/fads/create" method="POST">
        <%@ include file="./partials/form.jsp" %>
    </form>


</body>
</html>
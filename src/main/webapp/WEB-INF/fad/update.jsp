<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Update Fad</title>
</head>
<body>

    <%@ include file="../../partials/navbar.jsp" %>

    <h1>Update Fad</h1>

    <form action="/fads/update" method="POST">
        <%@ include file="./partials/form.jsp" %>
    </form>


</body>
</html>

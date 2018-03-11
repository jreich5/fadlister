<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Show Fad</title>
</head>
<body>

    <%@ include file="../../partials/navbar.jsp" %>

    <h1>Show Fad</h1>

    <h3>${fad.title}</h3>
    <ul>
        <li>${fad.description}</li>
        <li>${fad.isPasse}</li>
        <li><img src="${fad.img_url}"></li>
        <li>${fad.created_at}</li>
        <li>${fad.updated_at}</li>
    </ul>

    <a href="/fads/update?id=${fad.id}">Edit Ad</a>
    <form action="/fads/delete">
        <input type="hidden" name="id" value="${fad.id}">
        <button>Delete</button>
    </form>


</body>
</html>
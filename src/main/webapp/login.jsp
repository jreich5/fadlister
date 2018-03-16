<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="css/main.css">
    <script src="js/main.js"></script>
</head>
<body>

    <h1>Login!</h1>
    <form action="${pageContext.request.contextPath}/login" method="POST">

        <input type="text" name="email">
        <input type="password" name="password">
        <button>Submit</button>

    </form>

</body>
</html>

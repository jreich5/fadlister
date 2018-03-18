<%--
  Created by IntelliJ IDEA.
  User: JustinReich
  Date: 3/10/18
  Time: 3:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="pageTitle" scope="request" value="FadLister: Welcome"/>
<%@ include file="/partials/head.jsp" %>
<body>

    <%@ include file="partials/navbar.jsp" %>

    <main class="container">
        <h1 class="title">Welcome to FadLister!</h1>
    </main>

    <%@ include file="/partials/scripts.html" %>
</body>
</html>

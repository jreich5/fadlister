<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="pageTitle" scope="request" value="FadLister: Login"/>
<%@ include file="/partials/head.jsp" %>
<body>

    <%@ include file="partials/navbar.jsp" %>
    <main class="container">
        <h1>Please Login</h1>
        <form action="${pageContext.request.contextPath}/login" method="POST">

            <label for="email">Email</label>
            <input id="email" type="text" name="email" placeholder="Enter Email">
            <br>
            <label for="password">Password</label>
            <input id="password" type="password" name="password">
            <br>
            <button>Submit</button>

        </form>
    </main>

    <%@ include file="/partials/scripts.html" %>

</body>
</html>

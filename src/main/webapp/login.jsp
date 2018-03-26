<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="pageTitle" scope="request" value="FadLister: Login"/>
<%@ include file="/partials/head.jsp" %>
<body>

    <%@ include file="partials/navbar.jsp" %>
    <main class="container">
        <h1 class="clear-title">Please Login</h1>
        <hr>
        <div class="card">
            <div class="card-body">
                <form action="${pageContext.request.contextPath}/login" method="POST">

                    <div class="form-group">
                        <label for="email">Email</label>
                        <input class="form-control" id="email" type="text" name="email" placeholder="Enter Email">
                    </div>
                    <div class="form-group">
                        <label for="password">Password</label>
                        <input class="form-control" id="password" type="password" name="password" placeholder="Enter Password">
                    </div>
                    <button class="btn btn-block btn-outline-primary">Submit</button>

                </form>
            </div>
        </div>
    </main>

    <%@ include file="/partials/scripts.html" %>

</body>
</html>

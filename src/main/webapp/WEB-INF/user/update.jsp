<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="pageTitle" scope="request" value="FadLister: Edit User"/>
<%@ include file="../../partials/head.jsp" %>
<body>

<%@ include file="../../partials/navbar.jsp" %>

<main class="container">
    <h1>Edit Fad</h1>
    <div class="card">
        <div class="card-body">
            <form action="${pageContext.request.contextPath}/users/update" method="POST">
                <%@ include file="./partials/form.jsp" %>
            </form>
        </div>
    </div>
</main>

<%@ include file="../../partials/scripts.html" %>


</body>
</html>

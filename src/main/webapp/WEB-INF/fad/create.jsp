<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="pageTitle" scope="request" value="FadLister: Fads"/>
<%@ include file="../../partials/head.jsp" %>
<body>

    <%@ include file="../../partials/navbar.jsp" %>

    <main class="container">
        <h1>Create Fad</h1>

        <c:if test="${sessionScope.user == null}">
            <h1>User is logged out</h1>
        </c:if>

        <form action="${pageContext.request.contextPath}/fads/create" method="POST">
            <%@ include file="./partials/form.jsp" %>
        </form>
    </main>

    <%@ include file="../../partials/scripts.html" %>

</body>
</html>
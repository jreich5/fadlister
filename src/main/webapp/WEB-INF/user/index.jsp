<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>--%>

<%@ include file="../../partials/head.jsp" %>
<body>

    <%@ include file="../../partials/navbar.jsp" %>

    <main class="container">
        <h1>Community Members</h1>

        <c:forEach items="${users}" var="user">

            <div class="card">
                <div class="card-body">
                    <h3 class="card-title">
                        <a href="${pageContext.request.contextPath}/users/show?id=<c:out value="${user.id}"/>"><c:out value="${user.name}" /></a>
                    </h3>
                    <ul>
                        <li>Email: <c:out value="${user.email}" /></li>
                        <li>Joined: <c:out value="${user.created_at}" /></li>
                        <li>Last updated profile: <c:out value="${user.updated_at}" /></li>
                    </ul>
                </div>
            </div>

        </c:forEach>
    </main>

    <%@ include file="/partials/scripts.html" %>

</body>
</html>

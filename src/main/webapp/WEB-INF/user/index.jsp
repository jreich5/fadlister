<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>--%>

<%@ include file="../../partials/head.jsp" %>
<body>

    <%@ include file="../../partials/navbar.jsp" %>

    <h1>View Users JSP</h1>

    <c:if test="${sessionScope.user == null}">
        <h1>User is logged out</h1>
    </c:if>

    <c:forEach items="${users}" var="user">

        <h3><a href="${pageContext.request.contextPath}/users/show?id=<c:out value="${user.id}"/>"><c:out value="${user.name}" /></a></h3>
        <ul>
            <li><c:out value="${user.email}" /></li>
            <li><c:out value="${user.created_at}" /></li>
            <li><c:out value="${user.updated_at}" /></li>
        </ul>
        <hr>

    </c:forEach>

</body>
</html>

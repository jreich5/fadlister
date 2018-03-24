<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="pageTitle" scope="request" value="FadLister: View Fad"/>
<%@ include file="../../partials/head.jsp" %>
<body>

    <%@ include file="../../partials/navbar.jsp" %>

    <main class="container">

        <h1>Show Fad</h1>

        <h3><c:out value="${fad.title}"/></h3>
        <ul>
            <li><c:out value="${fad.description}"/></li>
            <li><c:out value="${fad.passe}"/></li>
            <li><img src="<c:out value="${fad.img_url}" />"></li>
            <li><c:out value="${fad.created_at}" /></li>
            <li><c:out value="${fad.updated_at}" /></li>
            <li>By: <c:out value="${fad.user.name}"/></li>
        </ul>

        <c:if test="${currentUserFad}">
            <a href="${pageContext.request.contextPath}/fads/update?id=<c:out value="${fad.id}" />">Edit Ad</a>
            <form action="${pageContext.request.contextPath}/fads/delete" method="POST">
                <input type="hidden" name="id" value="${fad.id}">
                <button>Delete</button>
            </form>
        </c:if>

    </main>

    <%@ include file="../../partials/scripts.html" %>

</body>
</html>
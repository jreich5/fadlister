<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="pageTitle" scope="request" value="FadLister: Fads"/>
<%@ include file="../../partials/head.jsp" %>
<body>

    <%@ include file="../../partials/navbar.jsp" %>

    <main class="container">
        <h1>Index of Fads <c:out value="${username}"/></h1>

        <c:forEach var="fad" items="${fads}">

            <h3><a href="${pageContext.request.contextPath}/fads/show?id=<c:out value="${fad.id}"/>"><c:out value="${fad.title}"/></a></h3>
            <ul>
                <li><c:out value="${fad.description}"/></li>
                <li><c:out value="${fad.passe}"/></li>
                <li><img src="<c:out value="${fad.img_url}" />"></li>
                <li><c:out value="${fad.created_at}" /></li>
                <li><c:out value="${fad.updated_at}" /></li>
                <li>By: <c:out value="${fad.user.name}"/></li>
            </ul>

        </c:forEach>
    </main>

    <%@ include file="../../partials/scripts.html" %>

</body>
</html>
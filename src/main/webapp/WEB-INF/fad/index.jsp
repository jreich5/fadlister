<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/partials/head.jsp">
    <jsp:param name="pageTitle" value="Fads" />
</jsp:include>
<body>

<%@ include file="/partials/navbar.jsp" %>

<main class="container">
    <h1 class="sub-title">Fads</h1>

    <hr>

    <div class="row">
        <c:forEach var="fad" items="${fads}">

            <div class="col-xl-4 col-lg-6 mb-5">
                <div class="card styled-card">
                    <a href="${pageContext.request.contextPath}/fads/show?id=<c:out value="${fad.id}"/>">
                        <div class="card-body">
                            <h3 class="card-title text-center"><c:out value="${fad.title}"/></h3>
                        </div>
                        <img class="card-img-bottom" src="<c:out value="${fad.img_url}" />">
                    </a>

                    <ul class="list-group">
                        <li class="list-group-item">This fad is passe: <c:out value="${fad.passe}"/></li>
                        <li class="list-group-item">
                            <span class="card-text">Posted by:</span>
                            <a class="card-link"
                               href="${pageContext.request.contextPath}/users/show?id=<c:out value="${fad.user.id}"/>"><c:out
                                    value="${fad.user.name}"/>
                            </a>
                        </li>
                    </ul>
                </div>
            </div>

        </c:forEach>
    </div>
</main>

<%@ include file="/partials/scripts.html" %>

</body>
</html>
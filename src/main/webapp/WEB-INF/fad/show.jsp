<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/partials/head.jsp">
    <jsp:param name="pageTitle" value="View Fad" />
</jsp:include>

<body>

<%@ include file="/partials/navbar.jsp" %>

<main class="container">

    <h1><c:out value="${fad.title}"/></h1>

    <div class="card">

        <div class="card-body">

            <div class="row">
                <div class="col">
                    <p class="card-text"><c:out value="${fad.description}"/></p>
                    <ul class="list-group">
                        <li class="list-group-item">Passe? <c:out value="${fad.passe}"/></li>
                        <li class="list-group-item">Date Posted: <c:out value="${fad.created_at}"/></li>
                        <li class="list-group-item">Updated: <c:out value="${fad.updated_at}"/></li>
                        <li class="list-group-item">
                            Posted by: <a class="card-link" href="${pageContext.request.contextPath}/users/show?id=${fad.user.id}"><c:out value="${fad.user.name}"/></a>
                        </li>
                        <c:if test="${currentUserFad}">
                            <li class="list-group-item">

                                <a class="btn btn-warning btn-block"
                                    href="${pageContext.request.contextPath}/fads/update?id=<c:out value="${fad.id}" />">
                                    <span style="color:white">Edit Fad</span>
                                </a>
                                <br>
                                <form action="${pageContext.request.contextPath}/fads/delete" method="POST">
                                    <input type="hidden" name="id" value="${fad.id}">
                                    <button class="btn btn-danger btn-block">Delete Fad :(</button>
                                </form>
                            </li>
                        </c:if>
                    </ul>
                </div>
                <div class="col">
                    <img src="<c:out value="${fad.img_url}" />">
                </div>
            </div>

        </div>

    </div>

</main>

    <%@ include file="../../partials/scripts.html" %>

</body>
</html>
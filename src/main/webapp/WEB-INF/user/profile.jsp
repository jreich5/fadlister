<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="pageTitle" scope="request" value="FadLister: Fads"/>
<%@ include file="../../partials/head.jsp" %>
<body>

<%@ include file="../../partials/navbar.jsp" %>

<main class="container">
    <h1><c:out value="${user.name}"/> Profile</h1>

    <div class="card">

        <div class="card-body">
            <div class="row">
                <div class="col">
                    <h3>Your details...</h3>
                    <p>Email: <c:out value="${user.email}"/></p>
                    <p>Joined: <c:out value="${user.created_at}"/></p>
                    <p>Last updated profile: <c:out value="${user.updated_at}"/></p>

                    <div class="btn-group">
                        <a class="btn btn-warning btn-lg"
                           href="${pageContext.request.contextPath}/users/update?id=<c:out value="${user.id}" />"><span
                                style="color:white">Edit Profile</span></a>
                        <form action="${pageContext.request.contextPath}/users/delete" method="POST">
                            <input type="hidden" name="id" value="${user.id}">
                            <button class="btn btn-danger btn-lg">Delete Account</button>
                        </form>
                    </div>
                </div>
                <div class="col">
                    <h3>Your fads...</h3>
                    <ul class="list-group">
                        <c:forEach var="fad" items="${fads}">
                            <li class="list-group-item">
                                <a href="${pageContext.request.contextPath}/fads/show?id=<c:out value="${fad.id}"/>"><c:out
                                        value="${fad.title}"/></a>
                            </li>
                        </c:forEach>
                    </ul>
                </div>
            </div>
        </div>

    </div>

    <%@ include file="../../partials/scripts.html" %>

</main>

</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: JustinReich
  Date: 3/10/18
  Time: 3:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="pageTitle" scope="request" value="FadLister: Member Details"/>
<%@ include file="/partials/head.jsp" %>
<body>

    <%@ include file="../../partials/navbar.jsp" %>

    <main class="container">

        <h1><c:out value="${user.name}"/> Member Details</h1>

        <div class="card">

            <div class="card-body">
                <div class="row">
                    <div class="col">
                        <h3><c:out value="${user.name}"/> details...</h3>
                        <p>Email: <c:out value="${user.email}"/></p>
                        <p>Joined: <c:out value="${user.created_at}"/></p>
                    </div>
                    <div class="col">
                        <h3><c:out value="${user.name}"/> fads...</h3>
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
    </main>

    <%@ include file="/partials/scripts.html" %>

</body>
</html>

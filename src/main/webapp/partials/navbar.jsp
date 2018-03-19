<%--
  Created by IntelliJ IDEA.
  User: JustinReich
  Date: 3/11/18
  Time: 8:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<nav>
    <div class="container">
        <ul>
            <li><a href="${pageContext.request.contextPath}/">Fadlister</a></li>
            <li><a href="${pageContext.request.contextPath}/fads">View Fads</a></li>

            <c:choose>
                <c:when test="${sessionScope.user == null}">

                    <li><a href="${pageContext.request.contextPath}/login">Login</a></li>
                    <li><a href="${pageContext.request.contextPath}/register">Register</a></li>

                </c:when>
                <c:otherwise>

                    <li><a href="${pageContext.request.contextPath}/fads/create">Create Fad</a></li>
                    <li><a href="${pageContext.request.contextPath}/users">Users</a></li>
                    <li><a href="${pageContext.request.contextPath}/users/profile">Profile</a></li>
                    <li><a href="${pageContext.request.contextPath}/logout">Logout</a></li>

                </c:otherwise>
            </c:choose>

        </ul>
    </div>
</nav>

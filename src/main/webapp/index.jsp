<%--
  Created by IntelliJ IDEA.
  User: JustinReich
  Date: 3/10/18
  Time: 3:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="/partials/head.jsp">
    <jsp:param name="pageTitle" value="Welcome" />
</jsp:include>
<body>

    <%@ include file="partials/navbar.jsp" %>

    <main class="container">
        <h1 class="title">FadLister</h1>
        <div class="row justify-content-center">
            <div class="col-md-5">
                <div class="text-center">
                    <img src="img/elmo2.jpg" width="350">
                </div>
            </div>
            <div class="col-md-5">
                <div class="text-center">
                   <img class="img-position" src="img/dab.png" alt="">
                </div>
            </div>
        </div>
    </main>

    <%@ include file="/partials/scripts.html" %>
</body>
</html>

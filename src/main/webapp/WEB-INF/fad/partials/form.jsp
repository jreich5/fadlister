<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: JustinReich
  Date: 3/11/18
  Time: 9:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="form-group">
    <label for="title">Title</label>
    <input class="form-control" type="text" name="title" id="title" placeholder="Enter fad title" value="${fad.title}">
</div>

<div class="form-group">
    <label for="description">Description</label>
    <textarea class="form-control" name="description" id="description" cols="30" rows="10" placeholder="Enter fad description">${fad.description}</textarea>
</div>

<div class="form-group">
    <label for="img">Image</label>
    <input class="form-control" id="img" type="text" name="img_url" value="${fad.img_url}" placeholder="Enter image address">
</div>

<div class="form-group">
    <label for="passe">Has this fad become passe yet?</label>
    <input id="passe" type="checkbox" name="passe" value="true"
    <c:if test="${fad.passe}">
        ${"checked"}
    </c:if>
    >
</div>

<input type="hidden" name="id" value="${fad.id}">

<button class="btn btn-block btn-outline-primary">Submit</button>



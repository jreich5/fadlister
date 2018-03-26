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
    <label for="email">Email</label>
    <input class="form-control" type="text" name="email" id="email" placeholder="Enter fad title" value="${user.email}">
</div>

<div class="form-group">
    <label for="name">Name</label>
    <input class="form-control" type="text" name="name" id="name" placeholder="Enter your name" value="${user.name}">
</div>

<div class="form-group">
    <label for="password">Password</label>
    <input class="form-control" id="password" type="password" name="password" placeholder="Enter password">
</div>

<input type="hidden" name="id" value="${user.id}">
<button class="btn btn-outline-primary btn-block">Submit</button>



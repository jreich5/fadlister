<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: JustinReich
  Date: 3/11/18
  Time: 9:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<label for="email">Email</label>
<input type="text" name="email" id="email" placeholder="Enter fad title" value="${user.email}">
<br>

<label for="name">Name</label>
<br>
<input type="text" name="name" id="name" placeholder="Enter your name" value="${user.name}">

<br>

<label for="password">Password</label>
<input id="password" type="password" name="password" placeholder="Enter password">

<br>

<input type="hidden" name="id" value="${user.id}">

<br>

<button>Submit</button>



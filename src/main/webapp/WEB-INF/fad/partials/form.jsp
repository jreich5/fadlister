<%--
  Created by IntelliJ IDEA.
  User: JustinReich
  Date: 3/11/18
  Time: 9:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<label for="title">Title</label>
<input type="text" name="title" value="" id="title" placeholder="Enter fad title">
<br>

<label for="description">Description</label>
<br>
<textarea name="description" id="description" cols="30" rows="10" value="" placeholder="Enter fad description"></textarea>

<br>

<label for="img">Image</label>
<input id="img" type="text" name="img_url" value="" placeholder="Enter image address">

<br>

<label for="isPasse">Is Passe?</label>
<input id="isPasse" type="checkbox" name="isPasse">

<input type="hidden" name="id" value="">

<br>

<button>Submit</button>



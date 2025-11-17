<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<h2>Add Book (Omprakash)</h2>

<form:form action="save" method="post" modelAttribute="book">
    Title: <form:input path="title"/><br><br>
    Author: <form:input path="author"/><br><br>
    Price: <form:input path="price"/><br><br>
    <input type="submit" value="Add Book"/>
</form:form>

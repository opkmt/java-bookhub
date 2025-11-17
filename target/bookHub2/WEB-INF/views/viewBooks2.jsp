<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h2>Book List (Narottam)</h2>

<table border="1">
    <tr>
        <th>ID</th>
        <th>Title</th>
        <th>Author</th>
        <th>Price</th>
    </tr>

    <c:forEach var="b" items="${books}">
        <tr>
            <td>${b.bookId}</td>
            <td>${b.title}</td>
            <td>${b.author}</td>
            <td>${b.price}</td>
        </tr>
    </c:forEach>
</table>

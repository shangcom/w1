<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2024-04-22
  Time: 오후 5:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>List Page</h1>
<ul>
    <c:forEach var="dto" items="${list}">
        <%--dto는 list에 들어있는 todoDTO 받기 위한 임시 변수. --%>
        <li>${dto}</li> <%--각 dto 객체의 name 속성이 리스트의 각 항목으로 출력--%>
    </c:forEach>
</ul>

<ul>
    <c:forEach var="num" begin="1" end="10">
        <li>${num}</li>
    </c:forEach>
</ul>

<%--test 속성 값 : true/false로 나오는 식이나 변수 등.--%>
<c:if test="${list.size() %2 ==0}">
    짝수
</c:if>
<c:if test="${list.size() %2 != 0}">
    홀수
</c:if>

<c:choose>
    <c:when test="${list.size() %2 == 0}">
        짝수
    </c:when>
    <c:otherwise>
        홀수
    </c:otherwise>
</c:choose>

<c:set var="target" value="5"></c:set>

<ul>
    <c:forEach var="num" begin="1" end="10">
        <c:if test="${target == num}">
            num is target
        </c:if>
    </c:forEach>
</ul>

</body>
</html>



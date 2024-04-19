<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2024-04-18
  Time: 오후 5:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/calc/makeResult" method="post"> <%--action, method 추가--%>
    <input type="number" name="num1">
    <input type="number" name="num2">
    <button type="submit">SEND</button> <%--<form> 태그 전송할 때, button의 타입 summit으로 한다.--%>
</form>

</body>
</html>

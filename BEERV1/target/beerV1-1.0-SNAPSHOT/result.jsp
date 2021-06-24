<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.beerV1.Beer" %><%--
  Created by IntelliJ IDEA.
  User: 咪西咪西
  Date: 2021/6/24
  Time: 13:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 align="center">Beer Recommendations JSP</h1>

<%
    ArrayList styles =(ArrayList)request.getAttribute("styles");

    for(Object s: styles){
        out.print("<br>try:"+((Beer)s).toString());
    }
%>
</body>
</html>

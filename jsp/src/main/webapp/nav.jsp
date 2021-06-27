<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8" />
    <title>简单导航栏学习</title>
    <style type="text/css">
        * {
            margin: 0;
            padding: 0;
        }

        ul {
            list-style-type: none;
        }

        .top {
            position: fixed;
            left: 0;
            right: 0;
            top: 0;
            z-index: 999;
            height: 50px;
            background-color: rgba(0, 0, 0, 0.6);
        }

        .menu {
            width: 1000px;
            margin: 0 auto;
            overflow: hidden;
        }



        .nav {
            float: right;
            margin-top: 10px;
            font-size: 0;
        }

        .nav li {
            display: inline-block;
            margin-left: 40px;
        }

        .nav a {
            display: inline-block;
            height: 30px;
            line-height: 30px;
            font-size: 20px;
            color: #fff;
            text-decoration: none;
        }

        .nav a:hover {
            color: #83c3f3;
        }
    </style>
</head>

<body>
<div class="top">
    <div class="menu">

        <ul class="nav">
            <li>
                <a href="http://localhost:8080/jsp_war/">Home</a>
            </li>
            <li>
                <a href="sameHobby.html">Find friends</a>
            </li>
            <li>
                <a href="foo.jsp">Foo-Counter</a>
            </li>
            <li>
                <a href="jstl">JSTL</a>
            </li>

        </ul>
    </div>
</div>
</body>

</html>


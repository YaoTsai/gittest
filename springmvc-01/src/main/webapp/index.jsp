<%--
  Created by IntelliJ IDEA.
  User: TsaiY
  Date: 2023/8/28
  Time: 10:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>测试不同的请求提交方式</h2>
    <a href="${pageContext.request.contextPath}/demo.action">访问服务器</a>
    <br>
    <form action="${pageContext.request.contextPath}/req.action" method="post">
        <%--<form action="${pageContext.request.contextPath}/req.action" method="get">--%>
        <input type="submit" value="提交">
    </form>
    <hr>
    <h2>1. 单个数据提交</h2>
    <form action="${pageContext.request.contextPath}/one.action" method="post">
        姓名:<input name="name" /> <br>
        年龄:<input name="age" /> <br>
        <input type="submit" value="提交" />
    </form>
    <hr>
    <h2>2. 对象封装数据提交</h2>
    <form action="${pageContext.request.contextPath}/two.action" method="post">
        姓名:<input name="uname" /> <br>
        年龄:<input name="uage" /> <br>
        <input type="submit" value="提交" />
    </form>

    <hr>
    <h2>3. 动态占位符提交</h2>
    <a href="${pageContext.request.contextPath}/three/张三/22.action">动态提交</a>
    <hr>
    <h2>4. 映射名称不一致</h2>
    <form action="${pageContext.request.contextPath}/four.action" method="get">
        姓名:<input name="name" /> <br>
        年龄:<input name="age" /> <br>
        <input type="submit" value="提交" />
    </form>

    <h2>5. 手工提取请求数据</h2>
    <form action="${pageContext.request.contextPath}/five.action" method="get">
        姓名:<input name="name" /> <br>
        年龄:<input name="age" /> <br>
        <input type="submit" value="提交" />
    </form>
</body>
</html>

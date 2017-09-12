<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Glory
  Date: 2017/9/12
  Time: 9:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生列表</title>
</head>
<body>
<h1>学生列表</h1>
<s:iterator value="StudentList" id="stu">
    <s:property value="#stu.studentId"/>
    <s:property value="#stu.studentName"/>
    <s:property value="#stu.studentAge"/>
    <br>
</s:iterator>
</body>
</html>

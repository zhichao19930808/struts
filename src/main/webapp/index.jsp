<%--
  Created by IntelliJ IDEA.
  User: Glory
  Date: 2017/9/11
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="Student_add" method="post">
      <s:textfield name="student.studentName" /> <br>
      <s:textfield name="student.studentAge" /> <br>
      <input type="submit">
  </form>
  </body>
</html>

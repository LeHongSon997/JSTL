
<%--
  Created by IntelliJ IDEA.
  User: a
  Date: 12/23/2021
  Time: 09:11
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<!DOCTYPE html>
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <h2>Striped Rows</h2>
    <p>Danh Sách Khách Hàng</p>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Tên</th>
            <th>Ngày Sinh</th>
            <th>Địa Chỉ</th>
            <th>Ảnh</th>
        </tr>
        </thead>
        <body>
        <c:forEach items="${khachHangs}" var="items">
            <tr>
                <td>${items.name}</td>
                <td>${items.birthday}</td>
                <td>${items.address}</td>
                <td><img src="${items.img}" height="250" width="300"></td>
            </tr>
        </c:forEach>
        </body>
    </table>
</div>

</body>

</html>

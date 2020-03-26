<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>userItem</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath }/layui/css/layui.css" media="all">
    <script src="${pageContext.request.contextPath }/layui/layui.js"></script>
</head>
<body class="childrenBody">
    <br>
    
    <blockquote class="layui-elem-quote quoteBox">
			<div class="layui-inline">
			<form action="${pageContext.request.contextPath }/user/findAll.action" class="layui-form">
				<!-- <div class="layui-input-inline">
					<input type="text" class="layui-input searchVal" name="keyword1" placeholder="please input keyword1" />
				</div>
				<input type="submit" value="search" class="layui-btn search_btn layui-btn-xs"> -->
				<a href="${pageContext.request.contextPath }/page/user/userInsert.jsp" class="layui-btn layui-btn-normal addLink_btn layui-btn-xs">
				<i class="layui-icon">&#xe608;</i>insert</a>
			</form>
			</div>
	</blockquote>
    
	<table lay-filter="user">
		<thead>
			<tr>
				<th lay-data="{field:'id',align:'center',sort: true}">id</th>
				<th lay-data="{field:'username',align:'center'}">username</th>
				<th lay-data="{field:'password',align:'center'}">password</th>
				<th lay-data="{field:'type',align:'center'}">type</th>
				<th lay-data="{field:'operation', width:160,align:'center'}">operation</th>
			</tr>
		</thead>
		<tbody>
		    <c:forEach items="${list}" var="user">
			<tr>
			    <td >${user.id}</td>
			    <td >${user.username}</td>
			    <td >${user.password}</td>
			    <td >${user.type}</td>
				<td>
				    <div class="layui-btn-group">
					    <a class="layui-btn layui-btn-xs"
						href="<c:url value='/user/saveById.action?id=${user.id }'/>">
						<i class="layui-icon">&#xe642;</i>update</a>
					    <a class="layui-btn layui-btn-xs layui-btn-danger"
						href="<c:url value='/user/deleteById.action?id=${user.id }'/>">
						<i class="layui-icon">&#xe640;</i>delete</a>
				    </div>
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
	<script type="text/javascript">
		layui.use('table', function() {
			var table = layui.table;
			table.init('user', {
				height: 475 
				,limit: 10 
				,page: true 
				,skin: 'row' 
				,even: true 
				,size: 'lg' 
			}); 
		});
	</script>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>userInsert</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/layui/css/layui.css"
	media="all">
<script src="${pageContext.request.contextPath }/layui/layui.js"></script>
</head>
<body>
	<br>
    <h1 align="center">insert</h1>
	<form class="layui-form"
		action="${pageContext.request.contextPath }/user/insert">
		<div class="layui-form-item">
			<label class="layui-form-label">username:</label>
			<div class="layui-input-block">
				<input type="text" name="username"  required
					lay-verify="required" placeholder="please input username "
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">password:</label>
			<div class="layui-input-block">
				<input type="text" name="password"  required
					lay-verify="required" placeholder="please input password "
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">type:</label>
			<div class="layui-input-block">
				<input type="text" name="type"  required
					lay-verify="required" placeholder="please input type "
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<div class="layui-input-block">
				<button class="layui-btn" lay-submit lay-filter="formDemo">submit</button>
				<button type="reset" class="layui-btn layui-btn-primary">reset</button>
			</div>
		</div>
	</form>

	<script>
		//Demo
		layui.use('form', function() {
			var form = layui.form;
			form.on('submit(formDemo)', function(data) {
				//layer.msg(JSON.stringify(data.field));
				return true;
			});
		});
	</script>

</body>
</html>
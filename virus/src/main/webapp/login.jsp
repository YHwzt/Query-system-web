<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>疫情管理系统</title>
	<link rel="icon" href="${pageContext.request.contextPath }/images/favicon.ico">
	<link rel="stylesheet" href="${pageContext.request.contextPath }/layui/css/layui.css" media="all" />
	<link rel="stylesheet" href="${pageContext.request.contextPath }/css/public.css" media="all" />
</head>
<body class="loginBody"  style="background-size:cover;background:url(${pageContext.request.contextPath }/images/login_bg.jpg)">
	<form class="layui-form" action="${pageContext.request.contextPath }/login" method="post">
		<div class="login_face"><img src="${pageContext.request.contextPath }/images/face.jpg" class="userAvatar"></div>
		<h1 align="center">登陆</h1>
		<br>
		 <h2 align="center"><font color="red">${msg}${SPRING_SECURITY_LAST_EXCEPTION.message}</font></h2>
		 <br>
		<div class="layui-form-item input-item">
			<label for="userName">用户名</label>
			<input type="text" name="username" placeholder="请输入用户名" autocomplete="off" id="userName" class="layui-input" lay-verify="required">
		</div>
		<div class="layui-form-item input-item">
			<label for="password">密码</label>
			<input type="password" name="password" placeholder="请输入密码" autocomplete="off" id="password" class="layui-input" lay-verify="required">
		</div>
		
		<div class="layui-form-item input-item">
			<select name="type">
				<option value="1">学生/教职工登录</option>
				<option value="2">学院负责人登录</option>
				<option value="3">学校负责人登录</option>
			</select>
		</div>
		<!-- <div class="layui-form-item input-item" id="imgCode">
			<label for="code">验证码</label>
			<input type="text" placeholder="请输入验证码" autocomplete="off" id="code" class="layui-input">
			<img src="../../images/code.jpg">
		</div> -->
		<div class="layui-form-item">
			<%--<button class="layui-btn layui-block" lay-filter="login" lay-submit>登录</button>--%>
		<input class="layui-btn layui-block" type="submit" value="登录">
		</div>
		<div class="layui-form-item">
		    <a class="layui-btn layui-block" href="${pageContext.request.contextPath }/register.jsp">注册</a>
			<!-- <button class="layui-btn layui-block" lay-filter="login" lay-submit>注册</button> -->
		</div>
		<!-- <div class="layui-form-item layui-row">
			<a href="javascript:;" class="seraph icon-qq layui-col-xs4 layui-col-sm4 layui-col-md4 layui-col-lg4"></a>
			<a href="javascript:;" class="seraph icon-wechat layui-col-xs4 layui-col-sm4 layui-col-md4 layui-col-lg4"></a>
			<a href="javascript:;" class="seraph icon-sina layui-col-xs4 layui-col-sm4 layui-col-md4 layui-col-lg4"></a>
		</div> -->
	</form>
	<script type="text/javascript" src="${pageContext.request.contextPath }/layui/layui.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/login.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/cache.js"></script>
</body>
	
</html>
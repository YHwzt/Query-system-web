<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>virusUpdate</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/layui/css/layui.css"
	media="all">
<script src="${pageContext.request.contextPath }/layui/layui.js"></script>
</head>
<body class="childrenBody">
	<br>
    <h1 align="center">update</h1>
	<form class="layui-form"
		action="${pageContext.request.contextPath }/virus/updateById">
		<input type="hidden" name="id" value="${virus.id}">
		<div class="layui-form-item">
			<label class="layui-form-label">college:</label>
			<div class="layui-input-block">
				<input type="text" name="college" value="${virus.college}" required
					lay-verify="required" placeholder="please input college "
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">myclass:</label>
			<div class="layui-input-block">
				<input type="text" name="myclass" value="${virus.myclass}" required
					lay-verify="required" placeholder="please input myclass "
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">startdate:</label>
			<div class="layui-input-block">
				<input type="text" name="startdate" value="${virus.startdate}" required
					lay-verify="required" placeholder="please input startdate "
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">username:</label>
			<div class="layui-input-block">
				<input type="text" name="username" value="${virus.username}" required
					lay-verify="required" placeholder="please input username "
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">tel:</label>
			<div class="layui-input-block">
				<input type="text" name="tel" value="${virus.tel}" required
					lay-verify="required" placeholder="please input tel "
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">province:</label>
			<div class="layui-input-block">
				<input type="text" name="province" value="${virus.province}" required
					lay-verify="required" placeholder="please input province "
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">city:</label>
			<div class="layui-input-block">
				<input type="text" name="city" value="${virus.city}" required
					lay-verify="required" placeholder="please input city "
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">areas:</label>
			<div class="layui-input-block">
				<input type="text" name="areas" value="${virus.areas}" required
					lay-verify="required" placeholder="please input areas "
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">ischinesestudent:</label>
			<div class="layui-input-block">
				<input type="text" name="ischinesestudent" value="${virus.ischinesestudent}" required
					lay-verify="required" placeholder="please input ischinesestudent "
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">iswuhanstudent:</label>
			<div class="layui-input-block">
				<input type="text" name="iswuhanstudent" value="${virus.iswuhanstudent}" required
					lay-verify="required" placeholder="please input iswuhanstudent "
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">ishubeistudent:</label>
			<div class="layui-input-block">
				<input type="text" name="ishubeistudent" value="${virus.ishubeistudent}" required
					lay-verify="required" placeholder="please input ishubeistudent "
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">is14contact:</label>
			<div class="layui-input-block">
				<input type="text" name="is14contact" value="${virus.is14contact}" required
					lay-verify="required" placeholder="please input is14contact "
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">isinwuhan:</label>
			<div class="layui-input-block">
				<input type="text" name="isinwuhan" value="${virus.isinwuhan}" required
					lay-verify="required" placeholder="please input isinwuhan "
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">isinhubei:</label>
			<div class="layui-input-block">
				<input type="text" name="isinhubei" value="${virus.isinhubei}" required
					lay-verify="required" placeholder="please input isinhubei "
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">istodayformother:</label>
			<div class="layui-input-block">
				<input type="text" name="istodayformother" value="${virus.istodayformother}" required
					lay-verify="required" placeholder="please input istodayformother "
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">islikevirus:</label>
			<div class="layui-input-block">
				<input type="text" name="islikevirus" value="${virus.islikevirus}" required
					lay-verify="required" placeholder="please input islikevirus "
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">isconfirmvirus:</label>
			<div class="layui-input-block">
				<input type="text" name="isconfirmvirus" value="${virus.isconfirmvirus}" required
					lay-verify="required" placeholder="please input isconfirmvirus "
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
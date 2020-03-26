<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>virusInsert</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/layui/css/layui.css"
	media="all">
<script src="${pageContext.request.contextPath }/layui/layui.js"></script>
</head>
<body>
	<br>
    <h1 align="center">请录入个人信息</h1>
	<form class="layui-form"
		action="${pageContext.request.contextPath }/virus/insert">
		<div class="layui-form-item">
			<label class="layui-form-label">所在学院:</label>
			<div class="layui-input-block">
				<select name="college">
					<option value="数学学院">数学学院</option>
					<option value="计算机学院">计算机学院</option>
					<option value="文学院">文学院</option>
					<option value="外国语学院">外国语学院</option>
					<option value="历史学院">历史学院</option>
					<option value="物理学院">物理学院</option>
					<option value="化学学院">化学学院</option>
				</select>
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">所在班级:</label>
			<div class="layui-input-block">
				<input type="text" name="myclass"  required
					lay-verify="required" placeholder="please input myclass "
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">姓名:</label>
			<div class="layui-input-block">
				<input type="text" name="username"  required
					lay-verify="required" placeholder="please input username "
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">联系电话:</label>
			<div class="layui-input-block">
				<input type="text" name="tel"  required
					lay-verify="required" placeholder="please input tel "
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">所在省:</label>
			<div class="layui-input-block">
				<input type="text" name="province"  required
					lay-verify="required" placeholder="please input province "
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">所在市:</label>
			<div class="layui-input-block">
				<input type="text" name="city"  required
					lay-verify="required" placeholder="please input city "
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">所在县/区:</label>
			<div class="layui-input-block">
				<input type="text" name="areas"  required
					lay-verify="required" placeholder="please input areas "
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">是否中国留学生:</label>
			<div class="layui-input-block">
				<select name="ischinesestudent">
					<option value="false">否</option>
					<option value="true">是</option>
				</select>
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">武汉籍学生:</label>
			<div class="layui-input-block">
				<select name="iswuhanstudent">
					<option value="false">否</option>
					<option value="true">是</option>
				</select>
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">湖北籍学生:</label>
			<div class="layui-input-block">
				<select name="ishubeistudent">
					<option value="false">否</option>
					<option value="true">是</option>
				</select>
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">14日内是否与疫区人员接触过:</label>
			<div class="layui-input-block">
				<select name="is14contact">
					<option value="false">否</option>
					<option value="true">是</option>
				</select>
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">是否在武汉:</label>
			<div class="layui-input-block">
				<select name="isinwuhan">
					<option value="false">否</option>
					<option value="true">是</option>
				</select>
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">是否在湖北:</label>
			<div class="layui-input-block">
				<select name="isinhubei">
					<option value="false">否</option>
					<option value="true">是</option>
				</select>
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">是否今天从外地返校:</label>
			<div class="layui-input-block">
				<select name="istodayformother">
					<option value="false">否</option>
					<option value="true">是</option>
				</select>
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">是否有疑似症状:</label>
			<div class="layui-input-block">
				<select name="islikevirus">
					<option value="false">否</option>
					<option value="true">是</option>
				</select>
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">是否确诊:</label>
			<div class="layui-input-block">
				<select name="isconfirmvirus">
					<option value="false">否</option>
					<option value="true">是</option>
				</select>
			</div>
		</div>
		<div class="layui-form-item">
			<div class="layui-input-block" align="center">
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
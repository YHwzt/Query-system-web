<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <script type="text/javascript">
    function ts() {
    	alert("hello");
    	var x=document.getEelementById("x");
    	alert(x);
   // 	alert(x.value);
    	
	}
    </script>
    
    
    <link rel="stylesheet" href="${pageContext.request.contextPath }/layui/css/layui.css" media="all">
<script src="${pageContext.request.contextPath }/layui/layui.js"></script>
</head>

<body>
		      <center>
		      <br>
		      <br>
    <h1>注冊</h1>
    <br>
    <h2><font color="red">${msg}</font></h2>
    	      <br>
   <%--  <h3><font color="red">${msg}</font></h3>
    <form action="${pageContext.request.contextPath }/register.action" method="post">
        username：<input type="text" name="username"/><br>
        password：<input type="password" name="password"><br>
        类型：<select name="type">
          <option value="user">用户</option>
          <option value="admin">管理员</option>
        </select><br>
        <input type="submit" value="提交"/>&nbsp;&nbsp;&nbsp;
        <a href="${pageContext.request.contextPath }/login.jsp">去登陆</a>
    </form> --%>
    
    
    
    
<form class="layui-form" action="${pageContext.request.contextPath }/user/insert" method="post">
  <div class="layui-form-item">
    <label class="layui-form-label">用户名</label>
    <div class="layui-input-block">
      <input type="text" name="username" required  lay-verify="required" placeholder="请输入用户名" autocomplete="off" class="layui-input">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">密码框</label>
    <div class="layui-input-inline">
      <input type="password" name="password" required lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">类型</label>
    <div class="layui-input-block">
      <select name="type" lay-verify="required">
          <option value="1">学生/教职工</option>
          <option value="2">学院负责人</option>
          <option value="3">学校负责人</option>
      </select>
    </div>
  </div>
  
  <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
      <a href="${pageContext.request.contextPath }/login.jsp" class="layui-btn">去登陆</a>
    </div>
  </div>
  <br>
  
</form>
 
<script>
//Demo
layui.use('form', function(){
  var form = layui.form;
  //监听提交
  form.on('submit(formDemo)', function(data){
    //layer.msg(JSON.stringify(data.field));
    return true;
  });
});
</script>
    
</center>
</body>
</html>

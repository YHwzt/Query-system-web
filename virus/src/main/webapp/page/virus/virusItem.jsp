<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>virusItem</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath }/layui/css/layui.css" media="all">
    <script src="${pageContext.request.contextPath }/layui/layui.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/echarts/echarts.js"></script>
</head>
<body class="childrenBody">
<div id="main" style="width: 600px; height: 400px;float: left"></div>
<div id="main2" style="width: 500px; height: 400px;float: right"></div>
<script type="text/javascript">
    var myChart = echarts.init(document.getElementById("main"));
	var data = genData(5);

	var option = {
		title: {
			text: '冠状病毒统计',
			subtext: '纯属虚构',
			left: 'center'
		},
		tooltip: {
			trigger: 'item',
			formatter: '{a} <br/>{b} : {c} ({d}%)'
		},
		legend: {
			type: 'scroll',
			orient: 'vertical',
			right: 10,
			top: 20,
			bottom: 20,
			data: data.legendData,

			selected: data.selected
		},
		series: [
			{
				name: '项目',
				type: 'pie',
				radius: '55%',
				center: ['40%', '50%'],
				data: data.seriesData,
				emphasis: {
					itemStyle: {
						shadowBlur: 10,
						shadowOffsetX: 0,
						shadowColor: 'rgba(0, 0, 0, 0.5)'
					}
				}
			}
		]
	};
	function genData(count) {
		var legendData = ['总人数','数学学院','计算机学院','文学院','外国语学院','历史学院','物理学院','化学学院',
			'留校中国生','武汉籍学生','湖北籍（不含武汉）学生','14日内与疫区人员接触过',
		'在武汉','在湖北（不含武汉）','今天从外地返校','有疫情疑似','确诊感染'];
		var list=${pie};
		var seriesData =new Array(legendData.length);
		for(var i=0;i<list.length;i++){
			// alert(list[i]);
			seriesData[i]={name:legendData[i],value:list[i]};
		}
		// var seriesData = [{name:'感染',value:30},{name:'疑似',value:60}];
		var selected = {};
		return {
			legendData: legendData,
			seriesData: seriesData,
			selected: selected
		};
	}
	myChart.setOption(option);




	myChart = echarts.init(document.getElementById("main2"));
	option = {
		title : {
			text : "添加与未添加的统计"
		},
		tooltip : {},
		legend : {
			data : [ "数量" ]
		},
		xAxis : {
			data : [ "未添加", "添加"]
		},
		yAxis : {},
		series : [ {
			name : "数量",
			type : "bar",
			data : [ ${i1}, ${i11} ]
		} ]
	};
	myChart.setOption(option);















	function export1() {
		var form=document.getElementById("where");
		form.action="${pageContext.request.contextPath }/virus/export";
		alert("${pageContext.request.contextPath }/virus/export");
		form.submit();
	}

</script>

    <br>
    
    <blockquote class="layui-elem-quote quoteBox">
			<div class="layui-inline">
			<form id="where" action="${pageContext.request.contextPath }/virus/findAll" class="layui-form">
				<div class="layui-input-inline">
					<table >
						<tr>
							<td>姓名</td>
							<td><input type="text" class="layui-input searchVal" name="username" value="${whereVirus.username}" placeholder="please input keyword1" /></td>
						</tr>
						<tr>
							<td>学院</td>
							<td><input type="text" class="layui-input searchVal" name="college" value="${whereVirus.college}" placeholder="please input keyword1" /></td>
						</tr>
						<tr>
							<td>班级</td>
							<td><input type="text" class="layui-input searchVal" name="myclass" value="${whereVirus.myclass}" placeholder="please input keyword1" /></td>
						</tr>
						<tr>
							<td>填表日期</td>
							<td><input type="text" class="layui-input searchVal" name="startdate1" value="${startdate1}" placeholder="please input keyword1" /></td>
						</tr>
						<tr>
							<td>省</td>
							<td><input type="text" class="layui-input searchVal" name="province" value="${whereVirus.province}" placeholder="please input keyword1" /></td>
						</tr>
						<tr>
							<td>市</td>
							<td><input type="text" class="layui-input searchVal" name="city" value="${whereVirus.city}" placeholder="please input keyword1" /></td>
						</tr>
						<tr>
							<td>区</td>
							<td><input type="text" class="layui-input searchVal" name="areas" value="${whereVirus.areas}" placeholder="please input keyword1" /></td>
						</tr>
						<tr>
							<td>是否湖北</td>
							<td><input type="text" class="layui-input searchVal" name="isinhubei" value="${whereVirus.isinhubei}" placeholder="please input keyword1" /></td>
						</tr>
						<tr>
							<td>是否武汉</td>
							<td><input type="text" class="layui-input searchVal" name="isinwuhan" value="${whereVirus.isinwuhan}" placeholder="please input keyword1" /></td>
						</tr>
					</table>
				</div>
				<input type="submit" value="search" class="layui-btn search_btn layui-btn-xs">
                <c:if test="${user.type=='3'}">
				<a href="${pageContext.request.contextPath }/page/virus/virusInsert.jsp" class="layui-btn layui-btn-normal addLink_btn layui-btn-xs">
				<i class="layui-icon">&#xe608;</i>insert</a>

				<button onclick="export1()" class="layui-btn layui-btn-normal addLink_btn layui-btn-xs">导出</button>
                </c:if>
			</form>
			</div>
	</blockquote>
    
	<table lay-filter="virus">
		<thead>
			<tr>
				<th lay-data="{field:'id',align:'center',sort: true}">id</th>
				<th lay-data="{field:'college',align:'center'}">college</th>
				<th lay-data="{field:'myclass',align:'center'}">myclass</th>
				<th lay-data="{field:'startdate',align:'center'}">startdate</th>
				<th lay-data="{field:'username',align:'center'}">username</th>
				<th lay-data="{field:'tel',align:'center'}">tel</th>
				<th lay-data="{field:'province',align:'center'}">province</th>
				<th lay-data="{field:'city',align:'center'}">city</th>
				<th lay-data="{field:'areas',align:'center'}">areas</th>
				<th lay-data="{field:'ischinesestudent',align:'center'}">ischinesestudent</th>
				<th lay-data="{field:'iswuhanstudent',align:'center'}">iswuhanstudent</th>
				<th lay-data="{field:'ishubeistudent',align:'center'}">ishubeistudent</th>
				<th lay-data="{field:'is14contact',align:'center'}">is14contact</th>
				<th lay-data="{field:'isinwuhan',align:'center'}">isinwuhan</th>
				<th lay-data="{field:'isinhubei',align:'center'}">isinhubei</th>
				<th lay-data="{field:'istodayformother',align:'center'}">istodayformother</th>
				<th lay-data="{field:'islikevirus',align:'center'}">islikevirus</th>
				<th lay-data="{field:'isconfirmvirus',align:'center'}">isconfirmvirus</th>
				<c:if test="${user.type=='3'}">
				<th lay-data="{field:'operation', width:100,align:'center'}">operation</th>
				</c:if>
			</tr>
		</thead>
		<tbody>
		    <c:forEach items="${list}" var="virus">
			<tr>
			    <td >${virus.id}</td>
			    <td >${virus.college}</td>
			    <td >${virus.myclass}</td>

			    <td ><fmt:formatDate value="${virus.startdate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
			    <td >${virus.username}</td>
			    <td >${virus.tel}</td>
			    <td >${virus.province}</td>
			    <td >${virus.city}</td>
			    <td >${virus.areas}</td>
			    <td >${virus.ischinesestudent}</td>
			    <td >${virus.iswuhanstudent}</td>
			    <td >${virus.ishubeistudent}</td>
			    <td >${virus.is14contact}</td>
			    <td >${virus.isinwuhan}</td>
			    <td >${virus.isinhubei}</td>
			    <td >${virus.istodayformother}</td>
			    <td >${virus.islikevirus}</td>
			    <td >${virus.isconfirmvirus}</td>
				<td>
				    <div class="layui-btn-group">
					    <%--<a class="layui-btn layui-btn-xs"
						href="<c:url value='/virus/saveById?id=${virus.id }'/>">
						<i class="layui-icon">&#xe642;</i>update</a>--%>
					    <a class="layui-btn layui-btn-xs layui-btn-danger"
						href="<c:url value='/virus/deleteById?id=${virus.id }'/>">
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
			table.init('virus', {
				height: 475 
				,limit: 10 
				,page: true 
				,skin: 'row' 
				,even: true 
				,size: 'sm'
			}); 
		});
	</script>
</html>
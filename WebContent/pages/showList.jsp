<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品列表</title>
</head>
<body>
	<h2>商品列表</h2>
	<!-- 模糊查询 -->
	<form action="${pageContext.request.contextPath}/commodityAction_fuzzyQuery">
		商品名称：<input type="text" name="conditions" value="${conditions[0] }"/>&nbsp;&nbsp;
		操作人：<input type="text" name="conditions" value="${conditions[1] }"/>&nbsp;&nbsp;
		数量：<input type="text" name="conditions" value="${conditions[2] }"/>—
		<input type="text" name="conditions" value="${conditions[3] }"/>&nbsp;&nbsp;
		<input type="submit" value="查找"/><br/><br/>
	</form>
	
	
	<!-- 商品列表 -->
	<table width="1000" border="1">
		<tr>
			<td>编号</td><td>商品名</td>
			<td>单位</td><td>数量</td>
			<td>添加日期</td><td>操作人</td>
		</tr>
		<c:forEach items="${clist }" var="c" varStatus="ids">
			<tr>
				<th>${ids.count}</th><th>${c.c_name}</th>
				<th>${c.c_units}</th><th>${c.c_quantity}</th>
				<th>${c.c_time}</th><th>${c.c_operator}</th>
			</tr>
		</c:forEach>
		<tr >
			<td colspan="6" align="center"><a href="${pageContext.request.contextPath}/pages/add.jsp">添加</a></td>
		</tr>
	</table>
</body>
</html>
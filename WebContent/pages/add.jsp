<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加商品页面</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/commodityAction_addCommodity">
		商品名称：<input type="text" name="c.c_name"/><br/><br/>
		　　单位：<input type="text" name="c.c_units"/><br/><br/>
		　　数量：<input type="text" name="c.c_quantity"/><br/><br/>
		添加日期：<input type="text" name="c.c_time"/><br/><br/>
		　操作人：<input type="text" name="c.c_operator"/><br/><br/>
		<input type="submit" value="添加"/><br/><br/>
	</form>
</body>
</html>
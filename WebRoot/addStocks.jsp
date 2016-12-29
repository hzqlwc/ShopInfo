<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  <s:form action="addStocks">
   <table border="1">
   <tr>
   <td>進貨單號<s:textfield name="stock.stockbillcode" /></td>
   </tr>
   <tr>
   <td>進貨日期<s:textfield name="stock.stockbilldate" /></td>
   </tr>
      <tr>
   <td>商品編號<s:textfield name="stock.baseshop.shopcode" /></td>
   </tr>
      <tr>
   <td>商品名稱<s:textfield name="stock.baseshop.shopname" /></td>
   </tr>
      <tr>
   <td>進貨數量<s:textfield name="stock.stocknum" /></td>
   </tr>
      <tr>
   <td>備注<s:textfield name="stock.memo" /></td>
   </tr>
   <tr>
    <td><a href="stocks">返回列表</a><input type="submit" value="保存"></td>
   </tr>
   
   
   </table>
    </s:form>


  </body>
</html>
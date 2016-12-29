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
  <s:form action="update">
   
   <table border="1">
    <tr>
   <td>商品编号<input type="text" name="baseshop.shopcode" value='<s:property value="#baseshop.shopcode"/>'/></td>
   </tr>
   <tr>
   <td>商品名称<input type="text" name="baseshop.shopname" /></td>
   </tr>
   <tr>
    <td><a href="ServiceInfo">返回列表</a><s:submit value="保存"/></td>
   </tr>
   </table>
    </s:form>


  </body>
</html>
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
    <form action="ServiceInfo">
    <table border="1">
       <tr>
       <td>商品编号<input type="text" name="baseshop.shopcode"></td>
       <td>商品名称<input type="text" name="baseshop.shopname"></td>
       <td><input type="submit" value="查询"></td>
       </tr>
       <tr>
         <td>商品编号</td>
         <td>商品名称</td>
         <td>操作</td>
       </tr>
 
  
       <s:iterator id="item" value="list">
       <tr>
       <td><s:property value="#item.shopcode" /></td>
       <td><s:property value="#item.shopname" /></td>
       <td><a href="addshops.jsp">新增</a>
       
       <a href='<s:url action="edit">
       <s:param name="shopcode" value="#item.shopcode" />
       </s:url>'>修改</a>
       
       <a href='<s:url action="delete">
       <s:param name="shopcode" value="#item.shopcode" /></s:url>'>
                   删除
       </a>
       </td>
     </tr>
    </s:iterator>
    </table>
    
</form>



  </body>
</html>

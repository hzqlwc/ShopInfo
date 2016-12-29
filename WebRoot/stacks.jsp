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
   
    <table border="1">
          <tr><a href="addStocks.jsp">新增</a></tr>
       <tr>
         <td>進貨單號</td>
         <td>進貨日期</td>
         <td>商品編號</td>
         <td>進貨數量</td>
         <td>備注</td>
       </tr>
 
  
       <s:iterator id="its" value="stocklist">
       <tr>
       <td><s:property value="#its.stockbillcode" /></td>
       <td><s:property value="#its.stockbilldate" /></td>
       <td><s:property value="#its.baseshop.shopcode" /></td>
       <td><s:property value="#its.stocknum" /></td>
       <td><s:property value="#its.memo" /></td>
      
       </tr>
    </s:iterator>
    </table>




  </body>
</html>

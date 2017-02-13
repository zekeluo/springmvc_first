<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
	<script type="text/javascript">
		function msg(){
			if (confirm("亲!  你确定要放弃当前操作,离开此页面吗?"))
				javaScript:window.location.href='queryUserServlet';
			else{
				return;
			}
		}
	</script>
  </head>
  
  <body>
   	<form action="AddTest" method="post" >
    	<table border="1px">
    	<tr>
        	<td colspan="2" style="text-align:center">用户注册</td>
        </tr>
        <tr>
        	<td>用户名：</td>
            <td><input type="text" name = "name"/></td>
        </tr>
        <tr>
       		<td>密码：</td>
        	<td><input type="password" name = "password"/></td>
        </tr>
        <tr>
        	<td>年龄：</td>
        	<td><input type="text" name="age"/></td>
        </tr>
        <tr>
        	<td>性别：</td>
        	<td><input checked="checked" type="radio" name="sex" value="男"/>男<input type="radio" name="sex" value="女"/>女</td>
        </tr>
        <tr>
        	<td>家庭住址：</td>
        	<td><textarea style="width=500px" name="address"></textarea></td>
        </tr>
        <tr>
        	<td colspan="2" style="text-align:center">
        		<input type="submit" value="提交" />
        		<input type="reset" value="重置" />
        		<a href="queryUserServlet" onclick="return confirm('确认离开当前页面吗？')" >返回首页</a>
        	</td>
        </tr>
        </table>
        
  	</form >
  		<form action="SelectTest" method="post"> 
  		<input type="submit" value="查询" />
  		 </form>
  </body>
</html>

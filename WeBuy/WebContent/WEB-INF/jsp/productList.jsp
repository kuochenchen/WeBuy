<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript">
	$(function(){
		var params='{"id":1,"name":"测试商品","price":99.9,"detail":"测试商品描述"}';
		/* $.post(url,params,function(data){
			
		},"json");//不是回调字符转 */
		$.ajax({
			url:"${pageContext.request.contextPath }/json.action",
			data:params,
			contentType:"application/json;charset=UTF-8",  //发送数据的格式
			type:"post",
			dataType:"json",
			success:function(d
					ata){
				alert(data.name);
			}
		}); 
		//alert(1);
	});
</script>
</head>
<body>
	<table>
	<c:forEach items="${list }" var="item">
		<tr>
			<td>${item.pid }<td/>
			<td>${item.pname }</td>
			<td>${item.shopPrice}</td>
			<td>${item.pdesc }</td>
			
			<td><a href="${pageContext.request.contextPath }/itemEdit.action?id=${item.pid}">修改</a></td>
			 
		</tr>
	</c:forEach>
	</table>	
</body>
</html>
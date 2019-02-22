<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 

<body id="mian_window">
	<script type="text/javascript">
		$(function(){
			$("#mian_window").load("<%=request.getParameter("path")%>");
		});
	</script>
</body>


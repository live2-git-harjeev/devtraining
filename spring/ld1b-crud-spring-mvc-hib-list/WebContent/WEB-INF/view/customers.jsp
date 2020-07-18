<%@ page language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>The Customers List</title>
</head>
<body>

	<h1>The List of Customer</h1>

	<c:forEach var="customerObject" items="${customerModelFromController}">
	${customerObject.firstName } <br/>
	${customerObject.lastName } <br/>
	${customerObject.email } <br/>
	<hr/>
	</c:forEach>
	
	
	<!-- scriptlets allow writing java code inside jsp -->
	<%-- 	 List of Customers
	<%
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
			out.print("<b>" + i + "</b><hr/>");
		}
	%> --%>
</body>
</html>
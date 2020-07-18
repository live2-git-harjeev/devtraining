<%@ page language="java"%>
<!DOCTYPE html>
<html>
<head>

<title>The Customers List</title>
</head>
<body>
<!-- scriptlets allow writing java code inside jsp -->
	 List of Customers
	<%
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
			out.print("<b>" + i + "</b><hr/>");
		}
	%>
</body>
</html>
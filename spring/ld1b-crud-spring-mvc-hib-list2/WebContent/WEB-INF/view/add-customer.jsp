<%@ page language="java"%>
<%@taglib prefix="springform" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>

<title>Create a new Customer</title>
</head>
<body>
<springform:form action="saveCustomer" modelAttribute="customerModel">
First Name : <br/><input type="text" path="firstName"/> <br/><br/>
Last Name : <br/><input type="text" path="lastName"/> <br/><br/>
Email : <br/><input type="text" path="email"/> <br/><br/>
<input type="submit" value="Save Customer"/>
</springform:form>
</body>
</html>
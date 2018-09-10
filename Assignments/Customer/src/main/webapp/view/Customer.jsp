<%@ taglib prefix="s" uri="/struts-tags"%> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Customer Login </title>
    <style>
	table.list
	{
		border-collapse:collapse;
		width: 40%;
	}
	table.list, table.list td, table.list th
	{
		border:1px solid gray;
		padding: 5px;
	}
	</style>
</head>
<body>
 
<h2>Customer Login </h2>
 
<s:form method="post" action="register">
    <table>
	    <tr>
	        <td><s:textfield key="label.firstname" name="customer.firstname"/></td> 
	    </tr>
	    <tr>
	        <td><s:textfield key="label.lastname" name="customer.lastname"/></td>
	    </tr>
	    <tr>
	        <td><s:textfield key="label.email" name="customer.email"/></td>
	    </tr>
	    <tr>
	        <td><s:textfield key="label.telephone" name="customer.telephone"/></td>
	    </tr>
	    <tr>
	        <td>
	        	<s:submit key="label.register"></s:submit></td>
	    </tr>
	    <tr>
	    	<td>Already Registered?<a href="LoginHere"></a></td>
	    </tr>
	</table> 
</s:form>
 
</body>
</html>
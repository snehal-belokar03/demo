<%@page import="com.cjc.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>success page</title>
<script type="text/javascript">
function deleteData(){
	alert("delete data");
	document.op.action="delete";
	document.op.submit();
}
function update(){
	alert("Update data");
	document.op.action="edit";
	document.op.submit();
}
function add(){
	alert("Add data");
	document.op.action="register";
	document.op.submit();
}

</script>
</head>
<body>
<h1><font color="green">Student Details</font></h1>
<form name="op">
<table border="1">
<tr>
<th>SR No</th>
<th>Roll No</th>
<th>UserName</th>
<th>Password</th>
<th>Name</th>
<th>Address</th>
<th>MobileNo</th>
</tr>
<%
List<Student> slist=(List)request.getAttribute("data");
for(Student s:slist)
{%>
<tr>
<td><input type="radio" name="rollno" value="<%=s.getRollno()%>"></td>
<td><%=s.getRollno()%></td>
<td><%=s.getUname()%></td>
<td><%=s.getPass()%></td>
<td><%=s.getName()%></td>
<td><%=s.getAddr()%></td>
<td><%=s.getMobileno()%></td>
</tr>
<%} %>

<tr>
<td><input type="button" value="Delete" onclick="deleteData()"></td>
<td><input type="button" value="Update" onclick="update()"></td>
<td><input type="button" value="Add" onclick="add()"></td>
</tr>

</table>




</form>
</body>
</html>
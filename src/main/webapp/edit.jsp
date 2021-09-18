<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>
		<font color="red">Update here....</font>
	</h1>
	<form action="update">
		<table>
			<tr>
				<td>Roll No:-</td>
				<td><input type="text" name="rollno" value="${stu.rollno}"></td>
			</tr>

			<tr>
				<td>UserName:-</td>
				<td><input type="text" name="uname" value="${stu.uname}"></td>
			</tr>

			<tr>
				<td>Password:-</td>
				<td><input type="text" name="pass" value="${stu.pass}"></td>
			</tr>

			<tr>
				<td>Name:-</td>
				<td><input type="text" name="name"value="${stu.name}"></td>
			</tr>

			<tr>
				<td>Address:-</td>
				<td><input type="text" name="addr" value="${stu.addr}"></td>
			</tr>

			<tr>
				<td>Mobile No:-</td>
				<td><input type="text" name="mobileno" value="${stu.mobileno}"></td>
			</tr>

			<tr>
				<td><input type="submit" value="submit"></td>
			</tr>

		</table>





	</form>

</body>
</html>
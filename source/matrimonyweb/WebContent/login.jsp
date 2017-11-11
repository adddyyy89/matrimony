<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<script src="scripts/login.js"></script>
</head>
<body>
	<center>
		<div>
			<h2>Ambedkarite Matrimony</h2>
		</div>
		<br>
		<div id="login_div">
			<table>
				<tbody>
					<tr>
						<td>User Name:</td>
						<td><input id="username" type="text" size="20" /></td>
					</tr>
					<tr>
						<td>Password:</td>
						<td><input id="password" type="text" size="20" /></td>
					</tr>
					<tr>
						<td colspan="2"><button id="login" onclick="login();">Login</button></td>
					</tr>
				</tbody>
			</table>
		</div>
	</center>
</body>
</html>
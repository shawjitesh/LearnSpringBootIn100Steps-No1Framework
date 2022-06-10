<!DOCTYPE html>
<html lang="en">
	<head>
		<title>First Web Application</title>
	</head>
	<body>
		<form method="post">
			Name: <input type="text" name="name"/>
			Password: <input type="password" name="password"/>
			<input type="submit"/><br>
			<font color="red">${errorMessage}</font>
		</form>
	</body>
</html>
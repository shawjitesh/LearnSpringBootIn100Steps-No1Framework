<!DOCTYPE html>
<html lang="en">
	<head>
		<title>First Web Application</title>
		<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	    		rel="stylesheet">
	</head>
	<body>
		<div class="container">
			<form method="post">
				Name: <input type="text" name="name" class="form-control"/>
				Password: <input type="password" name="password" class="form-control"/>
				<button type="submit" class="btn btn-success">Login</button><br>
				<font color="red">${errorMessage}</font>
			</form>
		</div>
		<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
		<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	</body>
</html>
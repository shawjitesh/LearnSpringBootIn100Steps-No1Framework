<%@include file="common/header.jspf"%>
<%@include file="common/navigation.jspf"%>
<div class="container">
	<form method="post">
		Name: <input type="text" name="name" class="form-control"/>
		Password: <input type="password" name="password" class="form-control"/>
		<button type="submit" class="btn btn-success">Login</button><br>
		<font color="red">${errorMessage}</font>
	</form>
</div>
<%@include file="common/footer.jspf"%>
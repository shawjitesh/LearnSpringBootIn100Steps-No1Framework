<%@include file="common/header.jspf"%>
<%@include file="common/navigation.jspf"%>
<div class="container">
	<h1>Your TODOs</h1>
	<table class="table table-striped">
		<caption>Your TODOs are</caption>
		<thead>
			<tr>
				<th>Description</th>
				<th>Target Date</th>
				<th>Is it Done?</th>
				<th>Update</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${todos}" var="todo">
				<tr>
					<td>${todo.desc}</td>
					<td><fmt:formatDate value="${todo.targetDate}" pattern="dd/MM/yyyy"></fmt:formatDate></td>
					<td>${todo.done}</td>
					<td><a type="button" class="btn btn-success" href="/update-todo?id=${todo.id}">Update</a></td>
					<td><a type="button" class="btn btn-warning" href="/delete-todo?id=${todo.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div><a class="button" href="/add-todo">Add a TODO</a></div>
</div>
<%@include file="common/footer.jspf"%>
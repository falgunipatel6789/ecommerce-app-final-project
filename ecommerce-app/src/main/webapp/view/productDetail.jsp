
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
    <%@ page import="java.util.List, com.cohart20.entity.Product" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>

	<%
	List<Product> product = (List<Product>)request.getAttribute("allproduct");
	%>

	<br>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container-fluid">
			<a class="navbar-brand" href="/">Home</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNav"
				aria-controls="navbarNav" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav">
					<a class="navbar-brand" href="masterModule">Master</a>
					<button class="navbar-toggler" type="button"
						data-bs-toggle="collapse" data-bs-target="#navbarNav"
						aria-controls="navbarNav" aria-expanded="false"
						aria-label="Toggle navigation">
						<span class="navbar-toggler-icon"></span>
					</button>
					<a class="navbar-brand" href="">Portfolio</a>
					<button class="navbar-toggler" type="button"
						data-bs-toggle="collapse" data-bs-target="#navbarNav"
						aria-controls="navbarNav" aria-expanded="false"
						aria-label="Toggle navigation">
						<span class="navbar-toggler-icon"></span>
					</button>
					<a class="navbar-brand" href="">Contact Us</a>
					<button class="navbar-toggler" type="button"
						data-bs-toggle="collapse" data-bs-target="#navbarNav"
						aria-controls="navbarNav" aria-expanded="false"
						aria-label="Toggle navigation">
						<span class="navbar-toggler-icon"></span>
					</button>
					<a class="navbar-brand" href="/">Logout</a>
					<button class="navbar-toggler" type="button"
						data-bs-toggle="collapse" data-bs-target="#navbarNav"
						aria-controls="navbarNav" aria-expanded="false"
						aria-label="Toggle navigation">
						<span class="navbar-toggler-icon"></span>
					</button>


				</ul>
			</div>
		</div>
	</nav>
	<br>

	<nav class="nav flex-column">
		<a class="nav-link" aria-current="page" href="masterUser">User</a> <a
			class="nav-link" href="/productDetail">Product</a>
	</nav>

	<h3>
		No of Users Present:
		<%=product.size()%></h3>

	<table class="table table-success table-striped">
		<thead>


			<tr>
				<th scope="col">Product Id</th>
				<th scope="col">Product Name</th>
				<th scope="col">Product Detail</th>
				<th scope="col">User Name</th>
				<th scope="col">Delete</th>
				<th scope="col">Update</th>
			</tr>

		</thead>
		<tbody>
			<%
			for (int i = 0; i < product.size(); i++) {
			%>
			<tr>
				<td><%=product.get(i).getProduct_id()%></td>
				<td><%=product.get(i).getProduct_name()%></td>
				<td><%=product.get(i).getProduct_detail()%></td>
				<td><%=product.get(i).getUser_name()%></td>
				<td><a href="/delete/<%=product.get(i).getProduct_id()%>">delete</a></td>
				<td><a href="/update/<%=product.get(i).getProduct_id()%>">update</a></td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>

	<div style="margin-top: 350px; margin-left: 50px"></div>
	<div class="card-footer text-muted">
		10 downing street, London United Kingdom
		<h6 style="margin-left: 500px">Powered by Cohart20</h6>
	</div>
</body>
</html>

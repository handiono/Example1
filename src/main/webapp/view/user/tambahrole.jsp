<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Edit User</title>
</head>
<body>
	<h1>${user1.users.username}, Role: ${user1.role}, Status:${user1.users.enable}</h1>
	<form action="user" method="post">
	<input type="hidden" name="tambahrole">
	<input type="hidden" name="id" value="${user.id}">
	<ul>
	<li>Username: ${user.username}</li>
	
	<c:forEach var="userrole" items="${userrole}">
	<li>Role List : ${userrole.role} ></li>
	</c:forEach>
	
	<li>New Role <input type="text" name="role" ></li>

	</ul>
	<input type="submit" value="Ganti">
	</form>
	
	<form action="user" method="post">
	<input type="submit" value="Tambah Role">
	</form>
	<a href="user">Kembali ke List User</a>
</body>
</html>
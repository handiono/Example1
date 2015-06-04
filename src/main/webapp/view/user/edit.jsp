<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Edit User</title>
</head>
<body>
	<h1>${user1.users.username}, Role: ${user1.role}, Status:${user1.users.enable}</h1>
	<form action="user" method="post">
	<input type="hidden" name="ganti">
	<input type="hidden" name="id" value="${user1.id}">
	<ul>
	<li>Username: ${user1.users.username}</li>
	<li>Password <input type="text" name="password" value="${user1.users.password}"></li>
	<li>Role <input type="text" name="role" value="${user1.role}"></li>
	<li>Enable <input type="text" name="enable" value="${user1.users.enable}"></li>

	</ul>
	<input type="submit" value="Ganti">
	</form>
	
	<form action="user" method="post">
	<input type="hidden" name="id" value="${user1.users.id}">
	<input type="hidden" name="hapus">
	<input type="submit" value="hapus">
	</form>
	<a href="user">Kembali ke List User</a>
</body>
</html>
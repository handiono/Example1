<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Masukkan User Baru</title>
</head>
<body>
	<h1>Masukkan User Baru</h1>
	<form action="user" method="post">
	<input type="hidden" name="tambah">
	<ul>
	<li>Username <input type="text" name="username"></li>
	<li>Password <input type="text" name="password"></li>
	<li>Role: <select name="role">
					<option value="ROLE_USER">User</option>
					<option value="ROLE_ADMIN">Admin</option>
			</select>
	</li>
	<li> Status
		<br>
		<input type="radio" name="enable" value="TRUE" checked>Aktif
		<br>
		<input type="radio" name="enable" value="FALSE">Tidak
		
	</li>
	</ul>
	<input type="submit" value="tambah">
	</form>
	<a href="user">Kembali ke List User</a>
</body>
</html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ page session="true"%>
<html>
<head>
<title>Daftar User</title>
</head>
<body>
	<h1>Daftar User</h1>
	
	<ul>
	<c:forEach var="user" items="${user2}">
		<li><a href="user?id=${user.id}&ganti">${user.username}</a></li>
	</c:forEach>
	</ul>
	<a href="user?tambah">Tambah User</a> | 
	<a href="<c:url value = '/' />">Home</a> 
</body>
</html>
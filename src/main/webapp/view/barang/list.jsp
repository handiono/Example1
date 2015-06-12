<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ page session="true"%>
<html>
<head>
<title>Daftar Barang</title>
</head>
<body>
	<h1>Daftar Barang${barang2}</h1>
	<c:if test="${pageContext.request.userPrincipal.name != null}">
	   <h2>Welcome : ${pageContext.request.userPrincipal.name} </h2>
	
	<ul>
	<c:forEach var="barang" items="${barang2}">
		<li><a href="barang?id=${barang.id}&ganti">${barang.partname}</a></li>
	</c:forEach>
	</ul>
	<a href="barang?tambah">Tambah Barang</a> | 
	<a href="<c:url value = '/' />">Home</a> | 
	<a href="<c:url value="/j_spring_security_logout" />" > Logout</a></h2>  
	</c:if>
</body>
</html>
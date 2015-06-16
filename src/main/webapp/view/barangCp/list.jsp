<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ page session="true"%>
<html>
<head>
<title>Daftar Barang</title>
</head>
<body>
	<h1>Daftar Barang</h1>
	
	   <h2>Stored Proceduer example page${barang2}</h2>
	<ul>
	<c:forEach var="barang" items="${barang2}">
		<li><a href="barang?id=${barang.barang_id}&ganti">${barang.partname}</a></li>
	</c:forEach>
	</ul>
	<a href="barang?tambah">Tambah Barang</a> | 
	<a href="<c:url value = '/' />">Home</a> | 

	<a href="<c:url value = '/' />">Home</a> | 

</body>
</html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ page session="true"%>
<html>
<head>
<title>Daftar Barang</title>
</head>
<body>
	<h1>Daftar Barang</h1>
	
	   <h2>Stored Proceduer example page</h2>
	<ul>
	<c:forEach var="barang" items="${barang2}">
		<li>${barang}</a></li>
		
	<c:forEach var="barang3" items="${barang}">
		<li>${barang3}</a></li>
	</c:forEach>
	
	
	</c:forEach>
	</ul>


	<a href="<c:url value = '/' />">Home</a> | 

</body>
</html>
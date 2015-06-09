<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>List Transaksi Stock</title>
</head>
<body>
	<h1>List Transaksi Stock</h1>
	<ul>
	<c:forEach var="transaksi" items="${transaksi2}">
		<li><a href="stock?id=${transaksi.id}&ganti">
		id: ${transaksi.id}, 
		tanggal: ${transaksi.tanggal}, 
		quantity:  ${transaksi.quantity}, 
		transaksi: ${transaksi.transaksi.jenis}, 
		barang : ${transaksi.barang.partname}
		</a></li>
	</c:forEach>
	</ul>
	<a href="stock?tambah">Tambah Transaksi Stock</a> | <a href="<c:url value = '/' />">Home</a>
		<br>
	Listing Jenis barang "m": pake JPQL
	<c:forEach var="asd" items="${barangm}">
	<ul> 
	<li>quantity:${asd.quantity }</li>
	<li>Tanggal:${asd.tanggal }</li>
	<li>Barang:${asd.barang.partname }</li>
	</ul>
	</c:forEach>
	Listing Quantity < 500):Pakai Querydsl
	<c:forEach var="qwe" items="${quantity}">
	<ul> 
	<li>quantity:${qwe.quantity }</li>
	<li>Tanggal:${qwe.tanggal }</li>
	<li>Barang:${qwe.barang.partname }</li>
	</ul>
	</c:forEach>

</body>
</html>
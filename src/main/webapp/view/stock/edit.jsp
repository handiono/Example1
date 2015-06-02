<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Input Transaksi Stock</title>
</head>
<body>
	<h1>Input Transaksi Stock</h1>
	<form action="stock" method="post">
		<input type="hidden" name="edit">
		<input type="hidden" name="id" value="${transaksibarang3.id}">
		<ul>
			<li>Jenis Barang: <select name="b_id">
					<c:forEach var="barang" items="${barang3}">
						<c:choose>
							<c:when test="${barang.id == transaksibarang3.barang.id}">
								<option value="${barang.id}" selected>${barang.partno}|
									${barang.partname}</option>
							</c:when>
							<c:otherwise>
								<option value="${barang.id}">${barang.partno}|
									${barang.partname}</option>
							</c:otherwise>
						</c:choose>
					</c:forEach>
			</select>
			</li>
			<li>Jenis Transaksi: <select name="t_id">
					<c:forEach var="transaksi" items="${transaksi3}">
						<c:choose>
							<c:when test="${transaksi.id == transaksibarang3.transaksi.id}">
								<option value="${transaksi.id}" selected>${transaksi.jenis}</option>
							</c:when>
							<c:otherwise>
								<option value="${transaksi.id}">${transaksi.jenis}</option>
							</c:otherwise>
						</c:choose>

					</c:forEach>
			</select>
			</li>

			<li>Quantity: <input type="number" name="quantity"
				value="${transaksibarang3.quantity }"></li>
		</ul>
		<input type="submit" value="Ganti">
	</form>
	<a href="stock">Kembali ke List Transaksi barang</a>
</body>
</html>
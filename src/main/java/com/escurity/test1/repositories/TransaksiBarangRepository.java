package com.escurity.test1.repositories;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.escurity.test1.entities.TransaksiBarang;



public interface TransaksiBarangRepository extends JpaRepository<TransaksiBarang, Long>, QueryDslPredicateExecutor<TransaksiBarang>{
	
	List<TransaksiBarang> findByTransaksiJenis(String jenis);
		
	List<TransaksiBarang> findByBarangPartno(String partno);
	
	@Query("select tr from TransaksiBarang tr where tr.barang.partname=?1")
	List<TransaksiBarang> cariM(String m); 
	
	List<TransaksiBarang> findByBarangPartname(String partname);
	
//	List<TransaksiBarang> findByBarangPartname(String partname, Pageable pageable);

	
//	public  Predicate cariQty(){
//		
//		QTransaksiBarang transaksiBarang = QTransaksiBarang.transaksiBarang;
//		return transaksiBarang.quantity.lt(500);
	
//	class QuerydslCustom{
//		public Predicate cariquantity(){
//			return QTransaksiBarang.transaksiBarang.quantity.lt(500);
//		}	
//	}
	
//	public void 
//		QTransaksiBarang transaksiBarang = QTransaksiBarang.transaksiBarang;
//		BooleanExpression cariquantity = transaksiBarang.quantity.lt(500);
//		BooleanExpression cariMjuga = qw.transaksi.jenis.eq("masuk");
		
//	return findAll(cariquantity);	
//	}
		
//	QTransaksiBarang qw = QTransaksiBarang.transaksiBarang;
//	List<TransaksiBarang> hasilq = T 
//	public List<TransaksiBarang> findQtylt(int quantity){
		
//		QTransaksiBarang qw = QTransaksiBarang.transaksiBarang;
//		Predicate where = qw.quantity.lt(500);
//		return (List<TransaksiBarang>) trRepo.findAll(where);
////	}

//		@Override
//		public Iterable<TransaksiBarang> 
}

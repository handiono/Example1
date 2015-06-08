package com.escurity.test1.repositories;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.escurity.test1.entities.TransaksiBarang;



public interface TransaksiBarangRepository extends JpaRepository<TransaksiBarang, Long>{
	
	List<TransaksiBarang> findByTransaksiJenis(String jenis);
	List<TransaksiBarang> findByBarangPartno(long id);
	
	@Query("select tr from TransaksiBarang tr where tr.barang.partname=?1")
	List<TransaksiBarang> cariM(String m); 
	
}

package com.escurity.test1.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.escurity.test1.entities.TransaksiBarang;

public interface TransaksiBarangRepository extends JpaRepository<TransaksiBarang, Long> {
	
	List<TransaksiBarang> findByTransaksiJenis(String jenis);
	List<TransaksiBarang> findByBarangPartno(long id);

}

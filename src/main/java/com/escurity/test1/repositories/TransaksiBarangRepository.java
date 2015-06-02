package com.escurity.test1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.escurity.test1.entities.TransaksiBarang;

public interface TransaksiBarangRepository extends JpaRepository<TransaksiBarang, Long> {

}

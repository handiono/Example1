package com.escurity.test1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.escurity.test1.entities.Transaksi;

public interface TransaksiRepository extends JpaRepository<Transaksi, Long> {

}

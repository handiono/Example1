package com.escurity.test1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.escurity.test1.entities.Barang;

public interface BarangRepository extends JpaRepository<Barang, Long> {

}
